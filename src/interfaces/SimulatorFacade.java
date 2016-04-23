package interfaces;

import enums.LogType;
import model.CoolSemaphore;

/**
 * Contains all the methods that must be visible by the classes that uses the simulator.
 * @author ajeferson
 * */
public interface SimulatorFacade {

	/**
	 * Returns the process on a given index.
	 * */
	public Process processAtIndex(int index);
	
	/**
	 * Give access to the mutex semaphore.
	 * */
	public CoolSemaphore getMutex();
	
	/**
	 * Writes on a log.
	 * @param logType Specifies in which log to write.
	 * @param text The text to append on the log.
	 * */
	public void log(LogType logType, String text);
	
}
