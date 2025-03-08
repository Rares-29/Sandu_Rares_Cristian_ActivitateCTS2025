package persoane;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

public class Student extends Persoana {

    @JsonProperty("id")
    private int idStudent;

    public Student(int idStudent) {
        this.idStudent = idStudent;
    }

    public Student() {

    }

    public Student(String nume, int varsta, int idStudent) {
        super(nume, varsta);
        this.idStudent = idStudent;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    @Override
    public void afiseazaModInvatare() {
        System.out.println("Invata prin repetitie");
    }
}
