package com.cydercode;

import org.springframework.stereotype.Service;

@Service
public class ExampleService {

    public String convertText(String text) {
        return text.toUpperCase();
    }
}
