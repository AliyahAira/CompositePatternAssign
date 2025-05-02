public class Student implements EducationalUnit {
    private String name;
    private String studentId;
    private double tuitionFee;

    public Student(String name, String studentId, double tuitionFee) {
        this.name = name;
        this.studentId = studentId;
        this.tuitionFee = tuitionFee;
    }

    @Override
    public void displayDetails(String indent) {
        System.out.println(indent + "🎓 Student: " + name + " | ID: " + studentId + " | Tuition Fee: ₱" + tuitionFee);
    }

    @Override
    public int getNumberOfStudents() {
        return 1;
    }

    @Override
    public double getTotalIncome() {
        return tuitionFee;
    }

    @Override
    public double getTotalExpenses() {
        return 0;
    }
}
