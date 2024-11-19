package com.EmployeeWage;

public class uc1_Check_Employee_Present_Absent {
    public static void main(String[] args) {
        System.out.println("Check Employee is Present or Absent");
        final  int full_time =1;
        double employetype= Math.floor(Math.random()*10)%2;
        if(employetype == full_time){
            System.out.println("it is present");
        }
        else {
            System.out.println("it is absent");
        }
    }
}
