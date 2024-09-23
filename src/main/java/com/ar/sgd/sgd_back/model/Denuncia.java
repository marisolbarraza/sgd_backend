package com.ar.sgd.sgd_back.model;

import java.time.LocalDate;

public class Denuncia {

    //Armar una clase que consuma esos datos desde el servidor cuando se encienda, chequee y deje para completar
    /*
    * 1. Cuando inicie el servicio o cuando se lo solicite, cargar las denuncias
    * 2. El sistema checkea que el sistema se
    *
    * */

    //Lo que viene de la api del MPF
    private long idDenuncia; //si
    private Localidad localidad;//Si
    private Comisaria comisaria;//si
    private LocalDate fechaDenuncia; //SI
    private LocalDate fechaHecho;
    private TipoDelito tipoDelito;//Si
    //private Ubicación ubicacion //SI
    private String Denunciante //si
    private int edad;//si

    //Lo que completan
    private String aprehendido; //p
    private String conMedida; //p
    private String interes;//p
    private String seguro;//p
    private String elementosSustraidos;//p
    private TipoArma tipoArma;
    private Submodalidad submovilidad;
    private Autor autor;
    private Victima victima;
    private Especializacion especializacion;

    private String fiscalia; //NO


}
