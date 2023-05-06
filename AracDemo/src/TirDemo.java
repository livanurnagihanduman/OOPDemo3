public class TirDemo extends AracDemo {

    private int bedNumber;

    TirDemo(int tyreNumber,String name,int aracAge,String aracType,int bedNumber){
        super(tyreNumber,name,aracAge,aracType);
        this.bedNumber = bedNumber;
    }

    public int getBedNumber(){
        return bedNumber;
    }
    public void setBedNumber(){
        this.bedNumber = bedNumber;
    }
    public void getir5(){
        System.out.println(this.getAracType() + " bu araçda 5 kişilik yatacak yer var AMA şöförü uyutmayın!!!!");
    }
}
