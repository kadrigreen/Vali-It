package ee.bcs.valiit.tasks;

import java.util.Arrays;

public class Lesson2b {
    public static void main(String[] args) {
//        exercise1(9);
//        System.out.println(9);
//
//        System.out.println(Arrays.toString(sampleArray()));

        //System.out.println(Arrays.toString(generateArray(5)));

        System.out.println(Arrays.toString(decreasingArray(-5)));

        System.out.println(Arrays.toString(yl3(10)));
    }

    // TODO trüki välja n arvu
    // näiteks
    // sisend: 5
    // trüki välja: 1 2 3 4 5
    public static void exercise1(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i); // System.out.println(i+" ") prindib välja "1 2 3 " (üksteise kõrvale, mitte alla)
        }
    }


    // TODO tagasta massiiv milles oleks numbrid 1,2,3,4,5
    public static int[] sampleArray() {
        return new int[]{1, 2, 3, 4, 5};

    }

    // TODO loo massiiv mis saab sisendiks n ja tagastab massiivi suurusega n
    // Kus esimene element on 1 ja iga järnev arv on 1 võrra suurem
    // näiteks:
    // sisend: 5
    // vastus: {1, 2, 3, 4, 5}
    public static int[] generateArray(int n) {
        int[] newArray = new int[n];
        for (int i = 0; i < n; i++) { // n on sama mis newArray.length (saaks ka kasutada)
            newArray[i] = i + 1;
        }


        return newArray;
    }

    // TODO
    // Tagastada massiiv kus oleks numbrid n-ist 0 ini
    // Näiteks: sisend: 5
    // Väljund: 5, 4, 3, 2, 1, 0
    // Näide2: siend: -3
    // Väljund: -3, -2, -1, 0
    public static int[] decreasingArray(int n) {

        if (n >= 0) {
            int[] decrease = new int[n + 1];
            for (int i = 0; i < n; i++) {  // for(int i=n; i>=0;i--)
                decrease[i] = n - i;       //decrease[i]=
            }
            return decrease;
        } else {
            int[] decrease = new int[-n+1];   // int[] decrease = new int[Math.Abs(n)+1];
            for (int i = n; i <=0; i++) {
                decrease [-n+i]=i;
                //decrease[i] = n + i;
            }
//            decrease [-n+i]=i; //-(-5)+(-5)
//            decrease [1]=i;//-(-5)+(-4)
//            decrease [2]=i;
//            decrease [3]=i;
//            decrease [4]=i;
//            decrease [5]=i;

            return decrease;
        }
    }


    // TODO
    // tagasta massiiv pikkusega n, mille kõigi elementide väärtused on 3
    public static int[] yl3(int n) {
        int[] array1 = new int[n];
        for (int i = 0; i < n; i++) {
            array1[i] = 3;
        }
        return array1;
    }
}
