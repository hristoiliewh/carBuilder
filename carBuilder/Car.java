package carBuilder;

import java.util.ArrayList;

public class Car {

    private ArrayList<Tire> tires = new ArrayList<Tire>();
    private ArrayList<Seat> seats = new ArrayList<Seat>();
    private Engine engine;
    private Frame frame;

    Car withEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    public Car withFrame(Frame frame) {
        this.frame = frame;
        return this;
    }

    public Car withSeats(Seat seat) {
        if (this.seats.size() < 5){
            this.seats.add(seat);
        }
        return this;
    }
    public Car withTires(Tire tire) {
        if (this.tires.size() < 4){
            this.tires.add(tire);
        }
        return this;
    }
}
