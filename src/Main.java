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


        Darbuotojas darb01 = new Darbuotojas("Vardas1", "Pavarde1", "krovikas", "39005050012", true );
        Darbuotojas darb02 = new Darbuotojas("Vards2", "Pavarde2", "administratorius", "30512090162", true );
        Darbuotojas darb03 = new Darbuotojas("Vrds3", "Pavarde3", "vadybininkas", "39801231002", false );
        Darbuotojas darb04 = new Darbuotojas("Vds4", "Pavarde4", "vadybininkas", "30204190715", true );

        System.out.println("Sujungtas vardas ir pavarde darb01: " + darb01.sujunk());
        System.out.println("Sujungtas vardas ir pavarde darb02: " + darb02.sujunk());
        System.out.println("Sujungtas vardas ir pavarde darb03: " + darb03.sujunk());
        System.out.println("Sujungtas vardas ir pavarde darb04: " + darb04.sujunk());
        System.out.println();

        System.out.println("Sujungto darb01 vardo ir pavardes simboliu skaicius: " + darb01.kiekSimboliu());
        System.out.println("Sujungto darb02 vardo ir pavardes simboliu skaicius: " + darb02.kiekSimboliu());
        System.out.println("Sujungto darb03 vardo ir pavardes simboliu skaicius: " + darb03.kiekSimboliu());
        System.out.println("Sujungto darb04 vardo ir pavardes simboliu skaicius: " + darb04.kiekSimboliu());
        System.out.println();

        System.out.println("Iskirtas darb01 tekstas : " + darb01.iskirpti(3, 9));
        System.out.println("Iskirtas darb02 tekstas : " + darb02.iskirpti(3, 9));
        System.out.println("Iskirtas darb03 tekstas : " + darb03.iskirpti(3, 9));
        System.out.println("Iskirtas darb04 tekstas : " + darb04.iskirpti(3, 9));


        List<Boolean> sarasas = new ArrayList<>();
        palyginti(darb01, darb02, sarasas);
        if(sarasas.getFirst()){
            System.out.println("darb01 ir darb02 pareigos yra vienodos.");
        } else System.out.println("darb01 ir darb02 pareigos yra skirtingos.");

        palyginti(darb03, darb04, sarasas);
        if(sarasas.getLast()){
            System.out.println("darb03 ir darb04 pareigos yra vienodos.");
        } else System.out.println("darb03 ir darb04 pareigos yra skirtingos.");

    }
    public static void palyginti(Darbuotojas drb01, Darbuotojas drb02, List sar){
        sar.add(drb01.getPareigos() == drb02.getPareigos());
    }
}


