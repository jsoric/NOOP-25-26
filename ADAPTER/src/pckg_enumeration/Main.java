package pckg_enumeration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String[] someString = {"23", "novo", "vrijeme", "kad", "sad"};
        List<String> list = Arrays.asList(someString);
        Iterator<String> stringIter = list.iterator();
        Client<String> stringClient = new Client<>(stringIter);
        while(stringClient.hasSomeElement()){
            System.out.println(stringClient.getNextElement());
        }

        System.out.println(stringClient.hasSomeElement());
        System.out.println(stringClient.getNextElement());
        EnumerationConcrete<String> enumerationConcrete = new EnumerationConcrete<>();
        EnumerationToIterator<String> enumerationToIterator = new EnumerationToIterator<>(enumerationConcrete);
        Client<String> newStringClient = new Client<>(enumerationToIterator);
        while(newStringClient.hasSomeElement()){
            System.out.println(newStringClient.getNextElement());
        }
        System.out.println(newStringClient.hasSomeElement());
        System.out.println(newStringClient.getNextElement());
        newStringClient.removeElement();


    }
}
