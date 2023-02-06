package exceptions.json;


import static utils.constants.ConstantException.JSONTOMODELFAILURE;

public class JsonToModelException extends RuntimeException {

    public JsonToModelException(Throwable cause) {
        super(JSONTOMODELFAILURE);
    }

}
