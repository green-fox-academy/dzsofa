package com.greenfox.frontend.services;

import com.greenfox.frontend.models.Log;
import com.greenfox.frontend.repositories.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
public class LogService {

    @Autowired
    LogRepository logRepository;

    public void saveGetMappingLog(HttpServletRequest request) {
        String endpoint = request.getServletPath();
        String data = request.getQueryString();
        logRepository.save(new Log(endpoint, data));
    }
//
//    public void savePostMappingLog(HttpServletRequest request, ) {
//        String endpoint = request.getServletPath();
//        String data = request.getParameter("keyword");
//        logRepository.save(new Log(endpoint, data));
//    }
}
