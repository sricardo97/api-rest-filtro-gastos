package br.com.santander.api.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.santander.api.documents.Gasto;
import br.com.santander.api.repositories.GastoRepository;
import br.com.santander.api.services.GastoService;

@Service
public class GastoServiceImpl implements GastoService {

	@Autowired
	private GastoRepository gastoRespository;

	@Override
	public List<Gasto> findByData(final String data) {
		return this.gastoRespository.findByData(data);
	}
}
