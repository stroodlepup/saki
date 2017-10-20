package com.company.models;

/**
 * Created by stroodlepup on 9/12/17.
 */
public class Line {
    String pointFrom;
    String pointTo;
    String bearing;
    String distance;
    Boolean isTieLine;
    Coordinates pointCoordinatefrom;
    Coordinates pointCoordinateto;

    public Line(String pointFrom, String pointTo, String bearing, String distance){
        this.setPointFrom(pointFrom);
        this.setPointTo(pointTo);
        this.setBearing(bearing);
        this.setDistance(distance);
    }

    public String getPointFrom() {return pointFrom;}

    public void setPointFrom(String pointFrom) {this.pointFrom = pointFrom;}

    public String getPointTo() {return pointTo;}

    public void setPointTo(String pointTo) {this.pointTo = pointTo;}

    public String getBearing() {return bearing;}

    public void setBearing(String bearing) {this.bearing = bearing;}

    public String getDistance() {return distance;}

    public void setDistance(String distance) {this.distance = distance;}

    public Boolean getTieLine() {return isTieLine;}

    public void setTieLine(Boolean tieLine) {isTieLine = tieLine;}

    public Coordinates getPointCoordinatefrom() {return pointCoordinatefrom;}

    public void setPointCoordinatefrom(Coordinates pointCoordinatefrom) {this.pointCoordinatefrom = pointCoordinatefrom;}


    public Coordinates getPointCoordinateto() {return pointCoordinateto;}

    public void setPointCoordinateto(Coordinates pointCoordinateto) {this.pointCoordinateto = pointCoordinateto;}
}
