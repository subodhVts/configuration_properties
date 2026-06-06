package in.ashokit.exception;

import java.time.LocalDate;

import lombok.Data;

@Data
public class ExInfo {
	private String ExCode;
	private String ExMsg;
	private LocalDate date;
	

}
