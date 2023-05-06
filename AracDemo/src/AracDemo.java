public class AracDemo {
    private int tyreNumber;
    private String name;
    private int aracAge;
    private String aracType;

    AracDemo(int tyreNumber, String name,int aracAge,String aracType){
        this.tyreNumber = tyreNumber;
        this.name = name;
        this.aracAge = aracAge;
        this.aracType = aracType;
    }
    public int getTyreNumber(){
        return tyreNumber;
    }

    public void setTyreNumber(){
        this.tyreNumber = tyreNumber;
    }
    public String getName(){
        return name;
    }
    public void  setName(){
        this.name = name;
    }
    public int getAracAge(){
        if(aracAge == 10){
            System.out.println("2012 Model Araçlar");
        }else if(aracAge == 20){
            System.out.println("2002 Model Araçlar");
        }
        return aracAge;
    }
    public void setAracAge(){
        this.aracAge = aracAge;
    }

    public String getAracType(){
        return aracType;
    }

    public void setAracType(){
        this.aracType = aracType;
    }

    public void getir(){
        System.out.println(this.getName() + " araç türü " + this.aracType + " türüdür.");
    }
    public void getir2(){
        System.out.println("Bu " + this.getAracType() + this.getAracAge()  +  " yaşındadır.");
    }
}

