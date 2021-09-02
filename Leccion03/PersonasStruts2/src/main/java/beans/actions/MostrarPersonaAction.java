/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author iblazquezc
 */
public class MostrarPersonaAction extends ActionSupport{
        
    Logger log = LogManager.getLogger(SaludarAction.class);
    
    private String nombre;
    
    @Override
    public String execute(){
        log.info("El nombre es:" + this.nombre);
        return SUCCESS;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
