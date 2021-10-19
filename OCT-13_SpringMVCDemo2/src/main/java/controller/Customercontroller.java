package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Customercontroller {
	
	@RequestMapping(value="/login form",method=RequestMethod.GET)
	public ModelAndView getlogin() 
	{
		ModelAndView model = new ModelAndView("loginform");
		return model;
	}

}
