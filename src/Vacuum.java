public class Vacuum implements ElectricDevice {

    private boolean hasPower;

    public Vacuum() {
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

    void clean(){
        if (hasPower){
            System.out.println("Buuuuuuuuuuuuu!!!!!!");
        } else {
            System.out.println("No power. No cleanig...");
        }
    }
}
