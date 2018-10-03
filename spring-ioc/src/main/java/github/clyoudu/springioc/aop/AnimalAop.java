package github.clyoudu.springioc.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA
 *
 * @author chenlei
 * @date 2018/10/1
 * @time 16:34
 * @desc AnimalAop
 */
@Aspect
@Component
public class AnimalAop {

    @Pointcut("execution(* github.clyoudu.springioc.beans..*.getLanguage(..))")
    public void language(){}

    @Before("language()")
    public void before(){
        System.out.println("before...");
    }

}
