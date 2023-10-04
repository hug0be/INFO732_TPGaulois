import java.util.Date;

public class PotionUsage {

    private Potion potion;
    private float amount;
    private Date date;

    public PotionUsage (Potion _potion, float _amount){
        potion = _potion;
        amount = _amount;
        date = new Date( );
    }
}
