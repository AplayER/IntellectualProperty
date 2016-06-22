/**
 * 
 */
package com.hbippub.cache;

import com.dyuproject.protostuff.LinkedBuffer;
import com.dyuproject.protostuff.ProtobufIOUtil;
import com.dyuproject.protostuff.runtime.RuntimeSchema;
import com.hbippub.pojo.Seckill;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * @author 梁lab 806
 *
 */
public class JedisSeckill {
	
	private final JedisPool jedisPool;
	
	private RuntimeSchema<Seckill> schema = RuntimeSchema.createFrom(Seckill.class);
	
	public JedisSeckill(String ip,int port) {
		jedisPool=new JedisPool(ip,port);
	}
	
	/**
	 * @param seckillId
	 * @return
	 */
	public Seckill getSeckill(int seckillId){
		try {
			Jedis jedis = jedisPool.getResource();
			try {
				String key = "seckill:"+seckillId;
				byte[] seckillByte=jedis.get(key.getBytes());
				if (seckillByte!=null) {
					Seckill seckill = schema.newMessage();
					ProtobufIOUtil.mergeFrom(seckillByte, seckill, schema);
					return seckill;
				}
				
			} catch (Exception e) {
				// TODO: handle exception
			}finally{
				jedis.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * @param seckill
	 * @return
	 */
	public String putSeckill(Seckill seckill){
		try {
			Jedis jedis = jedisPool.getResource();
			try {
				String key = "seckill:"+seckill.getSeckillId();
				byte[] seckillBytes=ProtobufIOUtil.toByteArray(seckill, schema, LinkedBuffer.allocate(LinkedBuffer.DEFAULT_BUFFER_SIZE));
				String res = jedis.setex(key.getBytes(), 60*60,seckillBytes);
				return res;
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				jedis.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
			}
		return null;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	}

}
