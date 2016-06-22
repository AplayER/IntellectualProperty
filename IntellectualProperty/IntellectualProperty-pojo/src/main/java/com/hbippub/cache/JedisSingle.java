/**
 * 
 */
package com.hbippub.cache;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * @author 梁lab 806
 *
 */
public class JedisSingle{
	
	private JedisPool jedisPool;
	
	public JedisSingle(String ip,int port){
		jedisPool = new JedisPool(ip,port);
	}
	
}
