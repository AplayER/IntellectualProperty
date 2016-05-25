/**
 * 
 */
package com.hbippub.service;

import java.util.List;

import com.hbippub.pojo.HbipPubUser;
import com.hbippub.pojo.HbipPubUserExample;

/**
 * @author 梁lab 806
 *
 */
public interface UserService {
	/**
	 * @param userId
	 * @return
	 */
	HbipPubUser getUserByID(Integer userId);
	/**
	 * @param userId
	 * @return
	 */
	String getUserNameByID(Integer userId);
	/**
	 * @param type
	 * @return
	 */
	List<HbipPubUser> getUserByYongHuLeiBie(int type);
    /**
     * @param user
     * @return
     */
    Integer createUser(HbipPubUser user);
    /**
     * @param userId
     * @param userInfo
     * @return
     */
    Integer updateUserInfo(Integer userId,HbipPubUser userInfo);
    /**
     * @param userId
     * @param newPwd
     * @param oldPwd
     * @return
     */
    Integer updateUserPassword(int userId,String newPwd,String oldPwd);
    /**
     * @param email
     * @return
     */
    Boolean checkExistMail(String email);
    /**
     * @param userName
     * @return
     */
    Boolean checkExistUserName(String userName);
    /**
     * @param userPhone
     * @return
     */
    Boolean checkExistPhoneNumber(String userPhone);
    /**
     * @param userName
     * @return
     */
    Integer userSearchCount(String userName);
    /**
     * @param example
     * @return
     */
    List<HbipPubUser> baseSearchUser(String userName);
    /**
     * @param userId
     * @return
     */
    Integer passAuthenticationOrNot(int userId,short status);
    /**
     * @param example
     * @return
     */
    List<HbipPubUser> getUserInfo(HbipPubUserExample example);
    /**
     * @param userId
     * @return
     */
    Integer getUserFansCount(Integer userId);
    /**
     * @param userId
     * @return
     */
    List<HbipPubUser> getUserFansList(Integer userId);
    /**
     * @param userId
     * @return
     */
    Integer getFollowsCount(Integer userId);
    /**
     * @param userId
     * @return
     */
    List<HbipPubUser> getFollowsList(Integer userId);
    /**
     * @param userId
     * @param followId
     * @return
     */
    Boolean followUserOrNot(Integer userId,Integer followId);
    /**
     * @param userId
     * @param followId
     * @return
     */
    Boolean isFollowed(String userId,String followId);
    /**
     * @param userId
     * @param blackId
     * @return
     */
    Integer setBlackOrNot(Integer userId,Integer blackId);
    /**
     * @param userId
     * @param blackId
     * @return
     */
    Boolean isBlack(Integer userId,Integer blackId);
    
    
    
    
}
