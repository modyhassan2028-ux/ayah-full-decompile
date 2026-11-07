package A;

import p223x.C1423l;
import p223x.InterfaceC1421j;

/* JADX INFO: loaded from: classes.dex */
public final class r1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C1423l f399f = new C1423l(0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p223x.x0 f400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f401b = Long.MIN_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C1423l f402c = f399f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f403d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f404e;

    public r1(InterfaceC1421j interfaceC1421j) {
        this.f400a = interfaceC1421j.a(p223x.w0.f24113a);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0081 A[Catch: all -> 0x00ee, PHI: r0 r1 r13 r14 r15
      0x0081: PHI (r0v9 ??) = (r0v3 ??), (r0v15 ??) binds: [B:31:0x007a, B:40:0x00b6] A[DONT_GENERATE, DONT_INLINE]
      0x0081: PHI (r1v4 A.p1) = (r1v2 A.p1), (r1v5 A.p1) binds: [B:31:0x007a, B:40:0x00b6] A[DONT_GENERATE, DONT_INLINE]
      0x0081: PHI (r13v6 float) = (r13v3 float), (r13v7 float) binds: [B:31:0x007a, B:40:0x00b6] A[DONT_GENERATE, DONT_INLINE]
      0x0081: PHI (r14v6 y9.c) = (r14v3 y9.c), (r14v7 y9.c) binds: [B:31:0x007a, B:40:0x00b6] A[DONT_GENERATE, DONT_INLINE]
      0x0081: PHI (r15v17 A.r1) = (r15v8 A.r1), (r15v18 A.r1) binds: [B:31:0x007a, B:40:0x00b6] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #2 {all -> 0x00ee, blocks: (B:38:0x00b1, B:32:0x0081, B:35:0x0093), top: B:59:0x00b1 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x008e A[PHI: r0 r1 r14 r15
      0x008e: PHI (r0v4 ??) = (r0v16 ??), (r0v17 ??) binds: [B:33:0x008c, B:40:0x00b6] A[DONT_GENERATE, DONT_INLINE]
      0x008e: PHI (r1v3 A.p1) = (r1v4 A.p1), (r1v5 A.p1) binds: [B:33:0x008c, B:40:0x00b6] A[DONT_GENERATE, DONT_INLINE]
      0x008e: PHI (r14v4 y9.c) = (r14v6 y9.c), (r14v7 y9.c) binds: [B:33:0x008c, B:40:0x00b6] A[DONT_GENERATE, DONT_INLINE]
      0x008e: PHI (r15v11 A.r1) = (r15v17 A.r1), (r15v18 A.r1) binds: [B:33:0x008c, B:40:0x00b6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x0093 A[Catch: all -> 0x00ee, TryCatch #2 {all -> 0x00ee, blocks: (B:38:0x00b1, B:32:0x0081, B:35:0x0093), top: B:59:0x00b1 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c4 A[Catch: all -> 0x0037, TryCatch #1 {all -> 0x0037, blocks: (B:13:0x0032, B:48:0x00e2, B:42:0x00b9, B:45:0x00c4), top: B:57:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00b1 A[EXC_TOP_SPLITTER, PHI: r0 r1 r13 r14 r15
      0x00b1: PHI (r0v10 ??) = (r0v14 ??), (r0v11 ??) binds: [B:36:0x00ae, B:21:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x00b1: PHI (r1v5 A.p1) = (r1v4 A.p1), (r1v8 A.p1) binds: [B:36:0x00ae, B:21:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x00b1: PHI (r13v7 float) = (r13v6 float), (r13v11 float) binds: [B:36:0x00ae, B:21:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x00b1: PHI (r14v7 y9.c) = (r14v6 y9.c), (r14v13 y9.c) binds: [B:36:0x00ae, B:21:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x00b1: PHI (r15v18 A.r1) = (r15v17 A.r1), (r15v20 A.r1) binds: [B:36:0x00ae, B:21:0x004f] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [y9.a] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v9, types: [y9.a] */
    /* JADX WARN: Type inference failed for: r13v10, types: [y9.a] */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v5, types: [k9.e] */
    /* JADX WARN: Type inference failed for: r14v0, types: [A.j] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v2, types: [A.r1] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9, types: [A.r1] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00ae -> B:59:0x00b1). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(A.C0023i r13, A.C0025j r14, q9.c r15) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A.r1.a(A.i, A.j, q9.c):java.lang.Object");
    }
}
