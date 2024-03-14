public class MP3 extends Item {
    private int duration;
    public MP3(String name, String description, String ID, float price, int duration) {
        (name, description, ID, price);
        this.duration = duration;
    }
}
@Override
public void showInfo(){
    System.out.println("Ten vat pham la: "+name);
    System.out.println("Mo ta vat pham: "+description);
    System.out.println("ID vat pham: "+ID);
    System.out.println("Gia vat pham la: "+price);
    System.out.println("Tgian su dung vat pham la: "+duration);
}
