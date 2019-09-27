package com.everis.equipo1examen3enviarnotificaciones.repository;

public interface EmailRepository {
	
	public void enviarCorreo(String email, String asunto, String texto);
	public void enviarCorreoHTML(String email, String asunto, String html);
}
