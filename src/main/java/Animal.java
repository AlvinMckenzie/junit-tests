public class Animal {
    private String name;
    private String species;
    private void setName(String cat) {
    }

    public Animal(String an1, String felis_catus) {
        this.name = name;
        this.species = species;
    }

    public String getName(){
        return name;
    }

    public String getSpecies(){
        return species;
    }

    public String roar(){
        return "I am " + this.getName() + "hear me roar!";
    }

    public static void main(String[] args) {
        Animal animal = new Animal("Biscuit", "cat");
        animal.setName("Cat");
        System.out.println(animal.roar());
    }
}
