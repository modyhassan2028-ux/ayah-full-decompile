package j$.time.format;

import j$.time.temporal.ChronoField;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements InterfaceC1057e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f17870b;

    public /* synthetic */ h(int i10, Object obj) {
        this.f17869a = i10;
        this.f17870b = obj;
    }

    @Override // j$.time.format.InterfaceC1057e
    public final boolean k(y yVar, StringBuilder sb) {
        switch (this.f17869a) {
            case 0:
                Long lA = yVar.a(ChronoField.OFFSET_SECONDS);
                if (lA == null) {
                    return false;
                }
                sb.append("GMT");
                int iA = j$.com.android.tools.r8.a.A(lA.longValue());
                if (iA != 0) {
                    int iAbs = Math.abs((iA / 3600) % 100);
                    int iAbs2 = Math.abs((iA / 60) % 60);
                    int iAbs3 = Math.abs(iA % 60);
                    sb.append(iA < 0 ? "-" : "+");
                    if (((TextStyle) this.f17870b) == TextStyle.FULL) {
                        a(sb, iAbs);
                        sb.append(':');
                        a(sb, iAbs2);
                        if (iAbs3 != 0) {
                            sb.append(':');
                            a(sb, iAbs3);
                        }
                    } else {
                        if (iAbs >= 10) {
                            sb.append((char) ((iAbs / 10) + 48));
                        }
                        sb.append((char) ((iAbs % 10) + 48));
                        if (iAbs2 != 0 || iAbs3 != 0) {
                            sb.append(':');
                            a(sb, iAbs2);
                            if (iAbs3 != 0) {
                                sb.append(':');
                                a(sb, iAbs3);
                            }
                        }
                    }
                }
                return true;
            default:
                sb.append((String) this.f17870b);
                return true;
        }
    }

    @Override // j$.time.format.InterfaceC1057e
    public final int l(v vVar, CharSequence charSequence, int i10) {
        int i11;
        int iB;
        int i12;
        int i13;
        int i14;
        int i15;
        switch (this.f17869a) {
            case 0:
                int length = charSequence.length();
                if (vVar.g(charSequence, i10, "GMT", 0, 3)) {
                    int i16 = i10 + 3;
                    if (i16 == length) {
                        return vVar.f(ChronoField.OFFSET_SECONDS, 0L, i10, i16);
                    }
                    char cCharAt = charSequence.charAt(i16);
                    if (cCharAt == '+') {
                        i11 = 1;
                    } else {
                        if (cCharAt != '-') {
                            return vVar.f(ChronoField.OFFSET_SECONDS, 0L, i10, i16);
                        }
                        i11 = -1;
                    }
                    int i17 = i10 + 4;
                    int i18 = 0;
                    if (((TextStyle) this.f17870b) == TextStyle.FULL) {
                        int i19 = i10 + 5;
                        int iB2 = b(charSequence, i17);
                        int i20 = i10 + 6;
                        int iB3 = b(charSequence, i19);
                        if (iB2 >= 0 && iB3 >= 0) {
                            int i21 = i10 + 7;
                            if (charSequence.charAt(i20) == ':') {
                                iB = (iB2 * 10) + iB3;
                                int iB4 = b(charSequence, i21);
                                i15 = i10 + 9;
                                int iB5 = b(charSequence, i10 + 8);
                                if (iB4 >= 0 && iB5 >= 0) {
                                    i14 = (iB4 * 10) + iB5;
                                    int i22 = i10 + 11;
                                    if (i22 < length && charSequence.charAt(i15) == ':') {
                                        int iB6 = b(charSequence, i10 + 10);
                                        int iB7 = b(charSequence, i22);
                                        if (iB6 >= 0 && iB7 >= 0) {
                                            i18 = (iB6 * 10) + iB7;
                                            i15 = i10 + 12;
                                        }
                                    }
                                    i12 = i18;
                                    i13 = i15;
                                }
                            }
                        }
                    } else {
                        int i23 = i10 + 5;
                        iB = b(charSequence, i17);
                        if (iB >= 0) {
                            if (i23 < length) {
                                int iB8 = b(charSequence, i23);
                                if (iB8 >= 0) {
                                    iB = (iB * 10) + iB8;
                                    i23 = i10 + 6;
                                }
                                int i24 = i23 + 2;
                                if (i24 < length && charSequence.charAt(i23) == ':' && i24 < length && charSequence.charAt(i23) == ':') {
                                    int iB9 = b(charSequence, i23 + 1);
                                    int iB10 = b(charSequence, i24);
                                    if (iB9 >= 0 && iB10 >= 0) {
                                        i14 = (iB9 * 10) + iB10;
                                        int i25 = i23 + 3;
                                        int i26 = i23 + 5;
                                        if (i26 < length && charSequence.charAt(i25) == ':') {
                                            int iB11 = b(charSequence, i23 + 4);
                                            int iB12 = b(charSequence, i26);
                                            if (iB11 >= 0 && iB12 >= 0) {
                                                i18 = (iB11 * 10) + iB12;
                                                i15 = i23 + 6;
                                                i12 = i18;
                                                i13 = i15;
                                            }
                                        }
                                        i13 = i25;
                                        i12 = 0;
                                    }
                                    return vVar.f(ChronoField.OFFSET_SECONDS, ((((long) i18) * 60) + (((long) iB) * 3600) + ((long) i12)) * ((long) i11), i10, i13);
                                }
                            }
                            i12 = 0;
                            i13 = i23;
                            return vVar.f(ChronoField.OFFSET_SECONDS, ((((long) i18) * 60) + (((long) iB) * 3600) + ((long) i12)) * ((long) i11), i10, i13);
                        }
                    }
                    i18 = i14;
                    return vVar.f(ChronoField.OFFSET_SECONDS, ((((long) i18) * 60) + (((long) iB) * 3600) + ((long) i12)) * ((long) i11), i10, i13);
                }
                return ~i10;
            default:
                String str = (String) this.f17870b;
                if (i10 > charSequence.length() || i10 < 0) {
                    throw new IndexOutOfBoundsException();
                }
                return !vVar.g(charSequence, i10, str, 0, str.length()) ? ~i10 : str.length() + i10;
        }
    }

    public final String toString() {
        switch (this.f17869a) {
            case 0:
                return "LocalizedOffset(" + ((TextStyle) this.f17870b) + ")";
            default:
                return "'" + ((String) this.f17870b).replace("'", "''") + "'";
        }
    }

    public static void a(StringBuilder sb, int i10) {
        sb.append((char) ((i10 / 10) + 48));
        sb.append((char) ((i10 % 10) + 48));
    }

    public static int b(CharSequence charSequence, int i10) {
        char cCharAt = charSequence.charAt(i10);
        if (cCharAt < '0' || cCharAt > '9') {
            return -1;
        }
        return cCharAt - '0';
    }
}
