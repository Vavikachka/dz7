public abstract class Phone implements Call {
    private String name;
    

    public Phone(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
   

    
}
