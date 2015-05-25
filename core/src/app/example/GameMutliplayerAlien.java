package app.example;
import model.ModelManager;
import app.OpenRTSApplication;

public class GameMutliplayerAlien extends Game {

	protected static String mapfilename = "assets/maps/map01.json";

	public static void main(String[] args) {

		if (args.length > 0) {
			mapfilename = args[0];
		}

		GameMutliplayerAlien app = new GameMutliplayerAlien();
		OpenRTSApplication.main(app);
		app.startClient();
	}

	@Override
	public void simpleInitApp() {
		super.simpleInitApp();

		if (!mapfilename.isEmpty()) {
			ModelManager.loadBattlefield(mapfilename);
			faction = ModelManager.getBattlefield().getEngagement().getFactions().get(1);
		}
	}
}
