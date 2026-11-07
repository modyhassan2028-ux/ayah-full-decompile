package io.realm.internal.android;

import j$.util.DesugarTimeZone;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import p245z2.a;

/* JADX INFO: loaded from: classes.dex */
public class ISO8601Utils {
    private static final TimeZone TIMEZONE_UTC;
    private static final TimeZone TIMEZONE_Z;
    private static final String UTC_ID = "UTC";

    static {
        TimeZone timeZone = DesugarTimeZone.getTimeZone(UTC_ID);
        TIMEZONE_UTC = timeZone;
        TIMEZONE_Z = timeZone;
    }

    private static boolean checkOffset(String str, int i10, char c10) {
        return i10 < str.length() && str.charAt(i10) == c10;
    }

    private static int indexOfNonDigit(String str, int i10) {
        while (i10 < str.length()) {
            char cCharAt = str.charAt(i10);
            if (cCharAt < '0' || cCharAt > '9') {
                return i10;
            }
            i10++;
        }
        return str.length();
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00f1 A[Catch: IllegalArgumentException -> 0x0057, NumberFormatException -> 0x005a, IndexOutOfBoundsException -> 0x005d, TryCatch #2 {IllegalArgumentException -> 0x0057, IndexOutOfBoundsException -> 0x005d, NumberFormatException -> 0x005a, blocks: (B:3:0x000e, B:5:0x0021, B:6:0x0023, B:8:0x0030, B:9:0x0032, B:11:0x0041, B:13:0x0049, B:24:0x0068, B:26:0x0078, B:27:0x007a, B:29:0x0086, B:31:0x008a, B:33:0x0090, B:38:0x009c, B:43:0x00ac, B:45:0x00b4, B:57:0x00eb, B:59:0x00f1, B:61:0x00fb, B:86:0x0192, B:67:0x010c, B:68:0x0120, B:69:0x0121, B:71:0x0132, B:72:0x0136, B:74:0x013e, B:77:0x0147, B:79:0x0161, B:82:0x0170, B:83:0x018d, B:85:0x0190, B:88:0x01c5, B:89:0x01cc, B:50:0x00ce, B:51:0x00d1), top: B:100:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:61:0x00fb A[Catch: IllegalArgumentException -> 0x0057, NumberFormatException -> 0x005a, IndexOutOfBoundsException -> 0x005d, TryCatch #2 {IllegalArgumentException -> 0x0057, IndexOutOfBoundsException -> 0x005d, NumberFormatException -> 0x005a, blocks: (B:3:0x000e, B:5:0x0021, B:6:0x0023, B:8:0x0030, B:9:0x0032, B:11:0x0041, B:13:0x0049, B:24:0x0068, B:26:0x0078, B:27:0x007a, B:29:0x0086, B:31:0x008a, B:33:0x0090, B:38:0x009c, B:43:0x00ac, B:45:0x00b4, B:57:0x00eb, B:59:0x00f1, B:61:0x00fb, B:86:0x0192, B:67:0x010c, B:68:0x0120, B:69:0x0121, B:71:0x0132, B:72:0x0136, B:74:0x013e, B:77:0x0147, B:79:0x0161, B:82:0x0170, B:83:0x018d, B:85:0x0190, B:88:0x01c5, B:89:0x01cc, B:50:0x00ce, B:51:0x00d1), top: B:100:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0103  */
    /* JADX WARN: Code duplicated, block: B:71:0x0132 A[Catch: IllegalArgumentException -> 0x0057, NumberFormatException -> 0x005a, IndexOutOfBoundsException -> 0x005d, TryCatch #2 {IllegalArgumentException -> 0x0057, IndexOutOfBoundsException -> 0x005d, NumberFormatException -> 0x005a, blocks: (B:3:0x000e, B:5:0x0021, B:6:0x0023, B:8:0x0030, B:9:0x0032, B:11:0x0041, B:13:0x0049, B:24:0x0068, B:26:0x0078, B:27:0x007a, B:29:0x0086, B:31:0x008a, B:33:0x0090, B:38:0x009c, B:43:0x00ac, B:45:0x00b4, B:57:0x00eb, B:59:0x00f1, B:61:0x00fb, B:86:0x0192, B:67:0x010c, B:68:0x0120, B:69:0x0121, B:71:0x0132, B:72:0x0136, B:74:0x013e, B:77:0x0147, B:79:0x0161, B:82:0x0170, B:83:0x018d, B:85:0x0190, B:88:0x01c5, B:89:0x01cc, B:50:0x00ce, B:51:0x00d1), top: B:100:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0190 A[Catch: IllegalArgumentException -> 0x0057, NumberFormatException -> 0x005a, IndexOutOfBoundsException -> 0x005d, TryCatch #2 {IllegalArgumentException -> 0x0057, IndexOutOfBoundsException -> 0x005d, NumberFormatException -> 0x005a, blocks: (B:3:0x000e, B:5:0x0021, B:6:0x0023, B:8:0x0030, B:9:0x0032, B:11:0x0041, B:13:0x0049, B:24:0x0068, B:26:0x0078, B:27:0x007a, B:29:0x0086, B:31:0x008a, B:33:0x0090, B:38:0x009c, B:43:0x00ac, B:45:0x00b4, B:57:0x00eb, B:59:0x00f1, B:61:0x00fb, B:86:0x0192, B:67:0x010c, B:68:0x0120, B:69:0x0121, B:71:0x0132, B:72:0x0136, B:74:0x013e, B:77:0x0147, B:79:0x0161, B:82:0x0170, B:83:0x018d, B:85:0x0190, B:88:0x01c5, B:89:0x01cc, B:50:0x00ce, B:51:0x00d1), top: B:100:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:88:0x01c5 A[Catch: IllegalArgumentException -> 0x0057, NumberFormatException -> 0x005a, IndexOutOfBoundsException -> 0x005d, TryCatch #2 {IllegalArgumentException -> 0x0057, IndexOutOfBoundsException -> 0x005d, NumberFormatException -> 0x005a, blocks: (B:3:0x000e, B:5:0x0021, B:6:0x0023, B:8:0x0030, B:9:0x0032, B:11:0x0041, B:13:0x0049, B:24:0x0068, B:26:0x0078, B:27:0x007a, B:29:0x0086, B:31:0x008a, B:33:0x0090, B:38:0x009c, B:43:0x00ac, B:45:0x00b4, B:57:0x00eb, B:59:0x00f1, B:61:0x00fb, B:86:0x0192, B:67:0x010c, B:68:0x0120, B:69:0x0121, B:71:0x0132, B:72:0x0136, B:74:0x013e, B:77:0x0147, B:79:0x0161, B:82:0x0170, B:83:0x018d, B:85:0x0190, B:88:0x01c5, B:89:0x01cc, B:50:0x00ce, B:51:0x00d1), top: B:100:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:91:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:92:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:95:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:97:0x01e3  */
    /* JADX WARN: Instruction removed from duplicated block: B:97:0x01e3, please report this as an issue */
    public static Date parse(String str, ParsePosition parsePosition) throws ParseException {
        String strD;
        String message;
        int i10;
        int i11;
        int i12;
        int i13;
        char cCharAt;
        String strSubstring;
        int length;
        TimeZone timeZone;
        char cCharAt2;
        try {
            int index = parsePosition.getIndex();
            int i14 = index + 4;
            int i15 = parseInt(str, index, i14);
            if (checkOffset(str, i14, '-')) {
                i14 = index + 5;
            }
            int i16 = i14 + 2;
            int i17 = parseInt(str, i14, i16);
            if (checkOffset(str, i16, '-')) {
                i16 = i14 + 3;
            }
            int i18 = i16 + 2;
            int i19 = parseInt(str, i16, i18);
            boolean zCheckOffset = checkOffset(str, i18, 'T');
            if (!zCheckOffset && str.length() <= i18) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(i15, i17 - 1, i19);
                parsePosition.setIndex(i18);
                return gregorianCalendar.getTime();
            }
            if (zCheckOffset) {
                int i20 = i16 + 5;
                int i21 = parseInt(str, i16 + 3, i20);
                if (checkOffset(str, i20, ':')) {
                    i20 = i16 + 6;
                }
                int i22 = i20 + 2;
                int i23 = parseInt(str, i20, i22);
                int i24 = checkOffset(str, i22, ':') ? i20 + 3 : i22;
                if (str.length() > i24 && (cCharAt2 = str.charAt(i24)) != 'Z' && cCharAt2 != '+' && cCharAt2 != '-') {
                    int i25 = i24 + 2;
                    i11 = parseInt(str, i24, i25);
                    if (i11 > 59 && i11 < 63) {
                        i11 = 59;
                    }
                    if (checkOffset(str, i25, '.')) {
                        int i26 = i24 + 3;
                        int iIndexOfNonDigit = indexOfNonDigit(str, i24 + 4);
                        int iMin = Math.min(iIndexOfNonDigit, i24 + 6);
                        int i27 = parseInt(str, i26, iMin);
                        int i28 = iMin - i26;
                        if (i28 == 1) {
                            i27 *= 100;
                        } else if (i28 == 2) {
                            i27 *= 10;
                        }
                        i10 = i21;
                        i18 = iIndexOfNonDigit;
                        i12 = i23;
                        i13 = i27;
                    } else {
                        i18 = i25;
                        i10 = i21;
                        i12 = i23;
                    }
                    if (str.length() > i18) {
                        throw new IllegalArgumentException("No time zone indicator");
                    }
                    cCharAt = str.charAt(i18);
                    if (cCharAt == 'Z') {
                        timeZone = TIMEZONE_Z;
                        length = i18 + 1;
                    } else {
                        if (cCharAt != '+' && cCharAt != '-') {
                            throw new IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt + "'");
                        }
                        strSubstring = str.substring(i18);
                        length = i18 + strSubstring.length();
                        if (strSubstring.length() == 3) {
                            strSubstring = strSubstring.concat("00");
                        }
                        if (!"+0000".equals(strSubstring) || "+00:00".equals(strSubstring)) {
                            timeZone = TIMEZONE_Z;
                        } else {
                            String str2 = "GMT" + strSubstring;
                            TimeZone timeZone2 = DesugarTimeZone.getTimeZone(str2);
                            String id = timeZone2.getID();
                            if (!id.equals(str2) && !id.replace(":", "").equals(str2)) {
                                throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str2 + " given, resolves to " + timeZone2.getID());
                            }
                            timeZone = timeZone2;
                        }
                    }
                    GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
                    gregorianCalendar2.setLenient(false);
                    gregorianCalendar2.set(1, i15);
                    gregorianCalendar2.set(2, i17 - 1);
                    gregorianCalendar2.set(5, i19);
                    gregorianCalendar2.set(11, i10);
                    gregorianCalendar2.set(12, i12);
                    gregorianCalendar2.set(13, i11);
                    gregorianCalendar2.set(14, i13);
                    parsePosition.setIndex(length);
                    return gregorianCalendar2.getTime();
                }
                i10 = i21;
                i18 = i24;
                i12 = i23;
                i11 = 0;
            } else {
                i10 = 0;
                i11 = 0;
                i12 = 0;
            }
            i13 = 0;
            if (str.length() > i18) {
                throw new IllegalArgumentException("No time zone indicator");
            }
            cCharAt = str.charAt(i18);
            if (cCharAt == 'Z') {
                timeZone = TIMEZONE_Z;
                length = i18 + 1;
            } else {
                if (cCharAt != '+') {
                    throw new IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt + "'");
                }
                strSubstring = str.substring(i18);
                length = i18 + strSubstring.length();
                if (strSubstring.length() == 3) {
                    strSubstring = strSubstring.concat("00");
                }
                if ("+0000".equals(strSubstring)) {
                    timeZone = TIMEZONE_Z;
                } else {
                    timeZone = TIMEZONE_Z;
                }
            }
            GregorianCalendar gregorianCalendar3 = new GregorianCalendar(timeZone);
            gregorianCalendar3.setLenient(false);
            gregorianCalendar3.set(1, i15);
            gregorianCalendar3.set(2, i17 - 1);
            gregorianCalendar3.set(5, i19);
            gregorianCalendar3.set(11, i10);
            gregorianCalendar3.set(12, i12);
            gregorianCalendar3.set(13, i11);
            gregorianCalendar3.set(14, i13);
            parsePosition.setIndex(length);
            return gregorianCalendar3.getTime();
        } catch (IllegalArgumentException e10) {
            e = e10;
            if (str == null) {
                strD = null;
            } else {
                strD = a.D("\"", str, "'");
            }
            message = e.getMessage();
            if (message != null || message.isEmpty()) {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException = new ParseException("Failed to parse date [" + strD + "]: " + message, parsePosition.getIndex());
            parseException.initCause(e);
            throw parseException;
        } catch (IndexOutOfBoundsException e11) {
            e = e11;
            if (str == null) {
                strD = null;
            } else {
                strD = a.D("\"", str, "'");
            }
            message = e.getMessage();
            if (message != null) {
                message = "(" + e.getClass().getName() + ")";
            } else {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException2 = new ParseException("Failed to parse date [" + strD + "]: " + message, parsePosition.getIndex());
            parseException2.initCause(e);
            throw parseException2;
        } catch (NumberFormatException e12) {
            e = e12;
            if (str == null) {
                strD = null;
            } else {
                strD = a.D("\"", str, "'");
            }
            message = e.getMessage();
            if (message != null) {
                message = "(" + e.getClass().getName() + ")";
            } else {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException3 = new ParseException("Failed to parse date [" + strD + "]: " + message, parsePosition.getIndex());
            parseException3.initCause(e);
            throw parseException3;
        }
    }

    private static int parseInt(String str, int i10, int i11) {
        int i12;
        int i13;
        if (i10 < 0 || i11 > str.length() || i10 > i11) {
            throw new NumberFormatException(str);
        }
        if (i10 < i11) {
            i13 = i10 + 1;
            int iDigit = Character.digit(str.charAt(i10), 10);
            if (iDigit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i10, i11));
            }
            i12 = -iDigit;
        } else {
            i12 = 0;
            i13 = i10;
        }
        while (i13 < i11) {
            int i14 = i13 + 1;
            int iDigit2 = Character.digit(str.charAt(i13), 10);
            if (iDigit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i10, i11));
            }
            i12 = (i12 * 10) - iDigit2;
            i13 = i14;
        }
        return -i12;
    }
}
