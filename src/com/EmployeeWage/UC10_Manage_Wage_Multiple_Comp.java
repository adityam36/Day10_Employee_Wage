package com.EmployeeWage;

public class UC10_Manage_Wage_Multiple_Comp {
    static class CompanyEmpWage {
        private String companyName;
        private int wagePerHour;
        private int maxWorkingDays;
        private int maxWorkingHours;
        private int totalWage;

        public CompanyEmpWage(String companyName, int wagePerHour, int maxWorkingDays, int maxWorkingHours) {
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
                case 2: return 8;  // Full time
                case 1: return 4;  // Part time
                default: return 0; // No work
            }
        }

        public int getTotalWage() {
            return totalWage;
        }

        public String getCompanyName() {
            return companyName;
        }
    }

    static class EmpWageBuilder {
        private CompanyEmpWage[] companyEmpWages;
        private int companyCount = 0;

        public EmpWageBuilder(int numOfCompanies) {
            companyEmpWages = new CompanyEmpWage[numOfCompanies];
        }

        public void addCompanyEmpWage(String companyName, int wagePerHour, int maxWorkingDays, int maxWorkingHours) {
            companyEmpWages[companyCount++] = new CompanyEmpWage(companyName, wagePerHour, maxWorkingDays, maxWorkingHours);
        }

        public void computeWagesForAllCompanies() {
            for (CompanyEmpWage companyEmpWage : companyEmpWages) {
                companyEmpWage.computeEmployeeWage();
            }
        }

        public void displayTotalWages() {
            System.out.println("\n--- Summary of Total Wages ---");
            for (CompanyEmpWage companyEmpWage : companyEmpWages) {
                System.out.println(companyEmpWage.getTotalWage() + " - " + companyEmpWage.getCompanyName());
            }
        }
    }

    public static void main(String[] args) {
        EmpWageBuilder empWageBuilder = new EmpWageBuilder(3);

        empWageBuilder.addCompanyEmpWage("CompanyA", 20, 20, 100);
        empWageBuilder.addCompanyEmpWage("CompanyB", 25, 22, 120);
        empWageBuilder.addCompanyEmpWage("CompanyC", 30, 18, 90);

        empWageBuilder.computeWagesForAllCompanies();
        empWageBuilder.displayTotalWages();
    }
}