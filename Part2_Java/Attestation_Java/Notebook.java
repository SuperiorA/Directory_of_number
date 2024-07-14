package Part2_Java.Attestation_Java;

public class Notebook {

    String brand;
    int ram;
    int storage;
    String os;
    String color;
    String videocard;

    public Notebook(String brand, int ram, int storage, String os, String color, String videocard) {
        this.brand = brand;
        this.ram = ram;
        this.storage = storage;
        this.os = os;
        this.color = color;
        this.videocard = videocard;
    }

    public String getBrand() { return brand; }
    public int getRam() { return ram; }
    public int getStorage() { return storage; }
    public String getOs() { return os; }
    public String getColor() { return color; }
    public String getvideocard() { return videocard; }

    @Override
    public String toString() {
        return "Notebook{" +
                "brand = " + brand + "," +
                " ram = " + ram + "," +
                " storage = " + storage + "," +
                " os = " + os + "," +
                " color = " + color + "." +
                " videocard - " + videocard +
                '}';
    }
}
