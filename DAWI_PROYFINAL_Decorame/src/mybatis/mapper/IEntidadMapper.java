package mybatis.mapper;

import java.util.List;

public interface IEntidadMapper<T, V> {
	public void create(T t);
	public void update(T t);
	public void delete(V v);
	
	public List<T> findAll();
	public T find(V v);
	
}
