import java.util.*;

public class Main {

    final static Random random = new Random();
    public static void main(String[] args) throws Exception {
        Collection test1 = new ArrayList();
        initCollectionInt(test1);
        print(test1);
        Collection testRemove = removeDuplicates(test1);
        print(testRemove);
    }

    private static Collection removeDuplicates(Collection<?> collection) throws Exception{
        Class<?> implClass = collection.getClass();
        Collection returnColl = (Collection)implClass.getDeclaredConstructor().newInstance();
        for (Object o: collection){
            if (!returnColl.contains(o)){
                returnColl.add(o);
            }
        }
        return returnColl;
    }
    private static void print(Collection collection) {
        System.out.println();
        for (Object o : collection){
            System.out.print( " "+o.toString());
        }
        System.out.println();
    }

    private static void initCollectionInt(Collection collection) {
        for (int i = 0; i < 10; i++) {
            collection.add(random.nextInt(6));
        }
    }
}
