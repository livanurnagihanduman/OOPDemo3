public class CarDemo extends AracDemo {

    private int mirrorNumber;

    CarDemo(int tyreNumber,String name,int aracAge,String aracType,int mirrorNumber){
        super(tyreNumber,name,aracAge,aracType);
        this.mirrorNumber = mirrorNumber;
    }
    public int getMirrorNumber(){
        return mirrorNumber;
    }
    public void setMirrorNumber(){
        this.mirrorNumber = mirrorNumber;
    }
    public void getir3(){
        System.out.println(this.getAracType() + " bu araçta 4 ayna vardır.");
    }

    }
