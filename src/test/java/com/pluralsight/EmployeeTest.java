package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void punchOut_should_addFourHours_whenPunchedInAt10AndOutAt14() {
        Employee employee = new Employee(1, "Anup", "Housekeeping", 20.00, 0);
        double expectedHours = 4;
        employee.punchIn(10);
        employee.punchOut(14);
        double actualHours = employee.getHoursWorked();
        assertEquals(expectedHours, actualHours);
    }

    @Test
    void punchOut_should_addToExistingHours_whenEmployeeAlreadyHasHours() {
        Employee employee = new Employee(1, "Anup", "Housekeeping", 20.00, 8);
        double expectedHours = 10;
        employee.punchIn(13);
        employee.punchOut(15);
        double actualHours = employee.getHoursWorked();
        assertEquals(expectedHours, actualHours);
    }
}