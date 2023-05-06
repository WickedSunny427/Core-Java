package com.corejavaprojects.multithreading.basics.waitnotify.assignment;

//Guest class, jo ki ek thread ke roop me istemal kiya jayega
public class Guest implements Runnable {
 private String name; // Guest ka naam
 private Hotel hotel; // Hotel object

 // Guest constructor
 public Guest(String name, Hotel hotel) {
     this.name = name;
     this.hotel = hotel;
 }

 // Thread ke roop me chalne wali run method
 public void run() {
     boolean booked = hotel.bookRoom(name); // Hotel se room book karane ke lie bookRoom method ka upyog kiya jata hai
     if (booked) { // Agar room booked ho gaya hai to
         System.out.println(name + ", aapka room abhi available nahi hai"); // Room unavailable ka message print karta hai
     } else { // Varna
         System.out.println(name + ", aapka room abhi available hai"); // Room available ka message print karta hai
     }
 }
}

