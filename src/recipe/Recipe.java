/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recipe;

import java.util.*;

/**
 *
 * @author mihailvd
 */
public class Recipe {
    String name;
    HashMap<String, String> ingredients = new HashMap<>();
    LinkedList<String> steps = new LinkedList<>();
    double time;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<String, String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(HashMap<String, String> ingridients) {
        this.ingredients = ingredients;
    }

    public LinkedList<String> getSteps() {
        return steps;
    }

    public void setSteps(LinkedList<String> steps) {
        this.steps = steps;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public Recipe(String name, double time, HashMap<String, String> ingredients, LinkedList<String> steps) {
        this.name = name;
        this.time = time;
        this.ingredients = ingredients;
        this.steps = steps;
    }
    
    public void AddStep(String step) {
        this.steps.push(step);
    }
    
    public void AddIngredients(String ingredient, String quntity){
        this.ingredients.put(ingredient, quntity);
    }
    
    @Override
    public String toString(){
        String ingredients = "";
        String steps = "";
        for ( Map.Entry<String, String> entry : this.ingredients.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            ingredients += key + ":" + value + ",";
        }
        
        for (int i = 0; i < this.steps.size(); i++) {
            steps += this.steps.get(i) + ",";
        }
        return this.name + " " + this.time + " " + ingredients + "+"+ steps+ "\n";
    }
    
}
