package Interface;

/**
 * Created by IT_School on 24.10.2015.
 */
public interface Interface {
    int b = 10;

    enum Enum_in_interface {A,B,C};

    static void static_mettod_in_inetface(){
        System.out.println("Hello from Interface.static_mettod_in_inetface\n");
    }
        default void defualt_metod_in_interface(){
        System.out.println("Hello from Interface.defualt_metod_in_interface\n");
    };
      class  Class_in_inteface{
          public void print(){
              System.out.println("Hello from Class_in_inteface.print");
          }
        interface Interface_in_interface{};
          };
    }
