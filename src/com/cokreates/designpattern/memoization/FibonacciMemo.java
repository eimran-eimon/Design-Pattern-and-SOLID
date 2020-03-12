package com.cokreates.designpattern.memoization;

import java.util.HashMap;
import java.util.Map;

public class FibonacciMemo {
    // make memoize table for saving and getting result
    // for same data, without calculating it again.
    private Map<Integer, Integer> memoizeTable = new HashMap<>();

    public int fibMemo(int n){
        if (n == 0) return 0;
        if (n == 1) return 1;

        if(this.memoizeTable.containsKey(n)){
            // If we calculated for n previously
            // just return it.
            System.out.println("Getting result in cache for " + n);
            return this.memoizeTable.get(n);
        }

        int result = fibMemo(n-1) + fibMemo(n-2);
        // storing the calculated result in the Memoize table
        System.out.println("Putting result in cache for " + n);
        this.memoizeTable.put(n, result);
        return result;
    }

    public static void main(String[] args) {
        FibonacciMemo fibAlgo = new FibonacciMemo();
        System.out.println("Result: "+ fibAlgo.fibMemo(10));
    }

}
