package collectionsamigoscode.collectorsapiupdate;

import java.util.List;
import java.util.stream.Collectors;

//starting from java 10 with method Collectors.toUnmodifiableList() lists cannot be modified.
public class CollectorsDemo {
    public static void main(String[] args) {
        List<Integer>list=List.of(15,20,17,30);
        List<Integer>newList= list.stream().filter(i->i%3==0)
                .collect(Collectors.toUnmodifiableList());
        newList.add(40);
    }



}
