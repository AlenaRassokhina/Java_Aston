
public class Main4 {
    public static void main(String[] args) {
        //task 1
        Dog dogVasya = new Dog("Вася");
        Cat catBusya = new Cat("Буся");
        Dog dogBuddy = new Dog("Дружок");
        Cat catMusya = new Cat("Муся");

        dogVasya.animalRun(150);
        dogVasya.animalSwim(20);
        catBusya.animalRun(250);
        catBusya.animalSwim(10);
        dogBuddy.animalRun(100);
        dogBuddy.animalSwim(5);
        catMusya.animalRun(25);
        catMusya.animalSwim(0);

        System.out.println("--------------------");
        System.out.println("Количество животных: " + Animal.getAnimalCount());
        System.out.println("Количество котов: " + Cat.getCatCount());
        System.out.println("Количество собак: " + Dog.getDogCount());

        FoodBowl bowl = new FoodBowl(50);

        System.out.println("--------------------");
        Cat[] cats = {
                new Cat("Мурзик"),
                new Cat("Барсик"),
                new Cat("Филя"),
                new Cat("Спот"),
                new Cat("Матроскин")
        };

        System.out.println("\n--- Информация о сытости котов ---");
        for (Cat cat : cats) {
            boolean catIsSatiety = bowl.checkFood(15);
            System.out.println(cat.getName() + ": " + (catIsSatiety ? "сытый" : "голодный"));
        }

        bowl.addFood(155);

        System.out.println("--------------------");
        catMusya.animalEats();
        bowl.takeFood(5, "");
        bowl.takeFood(15, "");
        bowl.takeFood(-6, "");
        System.out.println("--------------------");

        //task 2
        Methods circle = new Circle(5.0, "Красный", "Черный");
        System.out.println("Фигура: Круг");
        circle.displayCircle();

        Methods rectangle = new Rectangle(15, 20, "Синий", "Желтый");
        System.out.println("Фигура: Прямоугольник");
        rectangle.displayRectangle();

        Methods triangle = new Triangle(15, 16, 18, "Зеленый", "Черный");
        System.out.println("Фигура: Треугольник");
        triangle.displayTriangle();
    }
}