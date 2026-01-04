package animalshelter;

public abstract class Animal {
    private static int idGen = 1;

    public abstract void makeSound();

    private int id;
    private String name;
    private String type;
    private int age;

    public Animal() {
        this.id = idGen++;
        this.name = "Unknown";
        this.type = "Unknown";
        this.age = 0;
    }

    public Animal(String name, String type, int age) {
        this.id = idGen++;
        this.name = name;
        this.type = type;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) age = 0;
        this.age = age;
    }

    public String getInfo() {
        return "Animal{id=" + id + ", name='" + name + "', type='" + type + "', age=" + age + "}";
    }
}
