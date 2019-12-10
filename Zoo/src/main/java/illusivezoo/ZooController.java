package illusivezoo;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class ZooController {
    ZooMockedData zooMockedData = ZooMockedData.getInstance();

    @GetMapping("/animal")
    public List<Animal> index(){
        return zooMockedData.fetchAnimals();
    }

    @GetMapping("/animal/{name}")
    public Animal show(@PathVariable String name){
        return zooMockedData.getAnimalDataByName(name);
    }

    @PostMapping("/animal/search")
    public List<Animal> search(@RequestBody Map<String, String> body){
        String searchTerm = body.get("text");
        return zooMockedData.searchAnimals(searchTerm);
    }

    @PostMapping("/animal")
    public Animal create(@RequestBody Map<String, String> body){
        String name = body.get("name");
        int count =  Integer.parseInt(body.get("count"));
        Boolean animalSleep = (body.get("sleep")== null) ? null : Boolean.parseBoolean(body.get("sleep"));
        Boolean animalClean = (body.get("clean")== null) ? null : Boolean.parseBoolean(body.get("clean"));
        Boolean animalHungry = (body.get("hungry")== null) ? null : Boolean.parseBoolean(body.get("hungry"));
        return zooMockedData.createAnimal(name, count, animalSleep, animalClean, animalHungry);
    }

    @PutMapping("/animal/{name}")
    public Animal update(@PathVariable String name, @RequestBody Map<String, String> body){

        Integer animalCount = (body.get("count")== null) ? null : Integer.parseInt(body.get("count"));
        Boolean animalSleep = (body.get("sleep")== null) ? null : Boolean.parseBoolean(body.get("sleep"));
        Boolean animalClean = (body.get("clean")== null) ? null : Boolean.parseBoolean(body.get("clean"));
        Boolean animalHungry = (body.get("hungry")== null) ? null : Boolean.parseBoolean(body.get("hungry"));

        return zooMockedData.updateAnimal(name, animalCount, animalSleep, animalClean, animalHungry);
    }

    @DeleteMapping("animal/{name}")
    public boolean delete(@PathVariable String name){
        return zooMockedData.delete(name);
    }

}