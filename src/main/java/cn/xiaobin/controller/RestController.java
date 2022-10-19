package cn.xiaobin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.xiaobin.entity.User;

/*
 *第六节课 rest
 *1，
 * 	询用户: http://localhost:8080/xxx/user/1 GET ­­查询
	查询多个用户: http://localhost:8080/xxx/users GET
	新增用户: http://localhost:8080/xxx/user POST ­­­新增
	修改用户: http://localhost:8080/xxx/user/1 PUT ­­修改
	删除用户:http://localhost:8080/xxx/user/1 DELETE ­­删除
  2.
    html中的form表单无法支持put，delete请求
    解决方案:
     在web.xml文件中添加过滤器HiddenHttpMethodFilter
     在form表单中添加一个名字为_method的隐藏作用域
		<input type="hidden" value="put" name="_method">

	 由于jsp也不支持put delete请求所以页面也会报错，使用重定向的方法解决
	    返回值设定为  return "redirect:/index.jsp";
 */
@Controller
@RequestMapping("/rest")
public class RestController {

	/*
	 * 查询一个id为XX的user
	 * get请求一般用于查询
	 * @GetMaping 相当于使用注解@RequestMapping 的get请求 
	 */
	@GetMapping("/user/{id}")
	public String rest01(@PathVariable("id") Integer id) {
		System.out.println("查询一条数据id＝"+id);
		return "/index";
	}
	
	/*
	 * 增加一条user数据
	 * post请求相当于增加
	 * @PostMapping 相当于使用注解@RequestMapping 的post请求 
	 */
	@PostMapping("/user")
	public String rest02(User user) {
		System.out.println("添加一条user数据"+user);
		return "/index";
	}
	/*
	 * 修改一条数据
	 * 使用put请求
	 * 
	 */
	@PutMapping("/user/{id}")
	public String rest03(User user) {
		System.out.println("修改一条user数据"+user);
		return "redirect:/index";	
	}
	
	/*
	 * 删除一条数据
	 * 使用delete请求
	 * 
	 */
	@DeleteMapping("/user/{id}")
	public String rest04(User user) {
		System.out.println("删除一条user数据"+user);
		return "redirect:/index";	
	}
	
	

}
