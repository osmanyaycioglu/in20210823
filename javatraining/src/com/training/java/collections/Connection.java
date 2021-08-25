package com.training.java.collections;


public class Connection {

    private final String name;
    private final String host;
    private final int    port;


    private Connection(final String nameParam,
                       final String hostParam,
                       final int portParam) {
        super();
        this.name = nameParam;
        this.host = hostParam;
        this.port = portParam;
    }

    //    public Connection(final String nameParam,
    //                      final String hostParam,
    //                      final int portParam) {
    //        super();
    //        this.name = nameParam;
    //        this.host = hostParam;
    //        this.port = portParam;
    //    }


    public String getName() {
        return this.name;
    }


    public String getHost() {
        return this.host;
    }


    public int getPort() {
        return this.port;
    }

    public static ConnectionBuilder getBuilder() {
        return new ConnectionBuilder();
    }

    public static class ConnectionBuilder {

        private String name;
        private String host;
        private int    port;

        private ConnectionBuilder() {
        }

        public String getName() {
            return this.name;
        }

        public ConnectionBuilder setName(final String nameParam) {
            this.name = nameParam;
            return this;
        }

        public String getHost() {
            return this.host;
        }

        public ConnectionBuilder setHost(final String hostParam) {
            this.host = hostParam;
            return this;
        }

        public int getPort() {
            return this.port;
        }

        public ConnectionBuilder setPort(final int portParam) {
            this.port = portParam;
            return this;
        }

        public Connection build() {
            // Validation
            Connection connectionLoc = new Connection(this.name,
                                                      this.host,
                                                      this.port);
            return connectionLoc;
        }

    }

}
