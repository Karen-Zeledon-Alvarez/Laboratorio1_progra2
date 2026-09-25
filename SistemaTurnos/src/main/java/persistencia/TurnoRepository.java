/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;
import java.util.List;
import java.util.Optional;
import modelo.Turno;

/**
 *
 * @author karen
 */
public interface TurnoRepository {
    void guardar(Turno turno);

    void actualizar(Turno turno);

    List<Turno> listar();

    Optional<Turno> buscarPorNumero(int numero);
}
