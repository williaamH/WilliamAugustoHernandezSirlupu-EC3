package idat.EC3.WilliamAugustoHernandezSirlupu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import idat.EC3.WilliamAugustoHernandezSirlupu.model.Usuariocliente;
import idat.EC3.WilliamAugustoHernandezSirlupu.service.UsuarioClienteService;

@Controller
@RequestMapping("/usuarioCliente")
public class UsuarioClienteController {
	
	@Autowired
	private UsuarioClienteService servicio;
	
	@RequestMapping(path = "/listar", method = RequestMethod.GET)
	public ResponseEntity<List<Usuariocliente>> listar(){
		return new ResponseEntity<List<Usuariocliente>>(servicio.lista(), HttpStatus.OK);
	}
	
	@RequestMapping(path = "/guardar", method = RequestMethod.POST)
	public ResponseEntity<Void> guardar(@RequestBody Usuariocliente usuariocliente){
		servicio.guardar(usuariocliente);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@RequestMapping(path = "/listar/{id}", method = RequestMethod.GET)
	public ResponseEntity<Usuariocliente> obtenerPorId(@PathVariable Integer id){
		Usuariocliente usuariocliente = servicio.obtener(id);
		if(usuariocliente != null) {
			return new ResponseEntity<Usuariocliente>(usuariocliente, HttpStatus.OK);
		}else {
			return new ResponseEntity<Usuariocliente>(usuariocliente, HttpStatus.NOT_FOUND);
		}
	}
	
	@RequestMapping(path = "/editar", method = RequestMethod.PUT)
	public ResponseEntity<Void> editar(@RequestBody Usuariocliente usuariocliente){
		Usuariocliente u = servicio.obtener(usuariocliente.getIdUsuario());
		if(u != null) {
			servicio.actualizar(usuariocliente);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}
	
	@RequestMapping(path = "/eliminar/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> eliminar(@PathVariable Integer id){
		Usuariocliente usuariocliente = servicio.obtener(id);
		if(usuariocliente != null) {
			servicio.eliminar(id);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}

}
