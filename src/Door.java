import java.util.HashMap;

public class Door {

    private boolean isOpen;
    private boolean isClosed;
    private boolean isLocked;
    public static String[] doorColors = {"Oak", "Black", "Silver", "Transparent"};
    private String doorMaterial;
    private String doorColor;
    private double depth;
    private double height;
    private double width;

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public Door(boolean isOpen, boolean isClosed, boolean isLocked, String doorMaterial, String doorColor, double depth, double height, double width) {
        this.isOpen = isOpen;
        this.isClosed = isClosed;
        this.isLocked = isLocked;
        this.doorMaterial = doorMaterial;
        this.doorColor = doorColor;
        this.depth = depth;
        this.height = height;
        this.width = width;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed(boolean closed) {
        isClosed = closed;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }


    public String[] getDoorColor() {
        return doorColors;
    }

    public void setDoorColor(String[] doorColor) {
        this.doorColors = doorColor;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double getWeight(){
        return height*width*depth*Materials.getDensity();
    }

    public static HashMap<String, Double> getMaterialsDensities(){
        return materialsDensities;
    }

}

