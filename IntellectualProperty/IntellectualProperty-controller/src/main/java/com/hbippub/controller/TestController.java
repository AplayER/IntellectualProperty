/**
 * 
 */
package com.hbippub.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.hbippub.mapper.HbipPubUserMapper;
import com.hbippub.mapper.SeckillMapper;
import com.hbippub.mapper.SuccessKilledMapper;
import com.hbippub.pojo.HbipPubUser;
import com.hbippub.pojo.Seckill;
import com.sun.xml.internal.xsom.impl.Ref.ContentType;

/**
 * @author Peter
 *
 */
@Controller
public class TestController {
	@Autowired
	private HbipPubUserMapper mapper;
	@Autowired
	private SeckillMapper seckillMapper;
	@Autowired
	private SuccessKilledMapper successKilledMapper;
	
	/*
	 * 下面的方法是为了测试一些数据类型的绑定，如包装类型、基本类型、简单对象和自定义多级对象等；
	 */
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
	//to http://localhost:8080/object.do?xingming=Tom&nicheng=Lucy
	@RequestMapping(value="object.do")
	@ResponseBody
	public String object(HbipPubUser hbippubuser){
		return hbippubuser.toString();
	}
	@RequestMapping("object2.do")
	public @ResponseBody HbipPubUser object2(HbipPubUser hbipPubUser){
		return hbipPubUser;
	}
	@InitBinder("hbippubuser")  
	public void initUser(WebDataBinder binder){
		binder.setFieldDefaultPrefix("user.");
	}
	@RequestMapping("/book")
	@ResponseBody
	public String book(HttpServletRequest request){
		String contentType = request.getContentType();
		if (contentType.equals("txt")) {
			return "book.txt";
		}else if(contentType.equals("html")){
			return "book.html";
		}else {
			return "book.default";
		}
	}
	/*
	 * This is some method for testing http method ,just like GET,POST,PUT and DELETE
	 */
	@RequestMapping(value="/book/{bookId}",method=RequestMethod.GET)
	@ResponseBody
	public String bookGet(@PathVariable("bookId") String bookId){
		return "This is a get method,and bookID is "+bookId;
	}
	@RequestMapping(value="/book/{bookId}",method=RequestMethod.POST)
	@ResponseBody
	public String bookPost(@PathVariable("bookId") String bookId){
		return "This is a post method,and bookID is "+bookId;
	}
	@RequestMapping(value="/book/{bookId}",method=RequestMethod.PUT)
	@ResponseBody
	public String bookPut(@PathVariable("bookId") String bookId){
		return "This is a put method,and bookID is "+bookId;
	}
	@RequestMapping(value="/book/{bookId}",method=RequestMethod.DELETE)
	@ResponseBody
	public String bookDelete(@PathVariable("bookId") String bookId){
		return "This is a delete method,and bookID is "+bookId;
	}
	
	/*
	 * 这是为了测试SpringMVC的拦截器的功能
	 */
	@RequestMapping("/viewAll")
	public ModelAndView viewAll(String name,String pwd){
		ModelAndView mv= new ModelAndView();
		System.out.println("进入了控制器的viewAll方法");
		System.out.println("name="+name);
		System.out.println("pwd="+pwd);
		mv.setViewName("/index");
		return mv; 
	}
	/*
	 * 测试文件上传的功能
	 */
	@RequestMapping("/file")
	public String upload(){
		return "file";
	}
	@RequestMapping("/file/upload")
	public String doUpload(@RequestParam("file") MultipartFile file) throws IOException{
		if (!file.isEmpty()) {
			FileUtils.copyInputStreamToFile(file.getInputStream(), new File("c:\\test\\",System.currentTimeMillis()+file.getOriginalFilename()));
		}
		return "success";
	}
	
	@RequestMapping("/db")
	@ResponseBody
	public String getUserName(){
		int userId = 2;
		HbipPubUser user = mapper.getUserInfo(userId);
		return user.getXingming();
	}
	@RequestMapping(value="/miaosha/{seckillId}")
	public @ResponseBody Seckill getSeckill(@PathVariable("seckillId")Integer seckillId){
		return seckillMapper.queryById(seckillId);	
	}
	@RequestMapping(value="/miaosha2/{seckillId}")
	public @ResponseBody Seckill getSeckill2(@PathVariable("seckillId")Integer seckillId){
		return seckillMapper.selectByPrimaryKey(seckillId);	
	}
}
