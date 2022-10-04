// кнопочный телефон

public class ButtonPhone extends MobilPhone {

    public ButtonPhone(String name) {
        super(name);
        
    }

    @Override
    public void call() {
        System.out.println("можно выбирать мелодию");
        
    }

    @Override
    public void text() {
        super.text();
    }

   
}
