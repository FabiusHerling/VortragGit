final class Applicant extends Person{
    
    private String studiengang;
    private double nc;

    public Applicant(String name, String email, String studiengang, int nc){
        super(name, email);
        this.nc = nc;
        this.studiengang = studiengang;
    }

    public String getStudiengang(){
        return studiengang;
    }

    public void setStudiengang(String studiengang){
        this.studiengang = studiengang;
    }

    public double getNC(){
        return nc;
    }

    public void setNC(double nc){
        this.nc = nc;
    }
}
