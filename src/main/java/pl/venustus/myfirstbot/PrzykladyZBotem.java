package pl.venustus.myfirstbot;

import java.awt.AWTException;
import java.io.IOException;
import java.awt.Robot; 
import java.awt.event.KeyEvent;
import java.util.Random;


public class PrzykladyZBotem {
    public static void main(String[] args) throws IOException, AWTException {
        String nazwa = "notepad.exe";
        Runtime run = Runtime.getRuntime();
        run.exec(nazwa);
        Robot robot = new Robot();
        robot.setAutoDelay(500);
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
        robot.keyPress(KeyEvent.VK_M); 
        Random r = new Random();
        for (int i=0; i<10; i++){
            robot.mouseMove(r.nextInt(1200),r.nextInt(800));
        }
    }
}
