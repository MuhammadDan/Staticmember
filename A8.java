// Yai aik singleton class ka program hai
public class A8 {
    public void Driver() {
        SuperCar sc = SuperCar.getInstance();
        sc.setOwnerName("John Doe");
        sc.setPrice(5000000);
        sc.setColor("Red");
        sc.setBrand("Bugatti");
        
        System.out.println("Owner: " + sc.getOwnerName());
        System.out.println("Price: $" + sc.getPrice());
        System.out.println("Color: " + sc.getColor());
        System.out.println("Brand: " + sc.getBrand());
    }
}

class SuperCar {
    private String ownerName;
    private int price;
    private String color;
    private String brand;

    private static SuperCar ref;

    public static SuperCar getInstance() {
        if (ref == null) {
            ref = new SuperCar();
        }
        return ref;
    }

    private SuperCar() {
        System.out.println("SuperCar instance created.");
    }

    // Setter methods
    public void setOwnerName(String name) {
        this.ownerName = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Getter methods
    public String getOwnerName() {
        return ownerName;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }
}
