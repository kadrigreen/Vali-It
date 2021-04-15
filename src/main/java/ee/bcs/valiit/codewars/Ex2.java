package ee.bcs.valiit.codewars;

public class Ex2 {
    public static void main(String[] args) {

    }
   public static int nthPower(int[] array, int n) {
       int[] newArray = new int[array.length];
       for (int i = 0; i < array.length; i++) {
           if (n < 0 || array.length - 1 > n) {
               return -1;
           } else {
               n=array.length;

           }
       }
       return 0;
   }

//    You are given an array with positive numbers and a non-negative number N.
//    You should find the N-th power of the element in the array with the index N.
//    If N is outside of the array, then return -1. Don't forget that the first element has the index 0.
//    Let's look at a few examples:
//    array = [1, 2, 3, 4] and N = 2, then the result is 3^2 == 9;
//    array = [1, 2, 3] and N = 3, but N is outside of the array, so the result is -1.
}
