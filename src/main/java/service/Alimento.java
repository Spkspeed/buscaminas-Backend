package service;

public class Alimento {
    private String meet = "meet";
    private String water = "water";

    public String getMeet() {
        System.out.println("carne obtenida");
        return meet;
    }

    public String getWater() {
        System.out.println("agua obtenida");
        return water;
    }
}
