/**
 * Represents a node in a generic class for a linked list.
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
public class GenericNode<E>{
    private E nodeVal; // Value of the node
    private GenericNode<E> nextNode; // Reference to the next node

    // Constructor to create a node with a value and no next node
    public GenericNode(E nodeVal){
        this(nodeVal, null);
    }

    // Constructor to create a node with a value and a reference to the next node
    public GenericNode(E nodeVal, GenericNode<E> nextNode){
        this.nodeVal = nodeVal;
        this.nextNode = nextNode;
    }

    public E getNodeVal() {
        return nodeVal;
    }

    public void setNodeVal(E nodeVal) {
        this.nodeVal = nodeVal;
    }

    public GenericNode<E> getNextNode() {
        return nextNode;
    }

    public void setNextNode(GenericNode<E> nextNode) {
        this.nextNode = nextNode;
    }
}
