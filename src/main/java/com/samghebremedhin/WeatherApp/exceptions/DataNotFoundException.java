package com.samghebremedhin.WeatherApp.exceptions;

import org.springframework.web.bind.annotation.ResponseStatus;
import javax.swing.plaf.PanelUI;

    @ResponseStatus
    public class DataNotFoundException extends RuntimeException{
        private static final long serialVersionUID = 1L;

        public DataNotFoundException(String message){
            super(message);
        }

        public DataNotFoundException(String message, Throwable throwable){
            super(message, throwable);
        }
    }

