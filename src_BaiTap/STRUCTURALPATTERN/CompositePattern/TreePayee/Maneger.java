package STRUCTURALPATTERN.CompositePattern.TreePayee;

public class Maneger implements Payee{
    private String name;

    public Maneger(String name) {
        this.name = name;
    }

    @Override
    public void payExpenses(int amount) {
        System.out.println("name manager "+ name+ "payee  : " +amount);
    }
}
