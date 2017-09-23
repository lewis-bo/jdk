package com.lewis.lang;

import com.lewis.io.Serializable;

/**
 * Created by lewis on 17/9/9.
 */
public class Throwable extends java.lang.Throwable implements Serializable{

    /**
     *
     */
    private transient Object backTrace;

    private String detailMessage;

    private static class SentinelHolder {
    }

    public Throwable(Object backTrace, String message) {
        this.backTrace = backTrace;
        this.detailMessage = message;
    }


    public Throwable(String message) {
        detailMessage = message;
    }
}
