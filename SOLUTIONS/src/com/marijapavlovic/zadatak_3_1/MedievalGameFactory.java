package com.marijapavlovic.zadatak_3_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public abstract class MedievalGameFactory {

    protected static final int MIN_ENTITIES = 0;
    protected static final int MAX_ENTITIES = 3000;
    protected HashMap<String, Integer> armyUnits;
    protected HashMap<String, List<Object>> particularEntities;

    public MedievalGameFactory() {
        armyUnits = new HashMap<>();
        particularEntities = new HashMap<>();
        armyUnits.put("Archery", 0);
        armyUnits.put("Cavalry", 0);
        armyUnits.put("Infantry", 0);
        armyUnits.put("Fleet", 0);
        armyUnits.put("SiegeWeapons", 0);
        armyUnits.put("Swordsmen", 0);
        particularEntities.put("Archer", new ArrayList<>());
        particularEntities.put("Cavalryman", new ArrayList<>());
        particularEntities.put("Soldier", new ArrayList<>());
        particularEntities.put("Ship", new ArrayList<>());
        particularEntities.put("SiegeWeapon", new ArrayList<>());
        particularEntities.put("Swordsman", new ArrayList<>());
    }

    public void addRandomNumberOfEntities(String army, String entity) {
        int randomNumber = ThreadLocalRandom.current().nextInt(MIN_ENTITIES, MAX_ENTITIES + 1);
        armyUnits.put(entity, randomNumber);
        System.out.println(army + " " + entity.toLowerCase() + " created");
    }

    public void addEntitiesManual(String army, String entity, int number) {
        System.out.println("Method: create" + entity + " manual creation");
        armyUnits.put(entity, number);
        System.out.println(army + " " + entity.toLowerCase() + " created");
        System.out.println("---------------------------------------------------------------------------------------------------------- \n");
        listGameEntities();
    }

    public void listGameEntities() {
        System.out.println("Game entities:");
        for (HashMap.Entry<String, Integer> entry : armyUnits.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("---------------------------------------------------------------------------------------------------------- \n");
    }

    public void populateListOfEntities() {
        for (HashMap.Entry<String, Integer> entry : armyUnits.entrySet()) {
            for (int i = 0; i < entry.getValue(); i++) {
                switch (entry.getKey()) {
                    case "Archery":
                        particularEntities.get("Archer").add(new Archer());
                        break;
                    case "Cavalry":
                        particularEntities.get("Cavalryman").add(new Cavalryman());
                        break;
                    case "Infantry":
                        particularEntities.get("Soldier").add(new Soldier());
                        break;
                    case "Fleet":
                        particularEntities.get("Ship").add(new Ship());
                        break;
                    case "SiegeWeapons":
                        particularEntities.get("SiegeWeapon").add(new SiegeWeapon());
                        break;
                    case "Swordsmen":
                        particularEntities.get("Swordsman").add(new Swordsman());
                        break;
                }
            }
        }
    }
//    public void particularListOfEntitiesInGame() throws NoSuchMethodException {
//        Class<?> clazz = this.getClass();
//        System.out.println("Particular list of entities in game:");
//        for (HashMap.Entry<String, List<Object>> entry : particularEntities.entrySet()) {
//            System.out.println(entry.getKey() + ": " + entry.getValue().size() + " - ArrayList of -> " + entry.getValue().get(0).getClass().getSimpleName());
//        }
//        if (clazz.getDeclaredMethod("addRadnomNumberOfEntities", String.class, String.class) != null) {
//            System.out.println("This kingdom has no " + clazz.getDeclaredMethod("addRadnomNumberOfEntities", String.class, String.class).getParameterTypes()[1].getSimpleName().toLowerCase() + " at this moment...");
//        }
//    }
}
