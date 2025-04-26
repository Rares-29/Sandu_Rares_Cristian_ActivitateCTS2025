package facade;

public class Facade {

    private Ospatar o;
    private Piccolo p;


    public String verificaAsezareMasa(Masa masa) {
        Ospatar o = new Ospatar();
        Piccolo p = new Piccolo();
        String message;
        if (!masa.isEsteLibera()) {
            message = "Masa nu este libera";
        } else if (o.esteAranjata(masa) && p.debaraseaza(masa)) {
            message = "Luati loc va rog la masa ";
        } else {
            message = "Masa nu este aranajata & debarasata";
        }
        return message;
    }
}
