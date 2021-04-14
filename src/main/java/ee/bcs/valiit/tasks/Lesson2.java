package ee.bcs.valiit.tasks;

public class Lesson2 {

    public static void main(String[] args) {
        // TODO siia saab kirjutada koodi testimiseks

        //System.out.println(Arrays.toString(reverseArray(9)));
        //System.out.println(Arrays.toString(sum(testArray)));

        //multiplyTable(5, 5);
        //System.out.println("Fibonacci number is "+fibonacci(0));
        System.out.println("Pikem jada on number " + sequence3n(10, 20));
        System.out.println("Järgmine x element " + nextElement(3));
        System.out.println("Jada x pikkus " + getSeqLength(1));
        System.out.println(evenNumbers(5));
        //System.out.println(Arrays.toString(minElement));

    }

    // TODO loe funktsiooni sisendiks on täisarvude massiiv
    // TODO tagasta massiiv mille elemendid on vastupidises järiekorras
    public static int[] reverseArray(int[] inputArray) {
        int[] returnArray = new int[inputArray.length];// uus muutuja, mis on sama pikk kui inPutArray
        for (int i = 0; i < inputArray.length; i++) {
            returnArray[i] = inputArray[inputArray.length - i - 1];
        }
        return returnArray;
    }

    // TODO tagasta massiiv mis sisaldab n esimest paaris arvu
    // Näide:
    // Sisend 5
    // Väljund 2 4 6 8 10
    public static int[] evenNumbers(int n) {
        int[] returnArray = new int[n];//
        for (int i = 0; i < n; i++) {
            returnArray[i] =i*2+2;
        }
            return returnArray;

    }



    // TODO, leia massiivi kõige väiksem element
    public static int min(int[] x) {
        int minElement = x[0];
        for (int i = 1; i < x.length; i++) {
            if (x[i] < minElement) {
                minElement = x[i];
            }
        }
        return minElement;
    }

    // TODO, leia massiivi kõige suurem element
    public static int max(int[] x) { // 4 5 6 7 8
        int maxElement = x[0];
        for (int i = 1; i < x.length; i++) {
            if (x[i] > maxElement) {
                maxElement = x[i];
            }
        }
        return maxElement;
    }

    // TODO, leia massiivi kõigi elementide summa
    public static int sum(int[] x) {
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }

        return sum;
    }

    // TODO trüki välja korrutustabel mis on x ühikut lai ja y ühikut kõrge
    // TODO näiteks x = 3 y = 3
    // TODO väljund
    // 1 2 3
    // 2 4 6
    // 3 6 9
    // TODO 1 trüki korrutustabeli esimene rida (numbrid 1 - x)
    // TODO 2 lisa + " " print funktsiooni ja kasuta print mitte println
    // TODO 3 trüki seda sama rida y korda
    // TODO 4 Kuskile võiks kirjutada System.out.println(),
    //  et saada taebli kuju
    // TODO 5 võrdle ridu. Kas on mingi seaduspärasus ridade vahel,
    // mis on ja mis võiks olla. Äkki tuleb mõni idee
    public static void multiplyTable(int x, int y) {

        for (int rida = 1; rida <= x; rida++) {    // nested loop
            for (int tulp = 1; tulp <= y; tulp++) {
                System.out.print(rida * tulp + " ");
            }
            System.out.println();
        }
    }


    // TODO
    // Fibonacci jada on fib(n) = fib(n-1) + fib(n-2);
    // 0, 1, 1, 2, 3, 5, 8, 13, 21
    // Tagasta fibonacci jada n element. Võid eeldada, et n >= 0
    public static int fibonacci(int n) {
        int fib1 = 0; // fib element 1
        int fib2 = 1; //fib element 2
        int fibNew; // , millest saab fib2 ja fib2 muutub fib1ks
        if (n == 0) {
            return 0;
        } else {
            for (int i = 1; i < n; i++) { // 0, 1, 2, 3, 4, 5, 6,
                //
                fibNew = fib1 + fib2; //fib1+fib2 tekib uus fib 0+1=1, 1+1=2, 1+2=3, 2+3=5, 3+5=8 5+8=13, 8+13=21
                fib1 = fib2; // fib1 muutub fib2ks 1, 1, 2, 3, 5, 8, 13
                fib2 = fibNew; // fib2 muutub uueks fibiks 1, 2, 3, 5, 8, 13, 21
            }
            return fib2; // 21
        }
    }

    // TODO
    // Kujutame ette numbrite jada, kus juhul kui number on paaris arv siis me jagame selle 2-ga
    // Kui number on paaritu arv siis me korrutame selle 3-ga ja liidame 1. (3n+1)
    // Seda tegevust teeme me niikaua kuni me saame vastuseks 1
    // Näiteks kui sisend arv on 22, siis kogu jada oleks:
    // 22 -> 11 -> 34 -> 17 -> 52 -> 26 -> 13 -> 40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1
    // Sellise jada pikkus on 16
    // Kirjutada programm, mis peab leidma kõige pikema jada pikkuse mis jääb kahe täis arvu vahele
    // Näiteks:
    // Sisend 10 20
    // Siis tuleb vaadata, kui pikk jada tuleb kui esimene numbr on 10. Järgmisen tuleb arvutada number 11 jada pikkus.
    // jne. kuni numbrini 20
    // Tagastada tuleb kõige pikem number
    // Näiteks sisendi 10 ja 20 puhul on vastus 20

    public static int sequence3n(int x, int y) {
        //x=1 ja y=2
        int number;
        int maxJada;

        return 0;
    }

    public static int nextElement(int x) {
        int järgmine;
        if (x % 2 == 0) { //kui arv on paaris
            järgmine = x / 2;
        } else { //kui arv on paaritu
            järgmine = x * 3 + 1;
        }
        return järgmine;
    }

    public static int getSeqLength(int x) {
        int jadaPikkus;
        for (int i = 0; i < x; i++) {

        }
        return 0;
    }


}
