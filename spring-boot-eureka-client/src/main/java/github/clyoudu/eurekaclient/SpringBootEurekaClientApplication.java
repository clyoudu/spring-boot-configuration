package github.clyoudu.eurekaclient;

import com.alibaba.fastjson.JSONObject;
import github.clyoudu.eurekaclient.config.FooConfigure;
import github.clyoudu.starter.business.ClyouduMustLoadClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@SpringBootApplication
@RestController
public class SpringBootEurekaClientApplication {

	@Autowired
	@Qualifier("fooConfigure")
	FooConfigure fooConfigure;

	@Autowired
	ClyouduMustLoadClass clyouduMustLoadClass;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEurekaClientApplication.class, args);
	}

	@RequestMapping(value = "test", method = RequestMethod.GET)
	public JSONObject test(){
		return new JSONObject()
				.fluentPut("data", new Date())
				.fluentPut("foo.bar", fooConfigure.getBar())
				.fluentPut("info", clyouduMustLoadClass.toString());
	}
}
