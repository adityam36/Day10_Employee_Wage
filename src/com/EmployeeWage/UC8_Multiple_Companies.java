package com.EmployeeWage;

class Company {
    private String name;
    private int wagePerHour;
    private int maxWorkingDays;
    private int maxWorkingHours;

    public Company(String name, int wagePerHour, int maxWorkingDays, int maxWorkingHours) {
        this.name = name;
        this.wagePerHour = wagePerHour;
        this.maxWorkingDays = maxWorkingDays;
        this.maxWorkingHours = maxWorkingHours;
    }

    public String getName() {
        return name;
    }

    public int getWagePerHour() {
        return wagePerHour;
    }

    public int getMaxWorkingDays() {
        return maxWorkingDays;
    }

    public int getMaxWorkingHours() {
        return maxWorkingHours;
    }
}

public class UC8_Multiple_Companies {

    private static final int FULL_TIME = 2;
    private static final int PART_TIME = 1;

    public static void computeEmployeeWage(Company company) {
        int totalWage = 0;
        int workingHrs = 0;

        System.out.println("Company: " + company.getName());
        System.out.printf("%5s     %5s     %5s     %5s\n", "Day", "WorkingHrs", "Wage", "TotalWorkingHrs");

        for (int day = 1, totalWorkingHrs = 0;
             day <= company.getMaxWorkingDays() && totalWorkingHrs < company.getMaxWorkingHours();
             day++, totalWorkingHrs += workingHrs) {

            int empType = (int) (Math.random() * 100) % 3;
            workingHrs = getWorkingHours(empType);
            int dailyWage = workingHrs * company.getWagePerHour();
            totalWage += dailyWage;
            System.out.printf("%5d       %5d      %5d      %5d\n", day, workingHrs, dailyWage, totalWorkingHrs + workingHrs);
        }

        System.out.println("Total wage for a month at " + company.getName() + " is " + totalWage + "\n");
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
        Company companyA = new Company("CompanyA", 20, 20, 100);
        Company companyB = new Company("CompanyB", 25, 22, 120);
        Company companyC = new Company("CompanyC", 30, 18, 90);

        computeEmployeeWage(companyA);
        computeEmployeeWage(companyB);
        computeEmployeeWage(companyC);
    }
}
