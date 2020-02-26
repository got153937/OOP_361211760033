package lab9;

public class Mobile {
    private int MobileID;
    private String brand;
    private String generation;
    private double price;
    private String Operating ;

    //constructor

    public Mobile(int mobileID, String brand, String generation, double price, String operating) {
        MobileID = mobileID;
        this.brand = brand;
        this.generation = generation;
        this.price = price;
        Operating = operating;
    }


    //getter and setter

    public int getMobileID() {
        return MobileID;
    }

    public void setMobileID(int mobileID) {
        MobileID = mobileID;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getGeneration() {
        return generation;
    }

    public void setGeneration(String generation) {
        this.generation = generation;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getOperating() {
        return Operating;
    }

    public void setOperating(String operating) {
        Operating = operating;
    }


    //toString


    @Override
    public String toString() {
        return "Mobile{" +
                "MobileID=" + MobileID +
                ", brand='" + brand + '\'' +
                ", generation='" + generation + '\'' +
                ", price=" + price +
                ", Operating='" + Operating + '\'' +
                '}';
    }
}
