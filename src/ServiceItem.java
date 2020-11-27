/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 * Nama  : Diva Sabila Ramadhan
 * Kelas : IF1
 * NIM   : 10119039
 * Deskripsi Program : berisi interface dari Service item 
 */
public interface ServiceItem {
    public void displayService();
    public float getPrice(int serviceiItem);
    public boolean checkMemberStatus(String statusMemeber);
    public float getSale(boolean isMember, float parServicePrice);
}
