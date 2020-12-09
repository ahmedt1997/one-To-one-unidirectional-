package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
/*@CrossOrigin("*")
@RepositoryRestResource*/
public interface Instruction_detailsRepository extends JpaRepository<Instructors_details,Long> {
	
	/*
	 * @RestResource(path = "/byDesignation") public List<Produits>
	 * findByDesignationsContains(@Param("mc") String s);
	 */
	


}
