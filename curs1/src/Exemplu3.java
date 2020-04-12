public class Exemplu3 {

    /*
        Operatorul ternar(Elvis) -> ?:
            -> operator decizional
            -> ia o decizie a unei valori pe care o intoarce in functie de o conditie booleana
            -> intoarce o valoare in functie de o conditie
            -> evalueaza conditia si daca contitia este true, returneaza prima valoare,
            altfel daca conditia este false returneaza a doua valoare
            -> cele 2 valori pe care le poate returna trebuie sa fie de acelasi tip
     */
    public static void main(String[] args) {
        int i1 = 4 < 5 ? 100 : 200;
        System.out.println(i1);

        String s1 = 3 > 4 ? "A" : "B";
        System.out.println(s1);

        String s2 = 3 < 4 ? (4 < 5 ? "A" : "B") : "C";
        System.out.println(s2);

        String s3 = 9 < 3 ? 2 < 1 ? "D" : "E" : "F";
        System.out.println(s3);
    }
}
