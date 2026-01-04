package animalshelter;

public class Main {
    public static void main(String[] args) {

        Shelter shelter = new Shelter("Zephyr Shelter", "Astana", 5);

        Cat c1 = new Cat("Murka", 2, "Black");
        Dog d1 = new Dog("Rex", 4, "Shepherd");
        Animal a3 = new Animal();

        shelter.addAnimal(c1);
        shelter.addAnimal(d1);
        shelter.addAnimal(a3);

        shelter.listAnimals();
    }
}
