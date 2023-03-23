package com.Odentist.Day12.HomeWork.GrabRedEnvelopes;

import java.util.ArrayList;

public class StartGrab {
    public static void main(String[] args) {
        RedEnvelop redEnvelop = new RedEnvelop();
        ArrayList<Thread> thread = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Thread threads = new Thread(redEnvelop);
            threads.setName("家人"+(1+i));
            thread.add(threads);
        }
        for (Thread thread1 : thread) {
            thread1.start();
        }



    }
}
