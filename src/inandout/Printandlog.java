package inandout;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.XMLFormatter;

public class Printandlog {

	private final static Logger LOGGER = Logger.getLogger(Printandlog.class.getName());
	

	public static void main(String[] args) throws SecurityException, FileNotFoundException, IOException {
		LOGGER.setLevel(Level.INFO);
		Handler chandler = new ConsoleHandler();
		try {
			Handler fhandler = new FileHandler();
			fhandler.setLevel(Level.SEVERE);
		} catch (SecurityException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		chandler.setLevel(Level.SEVERE);
		Formatter sf = new SimpleFormatter();
		Formatter xf = new XMLFormatter();
		LogManager.getLogManager().readConfiguration(new FileInputStream("mylogging.properties"));
		}
}