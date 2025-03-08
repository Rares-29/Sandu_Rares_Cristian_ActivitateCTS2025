
import persoane.IPredabil;
import persoane.Student;

import java.util.List;

public class Curs {
    private String numeCurs;
    private int credite;
    private IPredabil profesor;
    private List<Student> studenti;


    public Curs(String numeCurs, int credite, IPredabil profesor, List<Student> studenti) {
        this.numeCurs = numeCurs;
        this.credite = credite;
        this.profesor = profesor;
        this.studenti = studenti;
    }

    public String getNumeCurs() {
        return numeCurs;
    }

    public int getCredite() {
        return credite;
    }

    public void setNumeCurs(String numeCurs) {
        this.numeCurs = numeCurs;
    }

    public void setCredite(int credite) {
        this.credite = credite;
    }

    public IPredabil getProfesor() {
        return profesor;
    }

    public void setProfesor(IPredabil profesor) {
        this.profesor = profesor;
    }

    public List<Student> getStudenti() {
        return studenti;
    }

    public void setStudenti(List<Student> studenti) {
        this.studenti = studenti;
    }

    @Override
    public String toString() {
        return "main.java.university.Curs{" +
                "numeCurs='" + numeCurs + '\'' +
                ", credite=" + credite +
                ", profesor=" + profesor +
                ", studenti=" + studenti +
                '}';
    }
}
