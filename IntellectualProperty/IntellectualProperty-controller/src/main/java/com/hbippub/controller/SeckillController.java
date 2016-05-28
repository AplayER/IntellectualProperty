/**
 * 
 */
package com.hbippub.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hbippub.pojo.Seckill;
import com.hbippub.service.SeckillService;

/**
 * @author Peter
 *
 */
@Controller
@RequestMapping("/seckill")
public class SeckillController {
	
	@Autowired
	private SeckillService seckillService;
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public String list(Model model) {
		List<Seckill> list = seckillService.getSeckillList();
		model.addAttribute("list",list);
		return "list";
	}
	@RequestMapping(value="/{seckillId}/detail",method=RequestMethod.GET)
	public String detail(Integer seckillId,Model model){
		if (seckillId==null) {
			return "forward:/seckill/list";
		}
		Seckill seckill = seckillService.getSeckillByID(seckillId);
		if (seckill==null) {
			return "forward:/seckill/list";
		}
		model.addAttribute("seckill", seckill);
		return "detail";
	}
	

}
