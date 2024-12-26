package jpastudy.jpashop.exception;

import org.aspectj.weaver.ast.Not;

public class NotEnoughstockExeption extends RuntimeException {
    public NotEnoughstockExeption() {

    }

    public NotEnoughstockExeption(String message) {
        super(message);
    }

    public NotEnoughstockExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public NotEnoughstockExeption(Throwable cause) {
        super(cause);
    }
}
