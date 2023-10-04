import java.util.ArrayList;

public class Gallic implements IBattleListener {
    private String name;
    private String NNIG;
    private String birthDate;
    private int weight;
    private String street;
    private int streetNumber;
    private final ArrayList<Caracteristic> initialCaracteristics;
    private ArrayList<Caracteristic> caracteristics;
    private Neighborhood neighborhood;
    private ProfessionEnum profession;
    private CivicStatusEnum civicStatus;
    private ArrayList<PotionUsage> potionUsages;

    public Gallic(String _name, String _NNIG, String _birthdate, int _weight, String _street, int _streetNumber, ArrayList<Caracteristic> _caracteristics, Neighborhood _neighorhood, ProfessionEnum _profession, CivicStatusEnum _civicStatus) {
        name = _name; NNIG = _NNIG; birthDate = _birthdate; weight = _weight; street = _street; streetNumber = _streetNumber;
        initialCaracteristics = _caracteristics; caracteristics = _caracteristics;
        neighborhood = _neighorhood; profession = _profession; civicStatus = _civicStatus;
    }

    @Override
    public void onNewBattle(BattleEvent event) {

    }

    @Override
    public void onBattleCancel(BattleEvent event) {

    }

    @Override
    public void onBattleConfirm(BattleEvent event) {

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

    public ArrayList<Caracteristic> getInitialCaracteristics() {
        return initialCaracteristics;
    }

    public ArrayList<Caracteristic> getCaracteristics() {
        return caracteristics;
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
