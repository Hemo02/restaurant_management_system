import java.util.Scanner;

public class HapyyRest {
    //--------- [Info Restrens] -----------
    int RelistionNum;
    String NameRust;
    String DateOpen;
    String openHour;
    String CloseHour;
    //------------- End --------------------
    
    //------- Contonue Us :--------
    String phone ="21892-0000000";
    String FAcount ="HapyyRest";
    String Adrees ="Jamalabdalnaser Street";
    String Email ="info@HapyyRest.org";
    //------------ END --------------
    
    //------- Start Constrctor ---------
    public HapyyRest(int RN,String NR,String DO,String OH,String CH)
    {
       RelistionNum=RN;
       NameRust = NR;
       DateOpen = DO;
       openHour = OH;
       CloseHour= CH;
    }
    //----------- End Constrctor ---------
  
    public void menu()
    {
    do{
    //============= First menu ================
    System.out.print("\n----  WELCOM TO ******** RESTRENS ----\n");
    System.out.print("--------------------------------------\n");
    System.out.print("1)Order                               \n");
    System.out.print("2)Conaction us                        \n");
    System.out.print("3)Exit                                \n");
    System.out.print("--------------------------------------\n");
    System.out.print("      PLEASE SELECT ANY NUMBER        \n");
    //============= End First menu ================
    //============= Start Switch =================
    Scanner myiput =new Scanner(System.in);
    int choisce=myiput.nextInt();
    switch(choisce)
    {
        case 1:
            order();
        break;
        case 2:
            conaction();
        break;  
        case 3:
            Exit();
            break;
        default:
            System.out.print(" Your Choise Wrong........\n");
            break;
    }
    }while(true);
   }
    //================= End Switch ===================
    
    //================== Function Our Serveses =================
    public void order()
    {   
        //============= Sacend menu ================
        System.out.print("-------------------------------\n");
        System.out.print("         Our Prodect           \n");
        System.out.print("-------------------------------\n");
        System.out.print("1)Sandwitches                  \n");
        System.out.print("2)Pastries                     \n");
        System.out.print("3)Meals                        \n");
        System.out.print("-------------------------------\n");
        System.out.print("      Select Waht You Want (:  \n");
        System.out.print("-------------------------------\n\n\n");
        //============= End Sacend menu ================
        Scanner input = new Scanner(System.in);
        int select = input.nextInt();
        switch(select)
        {
            case 1:
                Sandwitches();
                break;
            case 2:
                Pastries();
                break;
            case 3:
                Meals();
                break;
            default:
            System.out.print(" Your Choise Wrong........\n");
            break;    
        }
        
    }
    
    //================== Start Function Sandwitches ====================
    public void Sandwitches()
    {
        //============= Start third menu ================
        System.out.print("\n\n------------ Our Sandwiches -------------\n");
        System.out.print("1)Shawarma                                 \n");
        System.out.print("2)Hamburger                                \n");
        System.out.print("3)Fajita                                   \n");
        System.out.print("------- Plase Selcet What You Want --------\n");
        //============= End third menu ================
        Scanner input= new Scanner(System.in);
        int select =input.nextInt();
        switch(select)
        {
            case 1:
                Shawarma();
                break;
            case 2:
                Hamburger();
                break;
            case 3:
                Fajita();
                break;
            default:
            System.out.print(" Your Choise Wrong........\n");
            break;    
        }
        
    }
    //================== End Function Sandwitches ====================
    
    //================== Start Function Pastries ====================
    public void Pastries()
    {
        //============= Start (4) menu ================
        
        System.out.print("\n\n-------------- Our Pastries -------------\n");
        System.out.print("1)Pizza                                  \n");
        System.out.print("2)Cheese pizza                           \n");
        System.out.print("------- Plase Selcet What You Want -------\n");
        //============= End (4) menu ================
        Scanner input= new Scanner(System.in);
        int select =input.nextInt();
        switch(select)
        {
            case 1:
                Pizza();
                break;
            case 2:
                Cheese_pizza();
                break;
            default:
            System.out.print(" Your Choise Wrong........\n");
            break;
        }
          
    }
    //================== End Function Pastries ======================
    
    //================== Start Function Meals ====================
    public void Meals()
    {
       
        //============= Start (5) menu ================
        
        System.out.print("\n\n-------------- Our Meals -------------\n");
        System.out.print("1)Kebab meal                          \n");
        System.out.print("2)chicken meal                        \n");
        System.out.print("3)meat meal                           \n");
        System.out.print("------- Plase Selcet What You Want -------\n");
        //============= End (5) menu ================
        Scanner input= new Scanner(System.in);
        int select =input.nextInt();
        switch(select)
        {
            case 1:
                Kebab_meal();
                break;
            case 2:
                chicken_meal();
                break;
            case 3:
                meat_meal();
                break;
            default:
            System.out.print(" Your Choise Wrong........\n");
            break;
        }
         
    }
    //================== End Function Meals ======================
    
