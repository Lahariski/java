public class genericmethod {
    public static <T> void printarray(T[] array){
        for(T ele:array){
            System.out.println(ele+" ");
        }
    }
    public static void main(String[] args) {
        Integer[] inta={1,2,3,4};
        printarray(inta);
    }
}
