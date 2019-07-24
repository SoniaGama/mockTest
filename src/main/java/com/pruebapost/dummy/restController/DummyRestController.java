package com.pruebapost.dummy.restController;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.pruebapost.dummy.model.ModelEntity;

@RestController
public class DummyRestController {

	@RequestMapping(method = RequestMethod.POST, value = "/entity")
	@ResponseStatus(value = HttpStatus.OK)
	public String entity(@RequestParam(value = "postTest", required = true) @RequestBody ModelEntity entity) {
		return "respuesta dummy de test post C:";
	}

}
