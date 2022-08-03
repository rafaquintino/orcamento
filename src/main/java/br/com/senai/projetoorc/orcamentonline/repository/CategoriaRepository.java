package br.com.senai.projetoorc.orcamentonline.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.senai.projetoorc.orcamentonline.orm.categ;

@Repository
public interface CategoriaRepository extends CrudRepository<categ, Integer> {

}
