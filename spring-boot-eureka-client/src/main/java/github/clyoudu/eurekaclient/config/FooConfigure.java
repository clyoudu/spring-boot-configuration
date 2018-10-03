package github.clyoudu.eurekaclient.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by IntelliJ IDEA
 *
 * @author chenlei
 * @date 2018/10/2
 * @time 0:50
 * @desc FooConfigure
 */
@Configuration
@EnableConfigurationProperties(FooProperties.class)
public class FooConfigure {

    private final FooProperties fooProperties;

    public FooConfigure(FooProperties fooProperties){
        this.fooProperties = fooProperties;
    }

    @Bean("t")
    public FooConfigure fooConfigure(FooProperties fooProperties){
        System.out.println(fooProperties.getBar());
        return new FooConfigure(fooProperties);
    }

    public String getBar(){
        return fooProperties.getBar();
    }

}
