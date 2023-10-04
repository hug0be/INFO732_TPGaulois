import java.time.LocalDate;

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
        return this.getPotion().getName() + " " + this.getAmount() +  " " + this.getDate();
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
