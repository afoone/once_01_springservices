package com.once.springservices.service;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;

/**
 * TimeServiceImpl
 */
@Service
@RequestScope
public class TimeServiceImpl implements TimeService {

    private Calendar c;

    @Override
    public String getTiempo() {
        return c.getTime().toString();
    }

    public TimeServiceImpl() {
         c = new GregorianCalendar();
    }
    
}