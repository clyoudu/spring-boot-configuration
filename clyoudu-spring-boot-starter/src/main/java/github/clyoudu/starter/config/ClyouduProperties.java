package github.clyoudu.starter.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by IntelliJ IDEA
 *
 * @author chenlei
 * @date 2018/10/3
 * @time 17:46
 * @desc ClyouduProperties
 */
@ConfigurationProperties(prefix = "github.clyoudu")
public class ClyouduProperties {

    private String author;

    private String date;

    public String getAuthor() {
        return author;
    }

    public String getDate() {
        return date;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
