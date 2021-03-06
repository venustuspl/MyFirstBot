package pl.venustus.myfirstbot;

import java.awt.AWTException;
import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.awt.Robot; 
import java.awt.event.KeyEvent;
import java.time.LocalDateTime;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Mybot {
    private static final Logger LOGGER = Logger.getLogger( Mybot.class.getName() );
    public static void main(String[] args) throws IOException, AWTException {
        Robot robot = new Robot();

        /*String nazwa = "notepad.exe";
        Runtime run = Runtime.getRuntime();
        run.exec(nazwa);
        robot.setAutoDelay(50);
        robot.keyPress(KeyEvent.VK_J);
        robot.keyPress(KeyEvent.VK_E); 
        robot.keyPress(KeyEvent.VK_S); 
        robot.keyPress(KeyEvent.VK_T); 
        robot.keyPress(KeyEvent.VK_E); 
        robot.keyPress(KeyEvent.VK_M); 
        robot.keyPress(KeyEvent.VK_SPACE); 
        robot.keyPress(KeyEvent.VK_B); 
        robot.keyPress(KeyEvent.VK_O); 
        robot.keyPress(KeyEvent.VK_T); 
        robot.keyPress(KeyEvent.VK_E); 
        robot.keyPress(KeyEvent.VK_M); */
        Random r = new Random();
        for (int i=0; i<10; i++){
            robot.mouseMove(r.nextInt(1200),r.nextInt(800));
            robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
            robot.setAutoDelay(2000);
            System.out.println(i + " " + LocalDateTime.now());
            LOGGER.log( Level.FINE, "processing {0} entries in loop", i);
            LOGGER.log(Level.INFO , " " + i);
        }
    }
}
