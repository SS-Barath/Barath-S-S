Get the total count of number listed in the dictionary which is multiple of [1,2,3,4,5,6,7,8,9]
  (examples)
  Input: [1,2,8,9,12,46,76,82,15,20,30]
  Output: 
    {1: 11, 2: 8, 3: 4, 4: 4, 5: 3, 6: 2, 7: 0, 8: 1, 9: 1}

Program:

import java.util.*;

class MultiplesCount{
    public static void main(String args[]){
        
        int[] arr = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};
        
        Map<Integer, Integer> countMap = new LinkedHashMap<>();
        
        for(int i=1;i<=9;i++){
            countMap.put(i,0);
        }
        
        for(int num : arr){
            for(int i=1;i<=9;i++){
                if(num % i == 0){
                    countMap.put(i,countMap.get(i) + 1);
                }
            }
        }
        
        System.out.print(countMap);
    }
}
