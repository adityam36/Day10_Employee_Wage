package com.EmployeeWage;

public class Uc9_Total_Wage_Each_Company {
    static class EmpWageBuilder {
        private String companyName;
        private int wagePerHour;
        private int maxWorkingDays;
        private int maxWorkingHours;
        private int totalWage;

        public EmpWageBuilder(String companyName, int wagePerHour, int maxWorkingDays, int maxWorkingHours) {
            this.companyName = companyName;
            this.wagePerHour = wagePerHour;
            this.maxWorkingDays = maxWorkingDays;
            this.maxWorkingHours = maxWorkingHours;
        }

        public void computeEmployeeWage() {
            int workingHrs = 0;
            totalWage = 0;

            System.out.println("\nCompany: " + companyName);
            System.out.printf("%5s     %5s     %5s     %5s\n", "Day", "WorkingHrs", "Wage", "TotalWorkingHrs");

            for (int day = 1, totalWorkingHrs = 0; day <= maxWorkingDays && totalWorkingHrs < maxWorkingHours; day++, totalWorkingHrs += workingHrs) {
                int empType = (int) (Math.random() * 100) % 3;
                workingHrs = getWorkingHours(empType);
                int dailyWage = workingHrs * wagePerHour;
                totalWage += dailyWage;
                System.out.printf("%5d       %5d      %5d      %5d\n", day, workingHrs, dailyWage, totalWorkingHrs + workingHrs);
            }

            System.out.println("Total wage for " + companyName + " is: " + totalWage);
        }

        private int getWorkingHours(int empType) {
            switch (empType) {
                case 2:
                    return 8;
                case 1:
                    return 4;
                default:
                    return 0;
            }
        }

        public int getTotalWage() {
            return totalWage;
        }

        public String getCompanyName() {
            return companyName;
        }
    }

    public static void main(String[] args) {
        EmpWageBuilder companyA = new EmpWageBuilder("CompanyA", 20, 20, 100);
        EmpWageBuilder companyB = new EmpWageBuilder("CompanyB", 25, 22, 120);
        EmpWageBuilder companyC = new EmpWageBuilder("CompanyC", 30, 18, 90);

        companyA.computeEmployeeWage();
        companyB.computeEmployeeWage();
        companyC.computeEmployeeWage();

        System.out.println("\n--- Summary of Total Wages ---");
        System.out.println(companyA.getTotalWage() + " - " + companyA.getCompanyName());
        System.out.println(companyB.getTotalWage() + " - " + companyB.getCompanyName());
        System.out.println(companyC.getTotalWage() + " - " + companyC.getCompanyName());
    }
}
