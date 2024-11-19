package com.EmployeeWage;

public class uc3_Add_Part_time_Employee_Wage {
    public static void main(String[] args) {
        System.out.println("Calculate Daily employe wage");
        final int full_time=2;
        int wage_per_hours=20;
        int working_hours=0;
        int part_time_hours=1;
        double employetyp=Math.floor(Math.random()*10)%2;
        if(employetyp == full_time){
            System.out.println("emp is present");
            working_hours=8;
        } else if (employetyp== part_time_hours) {
            System.out.println("employee is present in part time");
            working_hours =8;
        } else {
            System.out.println("emp is absent");
        }
        int wage= working_hours*wage_per_hours;
        System.out.println("wage of employe is "+ wage);
    }
}
