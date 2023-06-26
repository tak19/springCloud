package com.example.demo.controller;

import com.example.demo.dto.JaeDto;
import com.example.demo.dto.Response;
import com.example.demo.dto.TestDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class takcontroller {
    @GetMapping("/tak")
    public Response<TestDto> test(){
        TestDto testDto = new TestDto();
        testDto.setName("tak");

        Response<TestDto> response = new Response<>();
        response.setCode(200);
        response.setData(testDto);
        response.setMessage("정상적으로 탁승옥 이름이 나왔습니다.");

        return response;
    }

    @GetMapping("/error")
    public Response<TestDto> test2(){

        Response<TestDto> response = new Response<>();
        response.setCode(401);
        response.setData(null);
        response.setMessage("tak api 에서 잘못된 데이터가 삽입되었씁니다.");

        return response;
    }

    @GetMapping("/Jae")
    public  Response<JaeDto> test03(){
        JaeDto jaedto = new JaeDto();
        jaedto.setName("황재영");
        jaedto.setNickName("JJaeki");
        jaedto.setAge(27);

        Response<JaeDto> response = new Response<>();
        response.setCode(200);
        response.setData(jaedto);
        response.setMessage("데이터 삽입 완료");

        return response;
    }
}
