package com.app.jenkinsdemo;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;


@RunWith(SpringRunner.class)
@SpringBootTest
class JenkinsDemoApplicationTests {

    @Test
    void contextLoads() {


        assertEquals(true, true);
    }

}
