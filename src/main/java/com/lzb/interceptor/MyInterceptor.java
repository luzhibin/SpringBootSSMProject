package com.lzb.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//配置springbott里的spring-mvc拦截器
    @Slf4j
//创建拦截器实现HandlerInterceptor接口
public class MyInterceptor implements HandlerInterceptor {
        /*拦截器的中方法将按preHandle→Controller→postHandle→afterCompletion的顺序执行。注意，只有preHandle方法返回true时后面的方法才会执行，
        当拦截器链内存在多个拦截器时，postHandle在拦截器链内的所有拦截器返回成功时才会调用，而afterCompletion只有preHandle返回true才调用，
        但若拦截器链内的第一个拦截器的preHandle方法返回false，则后面的方法都不会执行。
        * */

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.debug("MyInterceptor-------preHandle");
        return true;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
        System.out.println("MyInterceptor--------postHandle");

    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {
        System.out.println("MyInterceptor--------afterCompletion");
    }

}
