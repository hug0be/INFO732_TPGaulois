import java.util.ArrayList;

public class  Potion {
    private String name;
    private int cooldown;
    private ArrayList<Characteristic> buffs;

    public  Potion (String _name, int _cooldown, ArrayList<Characteristic> _buffs) {
        name = _name;
        cooldown = _cooldown;
        buffs = _buffs;
    }

    public float calculateTheoricDose(Gallic gallic){return (float) gallic.getWeight() * cooldown/10; }

    public ArrayList<Characteristic> getBuffs() { return buffs; }

    public String getName() {
        return name;
    }
}