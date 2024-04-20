public class Car extends Bayer implements CarInterface {
    private String name;
    private String color;
    public int year;

    Car() {
        super("Antek", 1996);
        this.name = "Mercedes";
        this.color = "Red";
        this.year = 2018;
        this.setSurName("Kowalska");

    }
    Car(String _color){
        super("Antek", 1996);
        this.name = "Mercedes";
        this.color = _color;
        this.year = 2018;
    }

    Car(String _color, int _year)
    {
        super("Antek", _year);
        this.name = "Mercedes";
        this.color = _color;
        this.year = _year;
    }

    @Override
    public String InfoCar() {
        return "Name: " + this.name + ", " +
                "Color: " + this.color + ", " +
                "Year: " + this.year + ", " +
                "SurName: " + this.getSurName() + ", " +
                "bName: " + this.bName  + ", " +
                "bYear: " + this.bYear;
    }

    @Override
    public String InfoOwner() {
        return "";
    }
}
