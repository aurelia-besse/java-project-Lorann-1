package contract;
/**
 *<b>The Interface IDoor.</b> 
 * @author Arthur
 * @version 16.06.2016
 */
public interface IDoor {

	public DoorState getDoorState();
	/**
	 *Updates the door state 
	 * @param doorstate
	 * 				It's a DoorState
	 */
	public void setDoorState(DoorState doorState);
}