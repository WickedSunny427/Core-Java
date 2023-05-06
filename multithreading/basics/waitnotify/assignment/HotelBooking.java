package com.corejavaprojects.multithreading.basics.waitnotify.assignment;

public class HotelBooking {
    public static void main(String[] args) throws InterruptedException {
        Hotel hotel = new Hotel(); // Hotel object banaya jata hai

        // Do guests ke lie thread banaye jate hain
        Thread guest1 = new Thread(new Guest("Raj", hotel));
        Thread guest2 = new Thread(new Guest("Amit", hotel));

        // Threads ko start kara diya jata hai
        guest1.start();
     //   guest1.sleep(10000);
        guest2.start();
    }
}