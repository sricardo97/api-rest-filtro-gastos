package br.com.santander.api.services;

import java.util.List;

import br.com.santander.api.documents.Gasto;

public interface GastoService {

	List<Gasto> findByData(final String data);
}