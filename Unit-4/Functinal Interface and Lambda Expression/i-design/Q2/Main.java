import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        List <Event> eventList = new ArrayList<Event>();
        System.out.println("Enter the number of events");
        int n=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter event details in CSV(Event Name,Organiser Name ,Event Cost)");
        for(int i=0;i<n;i++){
            String[] S =sc.nextLine().split(",");
            eventList.add(new Event(S[0], S[1],Double.parseDouble(S[2])));
        }

        eventList.forEach(x->System.out.println(x.getEventName()+"|"+x.getOrganiserName()+"|"+x.getEventCost()));
        // Event event = new Event();
        // event.display(eventList);
        
    }
}   
