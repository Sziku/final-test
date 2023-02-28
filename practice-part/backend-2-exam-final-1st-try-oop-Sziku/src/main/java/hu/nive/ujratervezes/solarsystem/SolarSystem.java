package hu.nive.ujratervezes.solarsystem;

import java.util.List;

public class SolarSystem {

    private List<Planet> planets;

    public SolarSystem(List<Planet> planets) {
        this.planets = planets;
    }

    public List<Planet> getPlanets() {
        return planets;
    }

    public int countPlanetByType(PlanetType planetType){
        int planetCountByType  = 0;

        for (Planet planet : planets) {
            if(planet.getPlanetType().equals(planetType)){
                planetCountByType++;
            }
        }

        return planetCountByType;
    }

    public void addPlanet(Planet planet){
        planets.add(planet);
    }

    public void removePlanetByName(String name){
        for (Planet planet : planets){
            if(planet.getName().equals(name)){
                planets.remove(planet);
            }
        }
    }

    public Planet findPlanetWithMostMoons(){
        Planet mostMoon = null;
        int moonCount = 0;

        for (Planet planet : planets){
            if(planet.getMoons().size() > moonCount){
                
                mostMoon = planet;
                moonCount  = planet.getMoons().size();
            }
        }
        
        return mostMoon;
    }
}
