package T1;

/* JADX INFO: loaded from: classes.dex */
public final class g0 implements p150o9.g {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final g0 f7679r = new g0();

    /* JADX WARN: Can't wrap try/catch for region: R(3:31|17|34) */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
    
        r1 = r0.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        if (r1 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0064, code lost:
    
        r12.f7614r = r11;
        r12.f7615s = r3;
        r12.f7617u = 1;
        r0 = K9.AbstractC0405x.k(r3, r12);
        r1 = p161p9.a.f21156r;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0070, code lost:
    
        if (r0 == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0078, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0070 -> B:27:0x0074). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(java.io.FileOutputStream r11, q9.c r12) throws java.io.IOException {
        /*
            boolean r0 = r12 instanceof T1.O
            if (r0 == 0) goto L13
            r0 = r12
            T1.O r0 = (T1.O) r0
            int r1 = r0.f7617u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7617u = r1
            goto L18
        L13:
            T1.O r0 = new T1.O
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f7616t
            int r1 = r0.f7617u
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            long r3 = r0.f7615s
            java.io.FileOutputStream r11 = r0.f7614r
            p110k9.a.e(r12)
            r12 = r0
            goto L74
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L32:
            p110k9.a.e(r12)
            r3 = 10
            r12 = r0
        L38:
            r0 = 60000(0xea60, double:2.9644E-319)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
        */
        //  java.lang.String r1 = "lockFileStream.getChanne…LUE, /* shared= */ false)"
        /*
            if (r0 > 0) goto L79
            java.nio.channels.FileChannel r5 = r11.getChannel()     // Catch: java.io.IOException -> L55
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r10 = 0
            r6 = 0
            java.nio.channels.FileLock r0 = r5.lock(r6, r8, r10)     // Catch: java.io.IOException -> L55
            p251z9.j.d(r0, r1)     // Catch: java.io.IOException -> L55
            goto L8c
        L55:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            if (r1 == 0) goto L78
            java.lang.String r5 = "Resource deadlock would occur"
            boolean r1 = H9.o.V0(r1, r5)
            if (r1 != r2) goto L78
            r12.f7614r = r11
            r12.f7615s = r3
            r12.f7617u = r2
            java.lang.Object r0 = K9.AbstractC0405x.k(r3, r12)
            p9.a r1 = p161p9.a.f21156r
            if (r0 != r1) goto L74
            r0 = r1
            goto L8c
        L74:
            r0 = 2
            long r0 = (long) r0
            long r3 = r3 * r0
            goto L38
        L78:
            throw r0
        L79:
            java.nio.channels.FileChannel r5 = r11.getChannel()
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r10 = 0
            r6 = 0
            java.nio.channels.FileLock r0 = r5.lock(r6, r8, r10)
            p251z9.j.d(r0, r1)
        L8c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.g0.a(java.io.FileOutputStream, q9.c):java.lang.Object");
    }
}
