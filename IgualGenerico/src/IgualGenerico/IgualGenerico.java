package IgualGenerico;

public class IgualGenerico {
	
    public static <A> boolean esIgualA(A obj1, A obj2) {
        if (obj1 == null && obj2 == null) {
            return true;
        }
        if (obj1 == null || obj2 == null) {
            return false;
        }
        return obj1.equals(obj2);
    }

    public static void main(String[] args) {
        System.out.println("Compara enteros 3 y 4 : " + esIgualA(3 , 4));  
        System.out.println("Compara enteros 10 y 10: " + esIgualA(10 , 10));  

        System.out.println("Compara null con null: " + esIgualA(null , null));  

        System.out.println("Compara null con 3: " + esIgualA(null , 3));  
        System.out.println("Compara 8 con null: " + esIgualA(8 , null)); 

        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println("Compara objeto con objeto: " + esIgualA(obj1, obj1));  
        System.out.println("Compara dos objetos diferentes: " + esIgualA(obj1, obj2));  

        Integer int1 = 14;
        Integer int2 = 14;
        Integer int3 = 12;
        System.out.println("Compara enteros 14 y 14: " + esIgualA(int1, int2));  
        System.out.println("Compara enteros 14 y 12: " + esIgualA(int1, int3));  

        String str1 = "manzana";
        String str2 = "pera";
        String str3 = "manzana";
        System.out.println("Compara cadena de caracteres manzana y pera: " + esIgualA(str1, str2));  
        System.out.println("Compara cadena de caracteres manzana y manzana: " + esIgualA(str1, str3));  
    }
}
