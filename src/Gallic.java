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

    public Gallic(String _name, String _NNIG, String _birthdate, int _weight, String _street, int _streetNumber, ArrayList<Characteristic> _characteristics, Neighborhood _neighorhood, ProfessionEnum _profession, CivicStatusEnum _civicStatus) {
        name = _name; NNIG = _NNIG; birthDate = _birthdate; weight = _weight; street = _street; streetNumber = _streetNumber;
        initialCharacteristics = _characteristics; characteristics = _characteristics;
        neighborhood = _neighorhood; profession = _profession; civicStatus = _civicStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNNIG() {
        return NNIG;
    }

    public void setNNIG(String NNIG) {
        this.NNIG = NNIG;
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

    public ArrayList<Characteristic> getInitialCaracteristics() {
        return initialCharacteristics;
    }

    public ArrayList<Characteristic> getCaracteristics() {
        return characteristics;
    }

    public Neighborhood getNeighborhood() {
        return neighborhood;
    }

    public Profession getProfession() {
        return profession;
    }

    public CivicStatus getCivicStatus() {
        return civicStatus;
    }

    public ArrayList<PotionUsage> getPotionUsages() {
        return potionUsages;
    }
}
