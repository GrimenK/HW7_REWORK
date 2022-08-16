package listTask;

import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ListHandler {
    private List<String> wordsList;
    private Logger logger;

    public ListHandler(Logger logger){
        wordsList = new ArrayList<>();
        this.logger = logger;
    }

    public ListHandler handleUserInput(){
        logger.info("Please start your input: \n");
        Scanner scanner = new Scanner(System.in);
        while (true){
            String line = scanner.nextLine();
            if(scanner.nextLine().toLowerCase().equals("break")){
                break;
            }
            wordsList.add(line);
        }
        return this;
    }

    public ListHandler printUserInput(){
        logger.info("This is all user input: \n");
        for (String word: wordsList
        ) {
            System.out.println(word);
        }
        return this;
    }

    public ListHandler printWordsThatStartsWithLetter(char letter){
        logger.info("Words that start with specified letter: \n");
        for (String word : wordsList
        ) {
            if (word.charAt(0) == letter) {
                System.out.println(word);
            }
        }
        return this;
    }

    public ListHandler printWordsThatHaveLengthMoreThan(int length){
        logger.info("Words that have length more that specified: \n");
        for (String word : wordsList
        ) {
            if (word.length() > length) {
                System.out.println(word);
            }
        }
        return this;
    }
}
