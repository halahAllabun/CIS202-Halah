class Node {
    int variable;
    Node nextNode;

    Node(int num) {
        variable = num;
        nextNode = null;
    }
}

class Stack{
    Node topNode;

    public Node peek(){
        if(topNode != null){
            return topNode;
        }
        return null;
    }
    public boolean isEmpty () {
        return topNode == null;
    }
    public Node pop(){
        if(topNode == null){
            return null;
        }
        else{
            Node temp = new Node(topNode.variable);
            topNode = topNode.nextNode;
            return temp;
        }
    }
    public void push(Node node){
        if(node != null){
            node.nextNode = topNode;
            topNode = node;
        }
    }
}

class Queue{
    Node firstNode;
    Node lastNode;
    
    public void enqueue(Node node){
        if(firstNode == null){
            firstNode = node;
            lastNode = firstNode;
        }
        else{
            lastNode.nextNode = node;
            lastNode = node;
        }
    }

    public boolean isEmpty () {
        return firstNode == null && lastNode == null;
    }

    public Node dequeue(){
        if(firstNode == null){
            return null;
        }
        else{
            Node temp = new Node(firstNode.variable);
            firstNode = firstNode.nextNode;
            return temp;
        }
    }
}
