public class Exemplu2 {

    /*
        Operatori
     */

    public static void main(String[] args) {
        /*
            -> Operatori matematici:
                +, -, /, *, % (modulo -> restul impartierii)
                    + -> binar (are nevoie de 2 operanzi)
                    - -> unar si binar
                    / -> binar
                    * -> binar
                    % -> binar
         */

        int x = 10 + 5;
        System.out.println(x);

        int y = -x;
        System.out.println(y);

        int z = ((x + 10) * 10) + 10;
        System.out.println(z);

        /*
            Operatori de comparare:
                ==, !=, <, >, <=, >=
                    -> binari
                    -> rezultatul lor este intotdeauna un boolean (true/false)

                ==, != -> intre tipuri numerice si intre referinte de obiecte
                <, >, <=, >= -> doar intre tipuri numerice
         */

        boolean b1 = 3 == 5;
        System.out.println(b1);

        boolean b2 = 3 < 5;
        System.out.println(b2);

        boolean b3 = b1 == b2;
        System.out.println(b3);

        /*
            Operatori logici:
                ! -> opeartor de negare
                  -> unar, sta in fata operandului care trebuie sa fie mereu de tip boolean

                &, && -> operatorul SI logic
                    & -> operator SI standard (nescurtcircuitat)
                    && -> operator SI scurtcircuitat
                    -> au acelasi tabel de adevar
                    -> difera la executie prin modul in care sunt interpretati

                 |, || -> opratorul SAU logic
                    | -> operator SAU standard (nescurtcircuitat)
                    || -> oprator SAU scurtcircuitat
                    -> au acelasi tabel de adevar
                    -> difera la executie prin modul in care sunt interpretati
         */

        boolean b4 = !b3;
        System.out.println(b4);

        boolean b5 = false & true;
        System.out.println(b5);

        boolean b6 = false && true;
        System.out.println(b6);

        boolean b7 = true | false;
        System.out.println(b7);

        boolean b8 = true || false;
        System.out.println(b8);

        boolean b9 = m1() | m2(); // m1 si m2
        System.out.println(b9);

        boolean b10 = m1() || m2(); // m1 si m2
        System.out.println(b10);

        boolean b11 = m1() & m2(); // m1 si m2
        System.out.println(b11);

        boolean b12 = m1() && m2(); // m1
        System.out.println(b12);
    }

    public static boolean m1() {
        System.out.println("m1");
        return false;
    }

    public static boolean m2() {
        System.out.println("m2");
        return true;
    }
}
