final class Student extends Person{
    
    enum fakultaet{
        EINS,
        ZWEI,
        DREI,
        VIER,
        FUENF,
        SECHS,
        SIEBEN,
        ACHT,
        ZEHN
    }

    private int matrikelnummer;
    private String studiengang;
    private fakultaet fakultaet;

    public Student(String namen, int matrikelnummer, String studiengang, fakultaet fakultaet){
        super(namen, namen + matrikelnummer + "@rwth.de");
        this.matrikelnummer = matrikelnummer;
        this.fakultaet = fakultaet;
        this.studiengang = studiengang;
    }

    public int getMatrikelnummer(){
        return matrikelnummer;
    }

    public void setMatrikelnummer(int matrikelnummer){
        this.matrikelnummer = matrikelnummer;
    }

    public String getStudiengang(){
        return studiengang;
    }

    public void setStudiengang(String studiengang){
        this.studiengang = studiengang;
    }

    public fakultaet getFakultaet(){
        return fakultaet;
    }

    public void setFakultaet(fakultaet fakultaet){
        this.fakultaet = fakultaet;
    }
}