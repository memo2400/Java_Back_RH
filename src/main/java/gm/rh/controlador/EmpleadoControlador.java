package gm.rh.controlador;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gm.rh.modelo.Empleado;
import gm.rh.servicios.EmpleadoServicio;
import gm.rh.servicios.IEmpleadoServicio;

@RestController             // co este recibimos y hacemos peticones http
@RequestMapping("rh-app")             // como es a nivel clase se usa parentesis, seran localhost/rh-app
@CrossOrigin("http://localhost:3000")            // esta recibira peticones del fron que esta en port 3000
public class EmpleadoControlador {

    private static final Logger logger =         // con esta enviaremos cosas a consola
    LoggerFactory.getLogger(EmpleadoControlador.class);

    @Autowired
    private IEmpleadoServicio empleadoServicio;

    //se agrega funcion para consultad todos loa empleados
    @GetMapping("/empleados")
    public List<Empleado> obtenerEmpleados() {
        var empleados = empleadoServicio.listarEmpleados();
        // mandamos a imprimir el show
        // enla consola se ve asi, Hibernate: select e1_0.id_empleado,e1_0.departamento,e1_0.nombre,e1_0.sueldo from empleado e1_0
        empleados.forEach((empleado -> logger.info(empleado.toString())));        // expresion lambda para procesar cada entrada

        return empleados;

    }
}
