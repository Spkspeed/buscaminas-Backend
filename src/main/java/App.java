import service.Alimento;
import service.CreatingNewCharacter;
import service.Game;

public class App {
    public static void main(String[] args) {
        CreatingNewCharacter spkspeed = new CreatingNewCharacter("spkspeed");
        Game game = new Game();
        Alimento alimento = new Alimento();

        spkspeed.addMaterialToEquipment(alimento.getWater());
        spkspeed.addMaterialToEquipment(alimento.getMeet());

        game.saveCharacter();
    }
}
