public class Main {
    


    public static void main(String[] args) {
        /* 
        Lamp led = new Lamp();
        Lamp halogen = new Lamp();

        led.turnOn();

        halogen.turnOff();
        */
        Car focus = new Car("Blue","Rav4", "Camioneta", 4, 100);
        Car auris = new Car("Green","Sentra", "Auto", 4, 100);

        System.out.println(focus.increaseSpeed(10));
        auris.increaseSpeed(20);

    }
}
