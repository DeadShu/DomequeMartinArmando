/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DomequeMartinArmando
 * @see Main
 * @since 02-02-2022
 */


public class CCuenta {
  
    public String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    private float cantidad;

    /**Constructor vacío para crear un objeto sin datos*/
    public CCuenta() 
    {
    }

    /**Devuelve el nombre de la cuenta
     * @return nombre de la cuenta
     */
    public String getNombre() {
        return nombre;
    }

    /**Establece el nombre de la cuenta
     @param nombre Asigna a la cuenta el nombre pasado por parametro*/
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**Devuelve el número de cuenta
     * @return número de la cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**Establece el número de cuenta
     @param cuenta Asigna a la cuenta el valor pasado por parámetro*/
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**Devuelve el saldo de la cuenta
     * @return saldo de la cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /**Establece el saldo de cuenta
     @param saldo Asigna a la cuenta el saldo pasado por parámetro*/
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**Devuelve el tipo de interés de la cuenta
     * @return tipo de interés de la cuenta
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**Establece el tipo de interés de cuenta
     @param tipoInterés  Asigna a la cuenta el tipo de interés pasado por parámetro*/
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**Cosntructor de la CCuenta para ininializar el objeto con parámetros
     * @param nom Asigna a la cuenta el valor pasado por parámetro
     * @param cue Indica el número de cuenta
     * @param sal Indica el saldo de la cuenta
     * @param tipo Indica el tipo de interés de la cuenta
     * @param cantidad Indica la cantidad de la cuenta
     */
    
    public CCuenta(String nom, String cue, double sal, double tipo, float cantidad) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
        this.cantidad = cantidad;

    }

    /**Devuelve el saldo de la cuenta
     * @return saldo de la cuenta
     */
    public double estado() {

        return saldo;

    }
    
    /**Devuelve la cantidad de la cuenta
     * @return cantidad de la cuenta
     */
    public double cantidad() {

        return cantidad;

    }

    /**Este método ingresa en la cuenta un saldo dado
    * @param cantidad Establece la cantidad que se va a ingresar
    * @throws  Exception por si no se puede intresar el dinero
    */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        saldo = saldo + cantidad;
    }

    /**Este método retira en la cuenta un saldo dado
    * @param cantidad Establece la cantidad que se va a retirar
    * @throws Exception por si no se puede retirar el dinero
    */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        saldo = saldo - cantidad;
    }

}
