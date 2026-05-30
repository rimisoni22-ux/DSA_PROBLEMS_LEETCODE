package OOPS;

public class Classes {
    public static void main(String[] args) {

        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.getColor());

        p1.setTip(5);
        System.out.println(p1.getTip());

       p1.setColor("Yellow");
        System.out.println(p1.getColor());
    }
}

class BankAccount {
    public String username;
    private String password;

    public void setPassword(String pwd) {
        password = pwd;
    }
}

class Pen {
    private String color;
    private int tip;

    public String getColor() {
        return color;
    }

    public int getTip() {
        return tip;
    }

    public void setColor(String newColor) {
        color = newColor;
    }

    public void setTip(int newTip) {
        tip = newTip;
    }
}
