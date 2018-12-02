package pl.piterpti.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

@Service
public class MapValidationErrorService {

	public ResponseEntity<?> MapValidationService(BindingResult result) {

		if (result.hasErrors()) {

			Map<String, String> errorsMap = new HashMap<>();
			result.getFieldErrors().stream().forEach(err -> errorsMap.put(err.getField(), err.getDefaultMessage()));

			return new ResponseEntity<Map<String, String>>(errorsMap, HttpStatus.BAD_REQUEST);
		}

		return null;
	}

}
