package com.once.springservices.service;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;

/**
 * TimeServiceImpl
 */
@Service
@RequestScope
public class TimeServiceImpl implements TimeService {

    private final Calendar c;

    @Override
    public String getTiempo() {
        return c.getTime().toString();
    }

    public TimeServiceImpl() {
        c = new GregorianCalendar();
    }

    /*****************
     * DEVUELVE LA EDAD EN AÑOS A APRTIR DE LA FECHA DE NACIMIENTO****************
     */
    @Override
    public String edad(final int d, final int m, final int a) {
        /*
         * Calendar ahora = GregorianCalendar.getInstance(); // obtenemos objeto
         * Calendar momento actual y //lo guardamos en el objeto ahora
         */
        final Calendar fNacimiento = new GregorianCalendar(a, m - 1, d); // inicializamos fNacimiento como Calendar
        // con día, mes y año que nos han passado
        // (los meses empiezan desde el 0, así que hay que
        // restar 1)

        // Con el siguiente no hacemos nada, pero que sepamos que es el que nos
        // devuelve la "fecha" dentro del calendario
        Date fecha = c.getTime(); // obtenemos fecha actual mediante el atributo c propio del servicio
        // Restamos el año de nacimiento del año actual (YEAR es un ccampo de la clase
        // Calendar que hace referencia al año del objeto)
        int edad = c.get(Calendar.YEAR) - fNacimiento.get(Calendar.YEAR);
        // corregimos el resultado si el dia del nacimiento es posterior al de la fecha
        // actual porque aun no ha cumplido el año
        if (fNacimiento.get(Calendar.DAY_OF_YEAR) > c.get(Calendar.DAY_OF_YEAR)) {
            edad--;
        }
        return "La edad es " + edad; // devolvemos un String con la edad pedida
    }


    
}