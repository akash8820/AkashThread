package com.bus.reservation.client;

import com.bus.reservation.system.TicketBookingThread;
import com.bus.reservation.system.TicketCounter;

public class Test {

    public static void main(String[] args) {
        TicketCounter ticketCounter = new TicketCounter();
        TicketBookingThread t1 = new TicketBookingThread(ticketCounter,"User1",2);
        TicketBookingThread t2 = new TicketBookingThread(ticketCounter,"User2",2);
        
        t1.start();
        t2.start();
    }
}