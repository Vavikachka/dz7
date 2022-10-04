public class MobilPhone extends Phone implements Text {
   
    public MobilPhone(String name) {
        super(name);
    }

    @Override
    public void call() {
        System.out.println("Приятная музыка");
        
    }

    @Override
    public void text() {
        System.out.println("Теперь я могу написать другу!");
        
    }

    
}
