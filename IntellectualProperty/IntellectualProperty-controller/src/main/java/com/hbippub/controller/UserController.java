/**
 * 
 */
package com.hbippub.controller;

import java.util.HashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hbippub.cache.JedisSeckill;
import com.hbippub.dto.Exposer;
import com.hbippub.mapper.HbipPubUserMapper;
import com.hbippub.mapper.SuccessKilledMapper;
import com.hbippub.pojo.HbipPubUser;
import com.hbippub.pojo.HbipPubUserExample;
import com.hbippub.pojo.Seckill;
import com.hbippub.pojo.SuccessKilled;
import com.hbippub.service.SeckillService;
import com.hbippub.service.UserService;

/**
 * @author 梁lab 806
 *
 */
@Controller
public class UserController {
	
//	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private UserService userService;
//	@Autowired
//	private SeckillService seckillService;
	
	@RequestMapping("/userbyid/{userId}")
    @ResponseBody
    public HbipPubUser getUserById(@PathVariable int userId){
		HbipPubUser user = userService.getUserByID(userId);
		return user;
	}
	@RequestMapping("/userbytype/{type}")
	@ResponseBody
	public List<HbipPubUser> getUserBySex(@PathVariable int type){
		List<HbipPubUser> list = userService.getUserByYongHuLeiBie(type);
		return list;
	}
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-*.xml");
//		/*
//		 * 测试user表的方法
//		 */
//		HbipPubUserMapper mapper = applicationContext.getBean(HbipPubUserMapper.class);
//		HbipPubUserExample example = new HbipPubUserExample();
//		example.or().andYonghuleibieEqualTo(1);
//		List<HbipPubUser> list = mapper.getLoginInfoByExample(example);
////		for (HbipPubUser hbipPubUser : list) {
////			System.out.println(hbipPubUser.getJiguanquhuaid());
////		}
//		HashMap<String, String> userInfo = new HashMap<String, String>();
//		userInfo.put("logName", "lww");
//		userInfo.put("pwd", "e10adc3949ba59abbe56e057f20f883e");
//		HbipPubUser user2 = mapper.getLoginInfoByLogNameAndPwd(userInfo);
//			System.out.println(user2.getYonghuid());
		//测试秒杀表的方法
		SeckillService seckillService = applicationContext.getBean(SeckillService.class);
//		
//		List<Seckill> seckills = seckillService.getSeckillList();
//		for (Seckill seckill : seckills) {
//			System.out.println(seckill);
//		}
//		
//		System.out.println("getSeckillByID Test:");
//		Seckill seckill = seckillService.getSeckillByID(1);
//		System.out.println(seckill);
//		
//		Exposer exposer = seckillService.exportSeckillUrl(1);
//		System.out.println("exportSeckillUrl Test:");
//		System.out.println(exposer);
		//测试秒杀成功表的方法
//		SuccessKilledMapper successKilledMapper = applicationContext.getBean(SuccessKilledMapper.class);
//		successKilledMapper.insertSuccessKilled(1000, "13071287");
//		SuccessKilled successKilled=successKilledMapper.queryByIdWithSeckill(1000, "13071287");
//		System.out.println(successKilled);
		JedisSeckill jedisSeckill = applicationContext.getBean(JedisSeckill.class);
		Seckill seckill = seckillService.getSeckillByID(1);
		String res=jedisSeckill.putSeckill(seckill);
		System.out.println(res);
		Seckill reSeckill = jedisSeckill.getSeckill(1);
		System.out.println(reSeckill);
	}
}
