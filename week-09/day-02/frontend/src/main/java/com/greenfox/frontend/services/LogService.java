package com.greenfox.frontend.services;

import com.greenfox.frontend.models.Log;
import com.greenfox.frontend.repositories.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LogService {

    @Autowired
    LogRepository logRepository;

}
