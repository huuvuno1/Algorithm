package leetcode.easy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.awt.*;
public class Test extends Frame {
    

    public static void main(String[] args) {
        Test test = new Test();
        test.setTitle("Dep trai");
        test.setSize(1000, 400);
        test.setVisible(true);
    }

    static int test() {
        try 
        {
            FileInputStream fileInputStream = new FileInputStream("a.txt");

        }
        catch (FileNotFoundException e) {
            System.out.println("file not found");
            return -1;
        }
        catch (IOException e) {
            System.out.println("dsfajflk");
        }
        finally {
            System.out.println("done");
        }
        return 0;
    }
}
