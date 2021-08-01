package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import springmvc.dao.UserDao;
import springmvc.modal.User;

@Controller
public class ContactController {

	@Autowired
	UserDao dao;
	
	
	//this data will automatic will add to model before any handler method
	//that data we can get at jsp page
	@ModelAttribute
	public void commonDataForModel(Model m)
	{
		m.addAttribute("header","hader part");
		m.addAttribute("footer","footer part");
		System.out.println("common method called");
	}
	
	@RequestMapping("/contact")
	public String showForm()
	{
		
		return "contact";
	}
/*	@RequestMapping("/processform")
	public String processForm(@RequestParam("name") String name,
			@RequestParam("email") String email,
			@RequestParam("password") String password)
	{
		
		System.out.println(name);
		System.out.println(email);
		System.out.println(password);
		return "success";
	}*/
	
	@RequestMapping("/processform")
	public String processForm(@ModelAttribute User user,Model model)
	{
		System.out.println(user);
		
		//dao.insert(user);
		
		
		//model.addAttribute("user",user);
		
		return "success";
	}
	
	//for checking redirect:
	
/*	@RequestMapping("/processform")
	public RedirectView processForm(@ModelAttribute User user)
	{
		System.out.println("inside redirect mahtod handler");
		
		      RedirectView redirectView = new RedirectView();
		      redirectView.setUrl("/processfor");
		
		return  redirectView ;
	}*/
	
}
