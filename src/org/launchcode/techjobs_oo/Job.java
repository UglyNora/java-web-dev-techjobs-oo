package org.launchcode.techjobs_oo;

import java.lang.reflect.Field;
import java.util.Objects;

public class Job  {

    private int id;
    private static int nextId = 1;


    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    //Constructor initializing Unique ID.
    public Job(){
        id = nextId;
        nextId++;
    }

    //Constructor initializing all fields and calling first constructor to initialize the id field.

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency ) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }




    // Getters and Setters:
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

//    @Override
//    public String toString() {
//        String message = "Data Not Available";
//
//             name == null ? message : name,
//             employer == null ? message : employer,
//             location == null ? message : location,
//             positionType == null ? message : positionType,
//             coreCompetency == null ? message : coreCompetency);}


    @Override
    public String toString() {

        String message = "Data Not Available";


        String aName = (getName()== null ? message : getName());
        String aEmployer = (getEmployer().getValue() == "" ? message : getEmployer().getValue());
        String aLocation = (getLocation().getValue() == "" ? message : getLocation().getValue());
        String aPositionType = (getPositionType().getValue() == "" ? message : getPositionType().getValue());
        String aCoreCompetency = (getCoreCompetency().getValue() == "" ? message : getCoreCompetency().getValue());

        return
                "\nID: " + id +
                        "\nName: " + aName +
                        "\nEmployer: " + aEmployer +
                        "\nLocation: " + aLocation +
                        "\nPosition Type: " + aPositionType +
                        "\nCore Competency: " + aCoreCompetency + "\n";

    }








    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;

        Job job = (Job) o;

        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return getId();
    }



}
