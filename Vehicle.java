package task4;

import java.util.Scanner;

/**
 *
 * @author Ahmed Fawzi
 */
public class Vehicle {

    private final int id;
    private final String vehicleType;
    private String c = "";
    private Boolean flag = true;

    public Vehicle() {
        vehicleType = set_vehicle_type();
        id = set_vehicle_id();
    }

    public String set_vehicle_type() {
        Scanner scan = new Scanner(System.in);
        while (flag) {
            System.out.println("Enter your Vehivle Type:  ");
            System.out.println("Compact car press : 1");
            System.out.println("Regular car press : 2");
            int i = scan.nextInt();
            switch (i) {
                case 1:
                    c = "C";
                    flag = false;
                    break;
                case 2:
                    c = "R";
                    flag = false;
                    break;
                default:
                    System.out.println("Error choice");
                    flag = true;
                    break;
            }
        }
        return (c);
    }

    public int set_vehicle_id() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Vehivle Id:  ");
        int i = scan.nextInt();
        return (i);
    }

    public String get_vehicle_type() {
        return (vehicleType);
    }

    public int get_vehicle_id() {
        return (id);
    }
}
