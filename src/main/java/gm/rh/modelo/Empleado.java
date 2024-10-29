package gm.rh.modelo;

import jakarta.persistence.Entity;      // con ello se crea la tabla bd en autmatico
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;                     // para crear los get y setters automarticos.
import lombok.NoArgsConstructor;        // consturctor sin argumentos
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)     // se genera en automatico la llave primaria.
    
    Integer idEmpleado;
    String nombre;
    String departamento;
    Double sueldo;

}
