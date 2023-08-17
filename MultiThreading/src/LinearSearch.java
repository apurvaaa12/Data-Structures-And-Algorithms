public class LinearSearch {
    public static void main(String[] args){

        //Linear Search: Is used to iterate though a collection one element at a time
        //Runtime complexity: O(n)
        //Disadvantages: Not suitable for large data sets as it is slow
        //Advantages: Suitable for small to medium data sets
                   // Elements need not be sorted
                   // Useful for Data structures that don't have random access(LinkedList)

        int[] array ={3,6,7,2,4,1};
        int index= linearSearch(array,1);
        if(index != -1){
            System.out.println("Element found at index: " +index);
        }
        else{
            System.out.println("Element not found");
        }

    }

    private static int linearSearch(int[] array, int value) {
        for(int i=0;i<array.length;i++){
            if(array[i]==value){
                return i;
            }
        }
        return -1;
    }
}
