package com.company.JavaSysntax.level7;
import java.util.ArrayList;

/*
Р или Л
*/

public class PorL {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {

        for (int i = 0; i < strings.size(); i++) {
            if(strings.get(i).contains("л") && strings.get(i).contains("р"));
            if(strings.get(i).contains("р")){
                strings.remove(i);
            }
            if(strings.get(i).contains("л")){
                strings.add(i, strings.get(i));
                i+=2;
            }
        }
        return strings;
    }
}

