package mybatis.mapper;

import model.Cliente;

public interface IClienteMapper extends IEntidadMapper<Cliente, Integer>{
	public Cliente validarAcceso(Cliente cliente);
}
