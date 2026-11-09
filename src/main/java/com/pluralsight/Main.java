package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Room cleanEmpty = new Room(2,114.99, false, false);
        Room dirtyRoom = new Room(2, 124.00, false, true);
        Room occupiedRoom = new Room(1, 139.00, true, false);

        System.out.println("Is a clean, empty room available? " + cleanEmpty.isAvailable());       // true
        System.out.println("Is a dirty room available? " + dirtyRoom.isAvailable());               // false
        System.out.println("Is there a occupied room? " + occupiedRoom.isAvailable());

        Reservation king = new Reservation("king", 3, true);
        System.out.printf("King, 3 nights, weekend: $%.2f a night, $%.2f total%n", king.getPrice(), king.getReservationsTotal());
        Reservation db1 = new Reservation("double", 2 , false);
        System.out.printf("Double, 2 nights, weekday: $%.2f a night, $%.2f total%n", db1.getPrice(),db1.getReservationsTotal());
    }


}
