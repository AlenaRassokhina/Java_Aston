public class ProcessArray {
    public static class MyArraySizeException extends Exception {
        public MyArraySizeException(String message) {
            super(message);
        }
    }
    public static class MyArrayDataException extends Exception {
        public MyArrayDataException(String message) {
            super(message);
        }
    }

    public void myArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array == null || array.length != 4) {
            throw new MyArraySizeException("Ошибка: Входной массив должен иметь 4 строки.");
        }
        for (int i = 0; i < 4; i++) {
            if (array[i] == null || array[i].length != 4) {
                throw new MyArraySizeException("Ошибка: Строка " + i + " должна иметь 4 столбца.");
            }
        }
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Ошибка: элемент в ячейке [" + i + "][" + j + "] не является числом.");
                }
            }
            System.out.println("Сумма элементов: " + sum);
        }
    }
}
