package factura;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FacturaTest {
	
	Producto uno = new Producto("pan", 1.50f, 10);
	Producto dos = new Producto("queso", 10f, 2);
	Producto tres = new Producto("atun", 3.70f, 5);
	
	@Test
	void testTotalFactura() {
		Factura f = new Factura();
		f.meterProducto(uno);
		f.meterProducto(dos);
		f.meterProducto(tres);
		assertEquals(15.20f, f.totalFactura());
	}
	
	@Test
	void testAplicarIva() {
		Factura f = new Factura();
		f.meterProducto(uno);
		f.meterProducto(dos);
		f.meterProducto(tres);
		assertEquals(18.392f, f.aplicarIva(0.21f));
	}

}
