package com.hbippub.service;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hbippub.mapper.HbipPubFollowingMapper;
import com.hbippub.mapper.HbipPubUserMapper;
import com.hbippub.pojo.HbipPubFollowing;
import com.hbippub.pojo.HbipPubFollowingExample;
import com.hbippub.pojo.HbipPubUser;
import com.hbippub.pojo.HbipPubUserExample;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private HbipPubUserMapper userMapper;
	@Autowired
	private HbipPubFollowingMapper followingMapper;
	
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
		userExample.or().andYonghuidEqualTo(userId).andShifoudingyuexinwenEqualTo(0);
		List<HbipPubUser> list = userMapper.selectByExample(userExample);
		if (list!=null&&list.size()>0) {
			return list.get(0);
		}
		return null;
	}

	@Override
	public String getUserNameByID(Integer userId) {
		HbipPubUserExample userExample = new HbipPubUserExample();
		userExample.or().andYonghuidEqualTo(userId).andShifoudingyuexinwenEqualTo(0);
//		List<String> list = userMapper.selectByExample(userExample);
		return null;
	}

	@Override
	public List<HbipPubUser> getUserByYongHuLeiBie(int type) {
		HbipPubUserExample userExample = new HbipPubUserExample();
		userExample.or().andYonghuleibieGreaterThan(type).andShifoudingyuexinwenEqualTo(0);
		List<HbipPubUser> list = userMapper.selectByExample(userExample); 
		return list;
	}

	@Override
	public Integer createUser(HbipPubUser user) {
		int res = userMapper.addUser(user);
		return res;
	}

	@Override
	public Integer updateUserInfo(Integer userId, HbipPubUser userInfo) {
		HbipPubUserExample example = new HbipPubUserExample();
		example.or().andYonghuidEqualTo(userId);
		int res = userMapper.updateUserInfoByExample(userInfo, example);
		return res;
	}

	@Override
	public Integer updateUserPassword(int userId, String newPwd, String oldPwd) {
		if (oldPwd.equals(userMapper.getUserInfo(userId).getMima())) {
			int res = userMapper.updateUserPassword(userId, newPwd);
			return res;
		}
		else {
			return 0;
		}
	}

	@Override
	public Boolean checkExistMail(String email) {
		HbipPubUserExample example = new HbipPubUserExample();
		example.or().andYouxiangEqualTo(email).andShifoudingyuexinwenEqualTo(0);
		if (!userMapper.selectByExample(example).isEmpty()) {
			return true;
		}
		return false;
	}

	@Override
	public Boolean checkExistUserName(String userName) {
		HbipPubUserExample example = new HbipPubUserExample();
		example.or().andYouxiangEqualTo(userName).andShifoudingyuexinwenEqualTo(0);
		if (!userMapper.selectByExample(example).isEmpty()) {
			return true;
		}
		return false;
	}

	@Override
	public Boolean checkExistPhoneNumber(String userPhone) {
		HbipPubUserExample example = new HbipPubUserExample();
		example.or().andYouxiangEqualTo(userPhone).andShifoudingyuexinwenEqualTo(0);
		if (!userMapper.selectByExample(example).isEmpty()) {
			return true;
		}
		return false;
	}

	@Override
	public Integer userSearchCount(String userName) {
		HbipPubUserExample example = new HbipPubUserExample();
		example.or().andYonghumingEqualTo(userName);
		List<HbipPubUser> list = userMapper.selectByExample(example);
		return list.size();
	}

	@Override
	public List<HbipPubUser> baseSearchUser(String userName) {
		HbipPubUserExample example = new HbipPubUserExample();
		example.or().andYonghumingEqualTo(userName);
		List<HbipPubUser> list = userMapper.selectByExample(example);
		return list;
	}

	@Override
	public Integer passAuthenticationOrNot(int userId,short status) {
		HbipPubUser user = userMapper.getUserInfo(userId);
		user.setZhuangtai((int)status);
		user.setTijiaoshenheshijian(new Date());
		HbipPubUserExample example = new HbipPubUserExample();
		example.or().andYonghuidEqualTo(userId);
		int res = userMapper.updateUserInfoByExample(user, example);
		return res;
	}

	@Override
	public List<HbipPubUser> getUserInfo(HbipPubUserExample example) {
		return userMapper.selectByExample(example);
	}

	@Override
	public Integer getUserFansCount(Integer userId) {
		HbipPubFollowingExample example = new HbipPubFollowingExample();
		example.or().andYonghuidEqualTo(userId);
		int res = followingMapper.selectByExample(example).size();
		return res;
	}

	@Override
	public List<HbipPubUser> getUserFansList(Integer userId) {
		HbipPubUser user = new HbipPubUser();
		List<HbipPubUser> list = new LinkedList<HbipPubUser>();
		HbipPubFollowingExample example = new HbipPubFollowingExample();
		example.or().andYonghuidEqualTo(userId);
		for (HbipPubFollowing following : followingMapper.selectByExample(example)) {
			user.setYonghuid(following.getBeiguanzhuyonghuid());
			user.setYonghuming(following.getBeiguanzhuyonghuxingming());
			list.add(user);
		}
		return list; 
	}

	@Override
	public Integer getFollowsCount(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<HbipPubUser> getFollowsList(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean followUserOrNot(Integer userId, Integer followId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean isFollowed(String userId, String followId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer setBlackOrNot(Integer userId, Integer blackId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean isBlack(Integer userId, Integer blackId) {
		// TODO Auto-generated method stub
		return null;
	}


}
