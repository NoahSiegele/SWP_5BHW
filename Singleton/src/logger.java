import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class logger {

	private logger() throws IOException {
		writer = new PrintWriter(new FileWriter("log_file.txt", true));
	}
	
	private static logger instance;
	private PrintWriter writer;
	String output1 = "";
	LogLvl level1;
	
	public static logger getInstance() throws IOException {
		if (instance == null) {
			instance = new logger();
		}
		return instance;
	}
	
	enum LogLvl {
		debug,
		info,
		warning,
		error
	}

	public void log() throws IOException {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		writer.println(sdf.format(cal.getTime()) + output1);
		writer.flush();
	}
	
	public void setOutput(String dataName, String output) throws IOException{
		writer = new PrintWriter(new FileWriter(dataName, true));
		output1 = output;
	}
	
	public void error(String Error) throws IOException{
		logger.getInstance().log1(LogLvl.error, Error);
		
	}
	
	public void debug(String Debug) throws IOException{
		logger.getInstance().log1(LogLvl.debug, Debug);
	}
	
	public void info(String Info) throws IOException{
		logger.getInstance().log1(LogLvl.info, Info);
	}
	
	public void warning(String Warning) throws IOException{
		logger.getInstance().log1(LogLvl.warning, Warning);
	} 

	@Override
	protected void finalize() throws Throwable {
		writer.close();
		super.finalize();
	}
	
	public void log1(LogLvl lvl, String output){
		if (lvl.ordinal() >= LogLvl.error.ordinal() && level1 == LogLvl.error) {
			writer.println(output);
			writer.flush();	
		}
		
		else if (lvl.ordinal() >= LogLvl.debug.ordinal() && level1 == LogLvl.debug) { 
			writer.println(output);
			writer.flush();	
		}
	}
	
	public void setLogLvl(LogLvl lvl){
		level1 = lvl;
	}

	public static void main(String[] args) throws IOException {
		//logger.getInstance().setOutput("test1234", "Hallo 1234");
		//logger.getInstance().log();
		//logger.getInstance().setLogLvl("error");
		logger.getInstance().setLogLvl(LogLvl.error);
		logger.getInstance().info("INFO");
		logger.getInstance().error("ERROR");
		logger.getInstance().info("INFO");
		logger.getInstance().debug("DEBUG");
		logger.getInstance().warning("Warning");

	}

}
