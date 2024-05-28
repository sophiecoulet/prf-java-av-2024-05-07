import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MyPojo {

    private String nom;

    


    public MyPojo(String nom) {
        this.nom = nom;
    }




    public static void main(String[] args) throws JsonProcessingException {
        MyPojo myPojo = new MyPojo("toto"); 
        ObjectMapper mapper = new ObjectMapper();
        String jsonString = mapper.writeValueAsString(myPojo);
        System.out.println(jsonString);
    }




    public String getNom() {
        return nom;
    }
}
