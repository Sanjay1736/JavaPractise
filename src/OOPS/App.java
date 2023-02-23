package OOPS;
public class App {
    public static void main(String[] args) {
        Human person1 = new Human();
       person1.setAge(20);
       person1.setName("Sanjay");
       System.out.println(person1.getName() + ":" + person1.getAge());
    }
}
