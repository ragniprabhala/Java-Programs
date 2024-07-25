package com.softworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BroController 
{

	@RequestMapping("/cricketbat")
	@ResponseBody
	
	public String getCricketBat()
	{
		return "hey ..this is ur cricket bat";
	}
}
