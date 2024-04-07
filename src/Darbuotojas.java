public class Darbuotojas {
    private String vardas, pavarde, pareigos, asmensKodas, vardasPavarde, iskirptasTekstas;
    private int simboliuSkaicius;
    private boolean arVairuoja;
    public Darbuotojas(String vardas, String pavarde, String pareigos, String asmensKodas, boolean arVairuoja){
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.pareigos = pareigos;
        this.asmensKodas = asmensKodas;
        this.arVairuoja = arVairuoja;
    }
    public String sujunk(){
        vardasPavarde = vardas + pavarde;
        return vardasPavarde;
    }
    public int kiekSimboliu(){
        vardasPavarde = sujunk();
        simboliuSkaicius = vardasPavarde.length();
        return simboliuSkaicius;
    }
    public String iskirpti(int start, int end){
        vardasPavarde = vardas + pavarde;
        iskirptasTekstas = vardasPavarde.substring(start-1, end);
        return iskirptasTekstas;
    }
    public String getPareigos(){
        return pareigos;
    }
}
