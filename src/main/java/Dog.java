public class Dog extends Animal implements Walking,Runnable {
    private String color;
    //Constructor

    public Dog(String name, int age, String country, String color) {
        super(name, age, country);
        this.color = color;
    }

    public void getVoice() {
        System.out.println(this.getName()+" гав");
    }

    public void walk() {
        System.out.println(this.getName()+" идет");
    }
    public void run() {
        this.getVoice();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.walk();
    }


    //Methods
}
