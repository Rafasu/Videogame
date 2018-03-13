public class GameStateFactory
{
	private static GameStateFactory factory; 
	
	public static GameStateFactory getInstance() {
		if(factory == null) {
		    factory = new GameStateFactory();
		}
		return factory;
	}
	
	public GameState getState(int index, GameStateContext gsc) {

		switch(index)
		{
		case 1: return new GameStateLoad(gsc);
		case 2: return new GameStateJugar(gsc);
		case 3: return new GameStateEnd(gsc);
		case 4: return new GameStatePausa(gsc);
		case 5: return new GameStateFinalizado(gsc);
		default : break;
		}
		
		return null;
	}

}