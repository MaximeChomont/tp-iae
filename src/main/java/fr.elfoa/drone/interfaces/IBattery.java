package fr.elfoa.drone.interfaces;

import fr.elfoa.drone.impl.Module;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

public interface IBattery {

    @Inject
    List<Module> modules = new ArrayList<>();

    public void use(Integer power);
    public Integer getPower();
}
