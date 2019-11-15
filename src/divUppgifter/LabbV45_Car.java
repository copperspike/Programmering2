package divUppgifter;

import javafx.scene.paint.Color;

public abstract class LabbV45_Car {

	public boolean lights = false;
	public boolean functioning = true;
	public Color color;
	public Double[] health;
	
	/**
	 * Starts the car
	 */
	public abstract void Start();
	
	/**
	 * Turns the car
	 * @param degrees
	 */
	public abstract void Turn(int degrees);
	
	/**
	 * Returns a value 0 - 1 signifying how damaged each of the wheels are
	 * 0 wholly unusable, 1 totally new
	 * @return
	 */
	public abstract Double[] WheelsQuery();
	
	public void ToggleLights() {
		if (!lights && functioning) {
			lights = true;
		} else {
			lights = false;
		}
	}
	
	public void Crash() {
		functioning = false;
	}
	
}
