
package com.test4;

import com.test3.Test;

public class _6_Output {
    public static void main(String args[])
    {
        Test obj = new Test(5,10);
        obj.a = 10;
        obj.b = 20;             
        obj.meth(obj.a , obj.b);
        System.out.println(obj.a + " " + obj.b);        
    } 


}
