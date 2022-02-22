import java.util.ArrayList;
import java.util.Arrays;

public class Zoo<T extends Animal> {
    private ArrayList<Animal> animals;

    public Zoo() {
        this.animals = new ArrayList<Animal>();
    }

    public void addAnimals(Animal... animal){
        for (Animal a:animal) {
            if (animals.contains(a)){
                System.out.println("Такое животное уже добавлено: "+a.getName());
            }
            else {
                animals.add(a);
            }
        }
    }


    public ArrayList<Animal> returnArrayOfType(String typeStr){
        ArrayList<Animal> animalsByType = new ArrayList<Animal>();
        for (Animal e :animals) {

        }
        return null;
    }
}
