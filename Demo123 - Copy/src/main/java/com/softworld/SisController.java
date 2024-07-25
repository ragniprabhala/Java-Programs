package com.softworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/sis")
public class SisController 
{
	
	@RequestMapping("/paint")
	@ResponseBody
	public String getCanvas()
	{
		return "here is ur canvas";
	}
	
	
	@RequestMapping("/Book")
	@ResponseBody
	public String getBook()
	{
		return "Spring notes";
	}

}
