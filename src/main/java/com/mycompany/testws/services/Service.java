
public class Service {
    
  private static Map<Integer,person> persons=new HashMap<Integer,person>();
    
    static {
       for(int i=0;i<10;i++){
       person person=new person();
       int id=i+1;
       person.setId(id);
       person.setFullName("hi"+id);
       person.setAge(new Random().nextInt(40)+1);
       
       persons.put(id,person);
       
       }
    
    }  
    
}
