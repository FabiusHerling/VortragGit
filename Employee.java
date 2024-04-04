sealed class Employee extends Person permits Professor{
    
    private String titel;
    private int fakultaet;

    public Employee(String name, String email, String titel, int fakultaet){
        super(name, email);
        this.titel = titel;
        this.fakultaet = fakultaet;
    }

    public String getTitel(){
        return titel;
    }

    public void setTitel(String titel){
        this.titel = titel;
    }

    public int getFakultaet(){
        return fakultaet;
    }

    public void setFakultaet(int fakultaet){
        this.fakultaet = fakultaet;
    }
}