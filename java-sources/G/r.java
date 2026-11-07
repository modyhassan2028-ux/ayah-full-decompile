package G;

import K9.InterfaceC0402u;
import p223x.InterfaceC1435y;

/* JADX INFO: loaded from: classes.dex */
public final class r extends q9.i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f2723r = 1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f2724s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f2725t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Object f2726u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f2727v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f2728w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Z.X x9, boolean z10, B.j jVar, p150o9.c cVar) {
        super(2, cVar);
        this.f2727v = x9;
        this.f2725t = z10;
        this.f2728w = jVar;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f2723r) {
            case 0:
                return new r(this.f2725t, (C0185t) this.f2726u, (InterfaceC1435y) this.f2727v, (p205v0.b) this.f2728w, cVar);
            default:
                return new r((Z.X) this.f2727v, this.f2725t, (B.j) this.f2728w, cVar);
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0402u interfaceC0402u = (InterfaceC0402u) obj;
        p150o9.c cVar = (p150o9.c) obj2;
        switch (this.f2723r) {
            case 0:
                break;
        }
        return ((r) create(interfaceC0402u, cVar)).invokeSuspend(p110k9.y.f19095a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a7, code lost:
    
        if (p223x.C1411c.c(r9.f2747p, new java.lang.Float(1.0f), (p223x.InterfaceC1435y) r8, r3, r12, 4) == r7) goto L41;
     */
    @Override // q9.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            int r0 = r12.f2723r
            k9.y r6 = p110k9.y.f19095a
            java.lang.Object r1 = r12.f2728w
            boolean r2 = r12.f2725t
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            p9.a r7 = p161p9.a.f21156r
            r5 = 1
            java.lang.Object r8 = r12.f2727v
            switch(r0) {
                case 0: goto L56;
                default: goto L12;
            }
        L12:
            Z.X r8 = (Z.X) r8
            int r0 = r12.f2724s
            if (r0 == 0) goto L29
            if (r0 != r5) goto L23
            java.lang.Object r0 = r12.f2726u
            r8 = r0
            Z.X r8 = (Z.X) r8
            p110k9.a.e(r13)
            goto L51
        L23:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L29:
            p110k9.a.e(r13)
            java.lang.Object r0 = r8.getValue()
            B.l r0 = (B.l) r0
            if (r0 == 0) goto L55
            B.j r1 = (B.j) r1
            if (r2 == 0) goto L3e
            B.m r2 = new B.m
            r2.<init>(r0)
            goto L43
        L3e:
            B.k r2 = new B.k
            r2.<init>(r0)
        L43:
            if (r1 == 0) goto L51
            r12.f2726u = r8
            r12.f2724s = r5
            java.lang.Object r0 = r1.a(r2, r12)
            if (r0 != r7) goto L51
            r6 = r7
            goto L55
        L51:
            r0 = 0
            r8.setValue(r0)
        L55:
            return r6
        L56:
            java.lang.Object r0 = r12.f2726u
            r9 = r0
            G.t r9 = (G.C0185t) r9
            int r0 = r12.f2724s
            r10 = 0
            r11 = 2
            if (r0 == 0) goto L75
            if (r0 == r5) goto L71
            if (r0 != r11) goto L6b
            p110k9.a.e(r13)     // Catch: java.lang.Throwable -> L69
            goto Lab
        L69:
            r0 = move-exception
            goto Lb1
        L6b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L71:
            p110k9.a.e(r13)     // Catch: java.lang.Throwable -> L69
            goto L8b
        L75:
            p110k9.a.e(r13)
            if (r2 == 0) goto L8b
            x.c r0 = r9.f2747p     // Catch: java.lang.Throwable -> L69
            java.lang.Float r2 = new java.lang.Float     // Catch: java.lang.Throwable -> L69
            r3 = 0
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L69
            r12.f2724s = r5     // Catch: java.lang.Throwable -> L69
            java.lang.Object r0 = r0.e(r2, r12)     // Catch: java.lang.Throwable -> L69
            if (r0 != r7) goto L8b
            goto La9
        L8b:
            x.c r0 = r9.f2747p     // Catch: java.lang.Throwable -> L69
            r2 = r1
            java.lang.Float r1 = new java.lang.Float     // Catch: java.lang.Throwable -> L69
            r3 = 1065353216(0x3f800000, float:1.0)
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L69
            x.y r8 = (p223x.InterfaceC1435y) r8     // Catch: java.lang.Throwable -> L69
            G.q r3 = new G.q     // Catch: java.lang.Throwable -> L69
            v0.b r2 = (p205v0.b) r2     // Catch: java.lang.Throwable -> L69
            r3.<init>(r2, r9, r10)     // Catch: java.lang.Throwable -> L69
            r12.f2724s = r11     // Catch: java.lang.Throwable -> L69
            r5 = 4
            r4 = r12
            r2 = r8
            java.lang.Object r0 = p223x.C1411c.c(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L69
            if (r0 != r7) goto Lab
        La9:
            r6 = r7
            goto Lb0
        Lab:
            int r0 = G.C0185t.f2733t
            r9.d(r10)
        Lb0:
            return r6
        Lb1:
            int r1 = G.C0185t.f2733t
            r9.d(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: G.r.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(boolean z10, C0185t c0185t, InterfaceC1435y interfaceC1435y, p205v0.b bVar, p150o9.c cVar) {
        super(2, cVar);
        this.f2725t = z10;
        this.f2726u = c0185t;
        this.f2727v = interfaceC1435y;
        this.f2728w = bVar;
    }
}
