package com.sh.app;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Slf4j
public class AppController {

    @Value("${app.version}")
    private String appVersion;

    @GetMapping
    @ResponseBody   //리턴한 객체를 바로 응답 메시지에 써달라
    public String index(){
        log.info("GET / : app version : {}", appVersion);
        return "Welcome to Hello world application 🦄 : version " + appVersion;
    }
}
