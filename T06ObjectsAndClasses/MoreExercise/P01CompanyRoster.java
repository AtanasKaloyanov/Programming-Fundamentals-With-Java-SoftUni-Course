package T06ObjectsAndClasses.MoreExercise;

import java.util.*;

public class P01CompanyRoster {
    static class Employee implements Comparable<Employee> {
        private String name;
        private double salary;
        private String position;
        private String department;
        private String email;
        private int age;

        public Employee(String name, double salary, String position, String department, String email, int age) {
            this.name = name;
            this.salary = salary;
            this.position = position;
            this.department = department;
            this.email = email;
            this.age = age;
        }

        public double getSalary() {
            return this.salary;
        }

        @Override
        public int compareTo(Employee employee) {
            return Double.compare(employee.salary, this.salary);
        }

        @Override
        public String toString() {
            return String.format("%s %.2f %s %d", this.name, this.salary, this.email, this.age);
        }
    }

    private static Map<String, Set<Employee>> employees = new HashMap<>();

    public static void main(String[] args) {
        // 1. Input reading
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] currentArray = scanner.nextLine().split(" ");
            String currentName = currentArray[0];
            double currentSalary = Double.parseDouble(currentArray[1]);
            String currentPosition = currentArray[2];
            String currentDepartment = currentArray[3];
            String currentEmail = "n/a";
            int currentAge = -1;

            if (currentArray.length == 5) {
               String currentInfo = currentArray[4];
                if (isNumber(currentInfo)) {
                    currentAge = Integer.parseInt(currentInfo);
                } else {
                    currentEmail = currentInfo;
                }
            } else if (currentArray.length == 6) {
                currentEmail = currentArray[4];
                currentAge = Integer.parseInt(currentArray[5]);
            }

            Employee employee = new Employee(currentName, currentSalary, currentPosition, currentDepartment, currentEmail, currentAge);
            employees.putIfAbsent(currentDepartment, new TreeSet<>());
            employees.get(currentDepartment).add(employee);
        }

        // Output printing
        Map.Entry<String, Set<Employee>> bestEmployees = null;
        double bestAvgSum = 0;

        for (Map.Entry<String, Set<Employee>> entry : employees.entrySet()) {
            Set<Employee> employees = entry.getValue();
            double sum = employees.stream().mapToDouble(Employee::getSalary).sum();
            double avgSum = sum / employees.size();

            if (avgSum > bestAvgSum) {
                bestAvgSum = avgSum;
                bestEmployees = entry;
            }
        }

        // Output printing
        String searchedDepartment = bestEmployees.getKey();
        Set<Employee> searchedEmployees = bestEmployees.getValue();
        System.out.printf("Highest Average Salary: %s\n", searchedDepartment);
        for (Employee employee : searchedEmployees) {
            System.out.println(employee);
        }

    }

    private static boolean isNumber(String currentInfo) {
        boolean result = true;
        try {
            int age = Integer.parseInt(currentInfo);
        } catch (NumberFormatException exception) {
            return false;
        }

        return true;
    }

}

