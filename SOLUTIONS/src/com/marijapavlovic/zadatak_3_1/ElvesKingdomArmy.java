package com.marijapavlovic.zadatak_3_1;

public class ElvesKingdomArmy extends MedievalGameFactory {

    public ElvesKingdomArmy() {
        super();
    }

    @Override
    public void setArmyUnits() {
        //addRandomNumberOfEntities("Elves", "Archery");
        addRandomNumberOfEntities("Elves", "Infantry");
        addRandomNumberOfEntities("Elves", "Cavalry");
        //addRandomNumberOfEntities("Elves", "Swordsmen");
        addRandomNumberOfEntities("Elves", "Fleet");

    }


}
