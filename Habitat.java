package src.model;

public class Habitat {
    private int habitatId;
    private String name;
    private String location;
    private String description;

    // Setter and Getter for habitatId
    public void setHabitatId(int habitatId) {
        this.habitatId = habitatId;
    }
    public int getHabitatId() {
        return habitatId;
    }
    
    // Setter and Getter for name
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    
    // Setter and Getter for location
    public void setLocation(String location) {
        this.location = location;
    }
    public String getLocation() {
        return location;
    }
    
    // Setter and Getter for description
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }

    
}
