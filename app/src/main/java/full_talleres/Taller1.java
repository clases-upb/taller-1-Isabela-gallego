/*
 * Este es el primer taller de lógica de programación. Tenga en cuenta la siguiente rúbrica que debe ser  
 * tenida en cuenta para cada ejercicio y se basa en los mandamientos del programador. El taller es una 
 * herramienta para comenzar a preparar la evaluación donde los descuentos si van a ser tenidos en cuenta. 
 * Con este taller, usted irá aprendiendo a aplicar buenas prácticas en la programación.
 * 
 * Al valor que obtenga en la evaluación automática de github, se revisará si cumple con buenas prácticas
 * de acuerdo con la siguiente rúbrica que se descuenta en cada ejercicio y es acumulativa:
 * Descuento por quemar valores en el código y no usar constantes: -0.5
 * Descuento por no implementar control de errores con trycatch: -0.8
 * Descuento por no escribir el código ordenado, identado: -0.4
 * 
 * RÉTESE, PÓNGASE A PRUEBA!!!
 * 
 */
package full_talleres;

public class Taller1 {
    
    public static void main(String[] args) {
        try {
            System.out.println(Convertir_km_seg(40));
            System.out.println(Convertir_cm_lt((double)3500));
            System.out.println(Convertir_us_cops((long)45623));
            System.out.println(Convertir_cent_far((double)0));
            System.out.println(Calcular_peso_carga((float)47.5, (float)7.5));
            System.out.println(Calcular_segs((byte)1,(byte)1,(byte)1,(byte)1));
            System.out.println(Calcular_horasxviaje("Armenia",(short)285,(short)72));
            System.out.println(Calcular_combustible(638, 312, 1243, 220));
            System.out.println(Calcular_peso_luna((byte)80));
        } catch (Exception e) {
            
        }
    }

    /* 
     2.	Diseñe un algoritmo e implemente la función Convertir_km_seg que: reciba una velocidad entera en Km/seg 
     y la convierta a metros/seg y a metros/hora. Retorne un string del tipo:  m/s -  m/h. Si hay error, 
     devuelva el string "Error en la conversion"
    */
    /**
     * 
     */
    public static String Convertir_km_seg (int velocidadKmSeg) {
        try {
            double velocidadMHora= 0, velocidadmseg = 0;
            short conversion = 1000;
            short conversion2=3600;
            velocidadmseg = velocidadKmSeg * conversion;
           velocidadMHora = velocidadKmSeg * conversion*conversion2;
            return + velocidadmseg + " m/s - " + velocidadMHora + " m/h " ;
        } 
        catch (Exception e) {
            return "Error en la conversion"; 
        } 
    
    }  /*3. Diseñe un algoritmo e implemente la función Convertir_cm_lt que: reciba una cantidad double expresada en 
    cc (centímetros cúbicos) y devuelva un float con su equivalente en litros. Si hay algún error, retorne 0.
    */
    public static float Convertir_cm_lt (double cc ) {
        try {
           float canti_li=0;
            short conversion_cen_lit = 1000;
            canti_li = (float) cc/conversion_cen_lit;
            return  canti_li;
        } catch (Exception e) {
            return  0 ;
        }
  
    } 
   /*4.	Diseñe un algoritmo e implemente la función Convertir_us_cops que reciba una cantidad entera de dólares 
   y devuelva su equivalente en pesos usando una TRM de $4170 pesos por cada dólar. La función recibe enteros
   y devuelve enteros, pueden ser grandes. Si hay algún error, retorne -1.
   */
    public static long Convertir_us_cops (long  ndolares ) {
      try {
         long canti_peso=0;
         final short TRM = 4170;
         canti_peso= ndolares*TRM;
          return  canti_peso;
        } catch (Exception e) {
             return  -1 ;
        }
    }
    
    
  
   
   /*5.	Diseñe un algoritmo e implemente la función Convertir_cent_far que recibe la temperatura real en grados 
   centígrados y la devuelve en grados Fahrenheit (averiguar la fórmula) F = 32 + ( 9 * C / 5). Si hay algún error, 
   retorne 0.
   */
  public static double  Convertir_cent_far (double t_g_centi ) {
      try {
          double t_g_far=0;
          double form1=1.8;
           byte form2=32;
          t_g_far=  (form1*t_g_centi)+form2;
         return  t_g_far;
        } catch (Exception e) {
             return  0 ;
   }    }

