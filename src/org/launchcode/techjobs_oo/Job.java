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

    @Override
    public String toString() {
//        Job myJob = new Job();
//        String message = "Data Not Available";
//        Field[] fields = myJob.getClass().getDeclaredFields();
//        for (Field f : fields) {
//            if (f == null) {
//                return message;
//            }
//        }
        return
                " \nID: " + id +
                        " \nName: " + name +
                        " \nEmployer: " + employer +
                        " \nLocation: " + location +
                        " \nPosition Type: " + positionType +
                        " \nCore Competency: " + coreCompetency + "\n";
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
