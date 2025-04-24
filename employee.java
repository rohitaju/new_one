public class employee extends person1 {

    int employeeID;
    double salary;

    public employee(String name, int age, int employeeID, double salary) {
        super(name, age);
        this.employeeID = employeeID;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Salary: ₹" + salary);
    }

    public static void main(String[] args) {
        employee emp = new employee("Rohit", 20, 101, 55000.0);
        emp.displayDetails();
    }
}