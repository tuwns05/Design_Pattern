package CREATIONALPATTERN.PatternPrototype;

public class    Client {
    public static void main(String[] args){
        Person p = new Person("Jack");

        Rabbit rb1 = new Rabbit(p,2);

        Rabbit rb2 = rb1.clone();



        System.out.println("real: " + rb1.toString());
        rb2.getOwner().setName("TTPT");
        System.out.println("fake: " +rb2.toString() );
    }
}
