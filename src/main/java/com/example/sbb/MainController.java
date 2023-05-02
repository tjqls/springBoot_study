package com.example.sbb;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    int count =0;

    @GetMapping("/plus")
    @ResponseBody
    public int showPlus(int a, int b){
        return a+b;
    }

    @GetMapping("/minus")
    @ResponseBody
    public int minus(int a, int b){
        return a-b;
    }

    @GetMapping("/increase")
    @ResponseBody
    public int increase(){
        return count++;
    }

    @GetMapping("/mbti/{name}")
    @ResponseBody
    public String showMbti(@PathVariable String name){
        return switch (name) {
            case "홍길동" -> "INFP";
            case "홍길순","임꺽정" -> "ENFP";
            case "반장" -> "ESTJ";
            case "서빈" -> {
                char P = 'P';
                yield  "ISF" + P;
            }
            default -> "모름";

        };
    }

}
