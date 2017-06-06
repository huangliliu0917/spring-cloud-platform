package com.siebre.message.test.config;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath:spring/applicationContext-bean.xml",
        "classpath:spring/applicationContext-jdbc.xml",
        "classpath:spring/applicationContext-rabbit.xml",
        "classpath:spring/applicationContext-redis.xml",
})
public class BaseTest {
    protected Logger logger = LoggerFactory.getLogger(this.getClass());
}