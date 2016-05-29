/**
 * 
 */
package com.hbippub.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.hbippub.dto.Exposer;
import com.hbippub.dto.SeckillExecution;
import com.hbippub.dto.SeckillResult;
import com.hbippub.exception.RepeatKillException;
import com.hbippub.exception.SeckillCloseException;
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
		return "seckillList";
	}
	@RequestMapping(value="/{seckillId}/detail",method=RequestMethod.GET)
	public String detail(@PathVariable("seckillId") Integer seckillId,Model model){
		if (seckillId==null) {
			return "forward:/seckill/list";
		}
		Seckill seckill = seckillService.getSeckillByID(seckillId);
		if (seckill==null) {
			return "forward:/seckill/list";
		}
		model.addAttribute("seckill", seckill);
		return "seckillDetail";
	}
	
	@RequestMapping(value="/{seckillId}/exposer",
			method=RequestMethod.POST,
			produces="application/json;charset=utf-8")
	@ResponseBody
	public SeckillResult<Exposer> exposer(@PathVariable("seckillId") Integer seckillId){
		SeckillResult<Exposer> result;
		try {
			Exposer exposer = seckillService.exportSeckillUrl(seckillId);
			result = new SeckillResult<Exposer>(true, exposer);
		} catch (Exception e) {
			result = new SeckillResult<Exposer>(false, e.getMessage());
		}
		return result;
		
	}
	@RequestMapping(value="/{seckillId}/{md5}/execution",
			method=RequestMethod.POST,
			produces="application/json;charset=utf-8")
	@ResponseBody
	public SeckillResult<SeckillExecution> execute(@PathVariable("seckillId") Integer seckillId,@PathVariable("md5")String md5,@CookieValue(value="killPhone",required=false)String userPhone){
		SeckillResult<SeckillExecution> result;
		try {
			SeckillExecution execution = seckillService.executeSeckill(seckillId, userPhone, md5);
			result = new SeckillResult<SeckillExecution>(true, execution);
		} 
		catch(RepeatKillException e1){
			SeckillExecution execution = new SeckillExecution(seckillId, -1,"重复秒杀");
			result = new SeckillResult<SeckillExecution>(true, execution);

		}
		catch (SeckillCloseException e2) {
			SeckillExecution execution = new SeckillExecution(seckillId, 0, "秒杀结束");
			result = new SeckillResult<SeckillExecution>(true, execution);

		}
		catch (Exception e) {
			SeckillExecution execution =new SeckillExecution(seckillId, -2, "内部错误");
			result = new SeckillResult<SeckillExecution>(false, execution);
		}
		return result;
	}
	@RequestMapping(value ="/time/now",method=RequestMethod.POST)
	@ResponseBody
	public SeckillResult<Long> time(){
		return new SeckillResult<Long>(true, new Date().getTime());
	}
	

}
