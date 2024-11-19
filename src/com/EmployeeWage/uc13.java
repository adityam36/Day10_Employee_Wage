package com.EmployeeWage;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Uc13 {


    public class CompanyEmpWage {
        private final int fullTimeHour = 8;
        private final String companyName;
        private final int WAGE_PER_HR;
        private final int MAX_WORKING_DAYS;
        private final int MAX_WORKING_HRS;
        private int totalWage;
        private Map<String, Long> totalWagesRecord;

        // Constructor
        public CompanyEmpWage(String companyName, int WAGE_PER_HR, int MAX_WORKING_DAYS, int MAX_WORKING_HRS) {
            this.companyName = companyName;
            this.WAGE_PER_HR = WAGE_PER_HR;
            this.MAX_WORKING_DAYS = MAX_WORKING_DAYS;
            this.MAX_WORKING_HRS = MAX_WORKING_HRS;
            this.totalWagesRecord = new HashMap<>();
        }

        // Setter for total monthly wage
        public void setTotalMonthlyWage(int totalWage) {
            this.totalWage = totalWage;
        }

        // Setter for total wages record
        public void setTotalWagesRecord(Map<String, Long> totalWagesRecord) {
            this.totalWagesRecord = totalWagesRecord;
        }

        // Check if employee is present
        public boolean employeePresent() {
            return new Random().nextBoolean();
        }

        // Override toString to display company and wage details
        @Override
        public String toString() {
            System.out.println("Details of " + companyName + " employee:");
            System.out.println("Wage per hour: " + WAGE_PER_HR);
            System.out.println("Maximum working days: " + MAX_WORKING_DAYS);
            System.out.println("Maximum working hours: " + MAX_WORKING_HRS);
            return "Monthly wage for an employee of company " + companyName + " is " + totalWage;
        }
    }

}
