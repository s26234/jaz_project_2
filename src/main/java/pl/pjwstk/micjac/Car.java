package pl.pjwstk.micjac;

public class Car {
    private int id;
    private String model;


    public Car(int id,String model) {
        this.id = id;
        this.model = model;
    }
    public Car(String model) {
        this.model = model;
    }

    public Car(){
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
