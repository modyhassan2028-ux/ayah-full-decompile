package Y9;

import p185s8.u0;

/* JADX INFO: loaded from: classes.dex */
public final class n0 implements U9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n0 f10536a = new n0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final T f10537b = new T("kotlin.uuid.Uuid", W9.d.f9667k);

    @Override // U9.a
    public final void b(p009aa.n nVar, Object obj) {
        J9.a aVar = (J9.a) obj;
        p251z9.j.e(aVar, "value");
        nVar.r(aVar.toString());
    }

    @Override // U9.a
    public final Object c(X9.b bVar) {
        String strConcat;
        String strW = bVar.w();
        p251z9.j.e(strW, "uuidString");
        int length = strW.length();
        if (length == 32) {
            long jB = H9.c.b(strW, 0, 16);
            long jB2 = H9.c.b(strW, 16, 32);
            if (jB != 0 || jB2 != 0) {
                return new J9.a(jB, jB2);
            }
        } else {
            if (length != 36) {
                StringBuilder sb = new StringBuilder("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"");
                if (strW.length() <= 64) {
                    strConcat = strW;
                } else {
                    String strSubstring = strW.substring(0, 64);
                    p251z9.j.d(strSubstring, "substring(...)");
                    strConcat = strSubstring.concat("...");
                }
                sb.append(strConcat);
                sb.append("\" of length ");
                sb.append(strW.length());
                throw new IllegalArgumentException(sb.toString());
            }
            long jB3 = H9.c.b(strW, 0, 8);
            u0.h(8, strW);
            long jB4 = H9.c.b(strW, 9, 13);
            u0.h(13, strW);
            long jB5 = H9.c.b(strW, 14, 18);
            u0.h(18, strW);
            long jB6 = H9.c.b(strW, 19, 23);
            u0.h(23, strW);
            long j = (jB4 << 16) | (jB3 << 32) | jB5;
            long jB7 = H9.c.b(strW, 24, 36) | (jB6 << 48);
            if (j != 0 || jB7 != 0) {
                return new J9.a(j, jB7);
            }
        }
        return J9.a.f4414t;
    }

    @Override // U9.a
    public final W9.f d() {
        return f10537b;
    }
}
