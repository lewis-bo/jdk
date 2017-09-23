package com.lewis.util;

import com.lewis.lang.AssertionError;

/**
 * Created by lewis on 17/9/9.
 * 基础类
 */
public final class Objects {

    private Objects() {
        try {
            throw new AssertionError("haha");
        } catch (AssertionError assertionError) {
            assertionError.printStackTrace();
        }
    }


}

