import java.util.*;
public class Main{
  public static void main(String[] args){
   Scanner scanner = new Scanner(System.in);
   Set<Integer> available = new LinkedHashSet<>();

   for(int i=1; i<=10; i++){
    available.add(i);
   }

   Map<Integer, String> allocated = new LinkedHashMap<>();

   String choice = scanner.next();

   while(choice.equalsIgnoreCase("y") && !available.isEmpty()){
    System.out.print("Enter customer name : ");
    String name = scanner.next();

    System.out.println("Available rooms : "+available);
    System.out.println("(Odd - Normal room, Even - Premium room)");
      System.out.println("Enter room number (1-10)");
      int room = scanner.nextInt();

      while(!available.contains(room)){
        System.out.println("Not available");
        if(available.isEmpty()) break;
        System.out.print("Please choose another room : ");
        room = scanner.nextInt();
      }

      String type = (room%2 == 0) ? "Premium" : "Normal";
      available.remove(room);

      allocated.put(room, name);
      System.out.println("Room : "+room+" Name : "+name);
      System.out.println("Book another room ? ");
      choice = scanner.next();
    }

    System.out.println("Final Bookings : "+allocated);
    System.out.println("Rooms available so far : "+available);
   }
  }
