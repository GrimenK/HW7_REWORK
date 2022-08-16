package mapTask;

import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AccountsManager {
    private HashMap<Person, Account> accountsMap;
    private Logger logger;

    public AccountsManager(Logger logger){
        accountsMap = new HashMap();
        this.logger = logger;
    }

    public AccountsManager addAccount(Person person, Account account){
        logger.info("Adding account to person: \n");
        accountsMap.put(person,account);
        return this;
    }

    public AccountsManager deleteAccountFromPerson(Person person){
        logger.info("Deleting account from person: \n");
        accountsMap.put(person,null);
        return this;
    }

    public AccountsManager deletePerson(Person person){
        logger.info("Removing person: \n");
        accountsMap.remove(person);
        return this;
    }

    public AccountsManager printAccounts(){
        logger.info("This is all accounts: \n");
        Set<Map.Entry<Person,Account>> entrySet = accountsMap.entrySet();
        for(Map.Entry<Person,Account> entry : entrySet){
            Person key = entry.getKey();
            Account value = entry.getValue();
            System.out.println(key + " has an: " + value);
        }
        return this;
    }
}
