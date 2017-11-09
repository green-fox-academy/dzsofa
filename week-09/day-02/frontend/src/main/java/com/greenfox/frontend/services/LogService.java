package com.greenfox.frontend.services;

import com.greenfox.frontend.models.DoUntil;
import com.greenfox.frontend.models.Log;
import com.greenfox.frontend.repositories.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Field;
import java.util.List;

@Component
public class LogService {

    @Autowired
    LogRepository logRepository;

    public void saveGetMappingLog(HttpServletRequest request) {
        String endpoint = request.getServletPath();
        String data = request.getQueryString();
        logRepository.save(new Log(endpoint, data));
    }

    public void saveGetMappingLogWithPathVariable(HttpServletRequest request, String pathVariable) {
        String endpoint = request.getServletPath();
        String data = pathVariable;
        logRepository.save(new Log(endpoint, data));
    }

    public void savePostMappingLog(HttpServletRequest request, Object myObject) {
        String endpoint = request.getServletPath();
        String data = myObject.toString();
        logRepository.save(new Log(endpoint, data));
    }

    public List<Log> getAll() {
        return logRepository.findAll();
    }
}
