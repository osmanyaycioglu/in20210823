package com.training.java.collections;

import java.util.ArrayList;
import java.util.List;

public class ConnectionManager {

    private final List<Connection> connections = new ArrayList<>();

    public void openConnection(final Connection connectionParam) {
        this.connections.add(connectionParam);
        // open
    }

    public void schedule() {
        // log
    }

}
