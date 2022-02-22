import java.util.*;

public abstract class Animal implements Runnable{
    private String name;
    private int age;
    private String country;
    //Constructor
    public Animal(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }
    //Getters, Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return getName().equals(animal.getName());
    }

    @Override
    public int hashCode() {
        return (this.name.hashCode()+this.age)*33;
    }

    public abstract void getVoice();
}
