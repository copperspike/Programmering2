package divUppgifter;

import javafx.scene.paint.Color;

public class LabbV45_Trike extends LabbV45_Car {
	
	public LabbV45_Trike(Color col) {
		color = col;
		health = new Double[] {1.0,1.0,1.0};
	}
	
	@Override
	public void Start() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Turn(int degrees) {
		if (functioning) {
			health[0] -= degrees / 20.0;
			if (health[0] < 0) {
				Crash();
			}
		}
		
	}

	@Override
	public Double[] WheelsQuery() {
		return health;
	}

}
