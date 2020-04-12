public class Exemplu1 {

    /*
        Tipurile zonei de memorie:
                   -> primitive
                   -> referinte

               Tipurile primitive:
                   -> byte
                   -> short
                   -> int -> default
                   -> long
                   -> float
                   -> double -> default
                   -> char
                   -> boolean

               byte, short, int, long -> numere intregi
               float, double -> numere reale
               char -> caractere
               boolean -> true/false

               byte -> 1 byte -> 8 biti -> 256 = 2^8 valori -> [-128, 127]
               short -> 2 bytes -> 16 biti -> 2^16 = 65536 valori -> [-32768, 32767]

               var -> reserved type name
    */

    public static void main(String[] args) {

        byte b1 = 20;
        System.out.println(b1);

        short s1 = 2000;
        System.out.println(s1);

        int i1 = 10;
        System.out.println(i1);

        long l1 = 10000000000L;
        System.out.println(l1);
//        L, l -> literal pentru long

        double d1 = 10;
        System.out.println(d1);

        float f1 = 10;
        System.out.println(f1);

        float f2 = 10.5f;
        System.out.println(f2);
//        F, f -> literal pentru float

        float f3 = (float) 10.5;
        System.out.println(f3);

        int i2 = 1000000;
        System.out.println(i2);
        int i3 = 1_000_000;
        System.out.println(i3);

        double d2 = 10.51;
        System.out.println(d2);
        double d3 = 1_0.5_1;
        System.out.println(d3);

        char c1 = 'a';
        System.out.println(c1);

        char c2 = '\n'; // newline
        char c3 = '\t'; // tab
        char c4 = '\b'; // backspace

        char c5 = '\u4567'; // tabela UNICODE
        System.out.println(c5);

//        c5 = c5 + 1; // nu compileaza
        c5 += 1;
        System.out.println(c5);

        boolean b2 = true;
        boolean b3 = false;
        System.out.println(b3);

        String s2 = "abcde fgh \n \u1234 \\";
        System.out.println(s2);
    }
}
