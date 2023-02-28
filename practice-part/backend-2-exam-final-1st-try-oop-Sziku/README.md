# Csillagrendszer
Ebben a feladatban egy csillagrendszert kell modellezned.

Minden osztályodat a s `hu.nive.ujratervezes.solarsystem` package-ben kell létrehozni.

A `Main` osztály `main` metódusában próbálhatod ki a kódodat, illetve használd
az előre megírt teszteseteket az algoritmusod kipróbálására!

## Feladatleírás
Implementáld az alábbi leírás szerinti programot:

### hu.nive.ujratervezes.solarsystem.SpaceObject
tulajdonságai:
- `String name` ami az űrbeli objektum neve. Konstruktorral beállítható kell legyen. Tartozik hozzá egy `String getName()` getter.
- `int mass`  ami az űrbeli objektum tömege. Konstruktorral beállítható kell legyen. Tartozik hozzá egy `int getMass()` getter.

### hu.nive.ujratervezes.solarsystem.PlanetType
Egy enum ami a `GAS_GIANT` és a `NORMAL` értékeket veheti fel.

### hu.nive.ujratervezes.solarsystem.Moon
Az összes `Moon` egyben `SpaceObject` is.
Ezen felül tulajdonsága:
- `int periapsis` a bolygó és a hold közötti legkisebb távolság. Konstruktorral beállítható kell legyen. Tartozik hozzá egy `int getPeriapsis()` getter.

### hu.nive.ujratervezes.solarsystem.Planet
Az összes `Planet` egyben `SpaceObject` is.
Ezen felül tulajdonsága:
- `PlanetType planetType` a bolygó típusa. Konstruktorral beállítható kell legyen. Tartozik hozzá egy `PlanetType getPlanetType()` getter.
- `List<Moon> moons` a bolygó holdjainak listája. Konstruktorral beállítható kell legyen. Tartozik hozzá egy `PlanetType getPlanetType()` getter.

Metódusai:
- `int calculateMassWithMoons()` visszadja a bolygó és a holdjai együttes tömegét.
- `int calculateClosestDistanceWithMoon()` a legkisebb távolság a bolygó és holdjai között.
- `int numberOfMoons()` a bolygó holdjainak számát adja vissza.

### hu.nive.ujratervezes.solarsystem.SolarSystem
Tulajdonsága:
- `List<Planet> planets` a bolygók listája. Konstruktorral beállítható kell legyen. Tartozik hozzá egy `List<Planet> getPlanets()` getter.

Metódusai:
- `int countPlanetByType(PlanetType planetType)` visszaadja, hogy a paraméterben kapott bolygó típusból hány van a naprendszerben.
- `void addPlanet(Planet planet)` a paraméterben kapott bolygót hozzáadja a naprendszer bolygóihoz.
- `void removePlanetByName(String name)` a paraméterben egy bolygó nevét kapja. Az ilyen nevű bolygót eltávolítja a bolygók listájáról.
- `Planet findPlanetWithMostMoons()` visszaadja azt a bolygót ami a legtöbb holddal rendelkezik.