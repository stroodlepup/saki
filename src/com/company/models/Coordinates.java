package com.company.models;

/**
 * Created by stroodlepup on 9/12/17.
 */
public class Coordinates{
    private Float northing;
    private Float easting;

    public Coordinates(float northing, float easting){
        this.setNorthing(northing);
        this.setEasting(easting);
    }

    public Float getNorthing() {
        return northing;
    }

    public void setNorthing(Float northing) {
        this.northing = northing;
    }

    public Float getEasting() {
        return easting;
    }

    public void setEasting(Float easting) {
        this.easting = easting;
    }
}
