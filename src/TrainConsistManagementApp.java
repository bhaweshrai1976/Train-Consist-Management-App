import java.util.ArrayList;
import java.util.List;


public class TrainConsistManagementApp
{

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println(" UC2 - Add Passenger Bogies to Train ");
        System.out.println("======================================\n");


        List<String> passengerBogies = new ArrayList<>();


        passengerBogies.add("B1");
        passengerBogies.add("B2");
        passengerBogies.add("B3");


        System.out.println("Initial Train Consist:");
        for (String bogie : passengerBogies) {
            System.out.println(bogie);
        }


        passengerBogies.set(1, "B2-Updated");


        passengerBogies.remove("B3");


        System.out.println("\nChecking availability of B1...");
        if (passengerBogies.contains("B1")) {
            System.out.println("B1 is available in the train.");
        } else {
            System.out.println("B1 is NOT available in the train.");
        }


        System.out.println("\nFinal Train Consist:");
        for (String bogie : passengerBogies) {
            System.out.println(bogie);
        }
    }
}