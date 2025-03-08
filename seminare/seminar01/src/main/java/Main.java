import persoane.IPredabil;
import persoane.Student;

public class Main {
    public static void main(String[] args) {
        Database database = new Database();
        System.out.println("------------------Students----------------------");
        for(Student s : database.studenti) {
            System.out.println(s);
        }

        System.out.println("------------------Students----------------------");
        for(IPredabil p : database.cadreDidactice) {
            System.out.println(p);
        }

        System.out.println("-------------------Cursuri----------------------");
        for(Curs c: database.cursuri) {
            System.out.println(c);
        }
    }


}