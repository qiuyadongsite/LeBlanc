package com.qyd.play.designModel.flyweight.pool;

import java.sql.Connection;

/**
 * Created by qyd.
 */
public class Test {
    public static void main(String[] args) {
        ConnectionPool pool = new ConnectionPool();
        Connection conn = pool.getConnection();
        System.out.println(conn);
    }
}
