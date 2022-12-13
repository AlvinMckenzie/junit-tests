import java.util.ArrayList;

public class Assessment {
    public static double half(int x) {
        return x / 2;
    }

    public String shout(String input) {
        return input.toUpperCase() + "!!!";
    }

    public static ArrayList<Animal> removeCats(ArrayList<Animal> arr) {

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getSpecies().equals("Felis catus")) {
                arr.remove(i);
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println("this is great");
        Animal an1 = new Animal("an1", "Felis catus");
        Animal an2 = new Animal("an2", "werwer");
        Animal an3 = new Animal("an3", "Felis catus");
        ArrayList <Animal> animalsList = new ArrayList<>();
        animalsList.add(an1);
        animalsList.add(an2);
        animalsList.add(an3);
        System.out.println(removeCats(animalsList));
    }
}
