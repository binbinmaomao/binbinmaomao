package cn.xiaobin.interceptor;

import java.util.logging.Handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
/*
 * 拦截器步骤
 * 1，创建一个类，继承HandlerInterceptor接口
 *   这个接口提供了3个方法
 * 2，在spring的配置文件中配置这个类
 *   在执行contorller的方法的时候就会经过这个拦截器
 */
public class interceptors implements HandlerInterceptor {

	
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("-----------実行前------------");
		return true;
	}
	
	public  void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			@Nullable ModelAndView modelAndView) throws Exception {
		//modelAndView.addObject("password", "123");
		
	}
	
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
			@Nullable Exception ex) throws Exception {
	}
}
