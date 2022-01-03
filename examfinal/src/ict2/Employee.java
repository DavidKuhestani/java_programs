package ict2;

public class Employee extends Person {

        private double salary;

        public Employee() {
            super();
            salary = 0;
        }

        public Employee(String name, int age, String email, double salary) {
            super(name, age, email);
            this.salary = salary;
        }


        public double getSalary() { return salary; }

        public void setSalary(double number) {
            if (salary >= 0)
                this.salary = salary;
            else
                System.out.println("Salary argument is negative and disregarded.");
        }

        @Override
        public String toString() {
            return super.toString()  + "Salary:" + salary + "\n" ;
        }
    }


