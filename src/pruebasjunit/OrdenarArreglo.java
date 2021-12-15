
package pruebasjunit;

import java.util.Arrays;

public class OrdenarArreglo{

    public OrdenarArreglo() {
    }
        
    public static void MergeSort(int vec[]){
        if(vec.length<=1){
            return;
        }
        
        int mitad= vec.length/2;
        int izq[]=Arrays.copyOfRange(vec, 0, mitad);
        int der[]=Arrays.copyOfRange(vec, mitad, vec.length);
        MergeSort(izq);
        MergeSort(der);       
        merge(vec, izq, der);
    }
        
    public static void merge(int v[], int izq[],int der[]){
        int i=0;
        int j=0;
        for(int k=0;k<v.length;k++){
            if(i>=izq.length){
                    v[k]=der[j];
                    j++;
                    continue;
            }
            if(j>=der.length){
                    v[k]=izq[i];
                    i++;
                    continue;
            }
            if(izq[i]<der[j]){
                    v[k]=izq[i];
                    i++;
            }else{
                    v[k]=der[j];
                    j++;
            }
        }
    }
    
    public static void imprimirVector(int vec[]){
        for(int i=0;i<vec.length;i++){
            System.out.print(vec[i]+" ");
        }
    }
    
    public static int[] BubbleSort(int[] vector){
        int i, j, aux;
        for (i=0; i<vector.length-1; i++) {
            for (j=0; j<vector.length-i - 1; j++) {
                if (vector[j+1] < vector[j]) {
                    aux = vector[j+1];
                    vector[j+1] = vector[j];
                    vector[j] = aux;
                }
            }
        }
        return vector;
    }
}
