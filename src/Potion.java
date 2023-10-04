import java.util.ArrayList;

public abstract class  Potion {
    private String name;
    private int cooldown;
    private ArrayList<Characteristic> buffs;

    public  Potion (String _name, int _cooldown, ArrayList<Characteristic> _buffs) {
        name = _name;
        cooldown = _cooldown;
        buffs = _buffs;
    }

    public float calculateTheoricDose(Gallic gallic){return (float) gallic.getWeight() * cooldown/10; }

    public void apply(Gallic gallic) {
        ArrayList<Characteristic>  gallicCharacteristic = gallic.getCharacteristics();
        Boolean hasDone;
        for (Characteristic potionCharac : buffs){
            hasDone = false;
            for (Characteristic gallicCharac: gallicCharacteristic) {
                // Check if the characteristic type is the same
                if(potionCharac.getClass() != gallicCharac.getClass()) continue;
                gallicCharac.increaseValue(potionCharac.getValue());
                hasDone = true;
                break;
            }
            if(!hasDone) gallicCharacteristic.add(potionCharac);
        }
    }
}