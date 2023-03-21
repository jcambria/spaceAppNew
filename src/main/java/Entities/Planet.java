package Entities;

public class Planet {
    String name;
    String description;
    String id;
    public Planet (String name, String description, String id){
        this.name=name;
        this.description= description;
        this.id= id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
