import java.util.ArrayList;

public abstract class Characteristic {
    private int value;

    public Characteristic(int _value) {
        value = _value;
    }

    public int getValue() {
        return value;
    }

    public void increaseValue(int _value) {value = value + _value; }
    public void decreaseValue(int _value) {
        if(value <= 1) throw new IllegalArgumentException("Cannot decrease value to 0");
        value = value - _value;
    }
}
