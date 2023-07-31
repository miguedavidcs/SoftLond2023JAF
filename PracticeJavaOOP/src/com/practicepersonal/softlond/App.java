package com.practicepersonal.softlond;

import com.practicepersonal.softlond.model.Persona;
import com.practicepersonal.softlond.service.IPersonaService;
import com.practicepersonal.softlond.service.PersonaServiceImpl;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Persona p1 = new Persona(1,"Miguel");
        IPersonaService personaService = new PersonaServiceImpl();
        personaService.registrar(p1);

    }
}
