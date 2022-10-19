package cn.xiaobin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.xiaobin.entity.Role;
import cn.xiaobin.entity.User;

/*
 * 第五节课 @PathVariable
 *1，作用 ： 获取层级参数用的，比如说localhost：8080/path/hello/12345 获取参数12345
 *2，用法 ：
 *      当参数是一个基本数据类型的时候，@PathVariable注解必须有
 *       @RequestMapping("/hello/{id}")
 *       @PathVariable("id") Integer id
 *       
 *      当参数是个对象的时候，@PathVariable注解可以省　但是参数名字必须是对象中的成员变量名字保持一致
 *   
 */

@Controller
@RequestMapping("/path")
public class PathvariableController {

	@RequestMapping("/hello/{id}")
	public String test(@PathVariable("id") Integer id) {
		System.out.println(id);
		return "/index";
	}
	
	@RequestMapping("/hello/{id}/{name}")
	public String test01(Role role) {
		System.out.println(role);
		return "/index";
	}
	
	
	


}
