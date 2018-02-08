package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsTestSuite {

    public List<String> generateListOfUsers(int numberOfUsers) {
        List<String> userNames = new ArrayList<>();
        for (int i = 0; i < numberOfUsers; i++) {
            userNames.add("User" + i);
        }
        return userNames;
    }

    @Test
    public void TestStatisticsNoPosts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames = generateListOfUsers(1);
        StatisticsCounter statisticsCounter = new StatisticsCounter(statisticsMock);
        when(statisticsMock.usersNames()).thenReturn(userNames);
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
        List<String> userNames = generateListOfUsers(1);
        int fakePosts = 1000;
        when(statisticsMock.usersNames()).thenReturn(userNames);
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
        List<String> userNames = generateListOfUsers(1);
        StatisticsCounter statisticsCounter = new StatisticsCounter(statisticsMock);
        when(statisticsMock.commentsCount()).thenReturn(0);
        //When
        int quantityOfComments = statisticsCounter.getNumberOfComments();
        //Then
        Assert.assertEquals(0, quantityOfComments);
    }

    @Test
    public void TestStatisticsMorePostsThanComments(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames = generateListOfUsers(1);
        int comment=1;
        int post=10;
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.commentsCount()).thenReturn(comment);
        when(statisticsMock.postsCount()).thenReturn(post);
        StatisticsCounter statisticsCounter = new StatisticsCounter(statisticsMock);
        //When
        int quantityOfPosts = statisticsCounter.getNumberOfPosts();
        int quantityOfComments = statisticsCounter.getNumberOfComments();
        //Then
        Assert.assertTrue(quantityOfPosts > quantityOfComments);
    }

    @Test
    public void TestStatisticsMoreCommentsThanPosts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames = generateListOfUsers(1);
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.commentsCount()).thenReturn(100);
        when(statisticsMock.postsCount()).thenReturn(10);
        StatisticsCounter statisticsCounter = new StatisticsCounter(statisticsMock);
        //When
        int quantityOfPosts = statisticsCounter.getNumberOfPosts();
        int quantityOfComments = statisticsCounter.getNumberOfComments();
        //Then
        Assert.assertTrue(quantityOfPosts < quantityOfComments);
    }

    @Test
    public void TestStatisticsUsers(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames = generateListOfUsers(100);
        when(statisticsMock.usersNames()).thenReturn(userNames);
        StatisticsCounter statisticsCounter = new StatisticsCounter(statisticsMock);
        //When
        int quantityOfUsers = statisticsCounter.getNumberOfUsers();
        //Then
        Assert.assertEquals(100, quantityOfUsers);
    }

    @Test
    public void TestStatisticsNoUsers(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userNames = generateListOfUsers(0);
        StatisticsCounter statisticsCounter = new StatisticsCounter(statisticsMock);
        when(statisticsMock.usersNames()).thenReturn(userNames);
        //When
        int quantityOfUsers = statisticsCounter.getNumberOfUsers();
        //Then
        Assert.assertEquals(0, quantityOfUsers);
    }
}
