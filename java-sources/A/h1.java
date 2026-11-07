package A;

import K9.InterfaceC0402u;

/* JADX INFO: loaded from: classes.dex */
public final class h1 extends q9.h implements p241y9.e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public K9.A f248s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f249t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f250u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0402u f251v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q9.i f252w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ p251z9.k f253x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ C0053x0 f254y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h1(InterfaceC0402u interfaceC0402u, p241y9.f fVar, p241y9.c cVar, C0053x0 c0053x0, p150o9.c cVar2) {
        super(2, cVar2);
        this.f251v = interfaceC0402u;
        this.f252w = (q9.i) fVar;
        this.f253x = (p251z9.k) cVar;
        this.f254y = c0053x0;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [q9.i, y9.f] */
    /* JADX WARN: Type inference failed for: r3v0, types: [y9.c, z9.k] */
    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        h1 h1Var = new h1(this.f251v, this.f252w, this.f253x, this.f254y, cVar);
        h1Var.f250u = obj;
        return h1Var;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((h1) create((D0.N) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006f, code lost:
    
        if (r13 == r7) goto L19;
     */
    /* JADX WARN: Type inference failed for: r0v7, types: [y9.c, z9.k] */
    /* JADX WARN: Type inference failed for: r10v0, types: [q9.i, y9.f] */
    @Override // q9.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            int r0 = r12.f249t
            r1 = 0
            K9.u r2 = r12.f251v
            r3 = 2
            r4 = 1
            A.x0 r5 = r12.f254y
            r6 = 0
            p9.a r7 = p161p9.a.f21156r
            if (r0 == 0) goto L2c
            if (r0 == r4) goto L22
            if (r0 != r3) goto L1a
            java.lang.Object r0 = r12.f250u
            K9.a0 r0 = (K9.a0) r0
            p110k9.a.e(r13)
            goto L72
        L1a:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L22:
            K9.A r0 = r12.f248s
            java.lang.Object r8 = r12.f250u
            D0.N r8 = (D0.N) r8
            p110k9.a.e(r13)
            goto L50
        L2c:
            p110k9.a.e(r13)
            java.lang.Object r13 = r12.f250u
            r8 = r13
            D0.N r8 = (D0.N) r8
            A.U r13 = A.n1.f346a
            A.g1 r13 = new A.g1
            r13.<init>(r5, r6, r1)
            K9.A r13 = K9.AbstractC0405x.x(r2, r6, r13, r4)
            r12.f250u = r8
            r12.f248s = r13
            r12.f249t = r4
            r0 = 3
            java.lang.Object r0 = A.n1.c(r8, r12, r0)
            if (r0 != r7) goto L4d
            goto L71
        L4d:
            r11 = r0
            r0 = r13
            r13 = r11
        L50:
            D0.v r13 = (D0.v) r13
            r13.a()
            A.U r9 = A.n1.f346a
            q9.i r10 = r12.f252w
            if (r10 == r9) goto L63
            A.q r9 = new A.q
            r9.<init>(r10, r5, r13, r6)
            A.n1.e(r2, r0, r9)
        L63:
            r12.f250u = r0
            r12.f248s = r6
            r12.f249t = r3
            D0.o r13 = D0.EnumC0097o.f1124s
            java.lang.Object r13 = A.n1.g(r8, r13, r12)
            if (r13 != r7) goto L72
        L71:
            return r7
        L72:
            D0.v r13 = (D0.v) r13
            if (r13 != 0) goto L7f
            A.f1 r13 = new A.f1
            r13.<init>(r5, r6, r1)
            A.n1.e(r2, r0, r13)
            goto L96
        L7f:
            r13.a()
            A.f1 r1 = new A.f1
            r1.<init>(r5, r6, r4)
            A.n1.e(r2, r0, r1)
            long r0 = r13.f1134c
            r0.c r13 = new r0.c
            r13.<init>(r0)
            z9.k r0 = r12.f253x
            r0.e(r13)
        L96:
            k9.y r13 = p110k9.y.f19095a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: A.h1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
