package PatternPrototype;

public class Rabbit implements Prototype,Cloneable{

    //private String name;
    private int age;
    Person owner;

    public Rabbit(Person owner,int age){
        this.owner= owner;
        this.age = age;
    }

//    private Rabbit(Rabbit other){
//        this.name = other.name;
//        this.age = other.age;
//    }


    public Person getOwner() {
        return owner;
    }

    @Override
    public Rabbit clone() {
        try {
            Rabbit rb =  (Rabbit) super.clone();
            rb.owner = owner.clone();
            return rb;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public String toString() {
      return owner.getName() +"-"+ age;
    }

//    public void setName(String name) {
//        this.name = name;
//    }
}
