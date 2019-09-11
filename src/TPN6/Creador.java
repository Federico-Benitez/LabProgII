package TPN6;

import java.io.BufferedReader;
import java.net.URLConnection;
import java.util.*;

public class Creador {//Clase para construir las contraseñas

    //Caracteres necesarios para crear la contraseña
    public static final String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String lower = upper.toLowerCase(Locale.ROOT);
    public static final String numbers = "0123456789";

    private String[] arrayPasswords;
    private int length;

    public Creador(int cantidad,int length){
        this.arrayPasswords = new String[cantidad];
        this.length=length;
    }

    public void buildPassword(){
        //La contraseña debera estar compuesta por Mayusculas, minusculas y numeros
        //recorrer arreglo y ir creando contraseñas

        char caracter;//para ir cargando
        int valorAnterior = 0;
        int numRandom =0;

        for (int i=0;i<arrayPasswords.length;i++) {
            StringBuilder sb = new StringBuilder(); //se usa para ir guardando caracter por caracter
            for (int x = 0; x < this.length; x++) {//para crear una contraseña

                do{//evita que se repita el mismo tipo de caracter seguido
                    numRandom=(int) (Math.random() * 3)+1;
                }while(numRandom==valorAnterior);

                switch (numRandom) {
                    case 1://letra mayuscula
                        caracter = this.upper.charAt((int) (Math.random() * upper.length()));//se asigna una letra mayuscula
                        sb.append(caracter);//se concatena al string que contiene la contraseña
                        break;
                    case 2://letra minuscula
                        caracter = this.lower.charAt((int) (Math.random() * lower.length()));//se asigna una letra minuscula
                        sb.append(caracter);
                        break;
                    case 3://numerico
                        caracter = this.numbers.charAt((int) (Math.random() * numbers.length()));//se asigna un caracter numerico
                        sb.append(caracter);
                        break;
                    default:
                        break;
                }
                valorAnterior = numRandom;//resguardar que tipo de caracter fue para evitar repeticiones de tipo seguidas
            }
            arrayPasswords[i]=sb.toString();//guardar contraseña creada en el array que contiene las contraseñas
            sb=null;
        }
    }

    public String testPassword(String password){
        //Evalua si es segura la contraseña
        //Si la contraseña tiene 5 o mas numeros y tiene una minuscula y dos mayusculas ->segura
        int contNumeros=0,contMinusculas=0,contMayus=0;

        List<Character> cMinus = convertStringToCharList(lower);
        List<Character> cMayus = convertStringToCharList(upper);


        for (int x=0;x<password.length();x++){//recorrer caracteres del string
            if ((cMayus).contains(password.charAt(x))){
                contMayus++;
            }else{
                if ((cMinus).contains(password.charAt(x))){
                    contMinusculas++;
                }else{
                    contNumeros++;
                }
            }
        }
        if (contNumeros>=5 && contMinusculas >=1 && contMayus >= 2){
            return "Segura";
        }else{
            return "Insegura";
        }
        //comprobar si es segura


    }

    public void showPasswords(){
        for (int i=0;i<this.arrayPasswords.length;i++){
            System.out.println("contraseña "+i+": "+arrayPasswords[i]+" || "+this.testPassword(arrayPasswords[i])+" || Cantidad de caracteres: "+this.getLongitud());
        }
        //System.out.println("");
    }

    public String getPassword(int num){//Devuelve contraseña generada
        return arrayPasswords[num];
    }

    public int getLongitud(){//Devuelve la longitud de la contraseña
        return length;
    }

    public static List<Character> convertStringToCharList(String str){

        //Crea una lista vacia de caracteres
        List<Character> chars = new ArrayList<>();


        //Para cada caracter en el String, lo añado a la lista
        for (char ch : str.toCharArray()) {
            chars.add(ch);
        }

        //devuelvo la lista
        return chars;
    }

}
