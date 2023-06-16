package domesticpro.com.domesticpro.services;

import domesticpro.com.domesticpro.entities.Empleado;
import domesticpro.com.domesticpro.entities.Empleador;
import org.springframework.data.crossstore.ChangeSetPersister;

import java.util.List;

public interface IEmpleadorService {

    public void insert(Empleador empleador);

    List<Empleador> list();

    Empleador listId(Integer id) throws ChangeSetPersister.NotFoundException;

}
