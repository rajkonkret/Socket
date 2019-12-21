public class CoffeeGrinder implements ElectricDevice{

    private boolean hasPower;

    public CoffeeGrinder() {
        this.hasPower = false;
    }

    @Override
    public void electricityOn() {
        hasPower = true;
    }

    @Override
    public void electricityOff() {
        hasPower = false;
    }

    void grindCofee(){
        if (hasPower){
            System.out.println("Wrrrrr");
        } else {
            System.out.println("No power. Sorry...");
        }
    }
}
