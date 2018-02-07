package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class StatisticsCounter {

    Statistics statistics;
    int numberOfUsers,numberOfPosts, numberOfComments;
    double avPostsPerUser, avCommentsPerUser, avCommentsPerPost;

    public StatisticsCounter(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(){
        List<String> listOfUsers = new ArrayList<>();

        for (String users: statistics.usersNames()) {
            listOfUsers.add(users);
        }

        numberOfUsers = listOfUsers.size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();

        avPostsPerUser = numberOfPosts/numberOfUsers;
        avCommentsPerUser = numberOfComments/numberOfUsers;
        avCommentsPerPost = numberOfComments/numberOfPosts;
    }

    public void ShowStatistics(){
        System.out.println("avPostsPerUser: " + avPostsPerUser + ", avCommentsPerUser: " + avCommentsPerUser + ", avCommentsPerPost: " + avCommentsPerPost);
    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    public int getNumberOfComments() {
        return numberOfComments;
    }

    public double getAvPostsPerUser() {
        return avPostsPerUser;
    }

    public double getAvCommentsPerUser() {
        return avCommentsPerUser;
    }

    public double getAvCommentsPerPost() {
        return avCommentsPerPost;
    }
}
