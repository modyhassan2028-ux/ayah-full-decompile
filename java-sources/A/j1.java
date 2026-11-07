package A;

import K9.InterfaceC0402u;

/* JADX INFO: loaded from: classes.dex */
public final class j1 extends q9.h implements p241y9.e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ p241y9.c f273A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final /* synthetic */ p251z9.k f274B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final /* synthetic */ C0053x0 f275C;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f276s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f277t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public D0.v f278u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f279v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f280w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0402u f281x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ p241y9.f f282y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ p241y9.c f283z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j1(InterfaceC0402u interfaceC0402u, p241y9.f fVar, p241y9.c cVar, p241y9.c cVar2, p241y9.c cVar3, C0053x0 c0053x0, p150o9.c cVar4) {
        super(2, cVar4);
        this.f281x = interfaceC0402u;
        this.f282y = fVar;
        this.f283z = cVar;
        this.f273A = cVar2;
        this.f274B = (p251z9.k) cVar3;
        this.f275C = c0053x0;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [y9.c, z9.k] */
    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        j1 j1Var = new j1(this.f281x, this.f282y, this.f283z, this.f273A, this.f274B, this.f275C, cVar);
        j1Var.f280w = obj;
        return j1Var;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((j1) create((D0.N) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:21:0x010f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0119  */
    /* JADX WARN: Code duplicated, block: B:27:0x012c  */
    /* JADX WARN: Code duplicated, block: B:30:0x013c A[PHI: r1 r2 r4 r5 r12 r13 r14 r15 r21
      0x013c: PHI (r1v17 K9.a0) = (r1v6 K9.a0), (r1v20 K9.a0) binds: [B:28:0x0138, B:11:0x0090] A[DONT_GENERATE, DONT_INLINE]
      0x013c: PHI (r2v8 z9.k) = (r12v33 z9.k), (r2v12 z9.k) binds: [B:28:0x0138, B:11:0x0090] A[DONT_GENERATE, DONT_INLINE]
      0x013c: PHI (r4v12 y9.c) = (r4v4 y9.c), (r4v15 y9.c) binds: [B:28:0x0138, B:11:0x0090] A[DONT_GENERATE, DONT_INLINE]
      0x013c: PHI (r5v6 D0.N) = (r5v0 D0.N), (r5v8 D0.N) binds: [B:28:0x0138, B:11:0x0090] A[DONT_GENERATE, DONT_INLINE]
      0x013c: PHI (r12v8 D0.v) = (r12v34 D0.v), (r12v9 D0.v) binds: [B:28:0x0138, B:11:0x0090] A[DONT_GENERATE, DONT_INLINE]
      0x013c: PHI (r13v5 java.lang.Object) = (r13v1 java.lang.Object), (r13v8 java.lang.Object) binds: [B:28:0x0138, B:11:0x0090] A[DONT_GENERATE, DONT_INLINE]
      0x013c: PHI (r14v8 y9.f) = (r13v0 y9.f), (r14v9 y9.f) binds: [B:28:0x0138, B:11:0x0090] A[DONT_GENERATE, DONT_INLINE]
      0x013c: PHI (r15v6 D0.v) = (r15v2 D0.v), (r15v9 D0.v) binds: [B:28:0x0138, B:11:0x0090] A[DONT_GENERATE, DONT_INLINE]
      0x013c: PHI (r21v5 A.x0) = (r14v1 A.x0), (r21v6 A.x0) binds: [B:28:0x0138, B:11:0x0090] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x0144  */
    /* JADX WARN: Code duplicated, block: B:37:0x016a  */
    /* JADX WARN: Code duplicated, block: B:39:0x0170  */
    /* JADX WARN: Code duplicated, block: B:40:0x0175  */
    /* JADX WARN: Code duplicated, block: B:42:0x0179  */
    /* JADX WARN: Code duplicated, block: B:44:0x017c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0186  */
    /* JADX WARN: Code duplicated, block: B:47:0x0195 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x0197  */
    /* JADX WARN: Code duplicated, block: B:50:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:53:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:56:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:58:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:60:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:61:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:63:0x0200  */
    /* JADX WARN: Code duplicated, block: B:66:0x0210  */
    /* JADX WARN: Code duplicated, block: B:68:0x0215  */
    /* JADX WARN: Code duplicated, block: B:71:0x0227  */
    /* JADX WARN: Code duplicated, block: B:74:0x0234  */
    /* JADX WARN: Code duplicated, block: B:77:0x0251  */
    /* JADX WARN: Code duplicated, block: B:80:0x025c  */
    /* JADX WARN: Code duplicated, block: B:82:0x0260  */
    /* JADX WARN: Code duplicated, block: B:83:0x0268  */
    /* JADX WARN: Code duplicated, block: B:85:0x026c  */
    /* JADX WARN: Code duplicated, block: B:87:0x0271  */
    /* JADX WARN: Code duplicated, block: B:89:0x028a  */
    /* JADX WARN: Code duplicated, block: B:91:0x029e  */
    /* JADX WARN: Code duplicated, block: B:93:0x02a4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:94:0x02a5  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0123, code lost:
    
        if (r6 == r3) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x015b, code lost:
    
        if (A.n1.a(r5, r23) == r3) goto L76;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10, types: [o9.c] */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12, types: [o9.c, o9.h] */
    /* JADX WARN: Type inference failed for: r12v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19, types: [o9.c] */
    /* JADX WARN: Type inference failed for: r12v20, types: [D0.v, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v22, types: [o9.c] */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r12v29 */
    /* JADX WARN: Type inference failed for: r12v30 */
    /* JADX WARN: Type inference failed for: r12v31 */
    /* JADX WARN: Type inference failed for: r12v32 */
    /* JADX WARN: Type inference failed for: r12v35 */
    /* JADX WARN: Type inference failed for: r12v36 */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v7, types: [o9.c] */
    /* JADX WARN: Type inference failed for: r16v3, types: [o9.c] */
    /* JADX WARN: Type inference failed for: r2v14, types: [y9.c] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18, types: [y9.c] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v7, types: [y9.c] */
    /* JADX WARN: Type inference failed for: r4v25, types: [D0.v] */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v32 */
    @Override // q9.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 706
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A.j1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
