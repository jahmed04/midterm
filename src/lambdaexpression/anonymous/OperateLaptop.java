package lambdaexpression.anonymous;

public class OperateLaptop {

    public static void main(String[] args) {
        //Please implement anonymous class for interface laptop
        Laptop laptop = new Laptop(){

            public void ramSize(int memorySize) {

                System.out.println(4+4+4+4);
            }
            public void monitorSize(int screenSize) {
                System.out.println(17);
            }
        };
        laptop.ramSize(0);
        laptop.monitorSize(0);


        //please implement anonymous function for Phone interface

        Phone phone = ph -> System.out.println(ph);
        phone.cellularNetwork("\n5g Cellular networking is taking over. ");

        Phone phone1 = (network) -> System.out.println(network);
        phone1.cellularNetwork("\n5g Cellular networking is taking over. ");

    }
}
