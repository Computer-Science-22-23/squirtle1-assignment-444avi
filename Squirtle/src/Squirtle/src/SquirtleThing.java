
public class SquirtleThing extends PokeThing {

	int squaresMoved = 0;

	
	/**
	 * SquirtleThing Constructor
	 * Creates a new <code>SquirtleThing</code> object.
	 * Associated graphics file will be squirtle.png
	 */
	public SquirtleThing()
	{
		super("Squirtle", "", 0);	
		setImageFileType(IMAGETYPE_PNG);
	}
	
	
	/**
	 * step method -- this method is called over and over
	 * <code>SquirtleThing</code> moves in a pattern and prints how far it has gone
	 */	
	public void step()
	{
		movementPattern();
		
		Gui g = getBoard().getGui();
		squaresMoved = squaresMoved + 1;
		g.appendTextWindow("Squirtle made " + squaresMoved + " move(s).");
	}
	
	
	/**
	 * movement in a repeating pattern
	 * <code>SquirtleThing</code> turns right if it is blocked or encounters a wall
	 */	
	public void movementPattern()
	{
		// Check the 'next' Location.  If there is a PokeThing or wall there, turn.
		boolean blocked;
		boolean stuck;
		boolean flower = false;
		
			
		Gui g = getBoard().getGui();
		
		Location nextLoc = getDirection().getNextLocation(getLocation()); 
		blocked = getBoard().thingAt(nextLoc) instanceof PokeThing;
		stuck = !(nextLoc.isValid(getBoard()));
		flower = getBoard().thingAt(nextLoc) instanceof FlowerThing;
		if (stuck)
		{
			setDirection(getDirection().left());
		}
		if (blocked)
		{
	
			g.appendTextWindow("I refuse to move.");
		}
			
		if (flower = true)
		{
			g.appendTextWindow("");
		}
		move();
	}
}
