package task4;

import java.util.ArrayList;

/**
 *
 * @author Ahmed Fawzi
 */
public class Control {

    public static Ticket t;
    private final int max_regular;
    private final int max_compact;
    private ArrayList<Ticket> regular_cars = new ArrayList();
    private ArrayList<Ticket> compact_cars = new ArrayList();

    public Control(int max_reg, int max_comp) {
        max_regular = max_reg;
        max_compact = max_comp;
    }

    public void park_Vehicle(Vehicle vehicle, int ticket_id) {
        t = new Ticket(ticket_id, vehicle);//vehicle.get_vehicle_type());
        if (vehicle.get_vehicle_type() == "R") {
            if (regular_cars.size() < max_regular) {
                regular_cars.add(t);
                System.out.println("The car is added as a regular car");
            } else {
                System.out.println("Regular Spots are full");
            }
        } else if (vehicle.get_vehicle_type() == "C") {
            if (compact_cars.size() < max_compact) {
                compact_cars.add(t);
                System.out.println("The car is added as a compact car");
            } else if (regular_cars.size() < max_regular) {
                regular_cars.add(t);
                System.out.println("The car is added as a regular car");
            } else {
                System.out.println("Regular & Compact Spots are full");
                System.out.println("Parking is full");
            }
        }
    }

    public void check_Vehicle(int id) {
        if (regular_cars.size() != 0) {
            for (int x = 0; x < regular_cars.size(); x++) {
                Ticket check_t = regular_cars.get(x);
                if (id == check_t.get_ticket_id()) {
                    System.out.println("ID is founded");
                    remove_Vehicle(check_t, 1);
                    break;
                } else {
                    System.out.println("ID Not Found!");
                }
            }
        } else if (compact_cars.size() != 0) {
            for (int x = 0; x < compact_cars.size(); x++) {
                Ticket check_t = compact_cars.get(x);
                if (id == check_t.get_ticket_id()) {
                    System.out.println("ID is founded");
                    remove_Vehicle(check_t, 2);
                    break;
                } else {
                    System.out.println("ID Not Found!");
                }
            }
        } else {
            System.out.println("Parking is empty");
        }
    }

    public void remove_Vehicle(Ticket remove_t, int a) {
        switch (a) {
            case 1:
                System.out.println(String.format("Parking Duration %d ", remove_t.get_ParkingDuration(remove_t)));
                regular_cars.remove(remove_t);
                System.out.println("car is removed");
                break;
            case 2:
                System.out.println(String.format("Parking Duration %d ", remove_t.get_ParkingDuration(remove_t)));
                compact_cars.remove(remove_t);
                System.out.println("car is removed");
                break;
            default:
                break;
        }
    }

    public void print_data() {
        Ticket print_t;
        System.out.println("Regular Spots:");
        for (int i = 0; i < regular_cars.size(); i++) {
            print_t = regular_cars.get(i);
            System.out.print("Vechile id is  ");
            System.out.println(print_t.get_vehicle_id());
            System.out.print("Vechile type is  ");
            System.out.println(print_t.get_vehicle_type());
            System.out.print("Vechile's ticket id is  ");
            System.out.println(print_t.get_ticket_id());
        }
        System.out.println("Compact Spots:");
        for (int i = 0; i < compact_cars.size(); i++) {
            print_t = compact_cars.get(i);
            System.out.print("Vechile id is  ");
            System.out.println(print_t.get_vehicle_id());
            System.out.print("Vechile type is  ");
            System.out.println(print_t.get_vehicle_type());
            System.out.print("Vechile's ticket id is  ");
            System.out.println(print_t.get_ticket_id());
        }
    }
}