package com.training.java.properties;


@PropFile("my.properties")
public class AppProp {

    @Prop("app.prop.name")
    private String name;
    @Prop("app.prop.details")
    private String details;
    @Prop("app.prop.socket.host")
    private String socketHost;
    @Prop("app.prop.socket.port")
    private int    socketPort;

    public String getName() {
        return this.name;
    }

    public void setName(final String nameParam) {
        this.name = nameParam;
    }

    public String getDetails() {
        return this.details;
    }

    public void setDetails(final String detailsParam) {
        this.details = detailsParam;
    }

    public String getSocketHost() {
        return this.socketHost;
    }

    public void setSocketHost(final String socketHostParam) {
        this.socketHost = socketHostParam;
    }

    public int getSocketPort() {
        return this.socketPort;
    }

    public void setSocketPort(final int socketPortParam) {
        this.socketPort = socketPortParam;
    }

    @Override
    public String toString() {
        return "AppProp [name="
               + this.name
               + ", details="
               + this.details
               + ", socketHost="
               + this.socketHost
               + ", socketPort="
               + this.socketPort
               + "]";
    }


}
