//Сенсорный телефон
public class TouchPhone extends MobilPhone implements Internet,Email{

    public TouchPhone(String name) {
        super(name);
    }

    @Override
    public void call() {
        System.out.println("Крутая музыка");
        
    }

    @Override
    public void text() {
        System.out.println("Ну теперь смс мало используют");
        
    }

    @Override
    public void internet() {
        System.out.println("супер теперь есть Интернет");
        
    }

    @Override
    public void Email() {
        System.out.println("Ура теперь у меня есть почта");
        
    }

}
