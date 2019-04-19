package com.sunny.server;

import com.sunny.pool.NettyBufferPool;

public class TestMain1 {
    public static void main(String[] args) {

    }

    public static void testMethod1(){
        int port = 8888;        //1
        try {
            new EchoServer(port).start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void testMethod2(){
        int port = 8888;        //1
        NettyBufferPool nettyBufferPool = new NettyBufferPool(514);
        new Thread(()->{

        });
        try {
            new EchoServer(port).start1(nettyBufferPool);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
