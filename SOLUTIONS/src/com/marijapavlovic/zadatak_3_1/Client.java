package com.marijapavlovic.zadatak_3_1;

public class Client {

    public static void main(String[] args) {

        MedievalGameFactory elvesKingdom = new ElvesKingdomArmy();
        GameModuleArmyCreation gameModuleArmyCreation = new GameModuleArmyCreation(elvesKingdom);
        elvesKingdom.addRandomNumberOfEntities("Elves", "Infantry");
        elvesKingdom.addRandomNumberOfEntities("Elves", "Cavalry");
        elvesKingdom.addRandomNumberOfEntities("Elves", "Swordsmen");
        elvesKingdom.addRandomNumberOfEntities("Elves", "Fleet");
        gameModuleArmyCreation.createArmy();
        elvesKingdom.addEntitiesManual("Elves", "SiegeWeapons", 1000);
    }
}
