import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class phonebook{
    public static void main(String[] args) {
        Hashtable<String,String> phonebook=new Hashtable<>();
        try(BufferedReader br=new BufferedReader(new FileReader("contacts.txt"))){
            String line;
            while(((line=br.readLine())!=null)){
                String[] field=line.split("\t");
                if(field.length==2){
                    String name=field[0];
                    String ph=field[1];
                    phonebook.put(name,ph);
                    phonebook.put(ph,ph);
                }
            }
        }catch(IOException e){
            System.out.println("cant print"+e.getMessage());
            return;
            
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name or phone number: ");
        String input = scanner.nextLine();
        if (phonebook.containsKey(input)) {
            System.out.println("Result: " + phonebook.get(input));
        } else {
            System.out.println("No match found.");
        }
    }
}