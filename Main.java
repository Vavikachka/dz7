// Реализовать родительский класс Телефон и классы наследники(Стационарный, Мобильный и тд). 
// Построить согласно принципам озвученным на семинаре функции этих телефонов. Особое требование - использование интерфейсов, механизма наследования, полиморфизма и тд

public class Main {
    public static void main(String [] args) {
        Stationary phone = new Stationary("            Домашний телефон       ");
        System.out.println(phone.getName());
        phone.call();
        ButtonPhone phone1 = new ButtonPhone("         Кнопочный телефон");
        System.out.println(phone1.getName());
        phone1.call();
        phone1.text();
        TouchPhone phone2 = new TouchPhone("           Сенсорный телефон");
        System.out.println(phone2.getName());
        phone2.call();
        phone2.text();
        phone2.Email();
        phone2.internet();
    }
    
}