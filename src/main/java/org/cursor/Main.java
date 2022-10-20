package org.cursor;

import static org.cursor.SQLQueries.*;

public class Main {
    public static void main(String[] args) {
        ServiceSelectUsers selectUser = new ServiceSelectUsers();
        ServiceCountUsers countUser = new ServiceCountUsers();
        System.out.println("Users are younger than 18:");
        selectUser.select(OLDER_AGE);
        System.out.println("Users whose name ends with (o):");
        selectUser.select(ST_LATTER_NAME);
        System.out.println("Users whose age is between 18 and 60:");
        selectUser.select(BETWEEN_AGE);
        System.out.println("The number of users with the letter (a) in their name:");
        countUser.count(COUNT_USER_CONTAIN_LATTER);
        System.out.println("The number of all adult users");
        countUser.count(COUNT_USER_YOUNGER_AGE);
    }
}