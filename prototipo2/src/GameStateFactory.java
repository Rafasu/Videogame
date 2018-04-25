public class GameStateFactory {
	private static GameStateFactory factory;

	public static GameStateFactory getInstance() {
		if (factory == null) {
			factory = new GameStateFactory();
		}
		return factory;
	}

	public GameState getState(int index) {

		switch (index) {
		case 1:
			return new GameStateLoad();
		case 2:
			return new GameStateJugar();
		case 3:
			return new GameStateEnd();
		case 4:
			return new GameStatePausa();
		case 5:
			return new GameStateFinalizado();
		default:
			break;
		}

		return null;
	}

}