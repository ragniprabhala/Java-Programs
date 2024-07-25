package com.softworldpgms.uncheckedexceptions;

public class ClassCastExceptionExample 
{
    public static void main(String[] args) {
        Object obj = new Integer(10);
        // This will throw ClassCastException
        String str = (String) obj;
    }
}