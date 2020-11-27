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
 * Deskripsi Program : Berisi class dari Service Price
 */
public class ServicePrice implements ServiceItem {
    private float priceService,discount;

    public float getPriceService(){
        return priceService;
    }
    
    public void setPriceService(float priceService){
        this.priceService = priceService;
    }
    
    @Override
    public void displayService(){
        System.out.println("#*********#");
        System.out.println("#**Rock n Roll Haircut**#");
        System.out.println("#**Service List***#");
        System.out.println("1. Haircut : IDR 45K");
        System.out.println("2. Haircut + Hairwash: IDR 55K");
        System.out.println("3. Hairwash Only : IDR 15K");
        System.out.println("#*********#");
        System.out.println("Choose (1/2/3):");
    }
    
    @Override
    public boolean checkMemberStatus(String statusMember) {
        
    }
    
    @Override
    public float getSale(boolean isMember, float parServicePrice) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public float getPrice(int serviceItem) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
