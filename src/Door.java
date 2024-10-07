import java.util.HashMap;

public class Door {

    private boolean isOpen;
    private boolean isClosed;
    private boolean isLocked;
    public static HashMap<String, Double> materials = new HashMap<>();
    private String[] doorMaterials = {"Wood", "Metal", "Glass", "Stone"};
    public static String[] doorColors = {"Oak", "Black", "Silver", "Transparent"};
    private String doorMaterial;
    private String doorColor;
    private int depth;
    private int height;
    private int width;
    private int density;

    private void initiateMaterials(){
        materials.put("Wood",1212.0);
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public Door(boolean isOpen, boolean isClosed, boolean isLocked, String doorMaterial, String doorColor, int depth, int height, int width) {
        initiateMaterials();
        this.isOpen = isOpen;
        this.isClosed = isClosed;
        this.isLocked = isLocked;
        this.doorMaterial = doorMaterial;
        this.doorColor = doorColor;
        this.depth = depth;
        this.height = height;
        this.width = width;
        this.density = 
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

    public String[] getDoorMaterials() {
        return doorMaterials;
    }

    public void setDoorMaterials(String[] doorMaterials) {
        this.doorMaterials = doorMaterials;
    }

    public String[] getDoorColor() {
        return doorColors;
    }

    public void setDoorColor(String[] doorColor) {
        this.doorColors = doorColor;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double getWeight(){
        return height*width*depth*getDoorMaterials().getDoorDensity();
    }

    public double getDoorDensity(){
        return this.density;
    }

}

