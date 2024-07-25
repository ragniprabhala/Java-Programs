package com.softworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MotherController
{
	@RequestMapping("/sugar")
	@ResponseBody
	public String show()
	{
		return "take the sugar";
	}

}

