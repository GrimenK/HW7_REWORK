import mapTask.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static Logger logger;

    public static void main(String[] args) {
        logger = LogManager.getLogger(Main.class);

        List<Person> zooPersonsList = new ArrayList<>();
        List<Animal> animalsList = new ArrayList<>();

        zooPersonsList.add(new Person("Test", "Testovich", 228));
        zooPersonsList.add(new Person("Oleh", "Test1", 12));
        zooPersonsList.add(new Person("Bogdan", "Test2", 11));

        animalsList.add(new Animal("Cat","Tiger"));
        animalsList.add(new Animal("Reptile","Krokodil"));
        animalsList.add(new Animal("Pig","russian"));

        ZooManager zooManager = new ZooManager(logger);
        zooManager
                .addPersonToClub(zooPersonsList.get(2))
                .addAnimalToPerson(animalsList.get(0), zooPersonsList.get(0))
                .addAnimalToPerson(animalsList.get(1), zooPersonsList.get(0))
                .printZooClub()

                .withdrawAnimalFromPerson(animalsList.get(0),zooPersonsList.get(0))
                .printZooClub()

                .removePersonFromZooClub(zooPersonsList.get(2))
                .printZooClub();

        //TASK C
        AccountsManager accountsManager = new AccountsManager(logger);

        List<Person> personList = new ArrayList<>();
        List<Account> accountList = new ArrayList<>();

        personList.add(new Person("Test", "Testovich", 228));
        personList.add(new Person("Oleh", "Test1", 12));
        personList.add(new Person("Bogdan", "Test2", 11));

        accountList.add(new Account("admin", "admin@mail.com", "123456"));
        accountList.add(new Account("admin2", "admin2@mail.com", "abcdefg"));
        accountList.add(new Account("user", "user@mail.com", "123abc"));


        accountsManager
                .addAccount(personList.get(0),accountList.get(0))
                .addAccount(personList.get(1),accountList.get(1))
                .addAccount(personList.get(2),accountList.get(2))

                .printAccounts()
                .deleteAccountFromPerson(personList.get(0))
                .printAccounts()
                .deletePerson(personList.get(2))
                .printAccounts();
    }
}
