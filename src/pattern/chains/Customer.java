package pattern.chains;

public class Customer {

    private String name;
    private Grade grade;

    public Customer(String name, Grade grade) {
        this.name = name;
        this.grade = grade;
    }

    public Grade getGrade() {
        return grade;
    }
}
