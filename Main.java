import java.util.*;
class Main {
  
    //1. Two Sum: Given an array of integers, return indices of the two numbers such that they add up to a specific target. You may assume that each input would have exactly one solution, and you may not use the same element twice.

    //     (What if there are duplicates?) :) 
  public static int[] TwoSum(int[] array, int target){
    Map<Integer, Integer> values = new HashMap<Integer,Integer>();
    for(int i = 0; i < array.length; i++){
      values.put(array[i],i);
    }
    int indexOne = 0;
    int indexTwo = 0;
    int complement = 0;
    for (int i = 0;i < array.length; i++){
      complement = target - array[i];
      if (values.containsKey(complement) && complement != array[i]){
        indexOne = values.get(array[i]);
        indexTwo = values.get(complement);
      }
    }
    int[] arrayIndices = new int[2];
    arrayIndices[0] = indexOne;
    arrayIndices[1] = indexTwo;
    return arrayIndices;
  }

//2. Valid Palindrome: Given a string, write a program that returns a boolean indicating whether or not it is a palindrome. (Ignore spaces in the string) 

 //         (Try this without using extra space). Hint:   .toCharArray();
 public static Boolean isPalindrome(String string){
   return true;
 }


 public static void main(String[] args) {


  }
}