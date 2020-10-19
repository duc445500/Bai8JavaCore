package DongGoi;

public class Containter {
    private String containerNumber;
    private String containerType;

    public void setContainerNumber(String coNumber){
        this.containerNumber = coNumber;
    }
    public void setContainerType(String coType){
        this.containerType = coType;
    }

    public String getContainerNumber(){
        return containerNumber;
    }
    public String getContainerType(){
        return containerType;
    }

    public void showContainer(){
        System.out.println(this.getContainerNumber() + " -- " + this.getContainerType());
    }
}
