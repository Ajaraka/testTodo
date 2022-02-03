package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TodoController {
	
	@RequestMapping(value="/")
	public String index(Model model) {
		
		List<String> list = new ArrayList<>();
		list.add("テスト１");
		list.add("テスト２");
		list.add("テスト３");
		
		model.addAttribute("list", list);
		return "todo";
	}
}
