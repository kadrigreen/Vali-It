package ee.bcs.valiit.tasks;

// TODO kasuta if/else. Ära kasuta Math librarit
public class Lesson1 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Vali funktsioon 1-min, 2-max, 3-abs, 4-isEven, 5-min3, 6-max3");
//        int funktsioon = scanner.nextInt();
//        if (funktsioon == 1) {
//            System.out.println("Sisesta 2 arvu");
//            int a = scanner.nextInt();
//            int b = scanner.nextInt();
//            System.out.println("Miinimum on " + min(a, b));
//        } else if (funktsioon == 2) {
//            System.out.println("Sisesta 2 arvu");
//            int a = scanner.nextInt();
//            int b = scanner.nextInt();
//            System.out.println("Maksimum on " + max(a, b));
//        } else if (funktsioon == 3) {
//            System.out.println("Sisesta arv");
//            int a = scanner.nextInt();
//            System.out.println("Absoluut on " + abs(a));
//        } else if (funktsioon == 4) {
//            System.out.println("Sisesta arv");
//            int a = scanner.nextInt();
//            if(isEven(a)){
//                System.out.println("Paaris arv");}
//            else {
//                System.out.println("Paaritu arv");
//            }
//        } else if (funktsioon == 5) {
//            System.out.println("Sisesta 3 arvu");
//            int a = scanner.nextInt();
//            int b = scanner.nextInt();
//            int c = scanner.nextInt();
//            System.out.println("Kolme arvu miinimum on " + min3(a, b, c));
//        } else if (funktsioon == 6) {
//            System.out.println("Sisesta 3 arvu");
//            int a = scanner.nextInt();
//            int b = scanner.nextInt();
//            int c = scanner.nextInt();
//            System.out.println("Kolme arvu maksimum on " + max3(a, b, c));
//        } else{
//            System.out.println("Valitud funktsiooni ei olnud valikus");
//        }


    // Siia sisse võid sa kirjutada koodi, et testida kas su meetodid töötavad ilusti
    // Katseta IntelliJ shortcuti. Olles intelliJ kirjuta "sout" ja siis vajuta enter
       System.out.println(min(1, 3)); // trükib miinimumi 1 ja 3
       System.out.println(max(2, 5));
//        System.out.println(abs(-4));
//        System.out.println(isEven(8));
  System.out.println(min3(3, 5, 1));
        System.out.println(max3(3, 5, 10));
}


    // TODO tagasta a ja b väikseim väärtus
    public static int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    // TODO tagasta a ja b suurim väärtus
    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
        }
        return b;
    }

    // TODO tagasta a absoluut arv
    public static int abs(int a) {
        if (a < 0) {
            return a * -1;
        } else {
            return a;
        }
    }

    // TODO tagasta true, kui a on paaris arv
    // tagasta false kui a on paaritu arv
    public static boolean isEven(int a) {
        if (a % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // TODO tagasta kolmest arvust kõige väiksem
    public static int min3(int a, int b, int c) {
        if (a <= b && a <= c) {
            return a;
        } else if (b <= a && b <= c) {
            return b;
        } else {
            return c;
        }

    }

    // TODO tagasta kolmest arvust kõige suurem
    public static int max3(int a, int b, int c) {
//       return max(max(a, b), c);
        if (a >= b && a >= c) {
            return a;
        }
        if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }
}
