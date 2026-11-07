package p171r0;

import p084i.k;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static final long a(float f3, float f7) {
        return (((long) Float.floatToRawIntBits(f7)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0049  */
    /* JADX WARN: Code duplicated, block: B:22:0x0051  */
    /* JADX WARN: Code duplicated, block: B:24:0x005d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0032 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003c -> B:18:0x003f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:22:0x0051
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object b(D0.N r7, q9.a r8) {
        /*
            boolean r0 = r8 instanceof p242z.b
            if (r0 == 0) goto L13
            r0 = r8
            z.b r0 = (p242z.b) r0
            int r1 = r0.f24726t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24726t = r1
            goto L18
        L13:
            z.b r0 = new z.b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f24725s
            int r1 = r0.f24726t
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            D0.N r7 = r0.f24724r
            p110k9.a.e(r8)
            goto L3f
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            p110k9.a.e(r8)
        L32:
            r0.f24724r = r7
            r0.f24726t = r2
            java.lang.Object r8 = p245z2.a.s(r7, r0)
            p9.a r1 = p161p9.a.f21156r
            if (r8 != r1) goto L3f
            return r1
        L3f:
            D0.n r8 = (D0.C0096n) r8
            int r1 = r8.f1121c
            java.lang.Object r8 = r8.f1119a
            r1 = r1 & 66
            if (r1 == 0) goto L32
            int r1 = r8.size()
            r3 = 0
            r4 = r3
        L4f:
            if (r4 >= r1) goto L68
            java.lang.Object r5 = r8.get(r4)
            D0.v r5 = (D0.v) r5
            boolean r6 = r5.b()
            if (r6 != 0) goto L32
            boolean r6 = r5.f1138h
            if (r6 != 0) goto L32
            boolean r5 = r5.f1135d
            if (r5 == 0) goto L32
            int r4 = r4 + 1
            goto L4f
        L68:
            java.lang.Object r7 = r8.get(r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p171r0.d.b(D0.N, q9.a):java.lang.Object");
    }

    public static void c(String str) {
        if (str.equals("light")) {
            k.k(1);
        } else if (str.equals("dark")) {
            k.k(2);
        } else {
            k.k(-1);
        }
    }

    public static final long d(long j, float f3) {
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (j >> 32)) - f3);
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (j & 4294967295L)) - f3);
        return (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax2)) & 4294967295L);
    }
}
