import java.util.Arrays;

public class Methods {
    //метод 1
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    //метод 2
    public static void checkSumSign() {
        int a = 20;
        int b = 22;
        int summa = a + b;
        if (summa >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    //метод 3
    public static void printColor() {
        int value = 101;

        if (value <= 0) {
            System.out.println("Красный");
        } if (value > 100) {
            System.out.println("Зеленый");
            } else {
            System.out.println("Желтый");
        }
    }

    //метод 4
    public static void compareNumbers() {
        int a = 49;
        int b = 50;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    //метод 5
    public static boolean checkSum(int a, int b) {
        int summ = a + b;
        if (summ < 10 || summ > 20) {
            return false;
        } else {
            return true;
        }
    }

    //метод 6
    public static void check(int a) {
        if (a >= 0) {
            System.out.println("число положительное");
        } else {
            System.out.println("число отрицательное");
        }
    }

    //метод 7
    public static boolean checkNumber(int a) {
        if (a >= 0) {
            return false;
        } else {
            return true;
        }
    }

    //метод 8
    public static void cycle(int number, String inputString) {
        for (int i = 0; i < number; i++) {
            System.out.println(inputString);
        }
    }

    //метод 9
    public static boolean leapYear(int year) {
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            return true;
        } else {
            return false;
        }
    }

    //метод 10
    public static void massive() {
        int [] arr = {1, 0, 1, 0, 0, 1, 0, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else if (arr[i] == 0) {
                arr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //метод 11
    public static void massiveZero() {
        int [] arr = new int [100];
        for (int i = 0; i < 100; i++) {
            arr [i] = i;
        }
        System.out.println(Arrays.toString(arr));
    }

    //метод 12
    public static void massiveChange() {
        int [] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //метод 13
    public static void massiveSquare() {
        int counter = 1;
        int [] [] table = new int [5] [5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                table [i] [j] = counter;
                System.out.println(table [i] [j] + " ");
            }
            System.out.println();
        }
    }

    //метод 14
    public static void cycleBackMassif(int len, int initialValue) {
        int [] arr = new int [len];
        for (int i = 0; i < len ; i++) {
            arr [i] = initialValue;
        }
        System.out.println(Arrays.toString(arr));
    }
}
