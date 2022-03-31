package factura;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProductoTest {

	@Test
	void testNuevo() {
		Producto p = new Producto("pan", 0.50f, 1);
		assertTrue(p.getNombre().equals("pan"));
		assertEquals(0.50f, p.getPrecio());
		assertEquals(1, p.getCantidad());
	}

	@Test
	void testPrecioTotal() {
		Producto p = new Producto("pan", 1.50f, 10);
		assertEquals(15, p.precioTotal());
	}
}
