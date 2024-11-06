package gm.rh.excepcion;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// usamos el runtimeexcep, para wue no hagamos todo nosostros
// nost found es el 404 error
@ResponseStatus (value = HttpStatus.NOT_FOUND)
public class RecursoNoEncontradoExcepcion extends RuntimeException {

    // cosntrucctor de la clase
    public RecursoNoEncontradoExcepcion(String mensaje){
    // llamamos el contructor de la clase padre
    super(mensaje);
    }
}
