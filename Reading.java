package src.model;

import java.time.LocalDateTime;

public class Reading {

    private int readingId;
    private int habitatId;
    private int parameterId;
    private double value;
    private LocalDateTime timestamp;

    public int getReadingId() {
        return readingId;
    }
    public void setReadingId(int readingId) {
        this.readingId = readingId;
    }

    public int getHabitatId() {
        return habitatId;
    }
    public void setHabitatId(int habitatId) {
        this.habitatId = habitatId;
    }

    public int getParameterId() {
        return parameterId;
    }
    public void setParameterId(int parameterId) {
        this.parameterId = parameterId;
    }

    public double getValue() {
        return value;
    }
    public void setValue(double value) {
        this.value = value;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}

