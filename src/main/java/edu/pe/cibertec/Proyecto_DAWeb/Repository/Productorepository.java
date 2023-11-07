package edu.pe.cibertec.Proyecto_DAWeb.Repository;

import edu.pe.cibertec.Proyecto_DAWeb.Model.bd.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Productorepository extends JpaRepository<Producto,Integer> {
}
