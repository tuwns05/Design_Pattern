package STRUCTURALPATTERN.CompositePattern.TreePayee;

import java.util.List;

public class SalesTeam implements Payee{

    private List<Manager> managers;
    private List<Salespersons> salespersons;

    public SalesTeam(List<Manager> managers, List<Salespersons> salespersons) {
        this.managers = managers;
        this.salespersons = salespersons;
    }

    @Override
    public void payExpenses(int amount) {
        for(Manager m : managers){
            m.payExpenses(amount);
        }

        for (Salespersons s : salespersons){
            s.payExpenses(amount);
        }
    }
}
