package Apple;

/**
 * Created by IT_School on 25.10.2015.
 */

enum Apple {Golden(10), Red(15), Green(3), White(8), Orange(7);
private int price;
    Apple(int p){price = p;}

    int getPrice(){return  price;}
}
public class Enum {

    public static void main(String[] args) {
        Apple ap;

        ap = Apple.Golden;
        System.out.println("Value of ap " + ap);
        System.out.println();

        ap = Apple.Red;

        if (ap.equals(Apple.Red)) ;
        System.out.println("Ap countains Red");

        switch (ap) {
            case Green:
                System.out.println("Green apple");
                break;
            case White:
                System.out.println("White apple");
                break;
            case Orange:
                System.out.println("Orange apple");
                break;
        }

    //values - возвращает массивб содержаций список констант перечисления
    Apple allapples[] = Apple.values();
    for(Apple a :allapples)
        System.out.println(a + " " + a.ordinal());

        System.out.println();

        // valueOf

        ap = Apple.valueOf("White");
        System.out.println("Ap contains " + ap);

        System.out.println("White cost" + Apple.White.getPrice() + "cents.\n");

        System.out.println("All apple price");
        for (Apple a: Apple.values());
        System.out.println("Cost " + ap.getPrice()+ " cents.");

        Apple ap2,ap3;
        ap = Apple.Golden;
        ap2 = Apple.Red;
        ap3 = Apple.Green;

        if(ap.compareTo(ap2)<0)
            System.out.println(ap + " comes before" +ap2);
        if(ap.compareTo(ap2)>0)
            System.out.println(ap2 + " comes before" +ap);
        if(ap.compareTo(ap3)==0)
            System.out.println(ap + " equals" +ap3);

        System.out.println();

        if(ap.equals(ap2))
            System.out.println("error");
        if(ap.equals(ap3))
            System.out.println(ap + "equals" + ap3);
        if(ap == ap3)
            System.out.println(ap + " == " + ap3);
}
}