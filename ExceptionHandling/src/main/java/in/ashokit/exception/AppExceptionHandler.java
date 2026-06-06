package in.ashokit.exception;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppExceptionHandler {
   
	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<ExInfo> handleAllException(Exception e) {
		ExInfo  info = new ExInfo();
		info.setExCode("AP001");
		info.setExMsg(e.getMessage());
		info.setDate(LocalDate.now());
		return new ResponseEntity<>(info, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
