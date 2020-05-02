/**
 * 4 客户端查找远程对象，并调用远程方法
 */
package com.example.demo.iml;

import com.example.demo.iml.HelloInterface;

import java.rmi.Naming;

public class HelloClient {
    /**
     * 查找远程对象并调用远程方法
     */
    public static void main(String[] args) {

        try {

            //HelloInterface hello = (HelloInterface)Naming.lookup("Hello");
            //HelloInterface hello = (HelloInterface)Naming.lookup("//192.168.137.1:1099/Hello");
            HelloInterface hello = (HelloInterface)Naming.lookup("//127.0.0.1:1099/Hello");


            System.out.println(hello.say());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("HelloClient exception :"+e);
        }


    }

}
