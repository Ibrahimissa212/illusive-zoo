package illusivezoo;

import java.util.ArrayList;
import java.util.List;

public class ZooMockedData {
    //list of blog posts
    private List<Animal> animals;

    private static ZooMockedData instance = null;
    public static ZooMockedData getInstance(){
        if(instance == null){
            instance = new ZooMockedData();
        }
        return instance;
    }


    public ZooMockedData(){
        animals = new ArrayList<Animal>();
        animals.add(new Animal("Lion", 7));
        animals.add(new Animal("Monkey", 20));
        animals.add(new Animal("Zebra", 10));
        animals.add(new Animal("Turtle", 9));
        animals.add(new Animal("Snake", 20));
        animals.add(new Animal("Elefant", 15));
        animals.add(new Animal("Giraffe", 6));
    }

    // return all animals
    public List<Animal> fetchAnimals() {
        return animals;
    }

    // return animal by name
    public Animal getAnimalDataByName(String searchName) {
        for(Animal b: animals) {
            if(b.getName().toLowerCase().equals(searchName.toLowerCase())) {
                return b;
            }
        }
        return null;
    }

    // search blog by text
    public List<Animal> searchAnimals(String searchTerm) {
        List<Animal> searchedAnimals = new ArrayList<Animal>();
        for(Animal b: animals) {
            if(b.getName().toLowerCase().contains(searchTerm.toLowerCase())) {
                searchedAnimals.add(b);
            }
        }

        return searchedAnimals;
    }

    // create animal
    public Animal createAnimal(String name, int count) {
        Animal newAnimal = new Animal(name, count);
        animals.add(newAnimal);
        return newAnimal;
    }

    // update blog
    public Animal updateAnimal(String name, int count) {
        for(Animal b: animals) {
            if(b.getName() == name) {
                int animalIndex = animals.indexOf(b);
                b.setName(name);
                b.setCount(count);
                animals.set(animalIndex, b);
                return b;
            }

        }

        return null;
    }

    // delete animal by id
    public boolean delete(String name){
        int animalIndex = -1;
        for(Animal b: animals) {
            if(b.getName().toLowerCase().equals(name.toLowerCase())) {
                animalIndex = animals.indexOf(b);
                continue;
            }
        }
        if(animalIndex > -1){
            animals.remove(animalIndex);
        }
        return true;
    }

}