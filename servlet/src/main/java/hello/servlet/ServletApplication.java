package hello.servlet;

import hello.servlet.web.springmvc.v1.SpringMemberFormControllerV1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@ServletComponentScan //내 패키지부터 하위 패키지 다 뒤져서 서블릿 찾아서 등록하고 실행하게 도움
@SpringBootApplication
public class ServletApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServletApplication.class, args);
	}

}
