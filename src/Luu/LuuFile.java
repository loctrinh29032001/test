package Luu;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * 
 */
public class LuuFile {
    
    public void ghi(ArrayList list, String file){
        try(FileOutputStream out = new FileOutputStream(new File(file))) {
            ObjectOutputStream oos = new ObjectOutputStream(out);
            oos.writeObject(list);
        } catch (Exception e) {
            System.out.println("Got an exception!");
        }
    }
    
    public void ghiSV(ArrayList <LuuNhanSuu> list){
        try (PrintWriter pw = new PrintWriter(new File("SV.DAT"))){
            for(LuuNhanSuu s: list){
                pw.println(s.getSDT());
                pw.println(s.getTen());
                pw.println(s.getDiachi());
                pw.println(s.getNgaysinh());
                
            }
        } catch (Exception e) {
            System.out.println("got an exception!");
        }
    }
    
    public ArrayList docSV(){
        ArrayList<LuuNhanSuu> list = new ArrayList<>();
        try(Scanner sc = new Scanner(new File("SV.DAT"))) {
            while(sc.hasNext()){
                LuuNhanSuu s = new LuuNhanSuu();
                s.setSDT(sc.nextLine());
                s.setTen(sc.nextLine());
                s.setDiachi(sc.nextLine());
                s.setNgaysinh(sc.nextLine());
                
                list.add(s);
            }
        } catch (Exception e) {
            System.out.println("got an exception!");
        }
        return list;
    }
    
    
    
    public ArrayList doc( String file){
        ArrayList list = new ArrayList();
        try(FileInputStream out = new FileInputStream(new File(file))) {
            ObjectInputStream oos = new ObjectInputStream(out);
            list = (ArrayList) oos.readObject();
        } catch (Exception e) {
            System.out.println("Got an exception!");
        }
        return list;
    }
}

