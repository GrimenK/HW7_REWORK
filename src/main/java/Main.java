import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import setTask.CustomEntity;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ThreadLocalRandom;


public class Main {
    public static Logger logger;
    
    public static void main(String[] args) {
        logger = LogManager.getLogger(Main.class);

//--TASK B--//
        Set<CustomEntity> entitySet = new HashSet<>();
        generateTestEntities(entitySet, 5);

        for (CustomEntity entity: entitySet
        ) {
            System.out.println(entity);
        }

        logger.info("This is sorted set from previous HashSet: \n");
        Set<CustomEntity> sortedEntitySet = new TreeSet<>(Comparator.comparingInt(CustomEntity::getNumberAttribute));
        sortedEntitySet.addAll(entitySet);
        for (CustomEntity entity: sortedEntitySet
        ) {
            System.out.println(entity);
        }
    }

    public static void generateTestEntities(Set<CustomEntity> entitySet, int quantity){
        for (int i =0; i<quantity; i++){
            entitySet.add(new CustomEntity("Entity № " + i, ThreadLocalRandom.current().nextInt(1, Integer.MAX_VALUE)));
        }
    }
}
