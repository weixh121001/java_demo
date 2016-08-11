package tree;

import java.util.LinkedList;

public class treenode { 
	 
	String data;  
	treenode parent;  
	LinkedList<treenode> childlist;  
	     
	treenode()  
	{  
	    data = null;  
	    childlist = new LinkedList();  
	    parent = null;  
	}  

	private static void displaytree(treenode f, int level) {   
           	
    	String preStr = "";  
        for(int i=0; i<level; i++) {  
          preStr += "    ";  
        }  
      
        for(int i=0; i<f.childlist.size(); i++) {  
           treenode t = f.childlist.get(i);  
           System.out.println(preStr + "-"+t.data);  
            
            if(! t.childlist.isEmpty()) {  
              displaytree(t, level + 1);  
          	}  
       	}  
	}
}

