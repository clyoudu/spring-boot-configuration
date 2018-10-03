package github.clyoudu.springioc.beans;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by IntelliJ IDEA
 *
 * @author chenlei
 * @date 2018/10/1
 * @time 14:20
 * @desc Cat
 */
public class Cat {

    private Integer legs;

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
