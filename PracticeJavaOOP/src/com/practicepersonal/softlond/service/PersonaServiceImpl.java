package com.practicepersonal.softlond.service;

import com.practicepersonal.softlond.model.Persona;

public class PersonaServiceImpl implements IPersonaService{

    @Override
    public void registrar(Persona persona) {
        System.out.println(persona + " regsitrada");
    }
    
}
