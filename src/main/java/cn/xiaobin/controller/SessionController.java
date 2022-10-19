package cn.xiaobin.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

/*
 * 第11讲  session
 * 1，session的使用方法
 *   ①，servletapi的使用方法
 *      在参数中设定Httpsession 把数据填写到session中，然后传个页面
 *   ②，使用Spring注解的方式
 *      使用@Autowired注解的方式将session注入到spring容器中（建议使用这种方式）
 *      
 *   ③，使用springmvc提供的注解SessionAttributes #写入数据（一般不建议使用这种方法）
 *     此注解放在类上
 *     使用此注解，必须使用modelandview  将modelandview的值放到session中，传到页面
 *     上节课学过，modelandview的值会传进request域中，加上session注解，所匹配的值
 *     将会传入sessionScope作用域中
 *     
 * 2，@ModelAttribute：这个注解的意思是调用控制器里任何一个方法的时候，在调用之前
 *   都会调用@ModelAttribute的方法
 *   应用场景： 设定session 但是这种方法存在了线程不安全问题
 *      
 * 总结：线程安全
 * 1，在方法的参数中设定session值，是线程安全的  public String session01(HttpSession session) 
 * 2，使用servlet-api session是线程安全的  
 *    因为springmvc实现servlet-api是用Treadlocal
 * 3，modelAttribute 是线程不安全的
 *     
 */
@Controller
@SessionAttributes({"type","sun"})
public class SessionController {
	
	/*
	 * 使用servletapi
	 */
	@RequestMapping("/session01")
	public String session01(HttpSession session) {
		session.setAttribute("type", "sessionapi");
		return "/session";
	}
	
	/*
	 * 使用spring注入方式
	 */
	@Autowired
	private HttpSession httpsession;
	@RequestMapping("/session02/{name}")
	public String session02(@PathVariable("name") String name) throws Exception {
		Thread.sleep(5000);
		httpsession.setAttribute("type", name);
		return "/session";
	}
	
	
	@RequestMapping("/session03")
	public ModelAndView session03() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/session");
		mv.addObject("type","modelandviewsession");
		mv.addObject("sun","sunxiaobin");
		return mv;
	}
	
	HttpSession hs;
	@ModelAttribute
	public void modelAtr(HttpSession session) {
		hs=session;
	}
	
@RequestMapping("/session04/{name}")
	public String session04(@PathVariable("name") String name) throws Throwable {
		
		
		synchronized (this){
			Thread.sleep(3000);
			hs.setAttribute("type", name);
		}
		
		return "/session";
	}
	
	
}
