package CoreJava.OOPS.ImmutableClass;

public final class TestImmutableClass {
        //1>Attributes
    private final String message;
    private final Throwable throwable;

    //2>Constructor
    public TestImmutableClass(String message, Throwable throwable) {
        this.message = message;
        this.throwable = throwable;
    }

    //3>Getter
    public String getMessage() {
        return message;
    }
    public Throwable getThrowable() {
        return throwable;
    }
}
