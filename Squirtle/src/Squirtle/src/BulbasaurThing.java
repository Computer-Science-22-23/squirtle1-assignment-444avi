
public class BulbasaurThing extends PokeThing {

	/**
	 * Creates a new <code>BulbasaurThing</code> object.
	 * Associated graphics file will be bulbasaur.gif
	 */
	public BulbasaurThing()
	{
		super("Bulbasaur", "", 0);	
	}
	
	
	/**
	 * Place a <code>FlowerThing</code> at the <code>BulbasaurThing</code>'s current <code>Location</code>
	 * The <code>FlowerThing</code> will be placed under the <code>BulbasaurThing</code>
	 */
	
	
	/**
	 * Behavior to occur when the Thing has been clicked on
	 */
	public void mouseClick() 
	{
		Gui g = getBoard().getGui();
		g.appendTextWindow("Bulbasaur has been tickled.");
	}
}
