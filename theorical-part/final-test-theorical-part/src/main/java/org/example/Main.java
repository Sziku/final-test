package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int countter = 0;
        for (int i = 0; i< 5; i++){
            for (int j = 0; j < 5; j++) {
                if(i == 3){
                    break;
                }
                countter++;
            }
        }
        System.out.println(countter);

        List<String> letters = new ArrayList<>();
        letters.add("A");
        letters.add("B");
        letters.add("A");
        letters.add("C");
        letters.add("B");

        letters.stream().sorted()


        Collections.sort(letters);
        System.out.println(letters);
    }
}

public class Tree{
    public final void print(){
        System.out.println("tree");
    }
}
public class Oak extends Tree{
    public void print(){

    }
}