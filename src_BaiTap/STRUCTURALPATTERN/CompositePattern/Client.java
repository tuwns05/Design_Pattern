package STRUCTURALPATTERN.CompositePattern;

import STRUCTURALPATTERN.CompositePattern.TreePayee.Manager;
import STRUCTURALPATTERN.CompositePattern.TreePayee.SalesTeam;
import STRUCTURALPATTERN.CompositePattern.TreePayee.Salespersons;

import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        Manager m1 = new Manager("tuan");
        Manager m2 = new Manager("tuan2");

        Salespersons s1 = new Salespersons("tuan3");
        Salespersons s2 = new Salespersons("tuan4");

        SalesTeam salesTeam = new SalesTeam(Arrays.asList(m1,m2) , Arrays.asList(s1,s2));

        salesTeam.payExpenses(4000);
    }
}
