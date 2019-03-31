
package homework5;

// Stoixia Pelati!


public class Ex7MainCustomer {
    private String name;
    private String subname;
    private Integer id;
    private String pliromis;
    public Ex7MainCustomer(){
    name="Theodoros";
    subname="Ioannou";
    id=0005;
    pliromis="Visa";
    
    }
    
    public static void main(String[] args) 
    {
        Ex7MainCustomer n= new Ex7MainCustomer();
        Ex7Address  S = new Ex7Address();
        Ex7Items m = new Ex7Items();
        Ex7Invoice s = new Ex7Invoice();
        int i;
        System.out.println("   CUSTOMER DETAILS                                             ADDRESS OF CUSTOMER");
       System.out.println("  Onoma   :        "+n.name+"                         StreetAddress :    "+S.Streetaddress);
       System.out.println("  Epitheto :        "+n.subname+"                          City :          "+S.City);
       System.out.println(" Arithmos Taftotitas :    "+n.id+"                          Country :          "+S.Country);
       System.out.println(" Tropos pliromis :    "+n.pliromis+"                           State :       "+S.State);         
        System.out.println("                                                     Zipcode :       "+S.Zipcode);
        
        
        
        System.out.println(" ");                                       
        System.out.println(" ");   
        
         System.out.println("                        ITEMS     PRICE   ");
        for (i=0;i<7;i++) {
        System.out.print("                 "+m.items[i]);
        System.out.println("                "+m.price[i]);   
            }   
        System.out.println(" ");                                       
       
        System.out.println(" 3 ITEMS were purchased : 1 "+m.items[1]+" 1 "+m.items[2]+" 1 "+m.items[5]);  
        System.out.println("  TOTAL AMOUNT  : "+s.money);
        System.out.println("  HE/SHE PAID  : "+s.pay);
        System.out.println("  HE/SHE OWES : "+(s.money-s.pay));
   }
    
    
    
    
    
}
