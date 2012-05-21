package org.dartlang.compile;

/**
 * @author fedor.korotkov
 */
public enum Operator {
    PLUS("add"), MINUS("sub"), MULTIPLY("mul"), DIVIDE("div"),
    LOGICAL_OR("or"), LOGICAL_AND("and"), BITWISE_OR("or"), BITWISE_XOR("xor"), BITWISE_AND("and");
    private final String opcode;

    Operator(String opcode) {
        this.opcode = opcode;
    }

    public String getOpcode() {
        return opcode;
    }

    public static Operator getOperator(String token) {
        if ("+".equals(token)) {
            return PLUS;
        } else if ("-".equals(token)) {
            return MINUS;
        } else if ("*".equals(token)) {
            return MULTIPLY;
        } else if ("/".equals(token)) {
            return DIVIDE;
        }
        return null;
    }
}
