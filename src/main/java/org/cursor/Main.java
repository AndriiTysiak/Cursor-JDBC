package org.cursor;

import static org.cursor.SQLQueries.*;

public class Main {
    public static void main(String[] args) {
        ServiceSelectUsers selectUser = new ServiceSelectUsers();
        ServiceCountUsers countUser = new ServiceCountUsers();
        System.out.println("Users are younger than 18:");
       selectUser.select(SELECT_USERS_FOR_YANGER_18);
        System.out.println("Users whose name ends with (o):");
       selectUser.select(SELECT_USER_FOR_NAME);
        System.out.println("Users whose age is between 18 and 60:");
        selectUser.select(SELECT_USER_BETWEEN_AGE);
        System.out.println("The number of users with the letter (a) in their name:");
       countUser.count(COUNT_USER_LIKE_AGE);
        System.out.println("The number of all adult users");
       countUser.count(COUNT_USER_LIKE_NAME);
    }
}