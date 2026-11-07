package Q8;

import A.M0;
import com.google.android.gms.internal.measurement.AbstractC0813f2;

/* JADX INFO: renamed from: Q8.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0470q {
    public static T1.B b(T1.Y y10, O8.c cVar, P9.d dVar, p241y9.a aVar) {
        p120l9.r rVar = p120l9.r.f19440r;
        p150o9.c cVar2 = null;
        try {
            System.loadLibrary("datastore_shared_counter");
            return new T1.B(new T1.F(y10, new M0(24, dVar), aVar), AbstractC0813f2.K(new O9.y(rVar, cVar2, 5)), cVar, dVar);
        } catch (SecurityException | UnsatisfiedLinkError unused) {
            return new T1.B(new T1.F(y10, T1.E.f7579r, aVar), AbstractC0813f2.K(new O9.y(rVar, cVar2, 5)), cVar, dVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008a, code lost:
    
        if (r10 == r6) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r9v0, types: [J8.e] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(J8.e r9, q9.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof Q8.C0477y
            if (r0 == 0) goto L13
            r0 = r10
            Q8.y r0 = (Q8.C0477y) r0
            int r1 = r0.f7064u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7064u = r1
            goto L18
        L13:
            Q8.y r0 = new Q8.y
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f7062s
            int r1 = r0.f7064u
            java.lang.String r2 = "FirebaseSessions"
            r3 = 2
            r4 = 1
            java.lang.String r5 = ""
            p9.a r6 = p161p9.a.f21156r
            if (r1 == 0) goto L47
            if (r1 == r4) goto L3d
            if (r1 != r3) goto L35
            java.lang.Object r9 = r0.f7061r
            java.lang.String r9 = (java.lang.String) r9
            p110k9.a.e(r10)     // Catch: java.lang.Exception -> L32
            goto L8d
        L32:
            r10 = move-exception
            goto L94
        L35:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3d:
            java.lang.Object r9 = r0.f7061r
            J8.e r9 = (J8.e) r9
            p110k9.a.e(r10)     // Catch: java.lang.Exception -> L45
            goto L64
        L45:
            r10 = move-exception
            goto L70
        L47:
            p110k9.a.e(r10)
            r10 = r9
            J8.d r10 = (J8.d) r10     // Catch: java.lang.Exception -> L45
            l7.o r9 = r10.f()     // Catch: java.lang.Exception -> L45
            java.lang.String r1 = "getToken(...)"
            p251z9.j.d(r9, r1)     // Catch: java.lang.Exception -> L6c
            r0.f7061r = r10     // Catch: java.lang.Exception -> L6c
            r0.f7064u = r4     // Catch: java.lang.Exception -> L6c
            java.lang.Object r9 = p017b7.g.M(r9, r0)     // Catch: java.lang.Exception -> L6c
            if (r9 != r6) goto L61
            goto L8c
        L61:
            r7 = r10
            r10 = r9
            r9 = r7
        L64:
            J8.a r10 = (J8.a) r10     // Catch: java.lang.Exception -> L45
            java.lang.String r10 = r10.f4387a     // Catch: java.lang.Exception -> L45
            r7 = r10
            r10 = r9
            r9 = r7
            goto L77
        L6c:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L70:
            java.lang.String r1 = "Error getting authentication token."
            android.util.Log.w(r2, r1, r10)
            r10 = r9
            r9 = r5
        L77:
            J8.d r10 = (J8.d) r10     // Catch: java.lang.Exception -> L32
            l7.o r10 = r10.d()     // Catch: java.lang.Exception -> L32
            java.lang.String r1 = "getId(...)"
            p251z9.j.d(r10, r1)     // Catch: java.lang.Exception -> L32
            r0.f7061r = r9     // Catch: java.lang.Exception -> L32
            r0.f7064u = r3     // Catch: java.lang.Exception -> L32
            java.lang.Object r10 = p017b7.g.M(r10, r0)     // Catch: java.lang.Exception -> L32
            if (r10 != r6) goto L8d
        L8c:
            return r6
        L8d:
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Exception -> L32
            if (r10 != 0) goto L92
            goto L99
        L92:
            r5 = r10
            goto L99
        L94:
            java.lang.String r0 = "Error getting Firebase installation id ."
            android.util.Log.w(r2, r0, r10)
        L99:
            Q8.z r10 = new Q8.z
            r10.<init>(r5, r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: Q8.C0470q.a(J8.e, q9.c):java.lang.Object");
    }
}
