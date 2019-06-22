package task4;

/**
 *
 * @author Ahmed Fawzi
 */
public class Ticket {

    private final long startTime;
    private int ticket_id_car = 0;
    private int id;
    private String vehicleType;

    public Ticket(int ticket_id, Vehicle vehicle) {
        ticket_id_car = ticket_id;
        id = vehicle.get_vehicle_id();
        vehicleType = vehicle.get_vehicle_type();
        startTime = System.currentTimeMillis();
        System.out.print("Ticket ID Number is: ");
        System.out.println(ticket_id_car);
    }

    public long get_ParkingDuration(Ticket t) {
        return (System.currentTimeMillis() - t.startTime);
    }

    public int get_ticket_id() {
        return (ticket_id_car);
    }

    public String get_vehicle_type() {
        return (vehicleType);
    }

    public int get_vehicle_id() {
        return (id);
    }
}
