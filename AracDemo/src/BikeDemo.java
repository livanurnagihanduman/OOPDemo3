public class BikeDemo extends AracDemo{

    private int personNumber;

    BikeDemo(int tyreNumber,String name,int aracAge,String aracType,int personNumber){
        super(tyreNumber,name,aracAge,aracType);
        this.personNumber = personNumber;
    }
    public int getPersonNumber(){
        return personNumber;
    }

    public void setPersonNumber(){
        this.personNumber = personNumber;
    }
    public void getir4(){
        System.out.println(this.getName()  +  this.getAracType() + "   türünde 4 kişiik binme yeri vardır" +
                " ama siz yinede dikkatli olun Motorsiklet Şakaya gelmez!");
    }
}
