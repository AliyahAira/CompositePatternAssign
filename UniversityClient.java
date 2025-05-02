public class UniversityClient {
    public static void main(String[] args) {
        // Create Students
        Student alice = new Student("Alice Reyes", "S1001", 50000.0);
        Student bob = new Student("Bob Cruz", "S1002", 52000.0);
        Student charlie = new Student("Charlie Gomez", "S1003", 51000.0);

        // Create Teachers
        Teacher drSmith = new Teacher("Dr. Smith", "Computer Science", 70000.0);
        Teacher profJohnson = new Teacher("Prof. Johnson", "Information Technology", 68000.0);

        // Create Departments
        Department csDept = new Department("Department of Computer Science");
        csDept.add(drSmith);
        csDept.add(alice);
        csDept.add(bob);

        Department itDept = new Department("Department of Information Technology");
        itDept.add(profJohnson);
        itDept.add(charlie);

        // Create College
        College engineeringCollege = new College("College of Engineering");
        engineeringCollege.add(csDept);
        engineeringCollege.add(itDept);

        // Display Structure
        System.out.println("=== University Structure ===");
        engineeringCollege.displayDetails("");

        // Display Total Students
        System.out.println("\n=== Total Number of Students ===");
        System.out.println("🎯 Total Students: " + engineeringCollege.getNumberOfStudents());

        // Display Budget
        System.out.println("\n=== College Budget ===");
        double income = engineeringCollege.getTotalIncome();
        double expenses = engineeringCollege.getTotalExpenses();
        double budget = income - expenses;
        System.out.println("💰 Total Income: ₱" + income);
        System.out.println("💸 Total Expenses: ₱" + expenses);
        System.out.println("🎯 Net Budget: ₱" + budget);
    }
}
