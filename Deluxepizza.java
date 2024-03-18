public class Deluxepizza extends pizza{
    public Deluxepizza(Boolean veg)
    {
        super(veg);
        super.addExtraCheese();
        super.addExtraTopings();
        super.addTakeAway();
    }

    @Override
    public void addExtraCheese() {

    }

    @Override
    public void addExtraTopings() {

    }
}
