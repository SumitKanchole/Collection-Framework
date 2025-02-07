// 4th assignment (05-02-2025)
import java.util.*;
class Reservation {
    String name;
    int TicketNumber;
    String source;
    String destination;
    int seatNumber;
    public Reservation(int TicketNumber,String name,String source, String destination,int seatNumber){
        this.name=name;
       this.TicketNumber=TicketNumber;
        this.source=source;
        this.destination=destination;
        this.seatNumber=seatNumber;
    }
    public String toString(){
        return "Railway Reservation : Passanger [Ticket Number : "+TicketNumber+" , Name : "+name+" , Source : "+source+" , Destination :"+destination+" , Seat Allocation : "+seatNumber+"]";
    }
}
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList <Reservation> l= new LinkedList <Reservation> ();
        String choice="";
        do{
        System.out.println("Enter Ticket Number : ");
        int TicketNumber = Integer.parseInt(sc.nextLine());
         System.out.println("Enter Passanger Name : ");
        String name = sc.nextLine();
        System.out.println("Enter available source: ");
        String source = sc.nextLine();
        System.out.println("Enter your Destination : ");
        String destination = sc.nextLine();
     
       System.out.println("Enter Seat Number : ");
        int seatNumber = Integer.parseInt(sc.nextLine());
        Reservation reserve = new Reservation(TicketNumber,name,source, destination,seatNumber);
        l.addLast(reserve);
        
       System.out.println("if you want to add new reservation of a passanger, Type...... 'yes'/'no' >>> ");
        choice = sc.nextLine();
    }while(choice.equals("yes"));
    
    
    System.out.println("Enter Ticket Number for cancellation a reservation : ");
    Integer cancel = sc.nextInt();
    
   ArrayList <library> l2 = new ArrayList <library> (l);
    
    Iterator itr = l.iterator();
    while(itr.hasNext()){
        Reservation str = (Reservation)itr.next();
        if(str.TicketNumber==cancel){
            itr.remove();
        }
    }
    System.out.println("Cancelled a reservation, now this is only available : "+l);
    
    System.out.println("All Reservation >>> ");
 for(Reservation lib: l2){
            System.out.println(lib);
        }
     
    
    }
}
