public class Darbuotojas {
    private String vardas, pavarde, pareigos, vardasPavarde, iskirptasTekstas;
    private long asmensKodas;
    private int simboliuSkaicius, gimimoMetai;
    private char lytis;
    private boolean arVairuoja;
    public Darbuotojas(String vardas, String pavarde, String pareigos, long asmensKodas, boolean arVairuoja){
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
    public long getAsmensKodas(){
        return asmensKodas;
    }
    public char nustatytiLyti(){   // V- vyras, M- moteris
        switch (Long.toString(asmensKodas).charAt(0)){
            case '3':
                lytis = 'V';
                break;
            case '4':
                lytis = 'M';
                break;
            case '5':
                lytis = 'V';
                break;
            case '6':
                lytis = 'M';
                break;
            default:
                break;
        }
    return lytis;
    }
}
