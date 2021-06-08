package com.okteto.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestHelloWorld {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "[{\"temp\":\"20℃/30℃\",\"weather\":\"晴天多云\",\"name\":\"北京\",\"pm\":\"80\",\"wind\":\"1级\"},\n" +
                "  {\"temp\":\"15℃/24℃\",\"weather\":\"晴天\",\"name\":\"成都\",\"pm\":\"98\",\"wind\":\"3级\"},\n" +
                "  {\"temp\":\"15℃/24℃\",\"weather\":\"晴天\",\"name\":\"上海\",\"pm\":\"98\",\"wind\":\"3级\"},\n" +
                "  {\"temp\":\"26℃/32℃\",\"weather\":\"多云\",\"name\":\"广州\",\"pm\":\"30\",\"wind\":\"2级\"}]";
	}
}
