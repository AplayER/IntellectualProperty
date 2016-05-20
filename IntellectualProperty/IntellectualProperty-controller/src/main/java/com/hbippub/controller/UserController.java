/**
 * 
 */
package com.hbippub.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hbippub.mapper.HbipPubUserMapper;
import com.hbippub.pojo.HbipPubUser;
import com.hbippub.pojo.HbipPubUserExample;
import com.hbippub.service.UserService;

/**
 * @author 梁lab 806
 *
 */
@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
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
		HbipPubUserMapper mapper = applicationContext.getBean(HbipPubUserMapper.class);
		HbipPubUserExample example = new HbipPubUserExample();
		example.or().andYonghuleibieEqualTo(1);
		List<HbipPubUser> list = mapper.getLoginInfoByExample(example);
//		for (HbipPubUser hbipPubUser : list) {
//			System.out.println(hbipPubUser.getJiguanquhuaid());
//		}
		HashMap<String, String> userInfo = new HashMap<String, String>();
		userInfo.put("logName", "lww");
		userInfo.put("pwd", "e10adc3949ba59abbe56e057f20f883e");
		HbipPubUser user2 = mapper.getLoginInfoByLogNameAndPwd(userInfo);
			System.out.println(user2.getYonghuid());
		
	}
}
