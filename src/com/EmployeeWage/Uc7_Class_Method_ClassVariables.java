package com.EmployeeWage;

public class Uc7_Class_Method_ClassVariables {
    private static final int FULL_TIME = 2;
    private static final int PART_TIME = 1;
    private static final int WAGE_PER_HR = 20;
    private static final int MAX_WORKING_DAYS = 20;
    private static final int MAX_WORKING_HRS = 100;

    private static int totalWage = 0;

    public static void computeEmployeeWage() {
        int workingHrs = 0;

        System.out.println("Welcome to Employee Wage Computation Problem");
        System.out.printf("%5s     %5s     %5s     %5s\n", "Day", "WorkingHrs", "Wage", "TotalWorkingHrs");

        for (int day = 1, totalWorkingHrs = 0; day <= MAX_WORKING_DAYS && totalWorkingHrs < MAX_WORKING_HRS; day++, totalWorkingHrs += workingHrs) {
            int empType = (int) (Math.random() * 100) % 3;
            workingHrs = getWorkingHours(empType);
            int dailyWage = workingHrs * WAGE_PER_HR;
            totalWage += dailyWage;
            System.out.printf("%5d       %5d      %5d      %5d\n", day, workingHrs, dailyWage, totalWorkingHrs + workingHrs);
        }

        System.out.println("Total wage for a month is " + totalWage);
    }

    private static int getWorkingHours(int empType) {
        switch (empType) {
            case FULL_TIME:
                return 8;
            case PART_TIME:
                return 4;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        computeEmployeeWage();
    }
}
