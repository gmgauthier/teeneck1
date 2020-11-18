package com.gmgauthier.springboot;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@EnableAutoConfiguration
public class HelloWorldController {

    @RequestMapping("/")
    @ResponseBody
    String hello() {
        return "<h1>Hello World!</h1> \n <h2>Spring boot is so simple.</h2>";
    }

    @RequestMapping("/date")
    @ResponseBody
    String time() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        Date date = new Date(System.currentTimeMillis());
        String strDate = formatter.format(date);
        return "<p><b>The Current Date is:" + strDate + "</b></p>";
    }
}