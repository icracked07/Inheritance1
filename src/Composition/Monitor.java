package Composition;
public class Monitor {
    private String model;
    private String manufacturer;
    private int Size;
    private Resolution nativeResolution;

    public Monitor(String model, String manufacturer, int size, Resolution nativeResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        Size = size;
        this.nativeResolution = nativeResolution;
    }

    public void drawPixelAt(int x , int y ,String color) {
        System.out.println("Drawing pixel at " + x + "," + y);
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return Size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }

    public Monitor(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}
