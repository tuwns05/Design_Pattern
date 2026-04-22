package CREATIONALPATTERN.PatternPrototype;

public class Rabbit implements Prototype,Cloneable{

    //private String name;
    private int age;
    Person owner;

    public Rabbit(Person owner,int age){
        this.owner= owner;
        this.age = age;
    }

    public Rabbit() {

    }

    private Rabbit(Rabbit other){
        this.owner= owner;
        this.age = other.age;
    }


    public Person getOwner() {
        return owner;
    }

    @Override
    public Rabbit clone() {

            Rabbit rb =  new Rabbit(this);
            rb.owner = owner.clone();
            return rb;


    }

    @Override
    public String toString() {
      return owner.getName() +"-"+ age;
    }

//    public void setName(String name) {
//        this.name = name;
//    }
}
