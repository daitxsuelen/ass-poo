package br.com.ulbra.as_poo.Repository;

import br.com.ulbra.as_poo.Model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository <Categoria, Long> {
}
