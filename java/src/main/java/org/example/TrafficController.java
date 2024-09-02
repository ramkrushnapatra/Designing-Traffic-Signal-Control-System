package org.example;

import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

public class TrafficController {
    private static TrafficController instance;
    private Map<String,Road>roadMap;

    public static synchronized  TrafficController getInstance(){
        if(instance == null){
            instance = new TrafficController();
        }
        return instance;
    }
    public TrafficController(){
        roadMap = new ConcurrentHashMap<>();
    }

    public void addRoadToTrafficController(Road road) {
        synchronized (this){
            roadMap.put(road.getRoadId(), road);
        }
    }

    public void checkSignalOfAllRoad() {
       synchronized (this){
           for (Map.Entry<String, Road>roadEntry:roadMap.entrySet()){
               System.out.println(roadEntry.getValue());
           }
       }
    }

    public void startTrafficController() {
        synchronized (this){
           for (Road road : roadMap.values()) {
               try{
                   Signal currentSignal = road.getTrafficeLight().getSignal();
                   road.getTrafficeLight().setSignal(currentSignal);
                   roadMap.put(road.getRoadId(),road);
               }
               catch (Exception e){
                   throw new RuntimeException(e);
               }
           }
        }
    }

    public void handleEmergency(String roadId) {
        Road road = roadMap.get(roadId);
        if(Objects.isNull(road)){
            throw new RuntimeException("invalid Road");
        }
        road.getTrafficeLight().setSignal(Signal.GREEN);
        roadMap.put(roadId,road);
    }


}
