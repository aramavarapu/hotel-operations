package com.pluralsight;
import java.time.LocalDateTime;
public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double startTime;

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getRegularHours() {
        return Math.min(hoursWorked, 40);
    }

    public double getOvertimeHours() {
        return Math.max(hoursWorked - 40, 0);
    }

    public  double getTotalPay() {
        return  getRegularHours() * payRate + getOvertimeHours() * payRate * 1.5;
    }

    public void punchIn(int time) {
        startTime = time;
    }

    public void punchOut(int time) {
        hoursWorked += time - startTime;
    }

    public void punchIn() {
        LocalDateTime now = LocalDateTime.now();
        startTime = now.getHour() + now.getMinute() / 60.0;
    }

    public void punchOut() {
        LocalDateTime now = LocalDateTime.now();
        hoursWorked = (now.getHour() + now.getMinute() / 60.0) - startTime;
    }
    }
