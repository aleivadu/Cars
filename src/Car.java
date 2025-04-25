import java.io.Serializable;

public class Car implements Serializable {
    private String make;
    private int year;
    private static final long serialVerionUID = 1L;
    private  transient String model;


    public Car(String make, int year, String model){
        this.make = make;
        this.year= year;
        this.model = model;
    }


    @Override
    public String toString() {
        String carInfo = "";
        carInfo += "\nmake:" + this.make;
        carInfo += "\nyear:" + this.year;
        carInfo += "\nmodel:" + this.model;
        return carInfo;
    }
}
