package com.project.test;
public class Bas
{
    private String baseName = "base";
    public Bas()
    {
        callName();
    }
 
    public void callName()
    {
        System. out. println(baseName);
    }
 
    static class Sub extends Bas
    {
        private String baseName = "sub";
        public void callName()
        {
            System. out. println (baseName) ;
        }
    }
    public static void main(String[] args)
    {
        Bas b = new Sub();
        String  string="aaa";
        string=string+"		a";
        System.out.println(string);
        String tes="hello world,heihie";
        //String[] aStrings=tes.split();
    }
}

