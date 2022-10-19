package cn.xiaobin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class I18nController {

	@RequestMapping("/i18n")
	public String showSun() {
		return "/i18n";
	}
	
	@PostMapping("/hirosi")
	public String showSun2() {
		return "/sucess";
	}
}

