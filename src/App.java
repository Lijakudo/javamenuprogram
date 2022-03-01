import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Székely Márton, 2022-02-23");
        Scanner sc = new Scanner(System.in);

        //kezdet
        String valasztott = "";
        do{
        System.out.println("------------------------");
        System.out.println();
        System.out.println("1) Program indítása");
        System.out.println("2) Névjegy");
        System.out.println("3) Kilépés");

        
        System.out.println();
        System.out.print("Választás: ");
        valasztott = sc.nextLine();
        
        switch(valasztott) {
            case "1":
                System.out.println("Program...");
                double szam = 0;
                do {
                    System.out.print("Szam: ");
                    szam = sc.nextDouble();
                    if(szam!= 0) {
                        double ngyok = Math.sqrt(szam);
                        System.out.printf("Gyök: %.2f\n", ngyok);
                    }
                }while(szam !=0);
                System.out.println("Folytatáshoz Enter");
                sc.nextLine(); //Enter olvasása
                sc.nextLine(); //Várás Enterre
                break;
            case "2":
                System.out.println("Székely Márton");
                System.out.println("2022-03-01");
                System.out.println("SZOFT I/N");
                System.out.println("Gyökszámító");
                System.out.println("");
                System.out.println("Folytatáshoz Enter");
                sc.nextLine();
                break;
            case "3":
                System.out.println("Kilépés...");
                break;
        }
        }while(!valasztott.equals("3"));
        //vege
       
        sc.close();
    }
}
