package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void onlyOpenBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void onlyClosingBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void bracketsWithStringReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[aa]"));
    }

    @Test
    public void onlyOpenBracketWithStringReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[aa"));
    }

    @Test
    public void onlyClosingBracketWithStringReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("aa]"));
    }

    @Test
    public void bracketsInWrongOrderReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void bracketsInWrongOrderWithStringsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]Hi["));
    }

    @Test
    public void balancedBracketsWithinStringReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Hi[Anu]"));
    }

    @Test
    public void balancedBracketsInFrontOfStringReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]Hi"));
    }

    @Test
    public void balancedBracketsInEndOfStringReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Hi[]"));
    }

    @Test
    public void unBalancedBracketsWithinStringReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Hi]A["));
    }



}