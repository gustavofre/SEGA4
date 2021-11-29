package mouse;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

public class Mouse {

	public static void main(String[] args) {
		
		try {
			Robot robo = new Robot();
			
			robo.setAutoDelay(1000);
			
			//Mover ou mouse (x,y)
			robo.mouseMove(400, 300);
			
			//Mover mais para baixo
			robo.mouseMove(1400, 10);
			
			// Pressionou o botão esquerdo
			robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
				
			//Soltar o botão esquerdo
			robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			
		} catch (AWTException e) {
			e.printStackTrace();
		}
		
	}

}
