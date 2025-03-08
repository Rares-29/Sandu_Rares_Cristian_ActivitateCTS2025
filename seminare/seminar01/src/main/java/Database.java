
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import persoane.*;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Database {

    public final List<IPredabil> cadreDidactice = new LinkedList<>();
    public final List<Student> studenti = new LinkedList<>();
    public final List<Curs> cursuri = new LinkedList<>();

    enum PersonType {
        STUDENT,TEACHER, ASSISTENT
    }
    public Database() {
        //init();
        initJson();
    }

    private void initJson() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            Profesor[] teachers = objectMapper.readValue(Database.class.getClassLoader().getResourceAsStream("teachers.json"), Profesor[].class);
            Student[] studentsJson = objectMapper.readValue(Database.class.getClassLoader().getResourceAsStream("students.json"), Student[].class);
            Asistent[] assistents = objectMapper.readValue(Database.class.getClassLoader().getResourceAsStream("assistents.json"), Asistent[].class);

            cadreDidactice.addAll(Arrays.asList(teachers));
            cadreDidactice.addAll(Arrays.asList(assistents));
            studenti.addAll(Arrays.asList(studentsJson));
        }catch(IOException e) {
            System.out.println(e);
        }
        Random random = new Random();
        String[] cursNames = {"Proiectarea sistemelor informatice", "Cibernetica economica", "Dezvoltare aplicatii mobile", "Tehnologii Web", "Networking"};
        for (int i = 0; i < cursNames.length; i++) {
            cursuri.add(new Curs(cursNames[i], random.nextInt(4, 7), cadreDidactice.get(i), studenti));
        }
    }



    private void init() {

        String[] firstNames = {"Bogdan", "Rares", "Andrei", "Matei", "Victor"};
        String[] names = {"Popa", "Popescu", "Vasile", "Sandu", "Mihaila", "Sauciuc"};
        int[] teacherIds = {100, 101, 102, 103, 104};
        int[] assistentIds = {1, 2, 3, 4, 5};
        int[] studentIds = {1000, 1001, 1002, 1003, 1004, 1005};

        Random random = new Random();

        for (int i = 0; i < teacherIds.length; i++) {
            for (int j = 0; j < 3; j++) {
                int id = 0;
                int varsta = 20;
                int firstNameVal = random.nextInt(0, firstNames.length);
                int nameVal = random.nextInt(0, names.length);
                String nume = firstNames[firstNameVal] + " " + names[nameVal];
                if (j == 0) id = studentIds[i];
                else if (j == 1) {
                    id = assistentIds[i];
                    varsta = random.nextInt(25, 30);
                }
                else  {
                    id = teacherIds[i];
                    varsta = random.nextInt(30, 70);
                }
                Persoana persoana = createAPerson(PersonType.values()[j], nume, varsta, id);
                if (persoana instanceof Student) studenti.add((Student) persoana);
                else cadreDidactice.add((IPredabil) persoana);
            }
        }


        String[] cursNames = {"Proiectarea sistemelor informatice", "Cibernetica economica", "Dezvoltare aplicatii mobile", "Tehnologii Web", "Networking"};
        for (int i = 0; i < cursNames.length; i++) {
            cursuri.add(new Curs(cursNames[i], random.nextInt(4, 7), cadreDidactice.get(i), studenti));
        }
    }


    private static Persoana createAPerson(PersonType tip, String nume, int varsta, int id) {
        switch (tip) {
            case STUDENT -> {
                return createStudent(nume, varsta, id);
            }
            case ASSISTENT -> {
                return createAsistent(nume, varsta, id);
            }
            case TEACHER -> {
                return createProfesor(nume, varsta, id);
            }
        }
        return createStudent(nume, varsta, id);
    }
    private static Asistent createAsistent(String nume, int varsta, int idAsistent) {
        Asistent asistent = new Asistent();
        asistent.setIdAsistent(idAsistent);
        setPersonAttr(asistent, nume, varsta);
        return asistent;
    }

    private static Profesor createProfesor(String nume, int varsta, int idProfesor) {
        Profesor profesor = new Profesor();
        profesor.setIdAngajat(idProfesor);
        setPersonAttr(profesor, nume, varsta);
        return profesor;
    }
    private static Student createStudent(String nume, int varsta, int idStudent) {
        Student student = new Student(idStudent);
        setPersonAttr(student, nume, varsta);
        return student;
    }

    private static void setPersonAttr(Persoana persoana, String nume, int varsta) {
        persoana.setNume(nume);
        persoana.setVarsta(varsta);
    }
}
