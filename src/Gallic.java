import java.util.ArrayList;

public class Gallic {
    private String name;
    private String NNIG;
    private String birthDate;
    private int weight;
    private String street;
    private int streetNumber;
    private final ArrayList<Characteristic> initialCharacteristics;
    private ArrayList<Characteristic> characteristics;
    private Neighborhood neighborhood;
    private ProfessionEnum profession;
    private CivicStatusEnum civicStatus;
    private ArrayList<PotionUsage> potionUsages;

    public Gallic(String _name, String _NNIG, String _birthdate, int _weight, String _street, int _streetNumber, ArrayList<Characteristic> _characteristics, Neighborhood _neighborhood, ProfessionEnum _profession, CivicStatusEnum _civicStatus) {
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
    }

    public String getName() {
        return name;
    }

    public String getNNIG() {
        return NNIG;
    }

    public String getBirthDate() {
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
}
