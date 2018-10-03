package github.clyoudu.eurekaclient.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA
 *
 * @author chenlei
 * @date 2018/10/1
 * @time 23:58
 * @desc FooProperties
 */
@Component
@ConfigurationProperties(prefix = "foo")
public class FooProperties {

    String bar;

    public String getBar() {
        return bar;
    }

    public void setBar(String bar) {
        this.bar = bar;
    }
}
