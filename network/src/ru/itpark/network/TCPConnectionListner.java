package ru.itpark.network;

public interface TCPConnectionListner {
    void onConnectionReady(TCPConnection tcpConnection);
    void onReceiveReady(TCPConnection tcpConnection, String value);
    void onDisconnect(TCPConnection tcpConnection);
    void oneException(TCPConnection tcpConnection, Exception e);
}
