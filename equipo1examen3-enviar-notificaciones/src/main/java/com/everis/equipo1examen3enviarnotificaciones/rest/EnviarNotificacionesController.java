package com.everis.equipo1examen3enviarnotificaciones.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.everis.equipo1examen3enviarnotificaciones.model.MensajeCliente;
import com.everis.equipo1examen3enviarnotificaciones.model.Pedido;
import com.everis.equipo1examen3enviarnotificaciones.model.Producto;
import com.everis.equipo1examen3enviarnotificaciones.model.Productosdelpedido;
import com.everis.equipo1examen3enviarnotificaciones.model.UbicacionCliente;
import com.everis.equipo1examen3enviarnotificaciones.proxy.ProductosProxy;
import com.everis.equipo1examen3enviarnotificaciones.proxy.WhatsappProxy;
import com.everis.equipo1examen3enviarnotificaciones.service.ServicioEmail;

@RestController
public class EnviarNotificacionesController {
	
	@Autowired
	private WhatsappProxy whatsappProxy;
	
	@Autowired
	private ProductosProxy productosProxy;
	
	@Autowired
	private ServicioEmail servicioEmail;
	
	@Value("${config.tiponotificacion}")
	private String tiponotificacion;
	@Value("${config.whatzmeapitoken}")
	private String whatzmeapitoken;
	@Value("${config.whatsappdestino}")
	private String whatsappdestino;
	@Value("${config.emaildestino}")
	private String emaildestino;
	
	@GetMapping("/pedido/")
	public List<Pedido> checar() {
		return productosProxy.listar();
	}
	
	@PostMapping("/pedido/idproductos/{idproductos}")
	public String convert(@PathVariable String idproductos, @RequestBody Pedido pedido) {
		Pedido pedidoinsertado = productosProxy.insertaPedido(pedido);
		String[] listaproductos = idproductos.split(",");
		String respuesta = "";
		for (String idproducto : listaproductos) {
				Integer.parseInt(idproducto);
				Productosdelpedido productosdelpedido = new Productosdelpedido();
				Producto producto = new Producto();
				producto.setId(Integer.parseInt(idproducto));
				productosdelpedido.setPedido(pedidoinsertado);
				productosdelpedido.setProducto(producto);
				respuesta += "producto: " + productosProxy.insertaProductoPedido(productosdelpedido).getProducto().getNombre() + ",";
			}
			try {
			if(tiponotificacion.equals("whatsapp") || tiponotificacion.equals("ambas")) {
				MensajeCliente mensaje = new MensajeCliente();
				mensaje.setMensaje(respuesta);
				mensaje.setNumero(whatsappdestino);
				UbicacionCliente ubicacion = new UbicacionCliente();
				ubicacion.setDireccion("Casa de " + pedido.getCliente().getNombre());
				ubicacion.setLatitud(pedido.getCliente().getLatitud());
				ubicacion.setLongitud(pedido.getCliente().getLongitud());
				ubicacion.setNumero(whatsappdestino);
				whatsappProxy.enviarubicacion(whatzmeapitoken, ubicacion);
				whatsappProxy.enviarmensaje(whatzmeapitoken, mensaje);
			}if(tiponotificacion.equals("email") || tiponotificacion.equals("ambas")) {
				servicioEmail.enviarCorreo(emaildestino, "Productos comprados", respuesta);
			}
			return respuesta;
		} catch (Exception e) {
			return e.getMessage();
		}
	}
	

}
