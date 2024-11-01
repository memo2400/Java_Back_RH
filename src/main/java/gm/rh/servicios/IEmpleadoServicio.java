package gm.rh.servicios;

import java.util.List;

import gm.rh.modelo.Empleado;

public interface IEmpleadoServicio {
    // aqui listaremos a todos los empleados con ALT Enter se importan las librerias.

    // La interface solo agrega la firma del metodo pero no la implementacion
    public List<Empleado> listarEmpleados();

    public Empleado buscarEmpleadoPorId(Integer idEmpleado);

    // si esta vacio se inserta , si esta lleno se hace un update
    public Empleado guardarEmpleado(Empleado empleado);

    public void eliminarEmpleado(Empleado empleado);

}
