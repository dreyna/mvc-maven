package webapp04;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import pe.edu.upeu.webapp04.dao.UsuarioDao;
import pe.edu.upeu.webapp04.daoImpl.UsuarioDaoImpl;

public class UsuarioTest {
	private UsuarioDao udao;
	@Before
	public void before() {
		udao = new UsuarioDaoImpl();
	}
	@Test
	public void validar() {
		int resultado = udao.validar("dreyna", "123");
		int esperado = 1;
		assertEquals(esperado, resultado);
	}

}
