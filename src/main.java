
import java.util.Arrays;
public class main {
    public static void main(String[] args){
        Grandom lisdes = new Grandom();
        InsertionSort lista = new InsertionSort(lisdes.generarRandom());
        System.out.println(Arrays.toString(lista.getData()));
    }
    
}
