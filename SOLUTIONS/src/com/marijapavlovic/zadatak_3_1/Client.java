package com.marijapavlovic.zadatak_3_1;

public class Client {

    public static void main(String[] args) {

        GameModuleArmyCreation gameModuleArmyCreation = new GameModuleArmyCreation();
        MedievalGameFactory elvesKingdom = new ElvesKingdomArmy();
        gameModuleArmyCreation.setGameArmyFactory(elvesKingdom);
        elvesKingdom.setArmyUnits();
        gameModuleArmyCreation.createArmy();
        elvesKingdom.addEntitiesManual("Elves", "SiegeWeapons", 1000);
        MedievalGameFactory orcKingdom = new OrcKingdomArmy();
        gameModuleArmyCreation.setGameArmyFactory(orcKingdom);
        orcKingdom.setArmyUnits();
        gameModuleArmyCreation.createArmy();
        orcKingdom.addEntitiesManual("Orcs", "SiegeWeapons", 1000);

    }
}
