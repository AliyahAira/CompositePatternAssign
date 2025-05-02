import java.util.ArrayList;
import java.util.List;

public class College implements EducationalUnit {
    private String name;
    private List<EducationalUnit> units = new ArrayList<>();

    public College(String name) {
        this.name = name;
    }

    public void add(EducationalUnit unit) {
        units.add(unit);
    }

    @Override
    public void displayDetails(String indent) {
        System.out.println(indent + "🏫 College: " + name);
        for (EducationalUnit unit : units) {
            unit.displayDetails(indent + "    ");
        }
    }

    @Override
    public int getNumberOfStudents() {
        int total = 0;
        for (EducationalUnit unit : units) {
            total += unit.getNumberOfStudents();
        }
        return total;
    }

    @Override
    public double getTotalIncome() {
        double total = 0;
        for (EducationalUnit unit : units) {
            total += unit.getTotalIncome();
        }
        return total;
    }

    @Override
    public double getTotalExpenses() {
        double total = 0;
        for (EducationalUnit unit : units) {
            total += unit.getTotalExpenses();
        }
        return total;
    }
}
