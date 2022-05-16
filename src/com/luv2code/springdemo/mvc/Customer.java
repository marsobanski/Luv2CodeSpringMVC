package com.luv2code.springdemo.mvc;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.*;

@Getter
@Setter
public class Customer {

    private String firstName;

    @NotNull(message = "is required")
    @Size(min = 1, message = "min 1")
    private String lastName;

    @Min(value = 0, message = ">= 0")
    @Max(value = 10, message = "<= 10")
    @NotNull(message = "is required")
    //żeby walidować notNull na polu liczbowym bez rzucania NumberFormatException należy dodać beana odpowiedniego typu,
        //do którego przekażemy odpowiedni message z message.properties (plik musi być src.resourcs.message.properties)
            //(typeMismatch.customer.freePasses - typ błędu, obiekt, pole)
                //jak wywołując błąd na polu wyprintuję BindingResult z CustomerController, to tam można podejrzeć te typeMismatch itp,
                //i nadpisać odpowiednio w message.properties
                //(Field error in object 'customer' on field 'freePasses': rejected value [asd]; codes [typeMismatch.customer.freePasses,typeMismatch.freePasses,typeMismatch.java.lang.Integer,typeMismatch]; arguments [org.springframework.context.support.DefaultMessageSourceResolvable: codes [customer.freePasses,freePasses]; arguments []; default message [freePasses]]; default message [Failed to convert property value of type 'java.lang.String' to required type 'java.lang.Integer' for property 'freePasses'; nested exception is java.lang.NumberFormatException: For input string: "asd"])
    private Integer freePasses;

    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "mmust be postal code pattern ")
    private String postalCode;

    //@CourseCode(value="TOPS", messsage="must start with TOPS")
    private String courseCode;
}
