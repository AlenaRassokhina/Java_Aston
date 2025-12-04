import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        //метод 1
        Methods.printThreeWords();

        //метод 2
        Methods.checkSumSign();

        //метод 3
        Methods.printColor();

        //метод 4
        Methods.compareNumbers();

        //метод 5
        boolean resalt = Methods.checkSum(7, 8);
        System.out.println(resalt);

        //метод 6
        Methods.check(-6);

        //метод 7
        boolean resultNumber = Methods.checkNumber(0);
        System.out.println(resultNumber);

        //метод 8
        Methods.cycle(6, "Java");

        //метод 9
        boolean resultYear =  Methods.leapYear(1945);
        System.out.println(resultYear);

        //метод 10
        Methods.massive();

        //метод 11
        Methods.massiveZero();

        //метод 12
        Methods.massiveChange();

        //метод 13
        Methods.massiveSquare();

        //метод 14
        Methods.cycleBackMassif(10, 7);
    }
}
