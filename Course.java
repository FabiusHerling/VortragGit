public class Course{
    
    enum semester{
        SOMMER,
        WINTER
    }

    enum pruefungsart{
        KLAUSUR,
        VORTRAG,
        MUENDLICHE_PRUEFUNG,
        HAUSARBEIT,
        KEINE_PRUEFUNG
    }

    private String name;
    private Employee leiter;
    private semester semester;
    private int jahr;
    private String pruefungstermin;
    private pruefungsart pruefungsart;

    public Course(String name, Employee leiter, semester semester,int jahr, String pruefungstermin, pruefungsart pruefungsart){
        this.name = name;
        this.leiter = leiter;
        this.semester = semester;
        this.jahr = jahr;
        this.pruefungstermin = pruefungstermin;
        this.pruefungsart = pruefungsart;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Employee getLeiter(){
        return leiter;
    }
    
    public void setLeiter(Employee leiter){
        this.leiter = leiter;
    }

    public semester getSemester(){
        return semester;
    }
    
    public void setSemester(semester semester){
        this.semester = semester;
    }

    public int getJahr(){
        return jahr;
    }

    public void setJahr(int jahr){
        this.jahr = jahr;
    }

    public String getPruefungstermin(){
        return pruefungstermin;
    }
    
    public void setPruefungstermin(String pruefungstermin){
        this.pruefungstermin = pruefungstermin;
    }

    public pruefungsart getPruefungsart(){
        return pruefungsart;
    }
    
    public void setPruefungsart(pruefungsart pruefungsart){
        this.pruefungsart = pruefungsart;
    }
}