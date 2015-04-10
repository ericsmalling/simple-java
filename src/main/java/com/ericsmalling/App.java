package com.ericsmalling;

/**
 * Hello world!
 *
 */
public class App 
{
    private final String name;

    public App(String name) {
        this.name = name;
    }

    public static void main( String[] args )
    {
        System.out.println( new App("somebody").greeting() );
    }
    
    public String greeting(){
        return "Hello world!";
    }
}
