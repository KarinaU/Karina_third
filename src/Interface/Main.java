package Interface;

/**
 * Created by IT_School on 24.10.2015.
 */
public class Main implements Interface{
    public static void main(String[] args) {

        Enum_in_interface s = Enum_in_interface.C;
        System.out.println("Привет Enum  из интерфейса " + s);

        Interface.static_mettod_in_inetface();

        Interface g = new Main();
        g.defualt_metod_in_interface();

        Class_in_inteface f = new Class_in_inteface();
        f.print();
    }
}
