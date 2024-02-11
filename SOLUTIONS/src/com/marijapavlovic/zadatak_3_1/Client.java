package com.marijapavlovic.zadatak_3_1;

public class Client {

    public static void main(String[] args) {

        GameModuleArmyCreation gameModuleArmyCreation = new GameModuleArmyCreation();
        MedievalGameFactory elvesKingdom = new ElvesKingdomArmy();
        gameModuleArmyCreation.setGameArmyFactory(elvesKingdom);
        elvesKingdom.addRandomNumberOfEntities("Elves", "Infantry");
        elvesKingdom.addRandomNumberOfEntities("Elves", "Cavalry");
        elvesKingdom.addRandomNumberOfEntities("Elves", "Swordsmen");
        elvesKingdom.addRandomNumberOfEntities("Elves", "Fleet");
        gameModuleArmyCreation.createArmy();
        elvesKingdom.addEntitiesManual("Elves", "SiegeWeapons", 1000);
        MedievalGameFactory orcKingdom = new OrcKingdomArmy();
        gameModuleArmyCreation.setGameArmyFactory(orcKingdom);
        orcKingdom.addRandomNumberOfEntities("Orcs", "Infantry");
        orcKingdom.addRandomNumberOfEntities("Orcs", "Cavalry");
//        orcKingdom.addRandomNumberOfEntities("Orcs", "Swordsmen");
        orcKingdom.addRandomNumberOfEntities("Orcs", "Fleet");
        gameModuleArmyCreation.createArmy();
        orcKingdom.addEntitiesManual("Orcs", "SiegeWeapons", 1000);

    }
}