    //================== Sandwitches ====================
    //================ (1) ============
    public void Shawarma()
    {
        Scanner input= new Scanner(System.in);
        int price =6;int Totel;
        System.out.printf("\t\t\tShawarma \nPrice :%d\n",price);
        System.out.print("Enter How Many DO you Have : ");
        int order =input.nextInt();
        Totel = price*order;
        System.out.printf("The Totel :%d\n",Totel);
        System.out.print("The order is in process. Wait five minutes, please\n\n");    
    }
    //================ (2) ============
    public void Hamburger()
    {
        Scanner input= new Scanner(System.in);
        int price =7;int Totel;
        System.out.printf("\t\t\tHamburger \nPrice :%d\n",price);
        System.out.print("Enter How Many DO you Have : ");
        int order =input.nextInt();
        Totel = price*order;
        System.out.printf("The Totel :%d\n",Totel);
        System.out.print("The order is in process. Wait five minutes, please\n\n");    
    }
    //================ (3) ============
     public void Fajita()
    {
        Scanner input= new Scanner(System.in);
        int price =10;int Totel;
        System.out.printf("\t\t\tFajita \nPrice :%d\n",price);
        System.out.print("Enter How Many DO you Have : ");
        int order =input.nextInt();
        Totel = price*order;
        System.out.printf("The Totel :%d\n",Totel);
        System.out.print("The order is in process. Wait five minutes, please\n\n");    
    }
    //===================================================
     
    //================== Pastries ====================
     //============== (1) ===========
     public void Pizza()
    {
        Scanner input= new Scanner(System.in);
        int price =15;int Totel;
        System.out.printf("\t\t\tPizza \nPrice :%d\n",price);
        System.out.print("Enter How Many DO you Have : ");
        int order =input.nextInt();
        Totel = price*order;
        System.out.printf("The Totel :%d\n",Totel);
        System.out.print("The order is in process. Wait five minutes, please\n\n");    
    } 
     //============== (2) ===========
     public void Cheese_pizza()
    {
        Scanner input= new Scanner(System.in);
        int price =13;int Totel;
        System.out.printf("\t\t\tCheese pizza \nPrice :%d\n",price);
        System.out.print("Enter How Many DO you Have : ");
        int order =input.nextInt();
        Totel = price*order;
        System.out.printf("The Totel :%d\n",Totel);
        System.out.print("The order is in process. Wait five minutes, please\n\n");    
    } 
    //===================================================
     
    //================== Meals ====================
     //============ (1) =========
     public void Kebab_meal()
    {
        Scanner input= new Scanner(System.in);
        int price =18;int Totel;
        System.out.printf("\t\t\tKebab meal \nPrice :%d\n",price);
        System.out.print("Enter How Many DO you Have : ");
        int order =input.nextInt();
        Totel = price*order;
        System.out.printf("The Totel :%d\n",Totel);
        System.out.print("The order is in process. Wait five minutes, please\n\n");    
    } 
    //=========== (2) ==========
      public void chicken_meal()
    {
        Scanner input= new Scanner(System.in);
        int price =20;int Totel;
        System.out.printf("\t\t\tchicken meal \nPrice :%d\n",price);
        System.out.print("Enter How Many DO you Have : ");
        int order =input.nextInt();
        Totel = price*order;
        System.out.printf("The Totel :%d\n",Totel);
        System.out.print("The order is in process. Wait five minutes, please\n\n");    
    } 
    //============ (3) ==========
      public void meat_meal()
    {
        Scanner input= new Scanner(System.in);
        int price =25;int Totel;
        System.out.printf("\t\t\tmeat meal meal \nPrice :%d\n",price);
        System.out.print("Enter How Many DO you Have : ");
        int order =input.nextInt();
        Totel = price*order;
        System.out.printf("The Totel :%d\n",Totel);
        System.out.print("The order is in process. Wait five minutes, please\n\n");    
    } 
      
      public void conaction()
      {
            System.out.print("\n\n\n------------ Conaction us -----------\n");
            System.out.println(phone);
            System.out.println(Email);
            System.out.println(FAcount);
            System.out.println(Adrees);
            System.out.print("------------ THNCK YOU ---------------\n\n");
      }
      public void Exit()
      {
            System.out.print("\n\n\n--------------------------------------\n");
            System.out.println("        Thank For Use Our Servses      ");
            System.out.print("\n--------------------------------------\n");
      }
}
//===================================  THANK YOU   ============================================