package com.squareup.moshi.adapters;

import j$.util.DesugarTimeZone;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TimeZone f15428a = DesugarTimeZone.getTimeZone("GMT");

    public static boolean a(String str, int i10, char c10) {
        return i10 < str.length() && str.charAt(i10) == c10;
    }

    public static String b(Date date) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(f15428a, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb = new StringBuilder(24);
        c(sb, gregorianCalendar.get(1), 4);
        sb.append('-');
        c(sb, gregorianCalendar.get(2) + 1, 2);
        sb.append('-');
        c(sb, gregorianCalendar.get(5), 2);
        sb.append('T');
        c(sb, gregorianCalendar.get(11), 2);
        sb.append(':');
        c(sb, gregorianCalendar.get(12), 2);
        sb.append(':');
        c(sb, gregorianCalendar.get(13), 2);
        sb.append('.');
        c(sb, gregorianCalendar.get(14), 3);
        sb.append('Z');
        return sb.toString();
    }

    public static void c(StringBuilder sb, int i10, int i11) {
        String string = Integer.toString(i10);
        for (int length = i11 - string.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(string);
    }

    public static Date d(String str) {
        int i10;
        int iPow;
        int iE;
        int iE2;
        char cCharAt;
        try {
            int iE3 = e(str, 0, 4);
            int i11 = a(str, 4, '-') ? 5 : 4;
            int i12 = i11 + 2;
            int iE4 = e(str, i11, i12);
            if (a(str, i12, '-')) {
                i12 = i11 + 3;
            }
            int i13 = i12 + 2;
            int iE5 = e(str, i12, i13);
            boolean zA = a(str, i13, 'T');
            if (!zA && str.length() <= i13) {
                return new GregorianCalendar(iE3, iE4 - 1, iE5).getTime();
            }
            if (zA) {
                int i14 = i12 + 5;
                int iE6 = e(str, i12 + 3, i14);
                if (a(str, i14, ':')) {
                    i14 = i12 + 6;
                }
                int i15 = i14 + 2;
                iE2 = e(str, i14, i15);
                if (a(str, i15, ':')) {
                    i15 = i14 + 3;
                }
                if (str.length() <= i15 || (cCharAt = str.charAt(i15)) == 'Z' || cCharAt == '+' || cCharAt == '-') {
                    i10 = iE6;
                    i13 = i15;
                    iPow = 0;
                    iE = 0;
                } else {
                    int i16 = i15 + 2;
                    iE = e(str, i15, i16);
                    if (iE > 59 && iE < 63) {
                        iE = 59;
                    }
                    if (a(str, i16, '.')) {
                        int i17 = i15 + 3;
                        int length = i15 + 4;
                        while (true) {
                            if (length >= str.length()) {
                                length = str.length();
                                break;
                            }
                            char cCharAt2 = str.charAt(length);
                            if (cCharAt2 < '0' || cCharAt2 > '9') {
                                break;
                                break;
                            }
                            length++;
                        }
                        int iMin = Math.min(length, i15 + 6);
                        iPow = (int) (Math.pow(10.0d, 3 - (iMin - i17)) * ((double) e(str, i17, iMin)));
                        i10 = iE6;
                        i13 = length;
                    } else {
                        i10 = iE6;
                        i13 = i16;
                        iPow = 0;
                    }
                }
            } else {
                i10 = 0;
                iPow = 0;
                iE = 0;
                iE2 = 0;
            }
            if (str.length() <= i13) {
                throw new IllegalArgumentException("No time zone indicator");
            }
            char cCharAt3 = str.charAt(i13);
            TimeZone timeZone = f15428a;
            if (cCharAt3 != 'Z') {
                if (cCharAt3 != '+' && cCharAt3 != '-') {
                    throw new IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt3 + "'");
                }
                String strSubstring = str.substring(i13);
                if (!"+0000".equals(strSubstring) && !"+00:00".equals(strSubstring)) {
                    String str2 = "GMT" + strSubstring;
                    timeZone = DesugarTimeZone.getTimeZone(str2);
                    String id = timeZone.getID();
                    if (!id.equals(str2) && !id.replace(":", "").equals(str2)) {
                        throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str2 + " given, resolves to " + timeZone.getID());
                    }
                }
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, iE3);
            gregorianCalendar.set(2, iE4 - 1);
            gregorianCalendar.set(5, iE5);
            gregorianCalendar.set(11, i10);
            gregorianCalendar.set(12, iE2);
            gregorianCalendar.set(13, iE);
            gregorianCalendar.set(14, iPow);
            return gregorianCalendar.getTime();
        } catch (IllegalArgumentException e10) {
            e = e10;
            throw new A6.a(p123m2.c.s("Not an RFC 3339 date: ", str), e);
        } catch (IndexOutOfBoundsException e11) {
            e = e11;
            throw new A6.a(p123m2.c.s("Not an RFC 3339 date: ", str), e);
        }
    }

    public static int e(String str, int i10, int i11) {
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
