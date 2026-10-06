package com.aws;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DynamoDbExampleApplicationTest {
 public static  Logger logger = org.slf4j.LoggerFactory.getLogger(DynamoDbExampleApplicationTest.class);
    @Test
   public static void contextLoads() {
        logger.info("Test case executed successfully");
    assertEquals(true, true);
    }
}
