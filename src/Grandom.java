
import java.util.Random;
public class Grandom{
    
    public int[] randomList;
    
    public Grandom(){
        randomList = new int[2001];
        generarRandom();
    }
    public int[] generarRandom(){
       Random randomGenerator = new Random();
       for (int i = 1; i <= 2000; ++i){
       int randomInt = randomGenerator.nextInt(2000);
       randomList[i] = randomInt;
       }
       return randomList;
    }
   public int[] getGenerarRandom(){
       return randomList;
   }
}