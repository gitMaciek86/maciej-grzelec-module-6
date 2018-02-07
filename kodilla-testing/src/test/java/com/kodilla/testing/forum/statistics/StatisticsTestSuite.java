package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsTestSuite {

    @Test
    public void TestStatisticsNoPosts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        // czy tutaj kolejność mocka i metod when jest ważna?
        StatisticsCounter statisticsCounter = new StatisticsCounter(statisticsMock);
        when(statisticsMock.postsCount()).thenReturn(0);
        //When
        int quantityOfPosts = statisticsCounter.getNumberOfPosts();
        //Then
        Assert.assertEquals(0, quantityOfPosts);
    }

    @Test
    public void TestStatisticsKiloPosts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        // czy tutaj kolejność mocka i metod when jest ważna?
        int fakePosts = 1000;
        when(statisticsMock.postsCount()).thenReturn(fakePosts);
        StatisticsCounter statisticsCounter = new StatisticsCounter(statisticsMock);
        //When
        int quantityOfPosts = statisticsCounter.getNumberOfPosts();
        //Then
        Assert.assertEquals(1000, quantityOfPosts);
    }

    @Test
    public void TestStatisticsNoComments(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsCounter statisticsCounter = new StatisticsCounter(statisticsMock);
        when(statisticsMock.commentsCount()).thenReturn(0);
        //When
        int quantityOfComments = statisticsCounter.numberOfComments;
        //Then
        Assert.assertEquals(0, quantityOfComments);
    }

    @Test
    public void TestStatisticsMorePostsThanComments(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsCounter statisticsCounter = new StatisticsCounter(statisticsMock);
        when(statisticsMock.commentsCount()).thenReturn(1);
        when(statisticsMock.postsCount()).thenReturn(10);
        //When
        int quantityOfPosts = statisticsCounter.numberOfPosts;
        int quantityOfComments = statisticsCounter.numberOfComments;
        //Then
        Assert.assertTrue(quantityOfPosts > quantityOfComments);
    }

    @Test
    public void TestStatisticsMoreCommentsThanPosts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsCounter statisticsCounter = new StatisticsCounter(statisticsMock);
        when(statisticsMock.commentsCount()).thenReturn(100);
        when(statisticsMock.postsCount()).thenReturn(10);
        //When
        int quantityOfPosts = statisticsCounter.numberOfPosts;
        int quantityOfComments = statisticsCounter.numberOfComments;
        //Then
        Assert.assertTrue(quantityOfPosts < quantityOfComments);
    }

    @Test
    public void TestStatisticsUsers(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsCounter statisticsCounter = new StatisticsCounter(statisticsMock);
        List<String> usersFakeList = new ArrayList<>();
        for (int i =0; i<100; i++) {
            usersFakeList.add("i");
        }
        when(statisticsMock.usersNames()).thenReturn(usersFakeList);
        //When
        int quantityOfUsers = statisticsCounter.numberOfUsers;
        //Then
        Assert.assertEquals(100, quantityOfUsers);
    }

    @Test
    public void TestStatisticsNoUsers(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsCounter statisticsCounter = new StatisticsCounter(statisticsMock);
        List<String> usersFakeList = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(usersFakeList);
        //When
        int quantityOfUsers = statisticsCounter.numberOfUsers;
        //Then
        Assert.assertEquals(0, quantityOfUsers);
    }
}
