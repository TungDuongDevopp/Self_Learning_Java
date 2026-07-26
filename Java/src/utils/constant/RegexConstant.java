package utils.constant;

public final class RegexConstant {
    public static final String EMAIL = "^[a-zA-Z0-9._-]+@[a-zA-Z0-9-]+(\\.[a-zA-Z]{2,})$";
    public static final String CCCD = "^(00[1-9]|0[1-8][0-9]|09[0-6])\\d{9}$";
    public static final String PASSWORD ="^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&!_])[A-Za-z\\d@#$%^&!_]{6,20}$";
    public static final String PHONE = "^(03|05|07|09)\\d{8}$";

    private RegexConstant() {}
}
