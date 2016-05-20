/**
 * 
 */
package com.hbippub.service;

import java.util.List;

import com.hbippub.pojo.HbipPubUser;

/**
 * @author 梁lab 806
 *
 */
public interface UserService {
	HbipPubUser getUserByID(Integer userId);
	String getUserNameByID(Integer userId);
	List<HbipPubUser> getUserByYongHuLeiBie(int type);

}
