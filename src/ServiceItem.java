/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author diky
 */
public interface ServiceItem {
    public void displayService();
    public float getPrice(int serviceiItem);
    public boolean checkMemberStatus(String statusMemeber);
    public float getSale(boolean isMember, float parServicePrice);
}
