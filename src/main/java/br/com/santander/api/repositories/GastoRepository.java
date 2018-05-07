package br.com.santander.api.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import br.com.santander.api.documents.Gasto;

public interface GastoRepository extends MongoRepository<Gasto, String> {

	@Query("{ 'data' : ?0 }")
	List<Gasto> findByData(final String data);
}
