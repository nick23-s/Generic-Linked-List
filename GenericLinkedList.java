/**
 * Represents a generic class for a linked list.
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

public class GenericLinkedList <E> {
    private GenericNode<E> head;
    private GenericNode<E> tail;

    public GenericLinkedList() {
        head = null;
        tail = null;
    }

    public GenericNode<E> getHead() {
        return head;
    }

    public GenericNode<E> getTail() {
        return tail;
    }

    public void setHead(GenericNode<E> head) {
        this.head = head;
    }

    public void setTail(GenericNode<E> tail) {
        this.tail = tail;
    }

    // Method to add a new element to the list
    public void add(E nodeVal) {
        GenericNode<E> newNode = new GenericNode<E>(nodeVal);
        if (head == null) {
            head = newNode;
        } else {
            tail.setNextNode(newNode);
        }
        tail = newNode;
    }

    // Method to remove and return the first element from the list
    public E remove() throws EmptyListException {
        if (head == null) {
            throw new EmptyListException();
        }

        E nodeVal = head.getNodeVal();
        head = head.getNextNode();
        if (head == null) {
            tail = null;
        }
        return nodeVal;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        GenericNode<E> currentNode = head;
        while (currentNode != null) {
            sb.append(currentNode.getNodeVal()).append(" ");
            currentNode = currentNode.getNextNode();
        }
        return sb.toString().trim();
    }
}
