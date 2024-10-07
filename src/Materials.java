public class Materials {

    private String name;
    private double density;

    public Materials(String name, double density) {
        this.name = name;
        this.density = density;
    }

    public double getDensity(){
        return density;
    }

    public String getName() {
        return name;
    }

}
