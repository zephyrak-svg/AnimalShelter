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

    public void addAnimal(Animal animal) throws ShelterException {
        if (animal == null) {
            throw new ShelterException("Animal is null");
        }

        if (count >= animals.length) {
            throw new ShelterException("Shelter is full");
        }

        animals[count] = animal;
        count++;
    }


    public void listAnimals() {
        System.out.println("Animals in shelter:");
        for (int i = 0; i < count; i++) {
            System.out.println(animals[i].getInfo());
        }
    }
}
