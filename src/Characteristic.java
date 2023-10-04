import java.util.ArrayList;

public abstract class Characteristic {
    private int value;

    public Characteristic(int _value) {
        value = _value;
    }

    public int getValue() {
        return value;
    }

    public void increaseValue(int _value) { value += _value; }
    public void decreaseValue(int _value) {
        if(value - _value <= 0) throw new IllegalArgumentException("Cannot decrease value to 0");
        value -= _value;
    }

    public ArrayList<Characteristic> add(ArrayList<Characteristic> others) {
        for (Characteristic other: others) {
            // Check if the characteristic type is the same
            if(this.getClass() != other.getClass()) continue;
            other.increaseValue(this.getValue());
            return others;
        }
        return others;
    }
}
