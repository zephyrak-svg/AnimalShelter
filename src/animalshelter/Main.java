package animalshelter;

public class Main {
    public static void main(String[] args) {

        Shelter shelter = new Shelter("Zephyr Shelter", "Astana", 5);

        Animal a1 = new Animal("Murka", "Cat", 2);
        Animal a2 = new Animal("Rex", "Dog", 4);
        Animal a3 = new Animal();

        shelter.addAnimal(a1);
        shelter.addAnimal(a2);
        shelter.addAnimal(a3);

        shelter.listAnimals();
    }
}
