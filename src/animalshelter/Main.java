package animalshelter;

public class Main {
    public static void main(String[] args) {

        Shelter shelter = new Shelter("Zephyr Shelter", "Astana", 2);

        try {
            Cat c1 = new Cat("Murka", 2, "Black");
            Dog d1 = new Dog("Rex", 4, "Shepherd");


            c1.makeSound();
            d1.makeSound();

            shelter.addAnimal(c1);
            shelter.addAnimal(d1);

            // специально ломаем — приют полный
            shelter.addAnimal(new Dog("Max", 3, "Bulldog"));

        } catch (ShelterException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        shelter.listAnimals();
    }

}
