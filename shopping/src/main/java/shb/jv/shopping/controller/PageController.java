package shb.jv.shopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value={"/","/home","/index","/shabab"})
	public ModelAndView index(){
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("greeting", "Welcome to Spring Web MVC by Shabab Akbar");
		return mv;
	}
}
