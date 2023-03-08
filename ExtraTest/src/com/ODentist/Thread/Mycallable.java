package com.ODentist.Thread;

import java.util.concurrent.Callable;

public class Mycallable implements Callable<String> {
    @Override
    public String call() throws Exception {

        for (int i = 0; i < 100; i++) {
            System.out.println("thread active!"+i);
        }
        return "system active";
    }
}
