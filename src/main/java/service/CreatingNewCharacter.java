package service;


import java.util.ArrayList;
import java.util.List;

public class CreatingNewCharacter {
    private String name;
    private int level;
    private int exp;
    private String armor = "empty";
    private String helmet = "empty";
    private String gloves = "empty";
    private String boots = "empty";
    private String weapon = "empty";

    public List equipment = new ArrayList();

    public CreatingNewCharacter(String name) {
        this.name = name;
        this.level = 0;
        this.exp = 0;

        equipment.add(armor);
        equipment.add(helmet);
        equipment.add(gloves);
        equipment.add(boots);
        equipment.add(weapon);

        System.out.println("personaje " + name + " creado");
    }

    public void addMaterialToEquipment(String material){
        equipment.add(material);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public void setArmor(String armor) {
        this.armor = armor;
    }

    public void setHelmet(String helmet) {
        this.helmet = helmet;
    }

    public void setGloves(String gloves) {
        this.gloves = gloves;
    }

    public void setBoots(String boots) {
        this.boots = boots;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
}
