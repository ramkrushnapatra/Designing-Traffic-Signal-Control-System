package org.example;

public class TrafficeLight {

    private String signalId;
    private Signal signal;
    private int redDuration;
    private int yellowDuration;
    private int greenDuration;

    public TrafficeLight(String signalId, Signal signal, int redDuration, int yellowDuration, int greenDuration) {
        this.signalId = signalId;
        this.signal = signal;
        this.redDuration = redDuration;
        this.yellowDuration = yellowDuration;
        this.greenDuration = greenDuration;
    }

    public String getSignalId() {
        return signalId;
    }

    public void setSignalId(String signalId) {
        this.signalId = signalId;
    }

    public Signal getSignal() {
        return signal;
    }

    public void setSignal(Signal signal) {
        this.signal = signal;
    }

    public int getRedDuration() {
        return redDuration;
    }

    public void setRedDuration(int redDuration) {
        this.redDuration = redDuration;
    }

    public int getYellowDuration() {
        return yellowDuration;
    }

    public void setYellowDuration(int yellowDuration) {
        this.yellowDuration = yellowDuration;
    }

    public int getGreenDuration() {
        return greenDuration;
    }

    public void setGreenDuration(int greenDuration) {
        this.greenDuration = greenDuration;
    }

    @Override
    public String toString() {
        return "TrafficeLight{" +
                "signalId='" + signalId + '\'' +
                ", signal=" + signal +
                ", redDuration=" + redDuration +
                ", yellowDuration=" + yellowDuration +
                ", greenDuration=" + greenDuration +
                '}';
    }
}
