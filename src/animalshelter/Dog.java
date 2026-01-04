package animalshelter;

public class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, "Dog", age);
        this.breed = breed;
    }

    public String getBreed() { return breed; }
    public void setBreed(String breed) { this.breed = breed; }

    @Override
    public String getInfo() {
        return super.getInfo() + ", breed='" + breed + "'";
    }
}
