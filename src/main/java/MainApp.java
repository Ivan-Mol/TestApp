public class MainApp {
    public static void main(String[] args) {
        Duck duck1 = new Duck("Утка",1,"Россия","Красный");
        Duck duck2 = new Duck("Утка2",2,"Россия","Серый");
        Duck duck3 = new Duck("Утка3",3,"Россия","Зеленый");
        Dog dog1 = new Dog("Собака1",4,"Россия","Черный");
        Dog dog2 = new Dog("Собака2",12,"Россия","Белый");
        Dog dog3 = new Dog("Собака3",5,"Россия","Синий");
        Zoo zoo = new Zoo();
        zoo.addAnimals(duck1,duck2,duck3,dog1,dog2,dog3);
        System.out.println();

    }
}
