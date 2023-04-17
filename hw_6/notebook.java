package hw_6;

public class notebook {
    private String brand;
    private String color;
    private int ram;
    private String typeOS;
    private int sizeDisk;
    
    public notebook(String brand, String color, int ram, String typeOS, int sizeDisk) {
        this.brand = brand;
        this.color = color;
        this.ram = ram;
        this.typeOS = typeOS;
        this.sizeDisk = sizeDisk;
    }

    public String printInfo(){
        System.out.printf("Brand: %s, Color: %s, RAM: %s, TypeDisk: %s, SizeDisk: %s", brand, color, ram, typeOS, sizeDisk);
        return ".";
    }
    
    public String getBrand() {
        return getBrand(null);
    }
    public String getBrand(String sc2) {
        return brand;
    }

    public String getColor() {
        return getColor(null);
    }

    public String getColor(String sc2) {
        return color;
    }

    public int getRam() {
        return ram;
    }

    public int getsizeDisk() {
        return sizeDisk;
    }

    public String getTypeOS() {
        return typeOS;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setsizeDisk(int sizeDisk) {
        this.sizeDisk = sizeDisk;
    }

    public void setTypeOS(String typeOS) {
        this.typeOS = typeOS;
    }

}
