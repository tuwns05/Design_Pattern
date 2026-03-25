package STRUCTURALPATTERN.CompositePattern;

import STRUCTURALPATTERN.CompositePattern.TreePayee.Maneger;
import STRUCTURALPATTERN.CompositePattern.TreePayee.SalesTeam;
import STRUCTURALPATTERN.CompositePattern.TreePayee.Salespersons;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        Maneger m1 = new Maneger("tuan");
        Maneger m2 = new Maneger("tuan2");

        Salespersons s1 = new Salespersons("tuan3");
        Salespersons s2 = new Salespersons("tuan4");

        SalesTeam salesTeam = new SalesTeam(Arrays.asList(m1,m2) , Arrays.asList(s1,s2));

        salesTeam.payExpenses(4000);
    }
}
