package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/first")
public class HomeController {
	@RequestMapping("/home")
	public String home(Model model)
	{
		model.addAttribute("name","Rahul verma");
		
		System.out.println("this is home url");
		return "index";
		
	}
	@RequestMapping("/about")
	public String about() {
		System.out.println("this is home url 2");
		return "about";
	}
	@RequestMapping("/help")
public ModelAndView help() {
	ModelAndView modelandview = new ModelAndView();
	modelandview.addObject("name","Rahul kumar Verma");
	modelandview.addObject("id",74732);
	LocalDateTime ldt =LocalDateTime.now();
	modelandview.addObject("time", ldt);
	List<Integer> list = new ArrayList();
	list.add(324);
	list.add(654);
	list.add(654);
	list.add(665);
	list.add(9999);
	modelandview.addObject("numbers", list);
	
	modelandview.setViewName("help");
	return modelandview;
	
	
	
}
}
