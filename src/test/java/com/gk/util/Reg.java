package com.gk.util;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg {
    @Test
    public void testReg(){
        String text="gk/ab/0cf5d370-cf8b-4688-80be-48ad60a11388.png";
        String regex = ".?+/(.+)";
        Pattern compile = Pattern.compile(regex);
        Matcher m=compile.matcher(text);
        if (m.find()){
            System.out.println(m.group(0));
            System.out.println(m.group(1));
        }

    }
}
