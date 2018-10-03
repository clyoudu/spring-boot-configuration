package github.clyoudu.springioc;

import github.clyoudu.springioc.beans.Cat;
import github.clyoudu.springioc.beans.annotation.Chicken;
import github.clyoudu.springioc.beans.Dog;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by IntelliJ IDEA
 *
 * @author chenlei
 * @date 2018/10/1
 * @time 14:23
 * @desc Application
 */
public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:ApplicationContext*.xml");
        //ApplicationContext applicationContext = new AnnotationConfigApplicationContext("github.clyoudu.springioc");

        Dog dog = applicationContext.getBean(Dog.class);
        System.out.println(dog.getLanguage());

        Cat cat = applicationContext.getBean(Cat.class);
        System.out.println(cat.getLanguage());

        Chicken chicken = applicationContext.getBean(Chicken.class);
        System.out.println(chicken.getLanguage());
    }

}
