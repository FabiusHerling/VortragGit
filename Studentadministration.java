import java.util.*;

public class Studentadministration{

    private List<Student> studenten;
    private List<Employee> mitarbeiter;
    private List<Course> kurse;
    private List<Applicant> bewerber;

    public Studentadministration(){
        this.studenten = new ArrayList<>();
        this.mitarbeiter = new ArrayList<>();
        this.kurse = new ArrayList<>();
        this.bewerber = new ArrayList<>();
    }

    public void addStudent(Student student) {
        studenten.add(student);
    }

    public void addMitarbeiter(Employee mitarbeiter) {
        this.mitarbeiter.add(mitarbeiter);
    }

    public void addKurs(Course kurs) {
        kurse.add(kurs);
    }

    public void addBewerber(Applicant bewerber) {
        this.bewerber.add(bewerber);
    }

    public void removeStudent(Student student) {
        studenten.remove(student);
    }

    public void removeMitarbeiter(Employee mitarbeiter) {
        this.mitarbeiter.remove(mitarbeiter);
    }

    public void removeKurs(Course kurs) {
        kurse.remove(kurs);
    }

    public void removeBewerber(Applicant bewerber) {
        this.bewerber.remove(bewerber);
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

    public Course findKursByName(String name) {
        for (Course kurs : kurse) {
            if (kurs.getName().equals(name)) {
                return kurs;
            }
        }
        return null;
    }

    public Applicant findBewerberByName(String name) {
        for (Applicant bewerber : bewerber) {
            if (bewerber.getName().equals(name)) {
                return bewerber;
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

    public List<Course> getAllKurse() {
        return Collections.unmodifiableList(kurse);
    }

    public List<Applicant> getAllBewerber() {
        return Collections.unmodifiableList(bewerber);
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

    public List<Grade> getNotenByStudent(Student student) {
        List<Grade> notenByStudent = new ArrayList<>();
        for (Grade note : student.getNoten()) {
            if (note.getStudent() == student) {
                notenByStudent.add(note);
            }
        }
        return Collections.unmodifiableList(notenByStudent);
    }

    public List<Course> getKurseByLeiter(Employee leiter) {
        List<Course> kurseByLeiter = new ArrayList<>();
        for (Course kurs : kurse) {
            if (kurs.getLeiter() == leiter) {
                kurseByLeiter.add(kurs);
            }
        }
        return Collections.unmodifiableList(kurseByLeiter);
    }

    public List<Course> getKurseBySemester(Course.semester semester, int jahr) {
        List<Course> kurseBySemester = new ArrayList<>();
        for (Course kurs : kurse) {
            if (kurs.getSemester() == semester && kurs.getJahr() == jahr) {
                kurseBySemester.add(kurs);
            }
        }
        return Collections.unmodifiableList(kurseBySemester);
    }

    public double calculateAverageNoteOfStudent(Student student) {
        List<Grade> noten = student.getNoten();
        if (noten.isEmpty()) {
            return 0.0;
        }

        double sum = 0.0;
        for (Grade note : noten) {
            sum += note.getNote();
        }
        return sum / noten.size();
    }

    public double calculateAverageNoteOfKurs(Course kurs) {
        List<Grade> noten = new ArrayList<>();
        for (Student student : studenten) {
            for (Grade note : student.getNoten()) {
                if (note.getKurs() == kurs) {
                    noten.add(note);
                }
            }
        }

        if (noten.isEmpty()) {
            return 0.0;
        }

        double sum = 0.0;
        for (Grade note : noten) {
            sum += note.getNote();
        }
        return sum / noten.size();
    }

    public List<Student> getTopPerformingStudentsForKurs(Course kurs, int numberOfTopStudents) {
        List<Student> topStudents = new ArrayList<>();
        List<Grade> noten = new ArrayList<>();

        for (Student student : studenten) {
            for (Grade note : student.getNoten()) {
                if (note.getKurs() == kurs) {
                    noten.add(note);
                }
            }
        }

        noten.sort(Comparator.comparingDouble(Grade::getNote).reversed());

        for (int i = 0; i < numberOfTopStudents && i < noten.size(); i++) {
            topStudents.add(noten.get(i).getStudent());
        }

        return topStudents;
    }

    public double calculateAverageNCForBewerber(String studiengang) {
        List<Double> ncValues = new ArrayList<>();
        for (Applicant bewerber : bewerber) {
            if (bewerber.getStudiengang().equals(studiengang)) {
                ncValues.add(bewerber.getNC());
            }
        }

        if (ncValues.isEmpty()) {
            return 0.0;
        }

        double sum = 0.0;
        for (double nc : ncValues) {
            sum += nc;
        }
        return sum / ncValues.size();
    }
}
