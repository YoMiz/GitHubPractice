package com.example.app.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.app.domain.JournalClass;
import com.example.app.mapper.JournalMapper;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class MainController {
	private final JournalMapper journalMapper;
	
	@GetMapping("/main")
	public String showMainPage(Model model) throws Exception{
		List<JournalClass> journals= journalMapper.journalList();
		model.addAttribute("journals", journals);
		return "/test";
		
	}
}
