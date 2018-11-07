// We import the Arraylist class to work with the Arraylist.
import java.util.ArrayList;
// We import the ListIteratos class
import java.util.ListIterator;

// We create a class called "ArrayListListIteratorExample". 
public class UnderstandingCode {
	//We create the main class in the class we created before.
  public static void main(String[] args) {
	//We create a new Arraylist.
    ArrayList<String> arrayList = new ArrayList<String>();
    //We add each element of the Arraylist.
    arrayList.add("element_1");
    arrayList.add("element_2");
    arrayList.add("element_3");
    arrayList.add("element_4");
    arrayList.add("element_5");
    //We create an object like a listIterator, to be possible to modify the direction of the list, to modify the list duration...
    ListIterator it = arrayList.listIterator();
    //We create a loop, we go to the next one until the list finishes.
    while(it.hasNext())
    	// We print those elements
         System.out.println(it.next());
    //When the other loop is finished, we create this loop in the other direction.
    while(it.hasPrevious())
    	 // We print those elements
         System.out.println(it.previous());

    // We print to know which is the previous index
    System.out.println("Previous Index is : " + it.previousIndex());   
    // We print to know which is the next index
    System.out.println("Next Index is : " + it.nextIndex());
    // We print to know which is the next element
    System.out.println("Next element is : " + it.next());
    
    System.out.println("Previous Index is : " + it.previousIndex());   
    System.out.println("Next Index is : " + it.nextIndex());

    // We add the sixth element to the list
    it.add("element_6");

    // We create a loop, while i is minor than the arraylist size
    for(int i = 0; i < arrayList.size(); i++)
    	  // We print each element of the arraylist.
          System.out.println(arrayList.get(i));
    
    //We print to know which is the next element of the list
    System.out.println("Next element is : " + it.next());

    // We remove the element of the arraylist
    it.remove();
    //We create a loop, while i is minor to the arraylist size
    for(int i = 0; i < arrayList.size(); i++)
    		// We print each element of the arraylist
            System.out.println(arrayList.get(i));

    //We print to know which is the next element.
    System.out.println("Next element is : " + it.next());
    //We enter the next element in the space we removed
    it.set("element_7");

    //We create a loop, while i is minor to the arraylist size
    for(int i = 0; i < arrayList.size(); i++)
    	   //We print each element of the arraylist
           System.out.println(arrayList.get(i)); 

  }//We close the main class
  
}//We close the public class