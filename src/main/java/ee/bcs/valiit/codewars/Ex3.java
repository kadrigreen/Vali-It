package ee.bcs.valiit.codewars;

public class Ex3 {
    public static void main(String[] args) {

    }

    public static int sumOfDifferences(int[] arr) {
        if (arr.length <= 1) {
            return 0;
        } else {
            // a[array.length]-b[array.length-1]
            //  b[array.length-2]-c[array.length-3]
            //  c[array.length-3]-d[array.length-4]
            for (int i = 1; i < arr.length; i++) {
                int difference = arr[arr.length] - arr[arr.length - i];
                int difference2 = arr[arr.length] - arr[arr.length - i];
                int sum = difference + difference2;
            }

                return 0;

            }
        }
  /*  Your task is to sum the differences between consecutive pairs in the array in descending order.
        For example:
        sumOfDifferences([2, 1, 10])
        Returns 9
        Descending order: [10, 2, 1]
        Sum: (10 - 2) + (2 - 1) = 8 + 1 = 9
        If the array is empty or the array has only one element the result should be 0 (Nothing in Haskell).*/
}


