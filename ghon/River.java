package com.ghon;

public class River extends Line{
    private String riverName;
    public River(String riverName, String... locations) {
        super(locations);
        this.riverName = riverName;
    }

    @Override
    public String toString(){
        return riverName + " River";
    }
}
