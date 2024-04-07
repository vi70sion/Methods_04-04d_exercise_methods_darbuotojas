import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        * Sukurkite klase Darbuotojas
//                * Klases kintamieji:
//        vardas, pavarde, pareigos, asmensKodas, arVairuoja
//        vardasPavarde, simboliuSkaicius, iskirptasTekstas,
//        * sukurkite 4 darbuotoju objektus. Pvz darb01, darb02 ir t.t.
//
//                Sukurkite metodus ir atskirai iskvieskite:
//        1. Sujunktite darbuotojo varda ir pavarde. Rezultata priskirkite
//        kintamajam "vardasPavarde"
//
//        2. Nuskaityti kintamojo "vardasPavarde" simboliu skaiciu
//        ir gauta rezultata priskirkite kintamajam "simboliuSkaicius"
//
//        3. Iskirpkite pirmo kintamojo reiksmes 3-9 pozicijoje
//        esancias raides ir gauta rezultata priskirkite
//        kintamajam "iskirptasTekstas"
//


        Darbuotojas darb01 = new Darbuotojas("Vardas1", "Pavarde1", "krovikas", 39005050012L, true );
        Darbuotojas darb02 = new Darbuotojas("Vards2", "Pavarde2", "administratorius", 50512090162L, true );
        Darbuotojas darb03 = new Darbuotojas("Vrds3", "Pavarde3", "vadybininkas", 49801231002L, false );
        Darbuotojas darb04 = new Darbuotojas("Vds4", "Pavarde4", "vadybininkas", 60204190715L, true );

        //1.
        System.out.println("Sujungtas vardas ir pavarde darb01: " + darb01.sujunk());
        System.out.println("Sujungtas vardas ir pavarde darb02: " + darb02.sujunk());
        System.out.println("Sujungtas vardas ir pavarde darb03: " + darb03.sujunk());
        System.out.println("Sujungtas vardas ir pavarde darb04: " + darb04.sujunk());
        System.out.println();

        //2.
        System.out.println("Sujungto darb01 vardo ir pavardes simboliu skaicius: " + darb01.kiekSimboliu());
        System.out.println("Sujungto darb02 vardo ir pavardes simboliu skaicius: " + darb02.kiekSimboliu());
        System.out.println("Sujungto darb03 vardo ir pavardes simboliu skaicius: " + darb03.kiekSimboliu());
        System.out.println("Sujungto darb04 vardo ir pavardes simboliu skaicius: " + darb04.kiekSimboliu());
        System.out.println();

        //3.
        System.out.println("Iskirtas darb01 tekstas : " + darb01.iskirpti(3, 9));
        System.out.println("Iskirtas darb02 tekstas : " + darb02.iskirpti(3, 9));
        System.out.println("Iskirtas darb03 tekstas : " + darb03.iskirpti(3, 9));
        System.out.println("Iskirtas darb04 tekstas : " + darb04.iskirpti(3, 9));

        // Palyginkite pirmo su antru ir trecio su ketvirtu pareigas
        List<Boolean> sarasas = new ArrayList<>();
        palyginti(darb01, darb02, sarasas);
        if(sarasas.getFirst()){
            System.out.println("darb01 ir darb02 pareigos yra vienodos.");
        } else System.out.println("darb01 ir darb02 pareigos yra skirtingos.");
        palyginti(darb03, darb04, sarasas);
        if(sarasas.getLast()){
            System.out.println("darb03 ir darb04 pareigos yra vienodos.");
        } else System.out.println("darb03 ir darb04 pareigos yra skirtingos.");
        System.out.println();

        // 5. Nustatykite darbuotojo lyti pagal asmens koda
        if(darb01.nustatytiLyti() == 'V') System.out.println("darb01 yra vyras");
        else System.out.println("darb01 yra moteris");
        if(darb02.nustatytiLyti() == 'V') System.out.println("darb02 yra vyras");
        else System.out.println("darb02 yra moteris");
        if(darb03.nustatytiLyti() == 'V') System.out.println("darb03 yra vyras");
        else System.out.println("darb03 yra moteris");
        if(darb04.nustatytiLyti() == 'V') System.out.println("darb04 yra vyras");
        else System.out.println("darb04 yra moteris");
        System.out.println();

        // 6. Nustatykite darbuotojo gimimo metus
        System.out.println("darb01 gimimo metai yra: " + getGimimoMetai(darb01));
        System.out.println("darb02 gimimo metai yra: " + getGimimoMetai(darb02));
        System.out.println("darb03 gimimo metai yra: " + getGimimoMetai(darb03));
        System.out.println("darb04 gimimo metai yra: " + getGimimoMetai(darb04));

    }
    public static void palyginti(Darbuotojas drb01, Darbuotojas drb02, List sar){
        sar.add(drb01.getPareigos() == drb02.getPareigos());
    }
    public static int getGimimoMetai(Darbuotojas drb){
        char lytiesSkaicius = Long.toString(drb.getAsmensKodas()).charAt(0);
        int gimimoMetai = Integer.parseInt(Long.toString(drb.getAsmensKodas()).substring(1,3));
        if(lytiesSkaicius == '3' || lytiesSkaicius == '4') gimimoMetai += 1900;
        else gimimoMetai += 2000;
    return gimimoMetai;
    }

}


