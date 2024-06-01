/**
 * Main class to demonstrate the usage of the GenericLinkedList with String elements.
 * This class will get 6 strings from the user,
 * add them to the linked list, and reverse them.
 * Then add a Person objects and determine who is the oldest.
 * 
 * Copyright [2024] [Nick Shteinberg]
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Author: Nick Shteinberg
 * Date: 2024-06-01
 */

import java.time.LocalDate;
import java.util.Scanner;

public class GenLinkedListMain {
    public static void main(String[] args) {

        GenericLinkedList<String> stringList = new GenericLinkedList<String>();
        Scanner scan = new Scanner(System.in);

        // Gets a 6 Strings from the user and adds them into the list
        System.out.println("Please enter 6 strings:");
        for (int i = 0; i < 6; i++){
            stringList.add(scan.nextLine());
        }
        System.out.println("Original list: " + stringList);

        GenericLinkedList<String> reversedList = new GenericLinkedList<String>();
        GenericNode<String> currentNode = stringList.getHead();

        while (currentNode != null) {
            GenericNode<String> newNode = new GenericNode<String>(currentNode.getNodeVal());
            newNode.setNextNode(reversedList.getHead());

            if (reversedList.getHead() == null){
                reversedList.setTail(newNode);
            }

            reversedList.setHead(newNode);
            currentNode = currentNode.getNextNode();
        }
        System.out.println("Reversed list: " + reversedList);

        GenericLinkedList<Person> personList = new GenericLinkedList<Person>();
        personList.add(new Person("Dani", "1111", LocalDate.of(1997, 5, 1)));
        personList.add(new Person("Israel", "2222", LocalDate.of(1980, 2, 25)));
        personList.add(new Person("Noa", "3333", LocalDate.of(1956, 10, 3)));
        personList.add(new Person("Bob", "4444", LocalDate.of(2004, 8, 9)));

        System.out.println("Person list: \n" + personList);
        try {
            Person oldest = GenMax.max(personList);
            System.out.println("Oldest person: \n" + oldest);
        } catch (EmptyListException e){
            e.printStackTrace();
        }
    }
}
