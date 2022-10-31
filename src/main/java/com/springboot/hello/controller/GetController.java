package com.springboot.hello.controller;

import com.springboot.hello.domain.dto.MemberDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/get-api")
@Slf4j
public class GetController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        log.info("hello로 요청이 들어왔습니다.");
        return "Hello World";
    }

    @GetMapping(value = "/name")
    public String getName() {
        log.info("getName으로 요청이 들어왔습니다.");
        return "Kyeongrok";
    }

    @GetMapping(value = "/variable1/{variable}")
    public String getVariable1(@PathVariable String variable) {
        log.info("getVariable1으로 요청이 들어왔습니다. variable:{}", variable);
        return variable;
    }
    // DTO를 통해 Query Parameter 받기
    @GetMapping("/request-dto")
    public String getRequestDto(MemberDto memberDto) {
        return memberDto.toString();
    }

}
