package task4;

import java.util.Scanner;

/**
 *
 * @author Ahmed Fawzi
 */
public class Task4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Boolean flag = true;
        int compact_car = 0;
        int Regular_car = 0;
        int choice = 0;
        int ticket_id = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter compact vehicle =  ");
        compact_car = sc.nextInt();
        System.out.print("Enter Regular vehicle =  ");
        Regular_car = sc.nextInt();
        System.out.println("");
        Control c = new Control(compact_car, Regular_car);

        while (flag) {
            System.out.println("Put your Vehicle press : 1 ");
            System.out.println("Take your Vehicle press : 2 ");
            System.out.println("Show all Vehicle press : 3 ");
            System.out.println("Exit : 4 ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Vehicle V1 = new Vehicle();
                    ticket_id++;
                    c.park_Vehicle(V1, ticket_id);
                    break;
                case 2:
                    System.out.println("Enter your Ticket id:  ");
                    int choice_id = sc.nextInt();
                    c.check_Vehicle(choice_id);
                    break;
                case 3:
                    c.print_data();
                    break;
                case 4:
                    flag = false;
                    System.exit(0);
                default:
                    System.out.println("Error choice");
                    break;
            }
        }
    }
}
