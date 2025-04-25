package method;
 class SmallestArray {
    
    static int smallest_num(int[] array) {
        int smallest_num = array[0]; 
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest_num) {
                smallest_num = array[i]; 
            }
        }
        return smallest_num;
    }

    public static void main(String[] args) {
        int[] array = {0, 1, 2, -3, 4, 5, -10}; 
        System.out.println("Smallest element of array: " + smallest_num(array));
    }
}