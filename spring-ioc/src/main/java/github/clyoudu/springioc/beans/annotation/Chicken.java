package github.clyoudu.springioc.beans.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA
 *
 * @author chenlei
 * @date 2018/10/1
 * @time 14:28
 * @desc Chicken
 */
@Component
public class Chicken {

    @Value("#{chickenProperties.legs}")
    private Integer legs;

    @Value("#{chickenProperties.language}")
    private String language;

    public Integer getLegs() {
        return legs;
    }

    public void setLegs(Integer legs) {
        this.legs = legs;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

}
