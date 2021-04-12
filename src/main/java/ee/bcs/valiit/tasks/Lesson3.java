package ee.bcs.valiit.tasks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Lesson3 {
    public static void main(String[] args) {
        //System.out.println("Faktoriaal " + factorial(5));
        //System.out.println("Tagurpidi String " + reverseString("abcd"));
        System.out.println("1 Prime Number " + isPrime(1));
        System.out.println("2 Prime Number " + isPrime(2));
        System.out.println("937 Prime Number " + isPrime(937));
        System.out.println("217 Prime Number " + isPrime(217));
        System.out.println("60 Prime Number " + isPrime(60));
        int[] testArray = {8, 2, 5, 1, 9, 3};
        System.out.println("Massiiv suuruse järjekorras on " + Arrays.toString(sort(testArray)));
        System.out.println("Paaris Fibonacci jada arvude summa on " + evenFibonacci(10));
        System.out.println("Morsekoodis sos " + morseCode("sos"));
    }

    // TODO tagasta x faktoriaal.
    // Näiteks
    // x = 5
    // return 5*4*3*2*1 = 120
    public static int factorial(int x) {
        int sum = 1;
        for (int i = 1; i <= x; i++) {
            sum *= i;
        }
        return sum;
    }

    // TODO tagasta string tagurpidi
    public static String reverseString(String a) {
        String tagurpidi = "";
        for (int i = a.length() - 1; i >= 0; i--) { //tsükkel 3 kuni 0
            tagurpidi += a.charAt(i);
        }
        return tagurpidi;
    }

    // TODO tagasta kas sisestatud arv on primaar arv (jagub ainult 1 ja iseendaga)
    public static boolean isPrime(int x) {
        if (x == 0 || x == 1) {
            return false;
        } else {
            for (int i = 2; i <= x; i++) { //tsükkel 2 kuni x
                //2, 3, 4, 5
                if (x % i == 0) {        //kui x jagatud iseendaga on jääk 0, tähendab on prime number
                    return false;
                } else {                 // kõik ülejäänud variandid, ei ole prime number
                    return true;
                }

            }

        }
        return true; // false???

    }


    // TODO sorteeri massiiv suuruse järgi.
    // TODO kasuta tsükleid, ära kasuta ühtegi olemasolevat sort funktsiooni
    public static int[] sort(int[] a) {
        for (int i = 0; i < a.length; i++) {              //tsükkel käib kuni a massiivi pikkuseni
            // väärtused    8, 2, 5, 1, 9, 3
            // i näitab indexit 0, 1, 2, 3, 4, 5
            //  väärtused           2, 5, 1, 9, 3
            for (int j = i + 1; j < a.length; j++) {      // sisemine tsükkel käib 1, 2, 3, 4, 5
                if (a[i] > a[j]) {        // kui a väärtusel 0 on suurem kui a väärtusel 1 ehk 8 > 2,
                    int uus = a[i];                  // uus muutuja on 8
                    a[i] = a[j];                     // 8=2
                    a[j] = uus;                       // uus=2
                }
            }
        }
        return a;
        //
    }

    public static int evenFibonacci(int x) {
        // TODO liida kokku kõik paaris fibonacci arvud kuni numbrini x
        if (x < 2) {
            return 0;
        }
        int fib1 = 0;
        int fib2 = 1;
        int fib3;
        int summa = 0;


        return 0;

    }


    public static String morseCode(String text) {
        // TODO kirjuta programm, mis tagastab sisestatud teksti morse koodis (https://en.wikipedia.org/wiki/Morse_code)
        // Kasuta sümboleid . ja - ning eralda kõik tähed tühikuga
        Map<Character, String> morseKood = new HashMap<>();

        morseKood.put('s', "...");
        morseKood.put('o', "---");
        morseKood.put('h', "....");
        morseKood.put('e', ".");
        morseKood.put('l', ".-..");

        String a = ""; //määra muutujale a väärtus
        for (int i = 0; i <= text.length(); i++) {    // tsükkel nullist kuni sisend teksti pikkuseni
            String l = text.substring(i, i + 1); // uus muutuja l, mille väärtuseks on
            // sisend stringi positsioon i-st kuni i+1-ni

            a = a + morseKood.get(l) + ""; // muutuja a saab väärtuse a+l

        }

        return a.trim(); // .trim eemaldab segavad tühikud
    }
}
