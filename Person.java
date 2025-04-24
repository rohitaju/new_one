public class Person {
    String name;
    int age;

    public void display(){
        System.out.println(name);
        System.out.println(age);

    }


    public static void main(String[] args) {
        Person stud = new Person();
        stud.age = 18;
        stud.name = "Rohit";
        stud.display();
    }



}
