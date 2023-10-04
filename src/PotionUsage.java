import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PotionUsage {
    private Potion potion;
    private float amount;
    private LocalDate date;

    public PotionUsage (Potion _potion, float _amount){
        potion = _potion;
        amount = _amount;
        date = LocalDate.now();
    }

    @Override
    public String toString() {
        return potion.getName() + " " + amount +  "cl " + date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public Potion getPotion() {
        return potion;
    }

    public float getAmount() {
        return amount;
    }

    public LocalDate getDate() {
        return date;
    }
}
