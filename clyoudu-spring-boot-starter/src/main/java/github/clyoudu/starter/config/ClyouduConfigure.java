package github.clyoudu.starter.config;

import github.clyoudu.starter.business.ClyouduMustLoadClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by IntelliJ IDEA
 *
 * @author chenlei
 * @date 2018/10/3
 * @time 17:51
 * @desc EnableClyoudu
 */
@Configuration
@ConditionalOnClass(ClyouduMustLoadClass.class)
@EnableConfigurationProperties(ClyouduProperties.class)
public class ClyouduConfigure {

    private final ClyouduProperties clyouduProperties;

    public ClyouduConfigure(@Autowired ClyouduProperties clyouduProperties){
        this.clyouduProperties = clyouduProperties;
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(prefix = "github.clyoudu", value = "enabled",havingValue = "true")
    public ClyouduMustLoadClass clyouduMustLoadClass(){
        return new ClyouduMustLoadClass(clyouduProperties.getAuthor(), clyouduProperties.getDate());
    }

}
