/* This is a stub for the House class */
import java.util.ArrayList;
public class House extends Building{
  private ArrayList<Student> residents;
  private boolean hasDiningRoom;
  // Constructor
  public House(String name, String address, int nFloors, boolean hasDiningRoom) {
    super(name, address,nFloors); // Call the constructor of the Building class
    this.residents = new ArrayList<Student>();
    this.hasDiningRoom = hasDiningRoom;
    System.out.println("You have built a house: 🏠");

  }
  public static void main(String[] args) {
    House Baabuur = new House("Baabuur", "4463 Laagbarako  st", 01, true);
    Student Abdule = new Student("Abdule", "4463 Laagbarako st", 01);
    Student Hibaaq = new Student("Hibaaq", "4463 Laagbarako st", 01);

    Baabuur.moveIn(Abdule);
    Baabuur.moveOut(Hibaaq);

    System.out.println("Number of residents" + "  " + Baabuur.nResidents());
    System.out.println("is there a dining? " + Baabuur.hasDiningRoom());
    System.out.println("is Hibaaq a resident ?");
    Baabuur.moveOut(Hibaaq);
  }

//accessor method to check if house has a dining room
  public boolean hasDiningRoom() {
    return this.hasDiningRoom;
  }
//accessor method for the number of residents
  public int nResidents() {
    return this.residents.size();
  }
// move students into the house
  public void moveIn(Student s) {
    if(!residents.contains(s)){
      residents.add(s);
      System.out.println(s.getName() + " has moved into " + this.getName());
    }else{
      System.out.println(s.getName() + " is a resident of " + this.getName());
    }
  }
// move students out of the house
  public Student moveOut(Student s){
    if(residents.contains(s)){
      residents.remove(s);
      System.out.println(s.getName() + " has moved out of " + this.getName());
      return s;
    }
    else{
      System.out.println(s.getName() + " is not a resident of " + this.getName());
      return null;
    }
  }
// method to check if a student is a resident
  public boolean isResident(Student s) {
    return residents.contains(s);
  }

}


  
