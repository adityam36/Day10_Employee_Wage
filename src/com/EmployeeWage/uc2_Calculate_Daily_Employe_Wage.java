package com.EmployeeWage;

public class uc2_Calculate_Daily_Employe_Wage {
    public static void main(String[] args) {
        System.out.println("Calculate Daily employe wage");
        final int full_time=1;
        int wage_per_hours=20;
        int working_hours=0;
        double employetype= Math.floor(Math.random()*10)%2;
        if(employetype == full_time){
            System.out.println("emp is present");
            working_hours=8;
        }
        else {
            System.out.println("emp is absent");
        }
        int wage= working_hours*wage_per_hours;
        System.out.println("wage of employe is "+ wage);
    }
}
