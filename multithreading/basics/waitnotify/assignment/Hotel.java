package com.corejavaprojects.multithreading.basics.waitnotify.assignment;

public class Hotel {
	 private boolean roomBooked = false; // Room ki booking ki sthiti ko darshata hai

	    // Agar room khali hai to uska booking kara deta hai aur true return karta hai, varna false return karta hai
	    public synchronized boolean bookRoom(String name) {
	        if (!roomBooked) { // Agar room khali hai to
	            System.out.println(name + ", aapka room book ho gaya hai"); // Booking successful ka message print karta hai
	            roomBooked = true; // Room ki sthiti booked kar deta hai
	            return true; // True return karta hai
	        } else { // Varna
	            System.out.println(name + ", room abhi book nahi ho paya hai"); // Booking unsuccessful ka message print karta hai
	            return false; // False return karta hai
	        }
	    }
	}