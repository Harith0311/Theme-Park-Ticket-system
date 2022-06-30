package ticket_package;

public class Customer {
    private String fullName;
    private String category;
    private String noOfAdult;
    private String noOfChild;

    //------------- Getters method -------------
    public String getFullName(){
        return fullName;
    }
    public String getCategory(){
        return category;
    }
    public String getNoOfAdult(){
        return noOfAdult;
    }
    public String getNoOfChild(){
        return noOfChild;
    }

    //------------- Setters method -------------
    public void setFullname(String fullName){
        this.fullName = fullName;
    }
    public void setCategory(String category){
        this.category = category;
    }
    public void setNoOfAdult(String noOfAdult){
        this.noOfAdult = noOfAdult;
    }
    public void setNoOfChild(String noOfChild){
        this.noOfChild = noOfChild;
    }

}
