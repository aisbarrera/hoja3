
import java.util.Arrays;
public class main {
    public static void main(String[] args){
        Grandom lisdes = new Grandom();
        MergeSort lista = new MergeSort(lisdes.generarRandom());
        System.out.println(Arrays.toString(lista.getNumbers()));
    }
    
}
