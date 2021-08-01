package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home()
	{
		System.out.println("hello this is home url ");
		return "index";
	}
	

	@RequestMapping("/about")
	public String about(Model model)
	{
		System.out.println("hello this is about url ");
		model.addAttribute("name","yash");
		return "about";
	}
	
	//using ModalAndView object for sending data
	@RequestMapping("/help")
	public ModelAndView help()
	{
		ModelAndView m = new  ModelAndView();
		
		m.addObject("name","yash");
		m.addObject("roll","101");
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(101);
		list.add(102);
		list.add(103);
		
		m.addObject("list",list);
		
		
		m.setViewName("help");
		
		return m;
		
	}
	
}
