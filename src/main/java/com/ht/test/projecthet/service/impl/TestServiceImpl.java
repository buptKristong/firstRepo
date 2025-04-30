package com.ht.test.projecthet.service.impl;

import com.ht.test.projecthet.service.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Override
    public void performTest() {
        // Implementation of the test service method
        System.out.println("Performing test...");
    }
}
