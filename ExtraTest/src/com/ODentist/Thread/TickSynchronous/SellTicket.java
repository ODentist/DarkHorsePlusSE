package com.ODentist.Thread.TickSynchronous;

public class SellTicket {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        Thread thread1 = new Thread(ticket);
        Thread thread2 = new Thread(ticket);
        thread1.setName("windows1");
        thread2.setName("windows2");
        thread1.start();
        thread2.start();


    }
}
