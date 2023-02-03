/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javadoc;

/**
 *
 * @author Víctor Bleda
 */
public class JavaDoc {

    /**
     * @param args the command line arguments
     */
    /**
     *
     * La clase Password se encarga de generar una contraseña aleatoria y
     * comprobar su fortaleza.
     *
     * @author Víctor Bleda
     * @version 1.5
     */
    public final class Password {

        /**
         *
         * Longitud por defecto de la contraseña.
         */
        private final static int LONG_DEF = 8;
        /**
         *
         * Longitud de la contraseña.
         */
        private int longitud;
        /**
         *
         * Contraseña generada.
         */
        private String contraseña;

        /**
         *
         * Método que devuelve la longitud de la contraseña.
         *
         * @return La longitud de la contraseña.
         */
        public int getLongitud() {
            return longitud;
        }

        /**
         *
         * Método que establece la longitud de la contraseña.
         *
         * @param longitud La longitud de la contraseña.
         */
        public void setLongitud(int longitud) {
            this.longitud = longitud;
        }

        /**
         *
         * Método que devuelve la contraseña.
         *
         * @return La contraseña.
         */
        public String getContraseña() {
            return contraseña;
        }

        /**
         *
         * Método que genera una contraseña aleatoria con longitud establecida.
         *
         * @see Math#random()
         * @see Math#floor()
         * @return La contraseña generada.
         */
        public String generaPassword() {
            String password = "";
            for (int i = 0; i < longitud; i++) {
                int eleccion = ((int) Math.floor(Math.random() * 3 + 1));
                if (eleccion == 1) {
                    char minusculas = (char) ((int) Math.floor(Math.random()
                    (123-97)+97));
password += minusculas;
                } else {
                    if (eleccion == 2) {
                        char mayusculas = (char) ((int) Math.floor(Math.random()
                        (91-65)+65));
password += mayusculas;
                    } else {
                        char numeros = (char) ((int) Math.floor(Math.random() * (58 - 48) + 48));
                        password += numeros;
                    }
                }
            }
            return password;
        }

        /**
         *
         * Método que comprueba si la contraseña es fuerte.
         *
         * @see String#charAt()
         * @return Verdadero si la contraseña es fuerte, falso en caso
         * contrario.
         */
        public boolean esFuerte() {
            int cuentanumeros = 0;
            int cuentaminusculas = 0;
            int cuentamayusculas = 0;
            for (int i = 0; i < contraseña.length(); i++) {
                if (contraseña.charAt(i) >= 97 && contraseña.charAt(i) <= 122) {
                    cuentaminusculas += 1;
                } else {
                    if (contraseña.charAt(i) >= 65 && contraseña.charAt(i)
    
 {
                        
                    }
                }
