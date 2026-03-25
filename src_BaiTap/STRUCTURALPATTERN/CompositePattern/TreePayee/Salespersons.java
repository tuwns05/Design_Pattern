package STRUCTURALPATTERN.CompositePattern.TreePayee;

public class Salespersons implements Payee{
    private String name;

    public Salespersons(String name) {
        this.name = name;
    }

    @Override
    public void payExpenses(int amount) {
        System.out.println("name salespersons "+ name+ "payee  : " +amount);
    }
}