  /*6.	Diseñe un algoritmo e implemente la función Calcular_segs que recibirá el número de Días, el número de horas, 
   el número de minutos y número segundos como enteros bytes, positivos y devuelva todo en segundos en un entero. 
   Si hay algún error, devuelva -1.
   */
  public static int Calcular_segs (short  dìa, short  horas, short  min, short  seg ) {
    try {
        int totl_seg=0; 
        int dia_seg=86400;
        short h_seg=3600;
        byte min_seg=60;
        totl_seg=(dìa*dia_seg)+(horas*h_seg)+(min*min_seg)+(seg);
       return  totl_seg ;
      } catch (Exception e) {
           return  -1 ;
}    }
   

   /*7.	Un usuario tiene un sistema de báscula para pesar camiones. Diseñe un algoritmo e implemente la función 
   Calcular_peso_carga que reciba un float con el peso total del camión cargado en toneladas y otro float con 
   lo que pesa el camión vacío en toneladas, y devuelva el peso neto de la carga en kilos y toneladas 
   en un string del tipo: "### kilos - ### toneladas". 
   Si hay algún error, devuelva en un string "Error en la función Calcular_peso_carga"*/

   public static String Calcular_peso_carga (float totl_pes_cam, float vacío_cam ) {
    try {
          double peso_total=0;
          int to_kg=1000;
          peso_total= totl_pes_cam - vacío_cam;
          return  ((peso_total*to_kg + " kilos - ") + (peso_total + " toneladas"));
      } catch (Exception e) {
           return  "Error en la función Calcular_peso_carga" ;
}    }
   

   /*8.	Diseñe un algoritmo e implemente la función Calcular_horasxviaje que calcule y devuelva un float con las horas  
   necesarias para alcanzar un destino que es recibido en un string, además de un short con la distancia en kms
   otro dato short que es la velocidad  promedio que alcanzará también el vehículo en kilómetros/hora.  
   Si hay algún error, devuelva -1.
   */
  public static float  Calcular_horasxviaje (String destino, short distancia, short velocidad ) {
    try {
         float horasxviaje=0;
         horasxviaje= distancia/velocidad;
          return  horasxviaje;
        } catch (Exception e) {
           return -1 ;
}    }
   

  
   
   /*9.	Un avión necesita cargar combustible para cubrir sus rutas programadas en el día. 
   Cada 0.2 toneladas de combustible puede recorrer 60.8 Km en velocidad de crucero. 
   En el despegue el avión consume 1.2 toneladas de combustible y en el aterrizaje consume 0.4 toneladas. 
   
   El piloto desea que sea diseñado un algoritmo e implementado en la función Calcular_combustible, 
   el kilometraje total para cada una de cuatro rutas que son datos enteros, y devuelva un float con la cantidad total 
   de combustible que debe ser cargado en el avión.
   
   Si hay algún error, devuelva -1.*/

   public static float  Calcular_combustible (int rut1,int rut2,int rut3,int rut4) {
      try {
           float cant_combustible = 0;
           final double despegue = 1.2*4, aterrizaje= 0.4*4 , t_recorrido = 0.2, recorrido_min = 60.8;
           cant_combustible= (float)(((rut1*t_recorrido)/recorrido_min)+((rut2*t_recorrido)/recorrido_min)+((rut3*t_recorrido)/recorrido_min)+((rut4*t_recorrido)/recorrido_min)+despegue+aterrizaje);
           return cant_combustible;
           //float cant_combustible=0;
          //double  recorrido=0.2, recorrido_min=60.8;
          //double tonelada_combustible=1.2*4, aterrizaje=0.4*4;
          //double combustibleParaRutas = ((rut1 * recorrido / recorrido_min) + (rut2 * recorrido /recorrido_min) +(rut3 * recorrido /recorrido_min) + (rut4 * recorrido / recorrido_min));
          //cant_combustible = (float) (combustibleParaRutas + aterrizaje + tonelada_combustible);
      

        
    }
         catch (Exception e) {
           return -1 ;
        }
    }   
   

   
   
   /*10. Diseñe un algoritmo e implemente la función Calcular_peso_luna que recibe un byte con el peso en la tierra en kilos
   y devuelve un double el equivalente de ese peso en la luna en Newtons. Utilice las siguientes fórmulas.
   peso_tierra_new = peso_kilos * 9.81m/s2
   peso_luna_new = peso_tierra_new * 0.165
   
   Si hay algún error, devuelva 0.
   */
  public static double Calcular_peso_luna (byte peso_kilos) {
    try {
        double peso_luna_new=0, peso_tierra_new=0;
        float gravedadTierra = 9.81f;
        float factorLuna = 0.165f;    
        peso_tierra_new = (double) (peso_kilos * gravedadTierra) ;
        peso_luna_new = (double)(peso_tierra_new * factorLuna);
      return  peso_luna_new;
     
        
    } catch (Exception e) {
           return 0 ;
}    }
   


}
