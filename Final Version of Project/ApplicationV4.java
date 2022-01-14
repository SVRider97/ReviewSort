import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Scanner;


public class ApplicationV4 {

// Using Bubble sort algorithm 
//Aggregation, the BubbleSort class is a static inner class
static class BubbleSort{
    void bubbleSort(ArrayList<Reviewer> bbb){     
      String a;
      String b;
      Reviewer c;
      Reviewer d;
      for (int i=0; i< bbb.size(); i++){
         for(int j=i; j< bbb.size()-1; j++){
            a = bbb.get(i).getRating();
            b = bbb.get(j+1).getRating();
            c = bbb.get(i);
            d = bbb.get(j+1);
   
            if ( a.compareTo(b) > 0 )  { 
                Reviewer temp = d;
                bbb.set(j+1, c);        
                bbb.set(i, temp); 
           }
        }
  }
  for(Reviewer reviewer: bbb){
      System.out.println(reviewer.getName() + " " + reviewer.getRating());
  }
}
}


public static void main(String [] args) throws FileNotFoundException {
// read all person details from file.
 ArrayList<Reviewer> reviewerList = new ArrayList<>();
 List<Integer> RatingList = new ArrayList<>();
 try {
      //If the file not found the "File not found" exception thrown, then caught in polymorphic catch
      //File input
      Scanner scanner = new Scanner(new File("first.txt"));
      
      while (scanner.hasNextLine()) {
      String line = scanner.nextLine();
      String [] parts = line.split("\t");
      if(parts.length != 4) {
      //invalid input from file. throw runtime exception.
         throw new RuntimeException();
      }
      RatingList.add((Integer.parseInt(parts[3])));
      reviewerList.add(new Guest(parts[0], parts[1], parts[2], parts[3]));
      //Do quicksort (by reviewer name in alphabetical order)
      }
      System.out.println(RatingList);
      System.out.println(reviewerList);
      //Do bubblesort (by rating)
      BubbleSort BubbleObject = new BubbleSort();
      BubbleObject.bubbleSort(reviewerList);
      QuickSort QuickObject = new QuickSort();
      ArrayList<Reviewer>test = QuickObject.quickSort(reviewerList);
      //output
      System.out.println("\n");
      for(Reviewer reviwer: test){
      System.out.println(reviwer.getName() + " " + reviwer.getRating());          
      }
 
       //Push ratings into stack data structure
      Stack<Integer> ratingStack = new Stack<Integer>();
      int intArray[];
      intArray = new int[10];
      //this will populate the stack 
       for(int i = 0; i < RatingList.size(); i++)
        {
            ratingStack.push(RatingList.get(i));
        }
       //Pop from the stack and print
        for(int i = 0; i < RatingList.size(); i++)
        {
            Integer y = (Integer) ratingStack.pop();
            intArray[i] = y;
            System.out.println(y);
        }
   //Linear search will return position in IntArray of the number that is passed by parameter, in this case 3
   int result = search(intArray, 3);
   System.out.println(result);
   //polymorphic catch block to catch both "file not found" and the runtime exceptions
   //output
   } catch (Exception e) {
      System.out.println("polymorphic catch block");
      System.out.println(e.toString());
}
}
//This is the method that performs linear search 
//This is a static method
 public static int search(int arr[], int x)
    {
        int n = arr.length;
        for (int i = 0; i < n; i++)
        {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }
}

// Person interface to represent all the people
interface Person {
String getName();
String getGender();
String getRating();
}



//Quicksort algorithm
class QuickSort{
    ArrayList<Reviewer> quickSort(ArrayList<Reviewer> qqq){
    if (qqq.size() <= 1) 
        return qqq; // Already sorted  

    ArrayList<Reviewer> sorted = new ArrayList<Reviewer>();
    ArrayList<Reviewer> lesser = new ArrayList<Reviewer>();
    ArrayList<Reviewer> greater = new ArrayList<Reviewer>();
    Reviewer pivot = qqq.get(qqq.size()-1); // Use last reviewer as pivot
    for (int i = 0; i < qqq.size()-1; i++)
    {
        //int order = list.get(i).compareTo(pivot);
        if (qqq.get(i).getName().compareTo(pivot.getName()) < 0)
            lesser.add(qqq.get(i));    
        else
            greater.add(qqq.get(i));   
    }

    //recursive, calling itself
    lesser = quickSort(lesser);
    greater = quickSort(greater);

    lesser.add(pivot);
    lesser.addAll(greater);
    sorted = lesser;

    return sorted;
}
}



