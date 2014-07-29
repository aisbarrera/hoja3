public class InsertionSort
{		
	private int[] data;
	private int [] helper;
	private int number;
	
	public InsertionSort(int [] randomList)
	{
		this.data = randomList;
		number = randomList.length;
		insertion(data, number);
	}
	//Metodos
	public static void insertion(int data[], int n)
	{
		
		int numSorted = 1;      // number of values in place
        int index;              // general index
        while (numSorted < n)
        {
        	// take the first unsorted value
        	int temp = data[numSorted];
        	// ...and insert it among the sorted:
        	for (index = numSorted; index > 0; index--)
        	{
        	    if (temp < data[index-1])
        	    {
        	        data[index] = data[index-1];
        	    } else {
        	break; }
        	}
        	// reinsert value
        	data[index] = temp;
        	numSorted++;
        }
	}
	
	public int[] getData()
	{
		return data;
	}
}