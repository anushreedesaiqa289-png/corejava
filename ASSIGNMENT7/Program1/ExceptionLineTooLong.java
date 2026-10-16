
package ASSIGNMENTS.ASSIGNMENT7.Program1;
public class ExceptionLineTooLong extends Exception{
    private String message;

    ExceptionLineTooLong(){
        this.message = "The String Is Too Long";
    }

    ExceptionLineTooLong(String message){
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

}
