package payroll.controller.advice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import payroll.exception.EmployeeNotFoundException;

@ControllerAdvice
public class EmployeeNotFoundAdvice {

    @ResponseBody //signals that this advice is rendered straight into the response body
    @ExceptionHandler(EmployeeNotFoundException.class) // configures the advice to only respond if an EmployeeNotFoundException is thrown.
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String employeeNotFoundHandler(EmployeeNotFoundException ex) {
        return ex.getMessage();
    }
}
