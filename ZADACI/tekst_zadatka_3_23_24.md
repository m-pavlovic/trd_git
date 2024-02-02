
# ZADATAK 3 ![simple](https://img.shields.io/badge/complexity-***-orange)

Zamislimo da radite kao dio tima koji razvija novu igricu. Vaš tim je zadužen za modul koji kreira vojske različitih kraljevstva (fantasy world). Modul treba realizirati na način da ni u jednom trenutku unaprijed nije poznato koju vojsku igrač želi kreirati. Vojske se sastoje od:

 - Archery
 - Swordsmen
 - Infantry
 - Fleet
 - Cavalry
 - SiegeWeapons

Za svaki element vojske potrebna je pripadna struktura podataka koja će "čuvati" sve generirane objekte pripadne klase:

- Archer
- Swordsman
- Soldier
- Ship
- Cavalryman
- SiegeWeapon

Zbog jednostanosti smatrajte da klase ne trebaju imati ništa - dovoljno ih je definirati kao "prazne klase". Brojčano stanje svakog elementa vojske će biti određeno s `HashMap` koja će uz naziv elementa vojske imati željeno brojčano stanje. Inicijalno su sva stanja nula. Svi ovi zahtjevi trebaju biti u odgovarajućoj razini apstrakcije `MedievalGameFactory`. U tom dijelu također trebate osigurati:

- metodu `addRandomNumberOfEntities` koja će za dani element vojske (ključ iz HashMap) generirati slučajni broj između `MIN_ENTITIES = 0` i `MAX_ENTITIES = 3000`
- metodu `addEntitiesManual` za "ručno" dodavanje željenog broja entiteta u željeni element vojske
- metodu `listGameEntities` koja izlistava sadržaj od HashMap
- metodu `populateListOfEntities` koja puni pripadnu strukturu podataka konkretnim objektima prema podacima iz HashMap
- metodu `particularLisOfEntitiesInGame` koja daje veličinu lista s konkretnim objektima (treba se poklapati s podacima u HashMap)

Obratite pažnju na "ručno dodavanje" entiteta jer ćete tada trebati pozvati pripadnu metodu za kreiranje tog elementa vojske &rarr; `DRY` &rarr; ne smije biti ponavljanja koda. 

> **HINT:** Class<?> i getDeclaredMethods, pa nakon toga invoke pripadne metode (naravno, za taj dio kao pomoć možete koristiti chatGPT).

Dalje, kreirajte dvije vojske `ElvesKingdomArmy` i `OrcKingdomArmy` temeljem osnovne apstrakcije. Glavni modul `GameModulArmyCreation` treba imati mogućnost dinamičkog generiranja željene vojske s metodom `createArmy`. Primjer konzolnog izlaza je:

```
Game module army creation initialized - set game army factory...
Game module army creation - game army factory set to: ElvesKingdomArmy


This kingdom has no archery at this moment...
Elves cavalry created
Elves fleet created
Elves infantry created
This kingdom has no siege weapons at this moment...
Elves swordsmen created

--------------------------------------------------------------------------------
Game entities:
Infantry - 963
Fleet - 1058
Archery - 0
SiegeWeapons - 0
Cavalry - 2110
Swordsmen - 1703

----------------------------------------------------------------------------
Method: createSiegeWeapons manual creation
Elves siege weapons created

--------------------------------------------------------------------------------
Game entities:
Infantry - 963
Fleet - 1058
Archery - 0
SiegeWeapons - 1000
Cavalry - 2110
Swordsmen - 1703

--------------------------------------------------------------------------------
Particular list of entities in game:
Archers: 0 - ArrayList of -> Archer
Swordsmen: 1703 - ArrayList of -> Swordsman
Infantry: 963 - ArrayList of -> Soldier
Fleet: 1058 - ArrayList of -> Ship
Cavalry: 2110 - ArrayList of -> Cavalryman
Siege weapons: 1000 - ArrayList of -> SiegeWeapon

```

U PDF dokumentu postavite pripadni UML dijagram vašeg rješenja te objasnite koji dijelovi SOLID principa dizajna su prepoznatljivi u vašem rješenju. 
