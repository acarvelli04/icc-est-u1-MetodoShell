public class SortShell {

    public SortShell(){
        System.out.println("-----Metodo Shell-----");
    }

    public void sort(int[] numeros,boolean ase){
        int n = numeros.length;
        int cambios = 1;
        // 1I -> gap = 4
        // Insersion
        for (int gap = n/2; gap>=1; gap/=2) {
            cambios++;
            // 1I -> gap = 4
            // Insersion
            //Boolean cambio=false;
            for (int i = gap; i < n; i++) {
                cambios++;
                int temp = numeros[i];
                int j = i;
                while (j >= gap && numeros[j-gap] > temp) {
                    numeros[j]= numeros[j - gap];
                    j-=gap;
                    
                    //cambio=true;
                }
                numeros[j] = temp;
                cambios++;
            }
        }
        System.out.println("Cambios:" + cambios);
        
    }
}
