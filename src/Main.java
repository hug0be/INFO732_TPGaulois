import java.util.ArrayList;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<Neighborhood> quartiers = new ArrayList<>();
        quartiers.add(new Neighborhood("Petit-Port", "img/flag/petitport.png"));
        quartiers.add(new Neighborhood("Chanzy", "img/flag/chanzy.jpg"));
        quartiers.add(new Neighborhood("Rond-Point", "img/flag/rondpoint.jpg"));

        ArrayList<Characteristic> exemplixCharacteristics = new ArrayList<>(
                Arrays.asList(new Endurance(10), new Intelligence(29))
        );
        
        Gallic exemplix = new Gallic(
            "exemplix",
            "0910274041001",
            "10-03-1991",
            81,
            "rue des menhirs",
            5,
                exemplixCharacteristics,
            quartiers.get(0),
            ProfessionEnum.Swordman,
            CivicStatusEnum.Fighter
        );

        exemplix.displayCharacteristics();

        ArrayList<Characteristic> strenghtBuffs = new ArrayList<>(
                Arrays.asList(new Strength(10))
        );

        StrenghtPotion strenghtPotion = new StrenghtPotion("Essence du berserk", 60, strenghtBuffs);
        strenghtPotion.apply(exemplix);



        exemplix.displayCharacteristics();
    }
}