package com.example.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
// → @Controller 애너테이션을 적용하면 MainController 클래스는 스프링부트의 컨트롤러가 된다
public class MainController {

    @GetMapping("/sbb")
    //@GetMapping애너테이션은 요청된 URL과의 매핑을 담당
    // 서버에 요청이 발생하면 스프링부트는 요청 페이지와 매핑되는 메서드를 컨트롤러를 대상을 ㅗ찾는다
    @ResponseBody
    //@ResponseBody애너테션은 URL 요청에 대한 응답으로 문자열을 리턴하라는 의미이다.
    public String index() {
        return "안녕하세요 sbb에 오신것을 환영합니다.";
        // http://localhost:9000/sbb를 주소창에 입력하여 접속하면 웹에 "안녕하세요 sbb에 오신것을 환영합니다." 라는 문구가 출력된다.
    }

    @GetMapping("/")
    public String root() {
        return "redirect:/question/list";
    }
}