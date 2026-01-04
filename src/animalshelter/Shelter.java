package animalshelter;

public class Shelter {
    private String name;
    private String address;

    private Animal[] animals;
    private int count;

    public Shelter(String name, String address, int capacity) {
        this.name = name;
        this.address = address;
        this.animals = new Animal[capacity];
        this.count = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean addAnimal(Animal animal) {
        if (animal == null || count >= animals.length) {
            return false;
        }
        animals[count] = animal;
        count++;
        return true;
    }

    public void listAnimals() {
        System.out.println("Animals in shelter:");
        for (int i = 0; i < count; i++) {
            System.out.println(animals[i].getInfo());
        }
    }
}
