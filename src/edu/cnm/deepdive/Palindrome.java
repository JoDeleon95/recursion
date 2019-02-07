package edu.cnm.deepdive;

public class Palindrome {

  public static boolean test(String candidate) {
    if (candidate.length()<= 1) {
      return true;
    }
    if (candidate.charAt(0)== candidate.charAt(candidate.length()-1)
    && test(candidate.substring(1, candidate.length()-1))){
      return true;
    }
    return false;
  }

}
