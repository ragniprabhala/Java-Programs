package com.softworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController
{
	@RequestMapping("/hi")
	@ResponseBody
	public String show()
	{
		return "welcome to spring mvc";
		
	}

}
