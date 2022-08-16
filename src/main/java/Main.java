import listTask.ListHandler;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Main {
    public static Logger logger = LogManager.getLogger(Main.class);
    
    public static void main(String[] args) {

        ListHandler listHandler = new ListHandler(logger);
        listHandler.handleUserInput();
        listHandler
                .printUserInput()
                .printWordsThatStartsWithLetter('s')
                .printWordsThatHaveLengthMoreThan(3);
    }
}
