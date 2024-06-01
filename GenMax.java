/**
 * Provides method to find the maximum element in a linked list.
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
public class GenMax {
    public static <E extends Comparable<E>> E max(GenericLinkedList<E> list) throws EmptyListException{
        if(list.getHead() == null){
            throw new EmptyListException();
        }

        GenericLinkedList<E> tempList = new GenericLinkedList<E>();
        GenericNode<E> currentNode = list.getHead();

        while (currentNode != null){
            tempList.add(currentNode.getNodeVal());
            currentNode = currentNode.getNextNode();
        }

        E maxVal = tempList.remove();
        while (tempList.getHead() != null){
            E nodeVal = tempList.remove();
            if (maxVal.compareTo(nodeVal) > 0){
                maxVal = nodeVal;
            }
        }
        return maxVal;
    }
}
