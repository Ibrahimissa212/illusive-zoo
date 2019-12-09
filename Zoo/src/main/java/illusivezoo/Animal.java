package illusivezoo;

import static java.lang.Boolean.FALSE;

public class Animal {
    private String name;
    private int count;
    //private Boolean sleep;
    //private Time clean;
    //private Boolean hungry;

    public Animal() {  }

    public Animal(String name, int count) {
        this.setName(name);
        this.setCount(count);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name=" + name +
                ", count='" + count + '\'' +
                '}';
    }
}