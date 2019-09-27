package com.everis.equipo1examen3enviarnotificaciones.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.everis.equipo1examen3enviarnotificaciones.model.MensajeCliente;
import com.everis.equipo1examen3enviarnotificaciones.model.UbicacionCliente;

@FeignClient(name="whatsapp-proxy", url = "https://whatzmeapi.com:10501")
//@RibbonClient(name="PRACTICA-CLOUD-INVENTARIO-REST")
public interface WhatsappProxy {
	@PostMapping("/rest/api/enviar-mensaje/?token={token}")
	public String enviarmensaje(@PathVariable String token, @RequestBody MensajeCliente cliente);
	@PostMapping("/rest/api/enviar-ubicacion/?token={token}")
	public String enviarubicacion(@PathVariable String token, @RequestBody UbicacionCliente cliente);
}
