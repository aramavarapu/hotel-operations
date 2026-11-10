package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Room cleanEmpty = new Room(2,114.99, false, false);
        Room dirtyRoom = new Room(2, 124.00, false, true);
        Room occupiedRoom = new Room(1, 139.00, true, false);

        System.out.println("Is a clean, empty room available? " + cleanEmpty.isAvailable());       // true
        System.out.println("Is a dirty room available? " + dirtyRoom.isAvailable());               // false
        System.out.println("Is there a occupied room? " + occupiedRoom.isAvailable());

        Room room = new Room(2, 124.00, false, false);
        System.out.println("Start: " + room.isAvailable());
        room.checkIn();
        System.out.println("After check in: " + room.isAvailable());
        room.checkOut();
        System.out.println("After check out: " + room.isAvailable());
        room.cleanRoom();
        System.out.println("After cleaning: " + room.isAvailable());

        Reservation king = new Reservation("king", 3, true);
        System.out.printf("King, 3 nights, weekend: $%.2f a night, $%.2f total%n", king.getPrice(), king.getReservationsTotal());
        Reservation db1 = new Reservation("double", 2 , false);
        System.out.printf("Double, 2 nights, weekday: $%.2f a night, $%.2f total%n", db1.getPrice(),db1.getReservationsTotal());


        Employee part = new Employee(1, "Anup", "Housekeeping", 20.00, 20);
        System.out.printf("%s: %.1f regular, %.1f overtime, $%.2f%n", part.getName(), part.getRegularHours(), part.getOvertimeHours(), part.getTotalPay());
        Employee full = new Employee(2, "JohnPaul", "Front Desk", 20.00, 45);
        System.out.printf("%s: %.1f regular, %.1f overtime, $%.2f%n", full.getName(), full.getRegularHours(), full.getOvertimeHours(), full.getTotalPay());
        Employee time = new Employee(3, "Gary", "Bartender", 20.00, 0);
        System.out.println("Before: " + time.getHoursWorked());
        time.punchIn(10);
        time.punchOut(14);
        System.out.println("After: " + time.getHoursWorked());
        Employee clock = new Employee(4, "Kai", "Valet", 20.00, 0);
        clock.punchIn();
        clock.punchOut();
        System.out.printf("Punched in and straight out: %.4f hours%n", clock.getHoursWorked());
    }


}
