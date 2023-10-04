import java.util.ArrayList;

public abstract class  Potion {

    private String name;
    private int cooldown;
    private ArrayList<Characteristic> potionCharacteristic;

    public  Potion (String _name, int _cooldown, ArrayList<Characteristic> _listCharacteristic) {
        name = _name;
        cooldown = _cooldown;
        potionCharacteristic = _listCharacteristic;
    }

    public float calculateTheoricDose(Gallic gallic){return (float) gallic.getWeight() * cooldown/10; }

    public void applyPotion(Gallic gallic) {
        ArrayList<Characteristic>  gallicCharacteristic = gallic.getCaracteristics();
        for (Characteristic potionCharac : potionCharacteristic){
            for (Characteristic gallicCharac: gallicCharacteristic) {
                // Check if the characteristic type is the same
                if(potionCharac.getClass() != gallicCharac.getClass()) continue;
                gallicCharac.increaseValue(potionCharac.getValue());
            }
        }
    }

    abstract ArrayList<Characteristic> getBuffs(Gallic gallic) ;
}