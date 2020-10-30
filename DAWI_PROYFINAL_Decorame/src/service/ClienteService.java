package service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import model.Cliente;
import mybatis.MyBatisUtil;
import mybatis.mapper.IClienteMapper;

public class ClienteService implements IClienteMapper {

	@Override
	public void create(Cliente t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Cliente t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer v) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Cliente> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente find(Integer v) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente validarAcceso(Cliente cliente) {
		Cliente objCliente = null;
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();
		try {
			IClienteMapper clienteMapper = session.getMapper(IClienteMapper.class);
			objCliente = clienteMapper.validarAcceso(cliente);
		} catch (Exception e) {
			System.out.println("Error al validar el acceso. " + e.getMessage());
		} finally {
			session.close();
		}
		
		return objCliente;
	}

}
