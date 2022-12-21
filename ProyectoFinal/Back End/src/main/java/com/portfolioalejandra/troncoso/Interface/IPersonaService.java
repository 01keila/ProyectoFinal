package com.portfolioalejandra.troncoso.Interface;

import com.portfolioalejandra.troncoso.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //traer lista de personas
    public List<Persona> getPersona();
    
    //guardar un objeto de tipo persona
    public void savePersona(Persona persona);
    
    //eliminar un objeto buscado por id
    public void deletePersona(Long id);
    
    //buscar persona por id
    
    public Persona findPersona(Long id);
    
    
}
