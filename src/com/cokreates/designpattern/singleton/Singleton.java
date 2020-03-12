package com.cokreates.designpattern.singleton;

public class Singleton
{
    // obj volatile which ensures that multiple threads
    // offer the obj variable correctly when it is being
    // initialized to Singleton instance
    private volatile static Singleton obj;

    private Singleton() {}

    public static Singleton getInstance()
    {
        if (obj == null)
        {
            // we will only acquire lock on the getInstance() once, when the obj is null.
            synchronized (Singleton.class)
            {
                if (obj==null)
                    obj = new Singleton();
            }
        }
        return obj;
    }
}
