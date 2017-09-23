package com.lewis.lang;

/**
 * Created by lewis on 17/9/9.
 */
public class Error extends Throwable{

    public Error(Object backTrace, String message) {
        super(backTrace, message);
    }

    public Error(String message) {
        super(message);
    }
}
