package life.modawen.community.exception;

public enum CustomizeErrorCode implements ICustomizeErrorCode {
    QUESTION_NOTFOUND("你找到的问题不在了，要不要换个试试？");

    private String message;

    @Override
    public String getMessage() {
        return message;
    }
    CustomizeErrorCode(String message) {
        this.message = message;
    }
}
