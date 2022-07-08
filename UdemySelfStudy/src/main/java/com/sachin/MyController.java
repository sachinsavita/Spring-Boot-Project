package com.sachin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	@RequestMapping("/")
	public String sayHello()
	{
		System.out.println("Or bhai kese ho?");
		return "index.jsp";
	}
	
	@RequestMapping("name")
	public ModelAndView showName(@RequestParam("firstname")String fname,@RequestParam("lastName") String lname)
	{
		ModelAndView mv = new ModelAndView();
		return mv;
	}

}
