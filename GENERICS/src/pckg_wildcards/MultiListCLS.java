package pckg_wildcards;

import java.util.ArrayList;
import java.util.List;

public class MultiListCLS<E> {

    private final List<E> someList;

    public MultiListCLS(){
        someList = new ArrayList<>();
    }

    public MultiListCLS(List<E> someList) {
        this.someList = someList;
    }

    public void listElementsInList(){
        if(someList.isEmpty()){
            System.out.println("List is empty");
        } else {
            someList.forEach(System.out::println);
        }
    }

    public void addElementToList(E e){
        if(someList.contains(e)){
            System.out.println("Element is already in the list!");
        } else {
            someList.add(e);
            System.out.println("Element added to the list!");
        }
    }

    public void removeElementFromList(E e){
        if(someList.contains(e)){
            someList.remove(e);
            System.out.println("Element removed from list!");
        } else {
            System.out.println("Element is not in the list!");
        }
    }

    public void compareListToList(List<?> list){
        if(someList.size() > list.size()){
            System.out.println("This list is longer than another list");
        } else if (someList.size() < list.size()){
            System.out.println("Another list is longer than this list");
        } else {
            System.out.println("These lists are equal in length!");
        }
    }
}
