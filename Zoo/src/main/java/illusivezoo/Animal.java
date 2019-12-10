package illusivezoo;

import static java.lang.Boolean.FALSE;

public class Animal {
    private String name;
    private Integer count;
    private Boolean sleep;
    private Boolean clean;
    private Boolean hungry;

    public Animal() {  }

    public Animal(String name, Integer count, Boolean sleep, Boolean clean,Boolean hungry) {
        this.setName(name);
        this.setCount(count);
        this.setSleep(sleep);
        this.setClean(clean);
        this.setHungry(hungry);
    }

    public Boolean getHungry() {
        return hungry;
    }

    public void setHungry(Boolean hungry) {
        this.hungry = hungry;
    }

    public Boolean getClean() {
        return clean;
    }
    public void setClean(Boolean clean) {
        this.clean = clean;
    }

    public Boolean getSleep() {
        return sleep;
    }
    public void setSleep(Boolean sleep) {
        this.sleep = sleep;
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

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name=" + name +
                ", count='" + count + '\'' +
                ", sleep='" + sleep + '\'' +
                ", clean='" + clean + '\'' +
                ", hungry='" + hungry + '\'' +
                '}';
    }
}