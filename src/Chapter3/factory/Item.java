package Chapter3.factory;

public abstract class Item implements HTMLable {
    protected String caption;
    public Item(String caption) {
        this.caption = caption;
    }
//    public abstract String makeHTML();
}
