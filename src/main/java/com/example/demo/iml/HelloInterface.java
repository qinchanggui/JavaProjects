/**
 * 1. 创建远程接口及声明远程方法
 */

package com.example.demo.iml;

import java.rmi.Remote;
import java.rmi.RemoteException;



/**
 *远程接口扩展remote接口
 */
public interface HelloInterface extends Remote {
    /**
     *远程接口方法必须抛出 java.rmi.RemoteException
     */
    public String say() throws RemoteException;
}

