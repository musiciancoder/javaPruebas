package clonesyhashcode;

import java.util.*;

public class HacerCopiasRapidasDeArraysListsEtcParaOcuparEnEjercicios {

    public static void main(String[] args) {

        //String
        String str1="abc";
        String str2=str1;
        str2="xyz";
        System.out.println(str1); //str1 does not change


        //int
        int int1=1;
        int int2=int1;
        int2 =  2;
        System.out.println(int1); //int1 does not change


        //Integer
        Integer Integer1=1;
        Integer Integer2=Integer1;
        Integer2 =  2;
        System.out.println(Integer1); //Integer1 does not change


        //
        String [] arr1;
        arr1 = new String[]{"1","2","3"};
        String [] arr2 = arr1;
        //arr2 = {"4", "5", "6","7"}; //no se puede !!
        arr2 = new String[]{"4", "5", "6","7"};


        //arraylist
        List<String> stringList = new ArrayList<>();
        stringList.add("andres");
        stringList.add("ibelys");

        List<String> stringList2 = stringList;
        stringList2.add("claudio");
        stringList.forEach(p-> System.out.print(p + " ")); //list1 cambia !!

        System.out.println("");

        List<String> deepCopyList = new ArrayList(stringList);
        deepCopyList.add("elizabeth");
        stringList.forEach(p-> System.out.print(p + " ")); ///list1 NO cambia !!

        System.out.println("");

        //linkedlist
        List<String> stringLinkedlist = new LinkedList<>();
        stringList.add("andres");
        stringList.add("ibelys");

        List<String> stringLinkedlist2 = stringLinkedlist;
        stringList2.add("claudio");
        stringList.forEach(p-> System.out.print(p + " ")); //list1 cambia !!

        System.out.println("");

        List<String> deepCopystringLinkedlist = new ArrayList(stringLinkedlist);
        deepCopyList.add("elizabeth");
        stringList.forEach(p-> System.out.print(p + " ")); ///list1 NO cambia !!

        System.out.println("");

        //hashset

        Set<String> stringSet = new HashSet<>();
        stringSet.add("andres");
        stringSet.add("ibelys");

        Set<String> stringSet2 = stringSet;
        stringSet2.add("claudio");
        stringSet.forEach(p-> System.out.print(p + " ")); //set cambia !!

        System.out.println("");

        Set<String> deepCopySet = new HashSet<>(stringSet);
        deepCopySet.add("elizabeth");
        stringSet.forEach(p-> System.out.print(p + " ")); ///set NO cambia !!





    }
}
