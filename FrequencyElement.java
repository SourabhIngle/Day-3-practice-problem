package com.blz.day3problem;

public class FrequencyElement {
   
        void Frequency(int array[], int fr[], int visited){
            for (int i = 0; i < array.length; i++) {
                int count = 1;
                for(int j=i+1; j< array.length; j++){
                    if(array[i] == array[j]){
                        count++;
                        fr[j] = visited;
                    }
                }
                if(fr[i] != visited){
                    fr[i] = count;
                }
            }
            for(int i=0; i< fr.length; i++){
                if(fr[i] != visited)
                    System.out.println(" " +array[i]+ " || " +fr[i]);
            }
    
        }
        public static void main(String[] args) {
            int[] array = {1, 2, 8, 3, 2, 2, 2, 5, 1};
            int[] fr = new int[array.length];
            int visited = -1;
            FrequencyElement obj = new FrequencyElement();
            obj.Frequency(array,fr,visited);
        }
    }


