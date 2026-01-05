package animalshelter;

public class Cat extends Animal {
    private String color;

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }


    public Cat(String name, int age, String color) {
        super(name, "Cat", age);
        this.color = color;
    }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    @Override
    public String getInfo() {
        return super.getInfo() + ", color='" + color + "'";
    }
}
