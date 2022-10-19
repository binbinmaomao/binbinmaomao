package cn.xiaobin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.xiaobin.entity.User;

/*
 * 第一节课内容
 * @requestparam 注解
 *   1，作用 用来重命名用的 当参数重命名为username的时候，访问name将会报错 如果不穿参数也会报错
 *   2，value : 
 *      required  true 默认值（必须穿参数）  false 可以不穿参数
 *      defaultValue 为默认值，当没传递参数值时，默认为这个值
 * 
 * @RquestHeader注解
 *  1，和requestparam用法一样，是把请求头的内容作为参数传入进来 
 *  用法参照show03
 *  
 *      
 * 第二节课内容 复杂类型数据
 * 以方法show02(User user)为例
 * 当参数是复杂数据类型的时候，获取的值就是User类的成员变量
 * 
 * 第三节课内容  requestMapping
 * 1，注释在类上面是为了分辨URL，比如user类的hello role类的hello等
 * 2，params :访问URL必须要的参数
 *        ①，必须有的参数，没有会报错　params = {"username"}必须有username这个参数
 *        ②，必须不能有的参数，有会报错 params = {"!username"}
 *        ③，这个参数的值必须等于XXX，否则报错  params = {"username=sun"} {}里面等号空格需要注意
 *        ④，这个参数的值必须不等于XXX，否则报错 
 * 
 * 3,通配符
 *   ①，？ 任意的一个字符(必须有字符，不然会报错）
 *   ②， * 任意的多个字符
 *   ③， ** 任意的多个层
 *   
 *
 *   
 *   
 */
@Controller
@RequestMapping("/user")
public class UserController {


	@RequestMapping("/hello")
	@ResponseBody
	public String show(@RequestParam(value = "username" , required = false ,defaultValue = "孫暁斌") String name) {
		System.out.println(name);
		return "index.jsp";
	}
	
	@RequestMapping("/sun")
	//@ResponseBody
	public String show02(User user) {
		System.out.println(user);
		return "/index";
	}
	
	@RequestMapping("/li")
	@ResponseBody
	public String show02(String name) {
		System.out.println(name);
		return "/index";
	}
	@RequestMapping("/su")
	@ResponseBody
	public String show03( @RequestHeader("User-Agent") String header) {
		System.out.println(header);
		return "/index";
	}
	
	@RequestMapping(path = "/xiao" , params = {"username!=sun"})
	//@ResponseBody
	public String show04() {
		System.out.println("params必须等于username参数");
		return "/index";
	}
	
	@RequestMapping(path = "/bin?" )
	//@ResponseBody
	public String show05() {
		System.out.println("path是bin❓");
		return "/index";
	}
	
	@RequestMapping(path = "/bin*" )
	//@ResponseBody
	public String show06() {
		System.out.println("path是bin*");
		return "/index";
	}
	
	@RequestMapping(path = "/**/bin*" )
	//@ResponseBody
	public String show07() {
		System.out.println("path是bin**");
		return "/index";
	}

}
