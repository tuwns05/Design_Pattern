package STRUCTURALPATTERN.CompositePattern.TreePayee;

import java.util.List;

public class SalesTeam implements Payee{

    private List<Maneger> manegers;
    private List<Salespersons> salespersons;

    public SalesTeam(List<Maneger> manegers, List<Salespersons> salespersons) {
        this.manegers = manegers;
        this.salespersons = salespersons;
    }

    @Override
    public void payExpenses(int amount) {
        for(Maneger m : manegers){
            m.payExpenses(amount);
        }

        for (Salespersons s : salespersons){
            s.payExpenses(amount);
        }
    }
}
