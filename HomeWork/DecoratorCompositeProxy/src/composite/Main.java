package composite;

public class Main {

    public static void main(String[] args) {

        Departament d = new Departament();
        Departament d2 = new Departament();
        for (int i = 0; i < 5; i++) {
            Sectie s = new Sectie();
            System.out.println(s.calculeazaBuget());
            d.adaugaSectie(s);
            if ( i % 2 == 0) d2.adaugaSectie(s);
        }
        System.out.println("------------------------");
        System.out.println(d.calculeazaBuget());
        System.out.println(d2.calculeazaBuget());
    }
}
