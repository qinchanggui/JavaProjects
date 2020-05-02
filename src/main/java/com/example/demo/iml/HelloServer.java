/**
 * 3 启动RMI注册服务，并注册远程对象
 */
package com.example.demo.iml;


import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class HelloServer {
    /**
     * 启动RMI注册服务并进行对象注册
     */

    public static void main(String[] args) {

        try {

            //启动RMI注册服务，指定端口1099
            LocateRegistry.createRegistry(1099);

            //创建远程对象
            HelloInterface hello = new Hello("Hello,World!");

            //注册到RMI注册服务器
            Naming.rebind("Hello",hello);

            System.out.println("Hello Server is ready.");

        } catch (Exception e) {
            System.out.println("Hello Server failed :"+e);
        }

    }
}
