/* This is a stub for the Library class */

import java.util.Hashtable;
import java.util.ArrayList;

class Library extends Building {
  private Hashtable<String, Boolean> collection;

  public Library(String name, String address, int nFloors) {
      super(name, address, nFloors);
      this.collection = new Hashtable<String, Boolean>();
      System.out.println("You have built a library: 📖");
    }
    // add books
    public void addTitle(String title){
      collection.put(title, true);
      System.out.println(title + " has been added");

    }
    // remove books
    public String removeTitle(String title){
      return collection.remove(title) != null ? title + " has been removed, and isnt in the collection": null;
    }
// check out books
    public void checkOut(String title){
      if(Boolean.TRUE.equals(collection.get(title))){
        collection.replace(title, false);
        System.out.println(title + " has been checked");
      }else{
        System.out.println(title + "Not available");
      }
    }
//return books
    public void returnBook(String title){
      if(collection.containsKey(title)){
        collection.replace(title, true);
        System.out.println(title + "returned");

      }else{
        System.out.println(title + "Not in the collection");
      }
    }
  
    public static void main(String[] args) {
     Library Gabiley = new Library("Gabiley", "21 Laagbarako  st", 2);
      Gabiley.addTitle("The Maktabad");
      Gabiley.addTitle("Java floor2");
    }
  
  }