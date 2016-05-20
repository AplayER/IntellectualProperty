package com.hbippub.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hbippub.mapper.HbipPubUserMapper;
import com.hbippub.pojo.HbipPubUser;
import com.hbippub.pojo.HbipPubUserExample;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private HbipPubUserMapper userMapper;
	
	/**
	 *
	 *函数名：		getUserByID
	 *输入：		Integer userId
	 *返回值：		HbipPubUser类型的bean
	 *功能：		通过userId获取用户信息
	 *创建人：		石昌民
	 *创建时间：	2016-05-20
	 */
	@Override
	public HbipPubUser getUserByID(Integer userId) {
		HbipPubUserExample userExample = new HbipPubUserExample();
//		Criteria userCriteria = userExample.createCriteria();
//		userCriteria.andYonghuidEqualTo(userId);
		userExample.or().andYonghuidEqualTo(userId);
		List<HbipPubUser> list = userMapper.selectByExample(userExample);
		if (list!=null&&list.size()>0) {
			return list.get(0);
		}
		return null;
	}

	@Override
	public String getUserNameByID(Integer userId) {
		HbipPubUserExample userExample = new HbipPubUserExample();
		userExample.or().andYonghuidEqualTo(userId);
//		List<String> list = userMapper.selectByExample(userExample);
		return null;
	}

	@Override
	public List<HbipPubUser> getUserByYongHuLeiBie(int type) {
		HbipPubUserExample userExample = new HbipPubUserExample();
		userExample.or().andYonghuleibieGreaterThan(type);
		List<HbipPubUser> list = userMapper.selectByExample(userExample); 
		return list;
	}


}
