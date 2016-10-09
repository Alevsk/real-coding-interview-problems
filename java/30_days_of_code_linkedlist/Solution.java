    public static  Node insert(Node head,int data) {
        if(head == null) {
            head = new Node(data);
        } else {
            Node focusNode = head;
            while(focusNode.next != null) {
                focusNode = focusNode.next;
            }
            focusNode.next = new Node(data);             
        }

        return head; 
    }
