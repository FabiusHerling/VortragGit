public class Grade{
    
    private double note;
    private Course kurs;
    private Student student;
    private Employee pruefer;
    private int versuchnummer;

    public Grade(double note, Course kurs, Student student, Employee pruefer, int versuchnummer){
        this.note = note;
        this.kurs = kurs;
        this.student = student;
        this.pruefer = pruefer;
        this.versuchnummer = versuchnummer;
    }

    public double getNote(){
        return note;
    }
    
    public void setNote(double note){
        this.note = note;
    }

    public Course getKurs(){
        return kurs;
    }
    
    public void setKurs(Course kurs){
        this.kurs = kurs;
    }

    public Student getStudent(){
        return student;
    }
    
    public void setStudent(Student student){
        this.student = student;
    }

    public Employee getPruefer(){
        return pruefer;
    }
    
    public void setPruefer(Employee pruefer){
        this.pruefer = pruefer;
    }

    public int getVersuchnummer(){
        return versuchnummer;
    }
    
    public void setVersuchnummer(int versuchnummer){
        this.versuchnummer = versuchnummer;
    }
}