package br.com.ulbra.as_poo.Repository;

import br.com.ulbra.as_poo.Model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
