import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        //метод 1
        methods.printThreeWords();

        //метод 2
        methods.checkSumSign();

        //метод 3
        methods.printColor();

        //метод 4
        methods.compareNumbers();

        //метод 5
        boolean resalt = methods.checkSum(7, 8);
        System.out.println(resalt);

        //метод 6
        methods.check(-6);

        //метод 7
        boolean resultNumber = methods.checkNumber(0);
        System.out.println(resultNumber);

        //метод 8
        methods.cycle(6, "Java");

        //метод 9
        boolean resultYear =  methods.leapYear(1945);
        System.out.println(resultYear);

        //метод 10
        methods.massive();

        //метод 11
        methods.massiveZero();

        //метод 12
        methods.massiveChange();

        //метод 13
        methods.massiveSquare();

        //метод 14
        methods.cycleBackMassif(10, 7);
    }
}
