import service.Alimento;
import service.CreatingNewCharacter;
import service.Game;

public class App {
    public static void main(String[] args) {
        Game game = new Game();
        Alimento alimento = new Alimento();

        CreatingNewCharacter spkspeed = new CreatingNewCharacter("spkspeed");
        CreatingNewCharacter saru = new CreatingNewCharacter("saru");
        CreatingNewCharacter spksaru = new CreatingNewCharacter("spksaru");

        spkspeed.addMaterialToEquipment(alimento.getWater());
        spkspeed.addMaterialToEquipment(alimento.getMeet());
        saru.addMaterialToEquipment(alimento.getMeet());
        spksaru.addMaterialToEquipment(alimento.getWater());

        for(Object looped : spkspeed.equipment){
            System.out.println(looped);
        }


        game.saveCharacter(spkspeed, "spkspeed");
    }
}
