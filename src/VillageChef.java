public class VillageChef {
    private static VillageChef chef;
    private VillageChef() {}

    public static VillageChef getInstance() {
        if(chef == null) chef = new VillageChef();
        return chef;
    }
}
