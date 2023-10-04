import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.time.LocalDate;

public class Gallic {
    private String name;
    private String NNIG;
    private LocalDate birthDate;
    private int weight;
    private String street;
    private int streetNumber;
    private final ArrayList<Characteristic> initialCharacteristics;
    private ArrayList<Characteristic> characteristics;
    private Neighborhood neighborhood;
    private ProfessionEnum profession;
    private CivicStatusEnum civicStatus;
    private ArrayList<PotionUsage> potionUsages;

    public Gallic(String _name, String _NNIG, LocalDate _birthdate, int _weight, String _street, int _streetNumber, ArrayList<Characteristic> _characteristics, Neighborhood _neighborhood, ProfessionEnum _profession, CivicStatusEnum _civicStatus) {
        if(_NNIG.length() != 13) throw new IllegalArgumentException("Le NNIG du gaulois doit contenir 13 caractères");

        name = _name;
        NNIG = _NNIG;
        birthDate = _birthdate;
        weight = _weight;
        street = _street;
        streetNumber = _streetNumber;
        initialCharacteristics = _characteristics;
        characteristics = _characteristics;
        neighborhood = _neighborhood;
        profession = _profession;
        civicStatus = _civicStatus;
        potionUsages = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getNNIG() {
        return NNIG;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getWeight() {
        return weight;
    }

    public String getStreet() {
        return street;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public ArrayList<Characteristic> getInitialCharacteristics() {
        return initialCharacteristics;
    }

    public ArrayList<Characteristic> getCharacteristics() {
        return characteristics;
    }

    public Neighborhood getNeighborhood() {
        return neighborhood;
    }

    public ProfessionEnum getProfession() {
        return profession;
    }

    public CivicStatusEnum getCivicStatus() {
        return civicStatus;
    }

    public ArrayList<PotionUsage> getPotionUsages() {
        return potionUsages;
    }

    public PotionUsage getLastPotionTaken (){return this.getPotionUsages().get(this.getPotionUsages().size() - 1);}

    public void displayCharacteristics() {
        System.out.print(getName() + " : ");
        for (Characteristic charac : getCharacteristics()) {
            System.out.print(charac.getClass().getName() + " " + charac.getValue() + " | ");
        }
        System.out.println();
    }
    public void displayPotionUsages() {
        System.out.print(getName() + " : ");
        for (PotionUsage usage : potionUsages) {
            System.out.print(usage + " | ");
        }
        System.out.println();
    }

    public void usePotion(Potion potion, float realDose) {
        if ((!this.getPotionUsages().isEmpty()) && ChronoUnit.DAYS.between(getLastPotionTaken().getDate().plusDays(potion.getCooldown()), LocalDate.now())<0){
            System.out.println("Potion not ready no be used");
            return;
        }
        ArrayList<Characteristic> gallicCharacteristic = this.getCharacteristics();
        boolean hasDone;
        for (Characteristic potionCharac : potion.getBuffs()) {
            hasDone = false;
            for (Characteristic gallicCharac : gallicCharacteristic) {
                // Check if the characteristic type is the same
                if (potionCharac.getClass() != gallicCharac.getClass()) continue;
                gallicCharac.increaseValue(potionCharac.getValue());
                hasDone = true;
                break;
            }
            if (!hasDone) gallicCharacteristic.add(potionCharac);
        }
        this.potionUsages.add(new PotionUsage(potion, realDose));
    }

        public int getAge() {
        Period period = Period.between(birthDate, LocalDate.now());
        return period.getYears();
    }
}
