import java.util.ArrayList;

public class Characteristic {
    private int value;
    private Characteristic next;

    public Characteristic(int _value, Characteristic _next) {
        next = _next;
        value = _value;
    }
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

    public Characteristic add(Characteristic other) {
        boolean sameClass = other.getClass() == this.getClass();
        if(sameClass) increaseValue(other.value);
        else if(next != null) next.add(other);
        else next = other;

        return other.next == null ? this : this.add(other.next);
    }
    public String toString() {
        return getClass().getName() + " " + value + " | " + ((next==null)?"":next);
    }
}
