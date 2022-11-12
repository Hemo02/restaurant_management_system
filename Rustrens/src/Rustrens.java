
public class Rustrens {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       HapyyRest Rest = new HapyyRest(234556,"Hapyy","2020/03/10","12:30 PM","12:30 AM");
       //***************** Info Restrens ***************
       System.out.printf("\nName[%s] \nNumberOrg : %d \nDate Start Work : %s \nOpen From %s to %s\n"
       ,Rest.NameRust,Rest.RelistionNum,Rest.DateOpen,Rest.openHour,Rest.CloseHour);
       //***************** END ********************
       Rest.menu();
    }
    
}
