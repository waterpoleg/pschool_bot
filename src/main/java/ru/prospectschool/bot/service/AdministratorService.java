package ru.prospectschool.bot.service;

import org.jvnet.hk2.annotations.Service;
import ru.prospectschool.bot.model.Administrator;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class AdministratorService {

    private final Map<Integer, Administrator> administrators = new HashMap<Integer, Administrator>();

    public AdministratorService() {
        administrators.put(0, new Administrator(1, "Mel", "", "", new byte[]{1, 1, 1}));
    }

    public Collection<Administrator> getAll() {
        return administrators.values();
    }
}
