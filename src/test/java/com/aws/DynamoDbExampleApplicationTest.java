package com.aws;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DynamoDbExampleApplicationTest {
 public static  Logger logger = org.slf4j.LoggerFactory.getLogger(DynamoDbExampleApplicationTest.class);
    @Test
    public void contextLoads() {
        logger.info("Test case executing...");
        assertEquals(true, true);
    }
}
