package org.cursor;

public class SQLQueries {
    public static final String INSERT_USERS = """
            INSERT INTO user (first_name, last_name,age) VALUES 
            ('john', 'snow',42),
            ('max', 'pax',18),
            ('tirion', 'lanister',30),
            ('olex', 'kadar',10),
            ('luka', 'mojo',17)
            """;
    public static final String OLDER_AGE = """
            SELECT * FROM user WHERE age <= 18;
             """;
    public static final String ST_LATTER_NAME = """
            SELECT * FROM user WHERE first_name LIKE'%o';
             """;
    public static final String BETWEEN_AGE = """
            SELECT * FROM user WHERE age BETWEEN 18 AND 60;
                             
            """;
    public static final String COUNT_USER_CONTAIN_LATTER = """
            select count(*) AS count from user where first_name like'%a%';           
            """;
    public static final String COUNT_USER_YOUNGER_AGE = """
            select count(*) AS count from user where age >=18;           
            """;

    public SQLQueries() {
    }
}
