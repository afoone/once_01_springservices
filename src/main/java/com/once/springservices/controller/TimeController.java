package com.once.springservices.controller;

import com.once.springservices.service.HelloService;
import com.once.springservices.service.TimeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * TimeController
 */
@Controller
public class TimeController {


    @Autowired
    private HelloService helloService;

    @Autowired
    private TimeService ts;

    @GetMapping("/time")
    @ResponseBody
    public String time(){
        return ts.getTiempo();
    }

    /**************************************************************
     * DEVUELVE LA EDAD PARTIENDO DE LA FECHA DE NACIMIENTO
     */
    @GetMapping("/edad") // mapeamos una url /edad que dispare el servicio
    @ResponseBody // lo que nos devuelve es directamente la respuesta
    public String edad(
            @RequestParam("d") Integer d, // tomamos los parametros de la url
            @RequestParam("m") Integer m, // los definimos como Integer con int no funciona
            @RequestParam("a") Integer a
            ) {

        return ts.edad(d, m, a);
    }

    
    
}