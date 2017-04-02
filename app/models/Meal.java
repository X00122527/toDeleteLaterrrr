package models;

import java.util.*;
import javax.persistence.*;
import java.util.Random;
import models.users.*;
import com.avaje.ebean.Model;


@Entity
public class Meal extends Model {

    @Id @GeneratedValue(strategy=GenerationType.AUTO) 
    private long mealId;

    @ManyToOne
    private Member m;

    @OneToMany
    private ArrayList<Food> foods = new ArrayList<Food>();


    private double totalKcal;

    private double totalCarbs;
    private double totalProtein;
    private double totalFat;

    public Meal() {
        generateProteinFood();
        generateCarbsFood();
    }

    public Meal(Member uIn) {
        m = uIn;
        generateProteinFood();
        generateCarbsFood();
    }

    public static Finder<Long,Meal> find = new Finder<Long,Meal>(Meal.class);



     public static List<Meal> findAll() {
        return Meal.find.all();
    }

    public long getMealId() {
        return mealId;
    }

    public double getTotalKcal() {
        return totalKcal;
    }

    public double getTotalCarbs() {
        return totalCarbs;
    }

    public double getTotalProtein() {
        return totalProtein;
    }

    public double getTotalFat() {
        return totalFat;
    }

    public void setUser(Member user){
	m = user;
    }

    public User getUser(){
	return m;
    }

    public void generateProteinFood(){
	//xd
	    Random r = new Random();
        int ran = r.nextInt(foods.size());
        Food f = foods.get(ran);
        double proteinRequiredPerMeal = (m.getWeight() * 4) / m.getNoOfMeal();
        double proteinAmount = (proteinRequiredPerMeal * 100) / f.getProtein();
        double totalProteinCalories = (f.getKcal() * proteinAmount) / 100;
        totalProtein += proteinAmount;

        double carbsRequiredPerMeal = (m.getWeight() * 4) / m.getNoOfMeal();
        double carbsAmount = (carbsRequiredPerMeal * 100) / f.getCarbs();
        double totalCarbsCalories = (f.getKcal() * carbsAmount) / 100;
        totalCarbs += carbsAmount;

        double fatRequiredPerMeal = (m.getWeight() * 4) / m.getNoOfMeal();
        double fatAmount = (fatRequiredPerMeal * 100) / f.getFat();
        double totalFatCalories = (f.getKcal() * fatAmount) / 100;
        totalFat = fatAmount;

        totalKcal += totalProteinCalories + totalCarbsCalories + totalFatCalories;

    }

    public void generateCarbsFood(){
        //xd
        Random r = new Random();
        int ran = r.nextInt(foods.size());
        Food f = foods.get(ran);
        double proteinRequiredPerMeal = (m.getWeight() * 4) / m.getNoOfMeal();
        double proteinAmount = (proteinRequiredPerMeal * 100) / f.getProtein();
        double totalProteinCalories = (f.getKcal() * proteinAmount) / 100;
        totalProtein += proteinAmount;

        double carbsRequiredPerMeal = (m.getWeight() * 4) / m.getNoOfMeal();
        double carbsAmount = (carbsRequiredPerMeal * 100) / f.getCarbs();
        double totalCarbsCalories = (f.getKcal() * carbsAmount) / 100;
        totalCarbs += carbsAmount;

        double fatRequiredPerMeal = (m.getWeight() * 4) / m.getNoOfMeal();
        double fatAmount = (fatRequiredPerMeal * 100) / f.getFat();
        double totalFatCalories = (f.getKcal() * fatAmount) / 100;
        totalFat = fatAmount;

        totalKcal += totalProteinCalories + totalCarbsCalories + totalFatCalories;

    }


}
