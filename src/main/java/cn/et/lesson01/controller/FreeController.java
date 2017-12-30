package cn.et.lesson01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FreeController {

	
	@RequestMapping("/indexFtl")
	public String indexFtl(Model model){
		model.addAttribute("hobbyArr", new String[]{"A","B"});
		return "index";
	}
}
