package com.generation.beans;
// Generated 8/09/2018 07:09:43 PM by Hibernate Tools 4.3.1



/**
 * Topics generated by hbm2java
 */
public class Topics  implements java.io.Serializable {


     private Integer idTopic;
     private String nombreTopic;
     private Integer modulesIdModule;

    public Topics() {
    }

    public Topics(String nombreTopic, Integer modulesIdModule) {
       this.nombreTopic = nombreTopic;
       this.modulesIdModule = modulesIdModule;
    }
   
    public Integer getIdTopic() {
        return this.idTopic;
    }
    
    public void setIdTopic(Integer idTopic) {
        this.idTopic = idTopic;
    }
    public String getNombreTopic() {
        return this.nombreTopic;
    }
    
    public void setNombreTopic(String nombreTopic) {
        this.nombreTopic = nombreTopic;
    }
    public Integer getModulesIdModule() {
        return this.modulesIdModule;
    }
    
    public void setModulesIdModule(Integer modulesIdModule) {
        this.modulesIdModule = modulesIdModule;
    }




}

