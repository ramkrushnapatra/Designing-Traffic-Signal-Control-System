package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        TrafficController trafficController = TrafficController.getInstance();
        TrafficeLight trafficeLight1 = new TrafficeLight("signalID1",Signal.GREEN,12,13,14);
        TrafficeLight trafficeLight2 = new TrafficeLight("signalID1",Signal.YELLOW,12,13,14);
        TrafficeLight trafficeLight3 = new TrafficeLight("signalID1",Signal.RED,12,13,14);

        Road road1 = new Road("rd1","kormangla",trafficeLight1);
        Road road2 = new Road("rd2","sarjapur",trafficeLight2);
        Road road3 = new Road("rd3","marathali",trafficeLight3);

        trafficController.addRoadToTrafficController(road1);
        trafficController.addRoadToTrafficController(road2);
        trafficController.addRoadToTrafficController(road3);

        trafficController.checkSignalOfAllRoad();

        trafficController.handleEmergency("rd3");

        trafficController.checkSignalOfAllRoad();

//        trafficController.startTrafficController();

    }
}