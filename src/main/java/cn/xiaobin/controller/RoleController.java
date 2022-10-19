package cn.xiaobin.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.xiaobin.entity.Role;



@Controller
public class RoleController {
	
	@PostMapping("/test")
	public String test01(@Valid Role role,BindingResult result,Model model) {
		
		System.out.println(role);
		if (result.hasErrors()) {
			List<FieldError> errors=result.getFieldErrors();
			Map<String,String> errorMap = new HashMap<>();
			for(FieldError er:errors) {
				errorMap.put(er.getField(),er.getDefaultMessage());
			}
			model.addAttribute("error", errorMap);
			return "/role";
		}
		return "/index";
	}
	
	@RequestMapping("/test02")
	public String test02(@Valid Role role, BindingResult result,Model model) {
		if (result.hasErrors()) {
			return "/role2";
		}
		System.out.print(role);
		return "/index2";
	}
	
	@RequestMapping("/add")
	public String add(Model model){
		model.addAttribute("role",new Role());
		return "/role2";
	}
	
	
}
