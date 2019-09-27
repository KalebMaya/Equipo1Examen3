package com.everis.equipo1examen3enviarnotificaciones.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.equipo1examen3enviarnotificaciones.model.MensajeCliente;
import com.everis.equipo1examen3enviarnotificaciones.model.UbicacionCliente;
import com.everis.equipo1examen3enviarnotificaciones.proxy.WhatsappProxy;
import com.everis.equipo1examen3enviarnotificaciones.service.ServicioEmail;

@RestController
public class EnviarNotificacionesController {
	
	@Autowired
	private WhatsappProxy whatsappProxy;
	
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
	
	@PostMapping("/pedido/")
	public String convert() {
		String respuesta = "";
		try {
			if(tiponotificacion.equals("whatsapp") || tiponotificacion.equals("ambas")) {
				MensajeCliente mensaje = new MensajeCliente();
				mensaje.setMensaje("prueba de mensaje del examen");
				mensaje.setNumero(whatsappdestino);
				UbicacionCliente ubicacion = new UbicacionCliente();
				ubicacion.setDireccion("Casa del cliente");
				ubicacion.setLatitud(19.4326009);
				ubicacion.setLongitud(-99.1333416);
				ubicacion.setNumero(whatsappdestino);
				whatsappProxy.enviarubicacion(whatzmeapitoken, ubicacion);
				respuesta = whatsappProxy.enviarmensaje(whatzmeapitoken, mensaje);
			}if(tiponotificacion.equals("email") || tiponotificacion.equals("ambas")) {
				servicioEmail.enviarCorreo(emaildestino, "Correo de prueba", "ya envia");
				respuesta = "email";
			}if(tiponotificacion.equals("ambas")) {
				respuesta = "ambas";
			}
			return respuesta;
		} catch (Exception e) {
			return "fallo";
		}
	}
	

}
