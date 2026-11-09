package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Room cleanEmpty = new Room(2,114.99, false, false);
        Room dirtyRoom = new Room(2, 124.00, false, true);
        Room occupiedRoom = new Room(1, 139.00, true, false);

        System.out.println("Is a clean, empty room available? " + cleanEmpty.isAvailable());       // true
        System.out.println("Is a dirty room available? " + dirtyRoom.isAvailable());               // false
        System.out.println("Is there a occupied room? " + occupiedRoom.isAvailable());
    }
}
