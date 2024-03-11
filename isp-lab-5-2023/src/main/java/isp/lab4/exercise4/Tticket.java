package isp.lab4.exercise4;

public enum Tticket {
    WWE ( "WWE_2023"),
    UFC ( "UFC_2023");
    private String johncena;
    public String toString(){
        return this.johncena;
    }
    Tticket(String johncena){
        this.johncena = johncena;
    }
}
