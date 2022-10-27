package com.springboot.hello.controller;

import com.springboot.hello.domain.dto.MemberDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;
import java.util.Map;

@RestController("/api/v1/get-api")
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello World";
    }
    @GetMapping("/name")
    public String getName(){
        return "hwan";
    }

    @GetMapping(value = "/request1")
    public String getVariable(@RequestParam String name,@RequestParam String email,@RequestParam String organization)
    {
        return String.format("%s %s %s",name,email,organization);
    }
    @GetMapping(value = "/request2")
    public String getVariable2(@RequestParam Map<String, String> param) {
        param.entrySet().forEach((map)->{
            System.out.printf("key:%s value:%s\n",map.getKey(),map.getValue());
        });
        return "request2가 호출 완료 되었습니다";
    }

    @GetMapping(value="/request3")
    public  String getRequestParam(MemberDto memberDto){
        return memberDto.toString();
    }

}
