package com.company;

public class DataTypesTester {

    public static void testByte() {

        System.out.println("TestByte:");
        byte a = 4;
        byte b = 2;
        byte c;

        System.out.println("\n***** Arithmetical Operators *****");
        // addition
        c = (byte) (a + b);
        System.out.printf("%d + %d = %d\n", a, b, c);
        // subtraction
        c = (byte) (a - b);
        System.out.printf("%d - %d = %d\n", a, b, c);
        // multiplication
        c = (byte) (a * b);
        System.out.printf("%d * %d = %d\n", a, b, c);
        // division
        c = (byte) (a / b);
        System.out.printf("%d / %d = %d\n", a, b, c);
        // modulus
        c = (byte) (a % b);
        System.out.printf("%d %% %d = %d\n", a, b, c);
        // c = a / 0; --> Arithmetical Exception
        a = 5;
        // unary minus
        b = (byte) (-a);
        System.out.printf("-%d = %d\n", a, b);
        // unary plus
        b = (byte) (+a);
        System.out.printf("+%d = %d\n", a, b);
        // prefix increment
        a = 10;
        System.out.printf("++%d = %d\n", a, ++a);
        // postfix increment
        a = 10;
        System.out.printf("%d++ = %d\n", a, a++);
        // prefix decrement
        a = 15;
        System.out.printf("--%d = %d\n", a, --a);
        // postfix decrement
        a = 15;
        System.out.printf("%d-- = %d\n", a, a--);

        System.out.println("\n***** Bitwise Operators *****");

        // bitwise AND
        c = (byte) (a & b);

        System.out.printf("%d & %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));

        // bitwise OR
        c = (byte) (a | b);
        System.out.printf("%d | %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));

        // bitwise XOR
        c = (byte) (a ^ b);

        System.out.printf("%d ^ %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));

        // bitwise unary compliment
        c = (byte) (~a);

        System.out.printf("~%d = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n", Integer.toBinaryString(a),Integer.toBinaryString(c));

        // left shift
        c = (byte) (a << 1);

        System.out.printf("%d << 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        // right shift
        c = (byte) (a >> 1);

        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        // right shift
        a = -5;
        c = (byte) (a >> 1);
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        // zero fill right shift
        a = 5;
        c = (byte) (a >>> 1);
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        // zero fill right shift
        a = -5;
        c = (byte) (a >>> 1);
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        System.out.println("\n***** Assignment Operators *****");
        c = 7;

        //assignment arithmetical operators

        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
        // c %= 0; --> Arithmetical Exception
        // c /= 0; --> Arithmetical Exception
        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
        System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
        System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
        System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);

        System.out.println("\n***** Relational Operators *****");
        // greater than
        System.out.printf("%d > %d --> %b\n", a, b, a > b);
        // greater than or equal to
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
        // less than
        System.out.printf("%d < %d --> %b\n", a, b, a < b);
        // less than or equal to
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
        // equal to
        System.out.printf("%d == %d --> %b\n", a, b, a == b);
        // not equal to
        System.out.printf("%d != %d --> %b\n", a, b, a != b);

        System.out.println("\n***** Logical Operations *****");

        // logical AND
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a, (a > b) && (a > 0));
        // bitwise logical AND
        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a, (a > b) & (a > 0));
        // logical OR
        System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));
        // bitwise logical OR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));
        // logical XOR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) ^ (b != 0));
        // logical NOT
        System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));

        System.out.println("\n***** Misc Operators *****");
        System.out.println("\nCondition Operator:");

        System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b,
                (a > b ? a : b));

        System.out.println("\nType Cast Operator:");

        short sh = -32000;
        int i = 5300;
        char ch = '\u0098';
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;

        c = (byte) (sh);
        System.out.printf("byte = short: c = (byte)%d --> c = %d\n", sh, c);
        c = (byte) (i);
        System.out.printf("byte = int: c = (byte)%d --> c = %d\n", i, c);
        c = (byte) (ch);
        System.out.printf("byte = char: c = (byte)'%c' --> c = %d\n", ch, c);
        c = (byte) l;
        System.out.printf("byte = long: c = (byte)%d --> c = %d\n", l, c);
        c = (byte) f;
        System.out.printf("byte = float: c = (byte)%f --> c = %d\n", f, c);
        c = (byte) d;
        System.out.printf("byte = double: c = (byte)%f --> c = %d\n", d, c);
        // c = (byte)bool;
        System.out.printf("byte = boolean: c = (byte)%b --> Compile Error\n", bool);

    }

    public static void testShort() {

        System.out.println("TestShort:");
        short a = 6;
        short b = 2;
        short c;
        System.out.println("\n***** Arithmetical Operators *****");

        // addition
        c = (short) (a + b);
        System.out.printf("%d + %d = %d\n", a, b, c);
        // subtraction
        c = (short) (a - b);
        System.out.printf("%d - %d = %d\n", a, b, c);
        // multiplication
        c = (short) (a * b);
        System.out.printf("%d * %d = %d\n", a, b, c);
        // division
        c = (short) (a / b);
        System.out.printf("%d / %d = %d\n", a, b, c);
        // c = a / 0; --> Arithmetical Exception

        // modulus
        c = (short) (a % b);
        System.out.printf("%d %% %d = %d\n", a, b, c);
        // c = a % 0; --> Arithmetical Exception

        // unary minus
        a = 5;

        c = (short) (-a);
        System.out.printf("-%d = %d\n", a, c);
        // unary plus
        c = (short) (+a);
        System.out.printf("+%d = %d\n", a, c);
        // prefix increment
        a = 15;
        System.out.printf("++%d = %d\n", a, ++a);
        // postfix increment
        a = 15;
        System.out.printf("%d++ = %d\n", a, a++);
        // prefix decrement
        a = 25;
        System.out.printf("--%d = %d\n", a, --a);
        // postfix decrement
        a = 25;
        System.out.printf("%d-- = %d\n", a, a--);

        System.out.println("\n***** Bitwise Operators *****");

        // bitwise AND
        c = (short) (a & b);
        System.out.printf("%d & %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));

        // bitwise OR
        c = (short) (a | b);
        System.out.printf("%d | %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));

        // bitwise XOR
        c = (short) (a ^ b);
        System.out.printf("%d ^ %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));


        // bitwise unary compliment
        c = (short) (~a);
        System.out.printf("~%d = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        // left shift
        c = (short) (a << 1);
        System.out.printf("%d << 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        // right shift
        c = (short) (a >> 1);
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        // right shift
        a = -5;
        c = (short) (a >> 1);
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        // zero fill right shift
        a = 5;
        c = (short) (a >>> 1);
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));


        // zero fill right shift
        a = -5;
        c = (short) (a >>> 1);
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        System.out.println("\n***** Assignment Operators *****");

        c = 7;
        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
        // c %= 0; --> Arithmetical Exception
        // c /= 0; --> Arithmetical Exception
        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
        System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
        System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
        System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);

        System.out.println("\n***** Relational Operators *****");
        // greater than
        System.out.printf("%d > %d --> %b\n", a, b, a > b);
        // greater than or equal to
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
        // less than
        System.out.printf("%d < %d --> %b\n", a, b, a < b);
        // less than or equal to
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
        // equal to
        System.out.printf("%d == %d --> %b\n", a, b, a == b);
        // not equal to
        System.out.printf("%d != %d --> %b\n", a, b, a != b);

        System.out.println("\n***** Logical Operations *****");

        // logical AND
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a, (a > b) && (a > 0));
        // bitwise logical AND
        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a, (a > b) & (a > 0));
        // logical OR
        System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));
        // bitwise logical OR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));
        // logical XOR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b, (a >= b) ^ (b != 0));
        // logical NOT
        System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));

        System.out.println("\n***** Misc Operators *****");
        System.out.println("\nCondition Operator:");

        System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b, (a > b ? a : b));
        System.out.println("\nType Cast Operator:");

        int i = 5300;
        byte bts = 2;
        char ch = '\u0098';
        long l = 100000000000000000L;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;


        c = (short) (i);
        System.out.printf("short = int: c = (short)%d --> c = %d\n", i, c);
        c = (short) (ch);
        System.out.printf("short = char: c = (short)'%c' --> c = %d\n", ch, c);
        c = (bts);
        System.out.printf("short = byte: c = %d --> c = %d\n", bts, c);
        c = (short) l;
        System.out.printf("short = long: c = (short)%d --> c = %d\n", l, c);
        c = (short) f;
        System.out.printf("short = float: c = (short)%f --> c = %d\n", f, c);
        c = (short) d;
        System.out.printf("short = double: c = (short)%f --> c = %d\n", d, c);
        // c = (short)bool;
        System.out.printf("short = boolean: c = (short)%b --> Compile Error\n", bool);

    }

    public static void testChar() {

        System.out.println("TestChar:");
        char a = '\u0141';
        char b = '\u0023';
        char c;
        System.out.println("\n***** Arithmetical Operators *****");

        // addition
        c = (char) (a + b);
        System.out.printf("%c + %c = %c\n", a, b, c);
        // subtraction
        c = (char) (a - b);
        System.out.printf("%c - %c = %c\n", a, b, c);
        // multiplication
        c = (char) (a * b);
        System.out.printf("%c * %c = %c\n", a, b, c);
        // division
        c = (char) (a / b);
        System.out.printf("%c / %c = %c\n", a, b, c);
        // modulus
        c = (char) (a % b);
        System.out.printf("%c %% %c = %c\n", a, b, c);
        // c = a / 0; --> Arithmetical Exception
        // c = a % 0; --> Arithmetical Exception
        a = '\u0148';
        // unary minus
        c = (char) (-a);
        System.out.printf("-%c = %c\n", a, c);
        // unary plus
        c = (char) (+a);
        System.out.printf("+%c = %c\n", a, c);
        // prefix increment
        a = '\u0148';
        System.out.printf("++%c = %c\n", a, ++a);
        // postfix increment
        a = '\u0148';
        System.out.printf("%c++ = %c\n", a, a++);
        // prefix decrement
        a = '\u0148';
        System.out.printf("--%c = %c\n", a, --a);
        // postfix decrement
        a = '\u0148';
        System.out.printf("%c-- = %c\n", a, a--);

        System.out.println("\n***** Bitwise Operators *****");

        // bitwise AND
        c = (char) (a & b);
        System.out.printf("%c & %c = %c\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));

        // bitwise OR
        c = (char) (a | b);
        System.out.printf("%c | %c = %c\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));

        // bitwise XOR
        c = (char) (a ^ b);
        System.out.printf("%c ^ %c = %c\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));

        // bitwise unary compliment
        c = (char) (~a);
        System.out.printf("~%c = %c\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        // left shift
        c = (char) (a << 1);
        System.out.printf("%c << 1 = %c\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        // right shift
        c = (char) (a >> 1);
        System.out.printf("%c >> 1 = %c\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        // right shift
        a = (char) (-5);
        c = (char) (a >> 1);
        System.out.printf("%c >> 1 = %c\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        // zero fill right shift
        a = 5;
        c = (char) (a >>> 1);
        System.out.printf("%c >>> 1 = %c\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        // zero fill right shift
        a = (char) (-5);
        c = (char) (a >>> 1);
        System.out.printf("%c >>> 1 = %c\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        System.out.println("\n***** Assignment Operators *****");
        c = '\u0148';
        System.out.printf("%c += %c --> c = %c\n", c, a, c += a);
        System.out.printf("%c -= %c --> c = %c\n", c, a, c -= a);
        System.out.printf("%c *= %c --> c = %c\n", c, a, c *= a);
        System.out.printf("%c /= %c --> c = %c\n", c, a, c /= a);
        System.out.printf("%c %%= %c --> c = %c\n", c, a, c %= a);
        // c %= 0; --> Arithmetical Exception
        // c /= 0; --> Arithmetical Exception
        System.out.printf("%c |= %c --> c = %c\n", c, a, c |= a);
        System.out.printf("%c &= %c --> c = %c\n", c, a, c &= a);
        System.out.printf("%c ^= %c --> c = %c\n", c, a, c ^= a);
        System.out.printf("%c >>= 1 --> c = %c\n", c, c >>= 1);
        System.out.printf("%c <<= 1 --> c = %c\n", c, c <<= 1);
        System.out.printf("%c >>>= 1 --> c = %c\n", c, c >>>= 1);

        System.out.println("\n***** Relational Operators *****");
        // greater than
        System.out.printf("%c > %c --> %b\n", a, b, a > b);
        // greater than or equal to
        System.out.printf("%c >= %c --> %b\n", a, b, a >= b);
        // less than
        System.out.printf("%c < %c --> %b\n", a, b, a < b);
        // less than or equal to
        System.out.printf("%c <= %c --> %b\n", a, b, a <= b);
        // equal to
        System.out.printf("%c == %c --> %b\n", a, b, a == b);
        // not equal to
        System.out.printf("%c != %c --> %b\n", a, b, a != b);

        System.out.println("\n***** Logical Operations *****");
        // logical AND
        System.out.printf("(%c > %c) && (%c > 0) --> %b\n", a, b, a, (a > b) && (a > 0));
        // bitwise logical AND
        System.out.printf("(%c > %c) & (%c > 0) --> %b\n", a, b, a, (a > b) & (a > 0));
        // logical OR
        System.out.printf("(%c >= %c) || (%c != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));
        // bitwise logical OR
        System.out.printf("(%c >= %c) | (%c != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));
        // logical XOR
        System.out.printf("(%c >= %c) | (%c != 0) --> %b\n", a, b, b, (a >= b) ^ (b != 0));
        // logical NOT
        System.out.printf("!(%c >= %c) --> %b\n", a, b, !(a >= b));

        System.out.println("\n***** Misc Operators *****");
        System.out.println("\nCondition Operator:");

        System.out.printf("%c > %c ? %c : %c --> %c\n", a, b, a, b, (a > b ? a : b));

        System.out.println("\nType Cast Operator:");

        byte bts = 2;
        int i = 35000;
        short sh = -32000;
        long l = 200000000000000L;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;
        c = (char) (bts);
        System.out.printf("char = byte: c = (char)%d --> c = %c\n", bts, c);
        c = (char) (bts);
        System.out.printf("char = int: c = (char)%d --> c = %c\n", i, c);
        c = (char) sh;
        System.out.printf("char = short: c = (char)%d --> c = %c\n", sh, c);
        c = (char) l;
        System.out.printf("char = long: c = (char)%d --> c = %c\n", l, c);
        c = (char) f;
        System.out.printf("char = float: c = (char)%f --> c = %c\n", f, c);
        c = (char) d;
        System.out.printf("char = double: c = (char)%f --> c = %c\n", d, c);
        // c = (char)bool;
        System.out.printf("char = boolean: c = (char)%b --> Compile Error\n", bool);


    }
    public static void testInt() {

        int a = 6;
        int b = 2;
        int c;

        System.out.println("/n***** Arithmetical Operators *****");

        // addition
        c = a + b;
        System.out.printf("%d + %d = %d\n", a, b, c);
        // subtraction
        c = a - b;
        System.out.printf("%d - %d = %d\n", a, b, c);
        // multiplication
        c = a * b;
        System.out.printf("%d * %d = %d\n", a, b, c);
        //division
        c = a / b;
        System.out.printf("%d / %d = %d\n", a, b, c);
        // modulus
        c = a % b;
        System.out.printf("%d %% %d = %d\n", a, b, c);
        // c = a / 0; --> Arithmetical Exception
        // c = a % 0; --> Arithmetical Exception

        a = 5;
        // unarny minus
        c = -a;
        System.out.printf("-%d = %d\n", a, c);
        // unarny plus
        c = +a;
        System.out.printf("+%d = %d\n", a, c);
        // prefix increment
        a = 5;
        System.out.printf("++%d = %d\n", a, ++a);
        // postfix increment
        a = 5;
        System.out.printf("%d++ = %d\n", a, a++);
        // prefix decrement
        a = 5;
        System.out.printf("--%d = %d\n", a, --a);
        // postfix decrement
        a = 5;
        System.out.printf("%d-- = %d\n", a, a--);

        System.out.println("/n***** Bitwise Operators *****");

        // bitwise AND
        c = a & b;
        System.out.printf("%d & %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));

        // bitwise OR
        c = a | b;
        System.out.printf("%d | %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));

        // bitwise XOR
        c = a ^ b;
        System.out.printf("%d ^ %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(b), Integer.toBinaryString(c));

        // bitwise unary compliment
        c = ~a;
        System.out.printf("~%d = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        // left shift
        c = a << 1;
        System.out.printf("%d << 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s << 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        // right shift
        c = a >> 1;
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        // right shift
        a = -5;
        c = a >> 1;
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        a = 5;
        c = a >>> 1; // zero fill right shift
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a),
                Integer.toBinaryString(c));

        a = -5;
        c = a >>> 1; // zero fill right shift
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Integer.toBinaryString(a), Integer.toBinaryString(c));

        System.out.println("\n***** Assignment Operators *****");

        c = 7;
        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        System.out.printf("%d %%= %d --> c = %d\n", c, a, c %= a);
        // c %= 0; --> Arithmetical Exception
        // c /= 0; --> Arithmetical Exception

        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
        System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
        System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
        System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);

        System.out.println("\n***** Relational Operators *****");

        // greater than
        System.out.printf("%d > %d --> %b\n", a, b, a > b);
        // greater than or equal to
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
        // less than
        System.out.printf("%d < %d --> %b\n", a, b, a < b);
        // less than or equal to
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
        // equal to
        System.out.printf("%d == %d --> %b\n", a, b, a == b);
        // not equal to
        System.out.printf("%d != %d --> %b\n", a, b, a != b);

        System.out.println("\n***** Logical Operations *****");

        // logical AND
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a,
                (a > b) && (a > 0));
        // bitwise logical AND
        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a,
                (a > b) & (a > 0));
        // logical OR
        System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b,
                (a >= b) || (b != 0));
        // bitwise logical OR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
                (a >= b) | (b != 0));
        // logical XOR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
                (a >= b) ^ (b != 0));
        // logical NOT
        System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));

        System.out.println("\n***** Misc Operators *****");
        System.out.println("\nCondition Operator:");

        System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b,
                (a > b ? a : b));
        System.out.println("\nType Cast Operator:");

        byte bts = 2;
        short sh = -32000;
        char ch = '\u0023';
        long l = 20000000000000L;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;
        c = bts;
        System.out.printf("int = byte: c = %d --> c = %d\n", bts, c);
        c = sh;
        System.out.printf("int = short: c = %d --> c = %d\n", sh, c);
        c = ch;
        System.out.printf("int = char: c = '%c' --> c = %d\n", ch, c);
        c = (int) l;
        System.out.printf("int = long: c = (int)%d --> c = %d\n", l, c);
        c = (int) f;
        System.out.printf("int = float: c = (int)%f --> c = %d\n", f, c);
        c = (int) d;
        System.out.printf("int = double: c = (int)%f --> c = %d\n", d, c);
        // c = (int)bool;
        System.out.printf("int = boolean: c = (int)%b --> Compile Error\n", bool);
    }

    public static void testLong() {
        System.out.println("Long:");
        long a = 40000000L;
        long b = 10000000L;
        long  c;
        System.out.println("\n***** Arithmetical Operators *****");
        // addition
        c = a + b;
        System.out.printf("%d + %d = %d\n", a, b, c);
        // subtraction
        c = a - b;
        System.out.printf("%d - %d = %d\n", a, b, c);
        // multiplication
        c = a * b;
        System.out.printf("%d * %d = %d\n", a, b, c);
        // division
        c = a / b;
        System.out.printf("%d / %d = %d\n", a, b, c);
        // c = a / 0; --> Arithmetical Exception

        // modulus
        c = a % b;
        System.out.printf("%d %% %d = %d\n", a, b, c);
        // c = a % 0; --> Arithmetical Exception
        a = 5;
        // unary minus
        c = -a;
        System.out.printf("-%d = %d\n", a, c);
        // unary plus
        c = +a;
        System.out.printf("+%d = %d\n", a, c);
        // prefix increment
        a = 15L;
        System.out.printf("++%d = %d\n", a, ++a);
        // postfix increment
        a = 15L;
        System.out.printf("%d++ = %d\n", a, a++);
        // prefix decrement
        a = 25L;
        System.out.printf("--%d = %d\n", a, --a);
        // postfix decrement
        a = 25L;
        System.out.printf("%d-- = %d\n", a, a--);


        System.out.println("\n***** Bitwise Operators *****");

        // bitwise AND
        c = a & b;

        System.out.printf("%d & %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s & %s = %s\n", Long.toBinaryString(a), Long.toBinaryString(b), Long.toBinaryString(c));

        // bitwise OR
        c = a | b;

        System.out.printf("%d | %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s | %s = %s\n", Long.toBinaryString(a), Long.toBinaryString(b), Long.toBinaryString(c));

        // bitwise XOR
        c = a ^ b;

        System.out.printf("%d ^ %d = %d\n", a, b, c);
        System.out.println("in binary form:");
        System.out.printf("%s ^ %s = %s\n", Long.toBinaryString(a), Long.toBinaryString(b), Long.toBinaryString(c));

        // bitwise unary compliment
        c = ~a;
        System.out.printf("~%d = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("~%s = %s\n", Long.toBinaryString(a), Long.toBinaryString(b), Long.toBinaryString(c));

        // left shift
        c = a << 1;

        System.out.printf("%d << 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s << 1 = %s\n", Long.toBinaryString(a), Long.toBinaryString(c));

        // right shift
        c = a >> 1;

        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Long.toBinaryString(a), Long.toBinaryString(c));

        // right shift
        a = -5L;
        c = a >> 1;
        System.out.printf("%d >> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >> 1 = %s\n", Long.toBinaryString(a), Long.toBinaryString(c));

        // zero fill right shift
        a = 5L;
        c = a >>> 1;
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Long.toBinaryString(a), Long.toBinaryString(c));

        // zero fill right shift
        a = -5L;
        c = a >>> 1;
        System.out.printf("%d >>> 1 = %d\n", a, c);
        System.out.println("in binary form:");
        System.out.printf("%s >>> 1 = %s\n", Long.toBinaryString(a), Long.toBinaryString(c));


        System.out.println("\n***** Assignment Operators *****");
        a = 5L;
        c = 17L;
        System.out.printf("%d += %d --> c = %d\n", c, a, c += a);
        System.out.printf("%d -= %d --> c = %d\n", c, a, c -= a);
        System.out.printf("%d *= %d --> c = %d\n", c, a, c *= a);
        System.out.printf("%d /= %d --> c = %d\n", c, a, c /= a);
        // c /= 0; --> Arithmetical Exception

        System.out.printf("%d %%= %d --> %d\n", c, a, c %= a);

        System.out.printf("%d |= %d --> c = %d\n", c, a, c |= a);
        System.out.printf("%d &= %d --> c = %d\n", c, a, c &= a);
        System.out.printf("%d ^= %d --> c = %d\n", c, a, c ^= a);
        System.out.printf("%d >>= 1 --> c = %d\n", c, c >>= 1);
        System.out.printf("%d <<= 1 --> c = %d\n", c, c <<= 1);
        System.out.printf("%d >>>= 1 --> c = %d\n", c, c >>>= 1);

        System.out.println("\n***** Relational Operators *****");

        // greater than
        System.out.printf("%d > %d --> %b\n", a, b, a > b);
        // greater than or equal to
        System.out.printf("%d >= %d --> %b\n", a, b, a >= b);
        // less than
        System.out.printf("%d < %d --> %b\n", a, b, a < b);
        // less than or equal to
        System.out.printf("%d <= %d --> %b\n", a, b, a <= b);
        // equal to
        System.out.printf("%d == %d --> %b\n", a, b, a == b);
        // not equal to
        System.out.printf("%d != %d --> %b\n", a, b, a != b);

        System.out.println("\n***** Logical Operations *****");

        // logical AND
        System.out.printf("(%d > %d) && (%d > 0) --> %b\n", a, b, a, (a > b) && (a > 0));
        // bitwise logical AND
        System.out.printf("(%d > %d) & (%d > 0) --> %b\n", a, b, a, (a > b) & (a > 0));
        // logical OR
        System.out.printf("(%d >= %d) || (%d != 0) --> %b\n", a, b, b,
                (a >= b) || (b != 0));
        // bitwise logical OR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
                (a >= b) | (b != 0));
        // logical XOR
        System.out.printf("(%d >= %d) | (%d != 0) --> %b\n", a, b, b,
                (a >= b) ^ (b != 0));
        // logical NOT
        System.out.printf("!(%d >= %d) --> %b\n", a, b, !(a >= b));

        System.out.println("\n***** Misc Operators *****");
        System.out.println("\nCondition Operator:");

        System.out.printf("%d > %d ? %d : %d --> %d\n", a, b, a, b, (a > b ? a : b));
        System.out.println("\nType Cast Operator:");

        byte bts = 2;
        short sh = -32000;
        char ch = '\u0023';
        int i = 4000;
        float f = 1.9f;
        double d = 123456789.625;
        boolean bool = true;

        c = bts;
        System.out.printf("long = byte: c = %d --> c = %d\n", bts, c);
        c = sh;
        System.out.printf("long = short: c = %d --> c = %d\n", sh, c);
        c = ch;
        System.out.printf("long = char: c = '%c' --> c = %d\n", ch, c);
        c = i;
        System.out.printf("long = int: c = %d --> c = %d\n", i, c);
        c = (long) f;
        System.out.printf("long = float: c = (long)%f --> c = %d\n", f, c);
        c = (long) d;
        System.out.printf("long = double: c = (long)%f --> c = %d\n", d, c);
        // c = (long)bool;
        System.out.printf("long = boolean: c = (long)%b --> Compile Error\n", bool);
    }

    public static void testFloat() {

        System.out.println("TestFloat:");
        float a = 6.9f;
        float b = 2.3f;
        float c;
        System.out.println("\n***** Arithmetical Operators *****");

        // addition
        c = a + b;
        System.out.printf("%f + %f = %f\n", a, b, c);
        // subtraction
        c = a - b;
        System.out.printf("%f - %f = %f\n", a, b, c);
        // multiplication
        c = a * b;
        System.out.printf("%f * %f = %f\n", a, b, c);
        // division
        c = a / b;
        System.out.printf("%f / %f = %f\n", a, b, c);
        // modulus
        c = a % b;
        System.out.printf("%f %% %f = %f\n", a, b, c);
        // c = a / 0; --> Arithmetical Exception
        // c = a % 0; --> Arithmetical Exception

        a = 4.6f;
        // unary minus
        c = -a;
        System.out.printf("-%f = %f\n", a, c);
        // unary plus
        c = +a;
        System.out.printf("+%f = %f\n", a, c);
        // prefix increment
        a = 4.6f;
        System.out.printf("++%f = %f\n", a, ++a);
        // postfix increment
        a = 4.6f;
        System.out.printf("%f++ = %f\n", a, a++);
        // prefix decrement
        a = 4.6f;
        System.out.printf("--%f = %f\n", a, --a);
        // postfix decrement
        a = 4.6f;
        System.out.printf("%f-- = %f\n", a, a--);


        System.out.println("\n***** Assignment Operators *****");
        c = 7.8f;
        System.out.printf("%f += %f --> c = %f\n", c, a, c += a);
        System.out.printf("%f -= %f --> c = %f\n", c, a, c -= a);
        System.out.printf("%f *= %f --> c = %f\n", c, a, c *= a);
        System.out.printf("%f /= %f --> c = %f\n", c, a, c /= a);
        System.out.printf("%f %%= %f --> c = %f\n", c, a, c %= a);
        // c %= 0; --> Arithmetical Exception
        // c /= 0; --> Arithmetical Exception

        System.out.println("\n***** Relational Operators *****");
        // greater than
        System.out.printf("%f > %f --> %b\n", a, b, a > b);
        // greater than or equal to
        System.out.printf("%f >= %f --> %b\n", a, b, a >= b);
        // less than
        System.out.printf("%f < %f --> %b\n", a, b, a < b);
        // less than or equal to
        System.out.printf("%f <= %f --> %b\n", a, b, a <= b);
        // equal to
        System.out.printf("%f == %f --> %b\n", a, b, a == b);
        // not equal to
        System.out.printf("%f != %f --> %b\n", a, b, a != b);
        System.out.println("\n***** Logical Operations *****");
        // logical AND
        System.out.printf("(%f > %f) && (%f > 0) --> %b\n", a, b, a, (a > b) && (a > 0));
        // bitwise logical AND
        System.out.printf("(%f > %f) & (%f > 0) --> %b\n", a, b, a, (a > b) & (a > 0));
        // logical OR
        System.out.printf("(%f >= %f) || (%f != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));
        // bitwise logical OR
        System.out.printf("(%f >= %f) | (%f != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));
        // logical XOR
        System.out.printf("(%f >= %f) | (%f != 0) --> %b\n", a, b, b, (a >= b) ^ (b != 0));
        // logical NOT
        System.out.printf("!(%f >= %f) --> %b\n", a, b, !(a >= b));

        System.out.println("\n***** Misc Operators *****");
        System.out.println("\nCondition Operator:");

        System.out.printf("%f > %f ? %f : %f --> %f\n", a, b, a, b, (a > b ? a : b));
        System.out.println("\nType Cast Operator:");

        byte bts = 2;
        short sh = -32000;
        char ch = '\u0023';
        long l = 10000000000L;
        double d = 123456789.625;
        int in = 5000000;
        boolean bool = true;
        c = bts;
        System.out.printf("float = byte: c = %d --> c = %f\n", bts, c);
        c = sh;
        System.out.printf("float = short: c = %d --> c = %f\n", sh, c);
        c = ch;
        System.out.printf("float = char: c = '%c' --> c = %f\n", ch, c);
        c = l;
        System.out.printf("float = long: c = %d --> c = %f\n", l, c);
        c = (float) d;
        System.out.printf("float = double: c = %f --> c = %f\n", d, c);
        c = in;
        System.out.printf("float = int: c = %d --> c = %f\n", in, c);
        // c = (float)bool;
        System.out.printf("float = boolean: c = (float)%b --> Compile Error\n", bool);
    }
    public static void testDouble() {
        System.out.println("TestDouble:");

        double a = 5.6;
        double b = 2.4;
        double c;
        System.out.println("\n***** Arithmetical Operators *****");

        // addition
        c = a + b;
        System.out.printf("%f + %f = %f\n", a, b, c);
        // subtraction
        c = a - b;
        System.out.printf("%f - %f = %f\n", a, b, c);
        // multiplication
        c = a * b;
        System.out.printf("%f * %f = %f\n", a, b, c);
       // division
        c = a / b;
        System.out.printf("%f / %f = %f\n", a, b, c);
        // modulus
        c = a % b;
        System.out.printf("%f %% %f = %f\n", a, b, c);
        // c = a / 0; --> Arithmetical Exception
        // c = a % 0; --> Arithmetical Exception

        a = 4.6;
        // unary minus
        c = -a;
        System.out.printf("-%f = %f\n", a, c);
        // unary plus
        c = +a;
        System.out.printf("+%f = %f\n", a, c);
        // prefix increment
        a = 4.6;
        System.out.printf("++%f = %f\n", a, ++a);
        // postfix increment
        a = 4.6;
        System.out.printf("%f++ = %f\n", a, a++);
        // prefix decrement
        a = 4.6;
        System.out.printf("--%f = %f\n", a, --a);
        // postfix decrement
        a = 4.6;
        System.out.printf("%f-- = %f\n", a, a--);


        System.out.println("\n***** Assignment Operators *****");
        c = 7.4;
        System.out.printf("%f += %f --> c = %f\n", c, a, c += a);
        System.out.printf("%f -= %f --> c = %f\n", c, a, c -= a);
        System.out.printf("%f *= %f --> c = %f\n", c, a, c *= a);
        System.out.printf("%f /= %f --> c = %f\n", c, a, c /= a);
        System.out.printf("%f %%= %f --> c = %f\n", c, a, c %= a);
        // c %= 0; --> Arithmetical Exception
        // c /= 0; --> Arithmetical Exception

        System.out.println("\n***** Relational Operators *****");
        // greater than
        System.out.printf("%f > %f --> %b\n", a, b, a > b);
        // greater than or equal to
        System.out.printf("%f >= %f --> %b\n", a, b, a >= b);
        // less than
        System.out.printf("%f < %f --> %b\n", a, b, a < b);
        // less than or equal to
        System.out.printf("%f <= %f --> %b\n", a, b, a <= b);
        // equal to
        System.out.printf("%f == %f --> %b\n", a, b, a == b);
        // not equal to
        System.out.printf("%f != %f --> %b\n", a, b, a != b);
        System.out.println("\n***** Logical Operations *****");
        // logical AND
        System.out.printf("(%f > %f) && (%f > 0) --> %b\n", a, b, a, (a > b) && (a > 0));
        // bitwise logical AND
        System.out.printf("(%f > %f) & (%f > 0) --> %b\n", a, b, a, (a > b) & (a > 0));
        // logical OR
        System.out.printf("(%f >= %f) || (%f != 0) --> %b\n", a, b, b, (a >= b) || (b != 0));
        // bitwise logical OR
        System.out.printf("(%f >= %f) | (%f != 0) --> %b\n", a, b, b, (a >= b) | (b != 0));
        // logical XOR
        System.out.printf("(%f >= %f) | (%f != 0) --> %b\n", a, b, b, (a >= b) ^ (b != 0));
        // logical NOT
        System.out.printf("!(%f >= %f) --> %b\n", a, b, !(a >= b));

        System.out.println("\n***** Misc Operators *****");
        System.out.println("\nCondition Operator:");

        System.out.printf("%f > %f ? %f : %f --> %f\n", a, b, a, b, (a > b ? a : b));
        System.out.println("\nType Cast Operator:");

        byte bts = 2;
        short sh = -32000;
        char ch = '\u0023';
        long l = 100000000000L;
        float f = 123456789.625f;
        int in = 40000;
        boolean bool = true;
        c = bts;
        System.out.printf("double = byte: c = %d --> c = %f\n", bts, c);
        c = sh;
        System.out.printf("double = short: c = %d --> c = %f\n", sh, c);
        c = ch;
        System.out.printf("double = char: c = '%c' --> c = %f\n", ch, c);
        c = l;
        System.out.printf("double = long: c = %d --> c = %f\n", l, c);
        c = f;
        System.out.printf("double = float: c = %f --> c = %f\n", f, c);
        c = in;
        System.out.printf("double = int: c = %d --> c = %f\n", in, c);
        // c = (double)bool;
        System.out.printf("double = boolean: c = (double)%b --> Compile Error\n",
                bool);
    }


    public static void testBoolean() {
        System.out.println("TestBoolean:");

        boolean a = true;
        boolean b = false;
        boolean c;

        System.out.println("\n***** Bitwise Operators *****");
        c = a & b; // bitwise AND
        System.out.printf("%b & %b = %b\n", a, b, c);
        c = a | b; // bitwise OR
        System.out.printf("%b | %b = %b\n", a, b, c);
        c = a ^ b; // bitwise XOR
        System.out.printf("%b ^ %b = %b\n", a, b, c);

        System.out.println("\n***** Assignment Operators *****");
        System.out.printf("%b |= %b --> c = %b\n", c, a, c |= a);
        System.out.printf("%b &= %b --> c = %b\n", c, a, c &= a);
        System.out.printf("%b ^= %b --> c = %b\n", c, a, c ^= a);

        System.out.println("\n***** Relational Operators *****");
        // equal to
        System.out.printf("%b == %b --> %b\n", a, b, a == b);
        // not equal to
        System.out.printf("%b != %b --> %b\n", a, b, a != b);

        System.out.println("\n***** Logical Operations *****");
        c = a && b; // logical AND
        System.out.printf("%b && %b = %b\n", a, b, c);
        c = a || b; // logical OR
        System.out.printf("%b || %b = %b\n", a, b, c);
        c = a ^ b; // logical XOR
        System.out.printf("%b ^ %b = %b\n", a, b, c);
        // logical NOT
        System.out.printf("!%b --> %b\n", a, !a);
        System.out.println("\n***** Misc Operators *****");
        System.out.println("\nCondition Operator:");
        System.out.printf(" %b ? %b : %b --> %b\n", c, a, b, (c ? a : b));
        System.out.println("\nType Cast Operator:");

        boolean bool = true;
        c = bool;
    }

    public static void testString() {

        System.out.println("TestString:");
        String str = "Java";
        String strg = "cool";
        String strgs;

        System.out.println("\n***** Arithmetical Operators *****");

        System.out.println("Only conсat operation!");
        strgs = str + strg;
        System.out.printf("%s + %s = %s\n", str, strg, strgs);


        System.out.println("\n***** Assignment Operators *****");
        System.out.printf("%s += %s --> c = %s\n", strgs, str, strgs += str);

        System.out.println("\n***** Relational Operators *****");
        System.out.println("Only equals and not equals operations!");
        // equal to
        System.out.printf("%s == %s --> %b\n", str, strg, str == strg);
        // not equal to
        System.out.printf("%s != %s --> %b\n", str, strg, str != strg);

        System.out.println("\n***** Misc Operators *****");
        System.out.println("\nCondition Operator:");

        System.out.printf("%s == %s ? %s : %s --> %s\n", str, strg, str, strg, (str == strg ? str : strg));
        System.out.println("\nType Cast Operator:");

        boolean bool = (strg instanceof Object);
        System.out.printf("GetInstance true" + bool);

    }

    public static void testStudent() {

        Student student1 = new Student("Anton", 14);
        Student student2 = new Student("Victor", 26);
        Student student3;

        System.out.println("\n***** Assignment Operators *****");
        student3 = student1;
        System.out.printf("student3 --> %s\n", student3.toString());

        System.out.println("\nCondition Operator:");
        System.out.println("Only equals and not equals operations!");

        // equal to
        System.out.printf("student1 == student2 --> %b\n", ((student1 == student2) ? true : false));
        // not equal to
        System.out.printf("student1 != student2 --> %b\n", ((student1 != student3) ? true : false));

        System.out.println("/n***** Type comparison operator *****");
         boolean bool;
         bool = (student1 instanceof Student);
        System.out.printf("GetInstance --> %b\n", bool);
    }
}










