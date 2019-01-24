//package test;
import java.io.BufferedWriter;
import java.io.File;
import java.nio.Buffer;
import java.io.FileWriter;
import java.io.IOException;

public class Test_profondeur{

    private int a;
    public Test_profondeur(int a_init){
        this.a=a_init;
        recopier(a);
    }
    public void recopier(int a){
        try{
        BufferedWriter writer = new BufferedWriter(new FileWriter(new File("Test_profondeur.wh")));
        writer.write("function test : read X % ");
        for (int i=1; i<=a; i++)
        {
            writer.write("if A=?B then A:=B fornulldo A := null");
        }
        for (int i=1; i<=a; i++)
        {
            writer.write("od fi");
        }
        writer.write("% write Z");
        System.out.print("ok normalement c'est bon");
        writer.close();}

        catch (IOException e)
        {
            System.out.print("fleme");
            e.printStackTrace();
            
        }
}

}
