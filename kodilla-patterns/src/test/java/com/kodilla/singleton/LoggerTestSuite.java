package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void getLastLog(){
        //Given
        Logger logger = Logger.getInstance();
        logger.log("First log");
        //When
        String log = logger.getLastLog();
        //Then
        Assert.assertEquals("First log",log);
    }
}
