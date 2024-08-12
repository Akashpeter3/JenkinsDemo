package com.app.jenkinsdemo;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;


@RunWith(SpringRunner.class)
@SpringBootTest
class JenkinsDemoApplicationTests {
Logger logger = LoggerFactory.getLogger(JenkinsDemoApplicationTests.class);
    @Test
    void contextLoads() {

logger.info("Test method executing............");
        assertEquals(true, true);
    }

}
