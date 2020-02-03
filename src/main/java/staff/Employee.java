package staff;

public abstract class Employee {

    private String name;
    private String NINumber;
    private Double salary;

    public Employee(String name, String NINumber, Double salary) {
        this.name = name;
        this.NINumber = NINumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void changeName(String newName) {
        if (newName != null) {
            this.name = newName;
        }
    }

    public String getNINumber() {
        return NINumber;
    }

    public Double getSalary() {
        return salary;
    }

    public void raiseSalary(Double salaryIncrease) {
        if (salaryIncrease > 0) {
            salary += salaryIncrease;
        }
    }

    public Double payBonus(){
        return salary* 0.01;
    }
}
