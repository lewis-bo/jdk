package com.lewis.lang;

import com.lewis.io.Serializable;

/**
 * Created by lewis on 17/9/9.
 */
public class StackTraceElement implements Serializable{

    private String declaringClass;

    private String methodName;

    private String fileName;

    private int lineNumber;


}
