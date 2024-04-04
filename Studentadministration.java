import java.util.*;

public class Studentadministration{

    private List<Student> studenten;
    private List<Employee> mitarbeiter;
    private List<Applicant> bewerber;

    public Studentadministration(){
        this.studenten = new ArrayList<>();
        this.mitarbeiter = new ArrayList<>();
        this.bewerber = new ArrayList<>();
    }

    public void addStudent(Student student) {
        studenten.add(student);
    }

    public void addMitarbeiter(Employee mitarbeiter) {
        this.mitarbeiter.add(mitarbeiter);
    }

    public void removeStudent(Student student) {
        studenten.remove(student);
    }

    public void removeMitarbeiter(Employee mitarbeiter) {
        this.mitarbeiter.remove(mitarbeiter);
    }

    public Student findStudentByMatrikelnummer(int matrikelnummer) {
        for (Student student : studenten) {
            if (student.getMatrikelnummer() == matrikelnummer) {
                return student;
            }
        }
        return null;
    }

    public Employee findMitarbeiterByName(String name) {
        for (Employee mitarbeiter : mitarbeiter) {
            if (mitarbeiter.getName().equals(name)) {
                return mitarbeiter;
            }
        }
        return null;
    }

    public List<Student> getAllStudents() {
        return Collections.unmodifiableList(studenten);
    }

    public List<Employee> getAllMitarbeiter() {
        return Collections.unmodifiableList(mitarbeiter);
    }

    public List<Student> getStudentsByFakultaet(Student.fakultaet fakultaet) {
        List<Student> studentsByFakultaet = new ArrayList<>();
        for (Student student : studenten) {
            if (student.getFakultaet() == fakultaet) {
                studentsByFakultaet.add(student);
            }
        }
        return Collections.unmodifiableList(studentsByFakultaet);
    }
}
