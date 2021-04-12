package ee.bcs.valiit.tests;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        int[] testArray = {2, 4, 6};
        System.out.println(kasJagub(41));
        System.out.println(Arrays.toString(addToArray(testArray, 3)));
    }

    //    ÜL 1
//    Tee funktsioon, mis tagastab boolean väärtuse ja võtab sisse ühe parameetri
//    funktsioon peab tagastama
//		true: kui sisend parameeter jagub 3 või 7 (aga ei jagu mõlema numbriga)
//            false: kui sisend parameeter ei jagu 3 ega 7 või jagub mõlema numbriga
    public static boolean kasJagub(int x) {
        if (x % 3 == 0 || x % 7 == 0) {
            return true;
        } else {
            return false;
        }
    }



    // ÜL2
    // lisa x igale array elemendile
    // Näiteks
    // sisend [1,2,3], 5
    // vastus [6,7,8]

    public static int[] addToArray(int[] array, int x) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i] + x;

        }
        return newArray;
    }

}
