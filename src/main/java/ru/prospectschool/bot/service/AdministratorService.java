package ru.prospectschool.bot.service;

import ru.prospectschool.bot.model.Administrator;
import ru.prospectschool.bot.model.Contacts;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class AdministratorService {

    private final Map<Integer, Administrator> administrators = new HashMap<Integer, Administrator>();

    public AdministratorService() {
        administrators.put(
                0, new Administrator(
                     1,
                     "Olga",
                     "",
                     0,
                     "",
                        new Contacts(
                                "Address",
                                "email",
                                "Phone"
                        )
                )
        );
    }

    public Collection<Administrator> getAll() {
        return administrators.values();
    }
}
