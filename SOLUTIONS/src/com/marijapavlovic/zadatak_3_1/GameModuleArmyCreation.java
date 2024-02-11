package com.marijapavlovic.zadatak_3_1;

public class GameModuleArmyCreation {
    private MedievalGameFactory gameArmyFactory;

    public GameModuleArmyCreation() {
        System.out.println("Game module army creation initialized - set game army factory...");
    }

    public void setGameArmyFactory(MedievalGameFactory gameArmyFactory) {
        this.gameArmyFactory = gameArmyFactory;
        System.out.println("Game module army creation - game army factory set to: " + gameArmyFactory.getClass().getSimpleName());
        System.out.println("---------------------------------------------------------------------------------------------------------- \n");
    }

    public void createArmy() {
        for (String key : gameArmyFactory.armyUnits.keySet()) {
            if (gameArmyFactory.armyUnits.get(key) == 0) {
                System.out.println("The kingdom has no " + key.toLowerCase() + " at the moment");
            }
        }
        System.out.println("---------------------------------------------------------------------------------------------------------- \n");
        gameArmyFactory.populateListOfEntities();
        gameArmyFactory.listGameEntities();
        gameArmyFactory.particularListOfEntitiesInGame();
    }
}
