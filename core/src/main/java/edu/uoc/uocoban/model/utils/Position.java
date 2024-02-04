package edu.uoc.uocoban.model.utils;

import java.util.Objects;

public class Position {

    private int x;
    private int y;


    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }


    ///////////////////////// Getters /////////////////////
    @Override
    public boolean equals(Object other){
        if (this == other) {
            return true;
        }
        if (other instanceof Position otherPosition) {
            return x == otherPosition.x && y == otherPosition.y;
        }
        return false;

    }

    @Override
    public String toString() {
        return x + "," + y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int hashCode(){
        return Objects.hash(x,y);
    }



    ///////////////////////// Setters //////////////////////


    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }



}
