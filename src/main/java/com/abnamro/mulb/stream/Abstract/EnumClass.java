package com.abnamro.mulb.stream.Abstract;
enum Status {
    SUCCESS,
    FAILURE,
    PENDING
}
public class EnumClass {
    public static void main(String[] args) {
        Status status = Status.SUCCESS;
        switch (status) {
            case SUCCESS:
                System.out.println("Operation was successful.");
                break;
            case FAILURE:
                System.out.println("Operation failed.");
                break;
            case PENDING:
                System.out.println("Operation is pending.");
                break;
            default:
                System.out.println("Unknown status.");
        }
    }
}
