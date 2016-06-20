package contract;
/**
 *<b>The Interface IDoor.</b> 
 * @author Arthur
 * @version 20.06.2016
 */
public interface IDoor {

	public DoorState getDoorState();
	/**
	 * 
	 * @param doorstate
	 * 				Updates the doorstate
	 */
	public void setDoorState(DoorState doorstate);
}