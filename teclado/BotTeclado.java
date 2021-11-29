package teclado;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class BotTeclado {

	public static void main(String[] args) {

		try {
			Robot robo = new Robot();
			
			robo.setAutoDelay(500);
			robo.delay(2000);
			
			robo.keyPress(KeyEvent.VK_S);
			robo.keyRelease(KeyEvent.VK_S);
			
			robo.keyPress(KeyEvent.VK_E);
			robo.keyRelease(KeyEvent.VK_E);
			
			robo.keyPress(KeyEvent.VK_G);
			robo.keyRelease(KeyEvent.VK_G);
			
			robo.keyPress(KeyEvent.VK_A);
			robo.keyRelease(KeyEvent.VK_A);
			
			robo.keyPress(KeyEvent.VK_4);
			robo.keyRelease(KeyEvent.VK_4);
		
		} catch (AWTException e) {
			e.printStackTrace();
		}
			}
}
