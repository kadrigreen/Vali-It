package ee.bcs.valiit.codewars;

public class Ex1 {
    public static void main(String[] args) {
        System.out.println(howOld("1 years old"));
        System.out.println(howOld("2 years old"));
        System.out.println(howOld("9 years old"));


    }
    //Ask a small girl - "How old are you?". She always says strange things... Lets help her!
//  For correct answer program should return int from 0 to 9.
//  Assume test input string always valid and may look like "1 year old" or "5 years old", etc..
//   The first char is number only.

    public static int howOld(final String herOld) {
        //your code here, return correct age as int ; )
        int age = Integer.parseInt(herOld.substring(0,1));


        return age;
    }
}

