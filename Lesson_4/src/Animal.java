public abstract class Animal {

    protected String name;
    private static int animalCount = 0;
    protected boolean satiety;

    public Animal(String name) {
        this.name = name;
        this.satiety = false;
        animalCount++;
    }
    public static int getAnimalCount() {
        return animalCount;
    }

    public String getName() {
        return name;
    }

    public void animalRun(int distance) {
    }

    public void animalSwim(int distance) {
    }

    public void animalEats() {
    }

    public boolean isSatiety() {
        return satiety;
    }
}

class FoodBowl {
    private int foodAmount;

    public FoodBowl(int startAmount) {
        this.foodAmount = startAmount;
    }

    public int getFoodAmount() {
        return foodAmount;
    }

    public void takeFood(int amount, String catName) {
        if (amount <= 0) {
            System.out.println("Нельзя взять отрицательное количество еды.");
            return;
        }
        if (amount <= foodAmount) {
            foodAmount = foodAmount - amount;
            System.out.println("Из миски взято " + amount + " еды. Осталось: " + foodAmount);
        } else {
            System.out.println("Недостаточно еды в миске. Попытка взять: " + amount + ", в наличии: " + foodAmount);
        }
    }

    public boolean checkFood(int amount) {
        if (amount <= 0) {
            return false;
        }
        if (amount <= foodAmount) {
            foodAmount = foodAmount - amount;
            return true;
        } else {
            return false;
        }
    }

    public void addFood(int amount) {
        this.foodAmount = this.foodAmount + amount;
        System.out.println("Добавлено " + amount + " еды. В миске сейчас " + this.foodAmount + ".");
    }
}

class Dog extends Animal {
    private static int dogCount = 0;

    public Dog(String name) {
        super(name);
        dogCount++;
    }

    public static int getDogCount() {
        return dogCount;
    }

    @Override
    public void animalRun(int distance) {
        if (distance <= 500) {
            System.out.println(this.name + " пробежал(а) " + distance + " м.");
        } else {
            System.out.println(this.name + " устала бежать " + distance + " м.");
        }
    }

    @Override
    public void animalSwim(int distance) {
        if (distance <= 10) {
            System.out.println(this.name + " проплыл(а) " + distance + " м.");
        } else {
            System.out.println(this.name + " устала плыть " + distance + " м.");
        }
    }
}

class Cat extends Animal {
    private static int catCount = 0;

    public Cat(String name) {
        super(name);
        catCount++;
    }

    public static int getCatCount() {
        return catCount;
    }

    @Override
    public void animalRun(int distance) {
        if (distance <= 200) {
            System.out.println(this.name + " пробежал(а) " + distance + " м.");
        } else {
            System.out.println(this.name + " устала бежать " + distance + " м.");
        }
    }

    @Override
    public void animalSwim(int distance) {
        if (distance >= 0) {
            System.out.println(this.name + " не умеет плавать");
        }
    }

    @Override
    public void animalEats() {
        System.out.println(getName() + " ест корм.");
    }
}
