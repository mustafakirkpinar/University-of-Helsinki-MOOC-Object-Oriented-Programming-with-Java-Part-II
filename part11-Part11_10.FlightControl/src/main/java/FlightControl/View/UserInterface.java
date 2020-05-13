package FlightControl.View;

import FlightControl.Models.AirPlane;
import FlightControl.Models.Flight;
import FlightControl.Repositories.AirPlaneRepository;
import FlightControl.Repositories.FlightRepository;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
    }

    public void assetControl() {
        while (true) {
            System.out.println("Airport Asset Control");
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit Airport Asset Control");
            System.out.print("> ");
            String input = this.scanner.nextLine();
            if (input.equalsIgnoreCase("1")) {
                System.out.print("Give the airplane id: ");
                String id = this.scanner.nextLine();
                System.out.print("Give the airplane capacity: ");
                int capacity = this.scanner.nextInt();
                AirPlaneRepository.getInstance().put(id, new AirPlane(id, capacity));
                continue;
            }
            if (input.equalsIgnoreCase("2")) {
                System.out.print("Give the airplane id: ");
                String id = this.scanner.nextLine();
                System.out.print("Give the departure airport id: ");
                String departure = this.scanner.nextLine();
                System.out.print("Give the target airport id: ");
                String target = this.scanner.nextLine();
                AirPlane addAirPlane = AirPlaneRepository.getInstance().get(id);
                FlightRepository.getInstance().put(addAirPlane, new Flight(addAirPlane, departure, target));
                continue;
            }
            if (input.equalsIgnoreCase("x")) {
                break;
            }

        }
    }

    public void flightControl() {
        while (true) {
            System.out.println("Flight Control");
            System.out.println("[1] Print airplanes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print airplane details");
            System.out.println("[x] Quit");
            System.out.print("> ");
            String input = this.scanner.nextLine();
            if (input.equalsIgnoreCase("1")) {
                HashMap<String, AirPlane> apr = AirPlaneRepository.getInstance().getAirPlaneRepository();
                for (Map.Entry<String, AirPlane> entry : apr.entrySet()) {
                    System.out.println(entry.getValue());
                }
                continue;
            }
            if (input.equalsIgnoreCase("2")) {
                HashMap<AirPlane, ArrayList<Flight>> fr = FlightRepository.getInstance().getFlightRepository();
                for (Map.Entry<AirPlane, ArrayList<Flight>> entry : fr.entrySet()) {
                    entry.getValue().stream().forEach(f -> System.out.println(f));
                }
                continue;
            }
            if (input.equalsIgnoreCase("3")) {
                System.out.println("Give the airplane id: ");
                String id = scanner.nextLine();
                HashMap<String, AirPlane> apr = AirPlaneRepository.getInstance().getAirPlaneRepository();
                for (Map.Entry<String, AirPlane> entry : apr.entrySet()) {
                    if (entry.getKey().equals(id)) {
                        System.out.println(entry.getValue());
                        break;
                    }
                }
                continue;
            }

            if (input.equalsIgnoreCase("x")) {
                break;
            }

        }

    }

    public void start() {

        assetControl();
        flightControl();
    }
}
