package Luu;


import Luu.GiaoTiep;
import java.io.Serializable;
import javax.swing.JTextField;

/**
 *
 * 
 */
public class LuuNhanSuu implements Serializable, GiaoTiep {
    
    private String ten, diachi, ngaysinh, SDT;

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String Phone) {
        this.SDT = SDT;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh =ngaysinh;
    }


    public Object[] toObject() {
        return new Object[]{
          this.getSDT(), this.getTen(), this.getDiachi(), this.getNgaysinh()
        };
    }

    
    
}
