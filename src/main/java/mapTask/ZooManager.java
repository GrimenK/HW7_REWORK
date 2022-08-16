package mapTask;

import org.apache.logging.log4j.Logger;

import java.util.*;

public class ZooManager {
    private Map<Person, List<Animal>> animalMap;
    private Logger logger;

    public ZooManager(Logger logger) {
        animalMap = new HashMap<>();
        this.logger = logger;
    }

    public ZooManager addPersonToClub(Person person){
        logger.info("Adding person to ZooClub: " + person);
        if(animalMap.containsKey(person)){
            System.out.println("Person is already in list!!!");
        }
        else {
            animalMap.put(person, new ArrayList<>());
        }
        return this;
    }

    public ZooManager addAnimalToPerson(Animal animal, Person person){
        logger.info("Linking animal to person: " + animal + " + " + person);
        if(!animalMap.containsKey(person)){
            animalMap.put(person, new ArrayList<>());
            animalMap.get(person).add(animal);
        }
        else {
            animalMap.get(person).add(animal);
        }
        return this;
    }

    public ZooManager withdrawAnimalFromPerson (Animal animal, Person person){
        logger.info("Withdrawing animal from person: " + animal + "from" + person);
        animalMap.get(person).remove(animal);
        return this;
    }

    public ZooManager removePersonFromZooClub (Person person){
        logger.info("Remove person from ZooClub: " + person);
        animalMap.remove(person);
        return this;
    }

    public ZooManager printZooClub (){
       logger.info("Printing ZooClub: \n");
        Set<Map.Entry<Person,List<Animal>>> entrySet = animalMap.entrySet();
        for (Map.Entry<Person,List<Animal>> entry : entrySet
        ) {
            System.out.println(entry.getKey() + "Has such animals: " + entry.getValue().toString());
        }
        return this;
    }

    public void exitFromSystem(){
        System.exit(0);
    }
}
