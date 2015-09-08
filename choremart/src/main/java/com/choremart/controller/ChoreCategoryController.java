package com.choremart.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.choremart.model.ChoreCategory;
//import com.choremart.model.Chore;
//import com.choremart.service.ChoreService;

@Controller
@SessionAttributes("choreCategory")
public class ChoreCategoryController {
	
	@RequestMapping(value = "/addChoreCat", method = RequestMethod.GET)
	public String addChoreCategory(Model model) {
		ChoreCategory choreCat = new ChoreCategory();
		model.addAttribute("choreCat", choreCat);
		
		return "addGoal";
		
	}
		
		@RequestMapping(value = "addChoreCat", method = RequestMethod.POST)
		public String updateChoreCat(@Valid @ModelAttribute("choreCategory") ChoreCategory choreCat, BindingResult result) {
			
			System.out.println("result has errors: " + result.hasErrors());
			
			System.out.println("Category name: " + choreCat.getCat_name());
			
			if(result.hasErrors()) {
				return "addCategory";
			}
			
			return "redirect:index.jsp";
		}
	}

