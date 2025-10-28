public class App {
    public static void main(String[] args) throws Exception {
       ///5,0,-1,4,9,6,-5,9,5
       int[] numeros = new int[]{5,0,-1,4,9,6,-5,9,5};
       SortShell shell = new SortShell();
       View view = new View();

       System.out.println("Original: ");
       view.printArray(numeros);
       shell.sort(numeros, false);
       System.out.println("Ordenado: ");
       view.printArray(numeros);
    }
}
