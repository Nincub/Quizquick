package com.generation.beans;
// Generated 8/09/2018 07:09:43 PM by Hibernate Tools 4.3.1



/**
 * Modules generated by hbm2java
 */
public class Modules  implements java.io.Serializable {


     private Integer idModule;
     private String nombreModule;

    public Modules() {
    }

    public Modules(String nombreModule) {
       this.nombreModule = nombreModule;
    }
   
    public Integer getIdModule() {
        return this.idModule;
    }
    
    public void setIdModule(Integer idModule) {
        this.idModule = idModule;
    }
    public String getNombreModule() {
        return this.nombreModule;
    }
    
    public void setNombreModule(String nombreModule) {
        this.nombreModule = nombreModule;
    }




}

