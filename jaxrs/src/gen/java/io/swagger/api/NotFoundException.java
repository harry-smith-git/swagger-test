package io.swagger.api;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-11-13T02:03:11.802Z")
public class NotFoundException extends ApiException {
    private int code;
    public NotFoundException (int code, String msg) {
        super(code, msg);
        this.code = code;
    }
}
