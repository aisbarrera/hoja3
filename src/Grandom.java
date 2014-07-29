//****************************************************************
// Autores: Andrea Barrera Carne: 13655 Otto Wantland Carne: 13663 Diego Rodriguez Carne: 13111
// Seccion: 20
//Fecha 29/7/14
// Nombre de Archivo: Grandom.java
// Breve Descripcion: Genera una lista de 2000 numeros random
//*****************************************************************
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
/*fuente: http://www.javapractices.com/topic/TopicAction.do?Id=62 */