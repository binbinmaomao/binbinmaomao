package cn.xiaobin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ModelController {
	
	/*
	 * 第10课 model modelMap map modelandview
	 * 把数据上传到网页的方法
	 * 以下面为例
	 * 这里注意了在JSP中使用EL表达式，必须要导入EL表达式所用的jar包，否则不能用
	 * 其实model就是将数据放进了request作用域
	 * 
	 * ||||||||||||||||||||||||||||||||||||
	 * modelandview（既可以传输数据，又可以视图）
	 * 用法和model modelmap 不太一样
	 * 设定跳转的URL有2中方法
	 * 1，构造函数里设定 ModelAndView mv = new ModelAndView("URL")
	 * 2,mv.setViewName("/index");
	 */
	
	@RequestMapping(value="/model", params = {"username=sun"})
	public String model01(Model model) {
		model.addAttribute("type", "model");
		return "/index";
	}
	
	@RequestMapping(value="/modelmap")
	public String model01(ModelMap modelmap) {
		modelmap.addAttribute("type", "modelmap");
		return "/index";
	}
	
	
	@RequestMapping(value="/modelandview")
	public ModelAndView model02() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/index");
		mv.addObject("type", "modelandview");
		return mv;
	}

}
