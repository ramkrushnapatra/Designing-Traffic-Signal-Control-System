package org.example;

public class Road {
    private String roadId;
    private String roadName;
    private TrafficeLight trafficeLight;

    public Road(String roadId, String roadName, TrafficeLight trafficeLight) {
        this.roadId = roadId;
        this.roadName = roadName;
        this.trafficeLight = trafficeLight;
    }

    public String getRoadId() {
        return roadId;
    }

    public void setRoadId(String roadId) {
        this.roadId = roadId;
    }

    public String getRoadName() {
        return roadName;
    }

    public void setRoadName(String roadName) {
        this.roadName = roadName;
    }

    public TrafficeLight getTrafficeLight() {
        return trafficeLight;
    }

    public void setTrafficeLight(TrafficeLight trafficeLight) {
        this.trafficeLight = trafficeLight;
    }

    @Override
    public String toString() {
        return "Road{" +
                "roadId='" + roadId + '\'' +
                ", roadName='" + roadName + '\'' +
                ", trafficeLight=" + trafficeLight +
                '}';
    }
}
