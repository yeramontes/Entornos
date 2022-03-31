package factura;

import java.util.Vector;

public class Factura {
	private Vector<Producto> productos;
	
	public Factura() {
		this.productos = new Vector();
	}
	
	public void meterProducto(Producto p) {
		this.productos.add(p);
	}
	
	public float totalFactura() {
		float total = 0f;
		for(Producto p : productos) {
			total += (float)(p.getPrecio());
		}
		
		return (float)(total);
	}
	
	public float aplicarIva(float iva) {
		if(iva < 1 && iva > 0) {
			return totalFactura() + (totalFactura() * iva);
		}
		
		if(iva >= 1) {
			return totalFactura() + (totalFactura() * iva / 100);
		}
		
		else return 0;
	}
}
