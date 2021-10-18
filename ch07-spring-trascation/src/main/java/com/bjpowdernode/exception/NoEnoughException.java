package com.bjpowdernode.exception;

/**
 * @author gjd
 * @create 2021/10/15  10:20:48
 */

//自定义运行时异常
public class NoEnoughException extends RuntimeException{

    public NoEnoughException() {
        super();
    }

    public NoEnoughException(String message) {
        super(message);
    }
}
