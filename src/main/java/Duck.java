public class Duck extends Animal implements Swiming,Runnable {
    private String wingsColor;
    //Constructor

    public Duck(String name, int age, String country, String wingsColor) {
        super(name, age, country);
        this.wingsColor = wingsColor;
    }
    //Getter Setter

    public String getWingsColor() {
        return wingsColor;
    }

    public void setWingsColor(String wingsColor) {
        this.wingsColor = wingsColor;
    }

    //Implement Methods
    public void getVoice() {
        System.out.println(getName()+" Кря!");
    }

    public void swim() {
        System.out.println(getName()+" плывет");
    }

    public void run() {
        this.getVoice();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.swim();
    }
}
