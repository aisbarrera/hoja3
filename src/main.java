
import java.util.Arrays;
public class main {
    public static void main(String[] args){
        Grandom lisdes = new Grandom();
        BubbleSort lista = new BubbleSort(lisdes.generarRandom());
        System.out.println(Arrays.toString(lista.getBubbleSort()));
    }
    
}
