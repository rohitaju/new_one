class applform {
    String name;
    int rollno;
    int age;


    public void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(rollno);

    }

    public static void main(String[] args) {
        applform obj = new applform();
        obj.age = 18;
        obj.rollno=89988;
        obj.name = "rohit";
        obj.display();
    }
}