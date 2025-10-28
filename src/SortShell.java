public class SortShell {

    public SortShell(){
        System.out.println("-----Metodo Shell-----");
    }

    public void sort(int[] numeros,boolean ase){
        int n = numeros.length;
        // 1I -> gap = 4
        // Insersion
        for (int gap = n/2; gap>=1; gap/=2) {
            // 1I -> gap = 4
            // Insersion
            int cambios = 0;
            for (int i = gap; i < n; i++) {
                int temp = numeros[i];
                int j = i;
                while (j >= gap && numeros[j-gap] > temp) {
                    numeros[j]= numeros[j - gap];
                    j-=gap;
                    cambios++;
                }
                numeros[j] = temp;
            }
        }
    }
}
