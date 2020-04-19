package org.snot.springboottemplate.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@Slf4j
public class ZipkinController {


    @RequestMapping("/**")
    public void zipkin(HttpServletRequest request, @RequestBody String body, HttpServletResponse response) throws IOException {
        log.info("URI: " + request.getRequestURI());
        log.info("Body: " + body);
        response.setStatus(HttpStatus.OK.value());
    }

}
