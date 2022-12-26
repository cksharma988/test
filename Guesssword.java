import java.util.*;                      //random stting match from user
class GenerateStr {
    String word(){
    String []movies = {"jeene nahi dunga","ddlj","indian","kgf2","pk"};
    
    Random obj= new Random();
    int index = obj.nextInt(movies.length-1);
    String word=movies[index];
    System.out.println(word);
    return word;
}
void check(){
    String word=word();
    System.out.println("guess the bollywood movie ! length");
}
public class Guesssword { 
    GenerateStr obj=new GenerateStr();
    String name=obj.word();               

    
    
 }
}
