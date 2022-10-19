package cn.xiaobin.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.xiaobin.entity.Role;

@Controller
//@RestController

public class JsonController {
	@PutMapping("/bin/xiao")
	@ResponseBody
	public Role test(@RequestBody Role role) {
		//Role role = new Role();
		//role.setId(9);
		//role.setName("sunbo");
		System.out.println(role);
		
		
		return role;
	}
	
	@RequestMapping("/binbin")	
	public String test02() {
		return "/json";
	}

}
