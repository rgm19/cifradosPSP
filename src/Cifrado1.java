import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class Cifrado1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String texto="--Mensaje que cifraremos...";
        String cad="";
        MessageDigest md = null; //siempre necesario ponerlo e inicializarlo a null || 1ºpaso!!!!!!!!!
        try {
            md =MessageDigest.getInstance("SHA-512");// 2ºpaso!!!!!!!!!
        } catch (NoSuchAlgorithmException ex) {
            System.err.println("Error algoritmo SHA-256 no disponible");
        }
        //Trabajamos a la fuerza con bytes, pasamos el texto a bytes y ciframos
        //guardando en array de bytes
        md.update(texto.getBytes()); //3ºpaso!!!!!!!!!!!!
        byte [] cifrado = md.digest(); //guarda en un array de bits ya codificado || 4ºpaso !!!!!!!!!!
        //Pasamos a base 64 para visualizar el array de bytes
        Base64.Encoder codi = Base64.getEncoder();
        String ba = codi.encodeToString(cifrado);
        System.out.println("Frase en BASE64: " + ba +"\n");
        //O lo pasamos a hexadecimal
        for(byte aux : cifrado) {
            
            int b = aux & 0xff;
            if (Integer.toHexString(b).length() == 1) cad += "0"; // Los numeros de 0 a F los pone 00, 01, ...., 0F
            cad += Integer.toHexString(b);
        }
        System.out.println("Hexadecimal: " + cad);
    }
   
}
