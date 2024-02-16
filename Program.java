import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Program {
public int removeElement(int[] nums, int val) {
        //iterate through array , if k is found swap with last element.
        // if element we are swapping with is already k, move pointer to left until value is not k.
        int pointer=nums.length-1;
        
        for(int i=0;i<pointer;i++){
            while(nums[pointer]==val && pointer>0){
                pointer--;
            }
            if(nums[i]==val && i<pointer){
                //swap
                int temp=nums[i];
                nums[i]=nums[pointer];
                nums[pointer]=temp;                
            }
        }
        if(nums[pointer]==val){
            pointer--;
        }
        System.out.println(pointer+1);
        return pointer+1;
    }
    public static void main(String[] args) {
        
        Program p=new Program();
        p.removeElement(new int[]{2,2,3}, 2);
    }
}