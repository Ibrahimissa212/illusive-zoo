package illusivezoo;

import java.util.ArrayList;
import java.util.List;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

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
        animals.add(new Animal("Lion", 7, FALSE, TRUE, TRUE));
        animals.add(new Animal("Monkey", 7, FALSE, TRUE, TRUE));
        animals.add(new Animal("Zebra", 7, FALSE, TRUE, TRUE));
        animals.add(new Animal("Turtle", 7, FALSE, TRUE, TRUE));
        animals.add(new Animal("Snake", 7, FALSE, TRUE, TRUE));
        animals.add(new Animal("Elefant", 7, FALSE, TRUE, TRUE));
        animals.add(new Animal("Giraffe", 7, FALSE, TRUE, TRUE));
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
        System.out.println("No animals in Illusive Zoo matches" + searchName);
        return null;
    }

    // search animal by text
    public List<Animal> searchAnimals(String searchTerm) {
        List<Animal> searchedAnimals = new ArrayList<Animal>();
        for(Animal b: animals) {
            if(b.getName().toLowerCase().contains(searchTerm.toLowerCase())) {
                searchedAnimals.add(b);
            }
        }
        System.out.println("Found " + searchedAnimals.size() +" animals in Illusive Zoo that matches " + searchTerm);
        return searchedAnimals;
    }

    // create animal
    public Animal createAnimal(String name, Integer count, Boolean sleep, Boolean clean,Boolean hungry) {
        Animal newAnimal = new Animal(name, count, sleep, clean, hungry);
        animals.add(newAnimal);
        return newAnimal;
    }

    // update blog
    public Animal updateAnimal(String name, Integer count, Boolean sleep, Boolean clean, Boolean hungry) {
        for(Animal b: animals) {
            if(b.getName().toLowerCase().equals(name.toLowerCase())) {
                int animalIndex = animals.indexOf(b);
                b.setName(name);
                if (count != null) {
                    b.setCount(count);
                }
                if (sleep != null) {
                    b.setSleep(sleep);
                }
                if (clean != null) {
                    b.setClean(clean);
                }
                if (hungry != null) {
                    b.setHungry(hungry);
                }
                animals.set(animalIndex, b);
                return b;
            }
        }
        System.out.println("No "+ name +"s in Illusive Zoo");
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