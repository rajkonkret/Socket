import java.util.Collection;

public class Run {
    public static void main(String[] args) {
        CoffeeGrinder coffeeGrinder = new CoffeeGrinder();
        coffeeGrinder.grindCofee();

        Socket socket = new Socket();
        socket.plugIn(coffeeGrinder);
        coffeeGrinder.grindCofee();


    }
}
