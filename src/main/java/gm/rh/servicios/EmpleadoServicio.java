package gm.rh.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gm.rh.modelo.Empleado;
import gm.rh.repositorio.EmpleadoRepositorio;

// esta calse sera un objeto/bin de spring solo con @Service se puede usar por spring esta clase
@Service
public class EmpleadoServicio implements IEmpleadoServicio{

    // Con esto comunicaremos a Repositorio de Servicio a la Base de datos
    @Autowired
    private EmpleadoRepositorio empleadoRepositorio;

    @Override
    public List<Empleado> listarEmpleados() {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'listarEmpleados'");
        return empleadoRepositorio.findAll();
    }

    // @Override
    // public Empleado buscarEmpleado(Integer idEmpleado) {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'buscarEmpleado'");
    //     Empleado empleado = empleadoRepositorio.findById(idEmpleado);
    // }

    @Override
    public Empleado buscarEmpleadoPorId(Integer idEmpleado) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'buscarEmpleadoPorId'");
        
        // aqui si no nomnemos el or else, marca error, si no hay empleado es null
        Empleado empleado = empleadoRepositorio.findById(idEmpleado).orElse(null);
        return empleado;
    }

    @Override
    public Empleado guardarEmpleado(Empleado empleado) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'guardarEmpleado'");

        // guarda, acrualiza o inserta el empleado, y nos regresa ese Empleado
        return empleadoRepositorio.save(empleado);
        
    }

    @Override
    public void eliminarEmpleado(Empleado empleado) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'eliminarEmpleado'");

        empleadoRepositorio.delete(empleado);
    }


}
