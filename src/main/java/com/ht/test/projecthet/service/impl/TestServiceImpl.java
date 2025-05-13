package com.ht.test.projecthet.service.impl;

import com.ht.test.projecthet.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public class TestServiceImpl implements TestService {

    String propertyName;
    @Override
    public String performTest() {
        // Implementation of the test service method
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }
}
