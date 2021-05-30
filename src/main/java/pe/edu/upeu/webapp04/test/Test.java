package pe.edu.upeu.webapp04.test;

import pe.edu.upeu.webapp04.dao.UsuarioDao;
import pe.edu.upeu.webapp04.daoImpl.UsuarioDaoImpl;
import pe.edu.upeu.webapp04.entity.Usuario;
import pe.edu.upeu.webapp04.utils.Conexion;


public class Test {
static UsuarioDao dao = new UsuarioDaoImpl();
	public static void main(String[] args) {
		//probar la conexión
		if(Conexion.getConexion()!=null) {
			System.out.println("Conectado");
		}else {
			System.out.println("Error de conexión");
		}
		//Login
		if(dao.validar("dreyna", "1233")==1) {
			System.out.println("Usuario existe");
		}else {
			System.out.println("Usuario No existe");
		}
		//Leer todos los usuario
		System.out.println("readAll: " + dao.readAll().get(0).getUsername());
		//Leer el usuario con id = 1
		System.out.println("read: " + dao.read(1).getUsername());
		//Crear un nuevo usuario
		System.out.println("Create: "+ dao.create(new Usuario("jonas","321",1)));
		//Update usuario con id = 2
		Usuario x = new Usuario();
		x = dao.read(2);
		x.setUsername("www");
		x.setPassword("ssaa");
		System.out.println("update: "+ dao.update(x));
		//Delete usuario con id = 3
		System.out.println("eliminar: "+ dao.delete(3));
		
	}

}
