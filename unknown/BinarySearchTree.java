package unknown;

import java.util.*;


class Node {
	  Node left;
	  Node right;
	  int data;
	}

public class BinarySearchTree {
	
	public Node insert(Node node, int val) {
	    if(node == null) {
	      return createNewNode(val);
	    }
	    
	    if(val < node.data) {
	      node.left = insert(node.left, val);
	    } else if((val > node.data)) {
	      node.right = insert(node.right, val);
	    }
	    
	    return node;
	  }
	  
	  public Node createNewNode(int k) {
	    Node a = new Node();
	    a.data = k;
	    a.left = null;
	    a.right = null;
	    return a;
	  }
}

public class BSTApp {

	  public static void main(String[] args) {
		  
		  
		  ArrayList<Integer> freq []= new ArrayList[5];
		  
		  for(int i = 0 ; i< 5; i++) {
			  freq[i] = new ArrayList<>();
		  }
	    
	  }
}