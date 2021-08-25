package com.training.java.collections;


public class ConnectionRun {

    public static void main(final String[] args) {
        ConnectionManager connectionManagerLoc = new ConnectionManager();
        //        Connection connectionLoc = new Connection("con1",
        //                                                  "192.168.1.1",
        //                                                  5050);
        Connection connectionLoc = Connection.getBuilder()
                                             .setName("con1")
                                             .setHost("192.168.1.1")
                                             .setPort(5050)
                                             .build();
        connectionManagerLoc.openConnection(connectionLoc);
        // Database

    }

}
