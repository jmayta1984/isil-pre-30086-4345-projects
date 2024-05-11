public class Car {
    private String color;
    private String model;
    private String type;
    private int wheels;
    private int speed;

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color; 
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    

    public Car(){}

    public Car(String color, String model, String type, int wheels, int speed) {
        this.color = color;
        this.model = model;
        this.type = type;
        this.wheels = wheels;
        this.speed = speed;
    }


    int increaseSpeed (int increment) {
        speed = speed + increment;
        return speed;
    }

    
}
