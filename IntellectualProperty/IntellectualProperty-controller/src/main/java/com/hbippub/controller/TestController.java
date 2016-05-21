/**
 * 
 */
package com.hbippub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hbippub.pojo.HbipPubUser;

/**
 * @author Peter
 *
 */
@Controller
public class TestController {
	
	//todo http://localhost:8080/baseType.do?xage=10
	@RequestMapping(value="baseType.do")
	@ResponseBody
	public String baseType(@RequestParam("xage") int age ){
		return "age"+age;
	}
	//todo http://localhost:8080/baseType2.do?age=10
	@RequestMapping(value="baseType2.do")
	@ResponseBody
	public String baseType2(Integer age ){
		return "age"+age;
	}
	//todo http://localhost:8080/array.do?name=Tom&name=Lucy
	@RequestMapping(value="array.do")
	@ResponseBody
	public String array(String[] name){
			
		return "name"+name.toString();
	}
	
	//to http://localhost:8080/array2.do?name=Tom&name=Lucy
	@RequestMapping(value="array2.do")
	@ResponseBody
	public String array2(String[] name){
		StringBuilder str = new StringBuilder();
		for (String string : name) {
			str.append(""+string);
		}
		return "name"+str.toString();
	}
	//to http://localhost:8080/object.do?name=Tom&name=Lucy
	@RequestMapping(value="object.do")
	@ResponseBody
	public String object(HbipPubUser user){
		return user.toString();
	}
}
