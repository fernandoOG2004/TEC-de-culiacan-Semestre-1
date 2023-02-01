package ayudaU4;
import java.util.*;
public class BonoPorCondicionesDeTrabajo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int condicion_de_trabajo, mes;
        double antiguedad, bono, sueldo_mensual, sueldo_neto_mensual;
        System.out.print("Ingresa el valor de antiguedad: ");
        antiguedad = in.nextDouble();
        in.nextLine();
        System.out.println("Selecciona el valor de condicion de trabajo.");
        System.out.println("\t1.- CP colaborador parcial");
        System.out.println("\t2.- CA colaborador antiguo");
        System.out.print("\t: ");
        do {
            condicion_de_trabajo = in.nextInt();
            in.nextLine();
            if (condicion_de_trabajo<1||condicion_de_trabajo>2)
                System.out.print("Valor incorrecto. Ingr\u00E9salo nuevamente.: ");
        } while (condicion_de_trabajo<1||condicion_de_trabajo>2);
        System.out.println("Selecciona el valor de mes.");
        System.out.println("\t1.- Enero");
        System.out.println("\t2.- Febrero");
        System.out.println("\t3.- Marzo");
        System.out.println("\t4.- Abril");
        System.out.println("\t5.- Mayo");
        System.out.println("\t6.- Junio");
        System.out.println("\t7.- Julio");
        System.out.println("\t8.- Agosto");
        System.out.println("\t9.- Septiembre");
        System.out.println("\t10.- Octubre");
        System.out.println("\t11.- Noviembre");
        System.out.println("\t12.- Diciembre");
        System.out.print("\t: ");
        do {
            mes = in.nextInt();
            in.nextLine();
            if (mes<1||mes>12)
                System.out.print("Valor incorrecto. Ingr\u00E9salo nuevamente.: ");
        } while (mes<1||mes>12);
        if(condicion_de_trabajo==1)
            sueldo_mensual=900;
        else
            sueldo_mensual=1500;
        bono=0;
        if((mes==7||mes==12)&&antiguedad<4)
            bono=sueldo_mensual*0.3;
        if((mes==7||mes==12)&&antiguedad>=4&&antiguedad<7)
            bono=sueldo_mensual*0.5;
        if((mes==7||mes==12)&&antiguedad>=7&&antiguedad<12)
            bono=sueldo_mensual*0.75;
        if((mes==7||mes==12)&&antiguedad>=12)
            bono=sueldo_mensual;
        sueldo_neto_mensual=sueldo_mensual+bono;
        System.out.println("Valor de bono: " + bono);
        System.out.println("Valor de sueldo mensual: " + sueldo_mensual);
        System.out.println("Valor de sueldo neto mensual: " + sueldo_neto_mensual);
    }

}
