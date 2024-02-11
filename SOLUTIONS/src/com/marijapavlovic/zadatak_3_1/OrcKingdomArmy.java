package com.marijapavlovic.zadatak_3_1;

public class OrcKingdomArmy extends MedievalGameFactory {

    public OrcKingdomArmy() {
        super();
    }

    @Override
    public void setArmyUnits() {
        addRandomNumberOfEntities("Orcs", "Infantry");
        addRandomNumberOfEntities("Orcs", "Cavalry");
        addRandomNumberOfEntities("Orcs", "Fleet");

    }

}
