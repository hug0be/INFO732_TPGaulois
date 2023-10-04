public class Neighborhood {
    private final String name;
    private final String imgUrl;

    public Neighborhood(String _name, String _imgUrl) {
        name = _name; imgUrl = _imgUrl;
    }

    public String getImg() {
        return imgUrl;
    }

    public String getName() {
        return name;
    }
}
