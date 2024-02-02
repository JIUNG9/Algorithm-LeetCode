package com.algo;

import java.util.Stack;

public class PalindromeNumber {

  private final Stack<Character> inOrderStack = new Stack<>();
  private final Stack<Character> reverseOrderStack = new Stack<>();


  public boolean isPalindrome(int x) {
    String numberString = String.valueOf(x);
    int len = numberString.length();
    setStack(numberString);

    for (int i = 0; i < len; i++) {
      if (!inOrderStack.pop().equals(reverseOrderStack.pop())) {
        return false;
      }
    }
    return true;

  }

  public void setStack(String numberString) {
    int len = numberString.length();
    for (int i = 0; i < len; i++) {
      inOrderStack.push(numberString.charAt(i));
    }
    for (int j = len - 1; j >= 0; j--) {
      reverseOrderStack.push(numberString.charAt(j));
    }

  }


}
