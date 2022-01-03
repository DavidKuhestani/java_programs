package ict2;

public class Manager extends Employee {

        private double bonus;
        private String office;

        public Manager(){
            super();
            office = "TokyoDriftShop";
            bonus = 0;
        }

        public Manager(String name, int age, String email, double salary,
                       double bonus, String office) {
            super(name, age, email, salary);
            this.bonus = bonus;
            this.office = office;
        }

        public double getBonus() {
            return bonus;
        }
        public void setBonus(double number) {
            if (bonus >= 0)
                this.bonus = bonus;
            else
                System.out.println("Bonus argument is negative and disregarded.");
        }

        public String getOffice() { return office; }
        public void setOffices(String office) { this.office = office; }

        @Override
        public String toString() {
            return super.toString() + "Office:" + office + "\n" + "Bonus:" + bonus + "\n";
        }
    }



