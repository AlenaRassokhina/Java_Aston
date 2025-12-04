public class Main5 {
    public static void main (String[] args) {
        //task 1, 2, 3
        String[][] myMassive = {
                {"15", "3", "17", "15"},
                {"2", "5", "78", "5"},
                {"3", "15", "8", "9"},
                {"5", "6", "9", "P"}
        };
        try {
            ProcessArray processor = new ProcessArray();
            processor.myArray(myMassive);
        } catch (ProcessArray.MyArraySizeException | ProcessArray.MyArrayDataException e) {
            System.err.println(e.getMessage());
        }

        //task 4
        String[][] largeArray = new String[5][5];
        try {
            // Попытка доступа к элементу за пределами массива
            System.out.println(largeArray[4][5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Перехвачено исключение: " + e.getMessage());
        }
    }
}
