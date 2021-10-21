package com.dockerized.ui.tests;

import com.dockerized.ui.configuration.Config;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

public class BaseTest {

    protected Config config;

    @BeforeMethod(alwaysRun = true)
    public void setup() throws IOException {
        this.config = new Config();
    }
}
