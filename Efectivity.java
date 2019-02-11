/**
 * Efectivity v1.1 FINAL 
 * - add Dark type
 */
public class Efectivity {
    public static double efectivity(String pokemonType, String enemyPokemonType) {
        switch (pokemonType) {
            case "Normal":
                if (enemyPokemonType.equals("Ghost")) {
                    return 0;
                }
                if (enemyPokemonType.equals("Steel")) {
                    return 0.5;
                }
                if (enemyPokemonType.equals("Rock")) {
                    return 0.5;
                }
                
                break;
            case "Steel":
                if (enemyPokemonType.equals("Water")) {
                    return 0.5;
                }
                if (enemyPokemonType.equals("Steel")) {
                    return 0.5;
                }
                if (enemyPokemonType.equals("Electric")) {
                    return 0.5;
                }
                if (enemyPokemonType.equals("Fire")) {
                    return 0.5;
                }
                if (enemyPokemonType.equals("Fairy")) {
                    return 2;
                }
                if (enemyPokemonType.equals("Ice")) {
                    return 2;
                }
                if (enemyPokemonType.equals("Rock")) {
                    return 2;
                }
                break;
            case "Water":
                if (enemyPokemonType.equals("Water")) {
                    return 0.5;
                }
                if (enemyPokemonType.equals("Dragon")) {
                    return 0.5;
                }
                if (enemyPokemonType.equals("Grass")) {
                    return 0.5;
                }
                if (enemyPokemonType.equals("Fire")) {
                    return 2;
                }
                if (enemyPokemonType.equals("Ground")) {
                    return 2;
                }
                if (enemyPokemonType.equals("Rock")) {
                    return 2;
                }
                break;
            case "Bug":
                if (enemyPokemonType.equals("Water")) {
                    return 0.5;
                }
                if (enemyPokemonType.equals("Flying")) {
                    return 0.5;
                }
                if (enemyPokemonType.equals("Poison")) {
                    return 0.5;
                }
                if (enemyPokemonType.equals("Fight")) {
                    return 0.5;
                }
                if (enemyPokemonType.equals("Ghost")) {
                    return 0.5;
                }
                if (enemyPokemonType.equals("Fire")) {
                    return 0.5;
                }
                if (enemyPokemonType.equals("Fairy")) {
                    return 0;
                }
                if (enemyPokemonType.equals("Grass")) {
                    return 2;
                }
                if (enemyPokemonType.equals("Psychic")) {
                    return 2;
                }
                if (enemyPokemonType.equals("Dark")) {
                    return 2;
                }
                break;
            case "Dragon":
                if (enemyPokemonType.equals("Steel")) {
                    return 0.5;
                }
                if (enemyPokemonType.equals("Dragon")) {
                    return 2;
                }
                if (enemyPokemonType.equals("Fairy")) {
                    return 0;
                }
                break;
            case "Electric":
                if (enemyPokemonType.equals("Water")) {
                    return 2;
                }
                if (enemyPokemonType.equals("Dragon")) {
                    return 0.5;
                }
                if (enemyPokemonType.equals("Grass")) {
                    return 0.5;
                }
                if (enemyPokemonType.equals("Ground")) {
                    return 0;
                }
                if (enemyPokemonType.equals("Electric")) {
                    return 0.5;
                }
                if (enemyPokemonType.equals("Flying")) {
                    return 2;
                }
                break;
            case "Ghost":
                if (enemyPokemonType.equals("Ghost")) {
                    return 2;
                }
                if (enemyPokemonType.equals("Psychic")) {
                    return 2;
                }
                if (enemyPokemonType.equals("Dark")) {
                    return 0.5;
                }
                if (enemyPokemonType.equals("Normal")) {
                    return 0;
                }
                break;
            case "Fire":
                if (enemyPokemonType.equals("Water")) {
                    return 0.5;
                }
                if (enemyPokemonType.equals("Dragon")) {
                    return 0.5;
                }
                if (enemyPokemonType.equals("Grass")) {
                    return 2;
                }
                if (enemyPokemonType.equals("Steel")) {
                    return 2;
                }
                if (enemyPokemonType.equals("Bug")) {
                    return 2;
                }
                if (enemyPokemonType.equals("Fire")) {
                    return 0.5;
                }
                if (enemyPokemonType.equals("Ice")) {
                    return 2;
                }
                if (enemyPokemonType.equals("Rock")) {
                    return 0.5;
                }
                break;
            case "Fairy":
                if (enemyPokemonType.equals("Dark")) {
                    return 2;
                }
                if (enemyPokemonType.equals("Dragon")) {
                    return 2;
                }
                if (enemyPokemonType.equals("Steel")) {
                    return 0.5;
                }
                if (enemyPokemonType.equals("Fight")) {
                    return 2;
                }
                if (enemyPokemonType.equals("Poison")) {
                    return 0.5;
                }
                if (enemyPokemonType.equals("Fire")) {
                    return 0.5;
                }
                break;
            case "Ice":
                if (enemyPokemonType.equals("Water")) {
                    return 0.5;
                }
                if (enemyPokemonType.equals("Dragon")) {
                    return 2;
                }
                if (enemyPokemonType.equals("Grass")) {
                    return 2;
                }
                if (enemyPokemonType.equals("Ground")) {
                    return 2;
                }
                if (enemyPokemonType.equals("Fire")) {
                    return 0.5;
                }
                if (enemyPokemonType.equals("Flying")) {
                    return 2;
                }
                if (enemyPokemonType.equals("Steel")){
                    return 0.5;
                }
                if (enemyPokemonType.equals("Ice")){
                    return 0.5;
                }
                break;
            case "Fight":
                if (enemyPokemonType.equals("Flying")) {
                    return 0.5;
                }
                if (enemyPokemonType.equals("Steel")) {
                    return 2;
                }
                if (enemyPokemonType.equals("Bug")) {
                    return 0.5;
                }
                if (enemyPokemonType.equals("Ice")) {
                    return 2;
                }
                if (enemyPokemonType.equals("Rock")) {
                    return 2;
                }
                if (enemyPokemonType.equals("Ghost")){
                    return 0;
                }
                if (enemyPokemonType.equals("Fairy")){
                    return 0.5;
                }
                if (enemyPokemonType.equals("Normal")){
                    return 2;
                }
                if (enemyPokemonType.equals("Psychic")) {
                    return 0.5;
                }
                if (enemyPokemonType.equals("Dark")) {
                    return 2;
                }
                if (enemyPokemonType.equals("Poison")) {
                    return 0.5;
                }
                break;
            case "Grass":
                if (enemyPokemonType.equals("Flying")) {
                    return 0.5;
                }
                if (enemyPokemonType.equals("Steel")) {
                    return 0.5;
                }
                if (enemyPokemonType.equals("Bug")) {
                    return 0.5;
                }
                if (enemyPokemonType.equals("Rock")) {
                    return 2;
                }
                if (enemyPokemonType.equals("Ghost")){
                    return 0;
                }
                if (enemyPokemonType.equals("Fairy")){
                    return 0.5;
                }
                if (enemyPokemonType.equals("Poison")) {
                    return 0.5;
                }
                if (enemyPokemonType.equals("Water")) {
                    return 2;
                }
                if (enemyPokemonType.equals("Dragon")) {
                    return 0.5;
                }
                if (enemyPokemonType.equals("Grass")) {
                    return 0.5;
                }
                if (enemyPokemonType.equals("Ground")) {
                    return 2;
                }
                if (enemyPokemonType.equals("Fire")) {
                    return 0.5;
                }
                break;
            case "Psychic":
                if (enemyPokemonType.equals("Steel")) {
                    return 0.5;
                }
                if (enemyPokemonType.equals("Poison")) {
                    return 2;
                }
                if (enemyPokemonType.equals("Fight")) {
                    return 2;
                }
                if (enemyPokemonType.equals("Dark")){
                    return 0;
                }
                if (enemyPokemonType.equals("Psychic")) {
                    return 0.5;
                }
                break;
            case "Rock":
                if (enemyPokemonType.equals("Flying")) {
                    return 2;
                }
                if (enemyPokemonType.equals("Steel")) {
                    return 0.5;
                }
                if (enemyPokemonType.equals("Bug")) {
                    return 2;
                }
                if (enemyPokemonType.equals("Rock")) {
                    return 0.5;
                }
                if (enemyPokemonType.equals("Ice")) {
                    return 2;
                }
                if (enemyPokemonType.equals("Ground")) {
                    return 0.5;
                }
                if (enemyPokemonType.equals("Fire")) {
                    return 2;
                }
                break;
            case "Ground":
                if (enemyPokemonType.equals("Flying")) {
                    return 0;
                }
                if (enemyPokemonType.equals("Steel")) {
                    return 2;
                }
                if (enemyPokemonType.equals("Bug")) {
                    return 0.5;
                }
                if (enemyPokemonType.equals("Rock")) {
                    return 2;
                }
                if (enemyPokemonType.equals("Electric")) {
                    return 2;
                }
                if (enemyPokemonType.equals("Fire")) {
                    return 2;
                }
                if (enemyPokemonType.equals("Grass")){
                    return 0.5;
                }
                if (enemyPokemonType.equals("Poison")) {
                    return 2;
                }
                break;
            case "Poison":
                if (enemyPokemonType.equals("Steel")) {
                    return 0;
                }
                if (enemyPokemonType.equals("Rock")) {
                    return 0.5;
                }
                if (enemyPokemonType.equals("Ghost")){
                    return 0.5;
                }
                if (enemyPokemonType.equals("Fairy")){
                    return 2;
                }
                if (enemyPokemonType.equals("Poison")) {
                    return 0.5;
                }
                if (enemyPokemonType.equals("Grass")) {
                    return 2;
                }
                if (enemyPokemonType.equals("Ground")) {
                    return 0.5;
                }
                break;
            case "Flying":
                if (enemyPokemonType.equals("Steel")) {
                    return 0.5;
                }
                if (enemyPokemonType.equals("Bug")) {
                    return 2;
                }
                if (enemyPokemonType.equals("Rock")) {
                    return 0.5;
                }
                if (enemyPokemonType.equals("Grass")) {
                    return 2;
                }
                if (enemyPokemonType.equals("Electric")) {
                    return 0.5;
                }
                if (enemyPokemonType.equals("Fight")) {
                    return 2;
                }
                break;
            case "Dark":
                if (enemyPokemonType.equals("Ghost")) {
                return 2;
                }
                if (enemyPokemonType.equals("Psychic")) {
                    return 2;
                }
                if (enemyPokemonType.equals("Dark")) {
                    return 0.5;
                }
                if (enemyPokemonType.equals("Fight")) {
                    return 0.5;
                }
                if (enemyPokemonType.equals("Fairy")) {
                    return 0.5;
                }
        }
        return 1;
    }
}