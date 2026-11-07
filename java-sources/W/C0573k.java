package W;

/* JADX INFO: renamed from: W.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0573k extends q9.i implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f9196r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0576l f9197s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ float f9198t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f9199u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0573k(C0576l c0576l, float f3, boolean z10, p150o9.c cVar) {
        super(1, cVar);
        this.f9197s = c0576l;
        this.f9198t = f3;
        this.f9199u = z10;
    }

    @Override // q9.a
    public final p150o9.c create(p150o9.c cVar) {
        return new C0573k(this.f9197s, this.f9198t, this.f9199u, cVar);
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        return ((C0573k) create((p150o9.c) obj)).invokeSuspend(p110k9.y.f19095a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0093, code lost:
    
        if (r15.e(r0, r14) == r7) goto L34;
     */
    @Override // q9.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            W.l r0 = r14.f9197s
            W.C2 r1 = r0.f9222a
            int r2 = r14.f9196r
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L1f
            if (r2 == r4) goto L1a
            if (r2 != r3) goto L12
            p110k9.a.e(r15)
            return r15
        L12:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L1a:
            p110k9.a.e(r15)
            goto L96
        L1f:
            p110k9.a.e(r15)
            int r15 = r1.c()
            r5 = 4609753056924675352(0x3ff921fb54442d18, double:1.5707963267948966)
            float r2 = r14.f9198t
            if (r15 != 0) goto L57
            r15 = 1048971922(0x3e860a92, float:0.2617994)
            double r7 = (double) r15
            double r7 = r7 + r5
            double r5 = (double) r2
            double r5 = r5 + r7
            r15 = 1057360530(0x3f060a92, float:0.5235988)
            double r9 = (double) r15
            double r5 = r5 / r9
            int r5 = (int) r5
            r6 = 12
            int r5 = r5 % r6
            int r5 = r5 % r6
            float r5 = (float) r5
            float r5 = r5 * r15
            r0.f9223b = r5
            double r11 = (double) r5
            double r11 = r11 + r7
            double r11 = r11 / r9
            int r15 = (int) r11
            int r15 = r15 % r6
            int r15 = r15 % r6
            boolean r5 = r1.i()
            if (r5 == 0) goto L51
            goto L52
        L51:
            r6 = 0
        L52:
            int r15 = r15 + r6
            r1.b(r15)
            goto L73
        L57:
            r15 = 1029076816(0x3d567750, float:0.05235988)
            double r7 = (double) r15
            double r7 = r7 + r5
            double r5 = (double) r2
            double r5 = r5 + r7
            r15 = 1037465424(0x3dd67750, float:0.10471976)
            double r9 = (double) r15
            double r5 = r5 / r9
            int r5 = (int) r5
            int r5 = r5 % 60
            float r5 = (float) r5
            float r5 = r5 * r15
            r0.f9224c = r5
            double r5 = (double) r5
            double r5 = r5 + r7
            double r5 = r5 / r9
            int r15 = (int) r5
            int r15 = r15 % 60
            r1.e(r15)
        L73:
            boolean r15 = r14.f9199u
            r1 = 1086918619(0x40c90fdb, float:6.2831855)
            r5 = 0
            r6 = 1070141403(0x3fc90fdb, float:1.5707964)
            p9.a r7 = p161p9.a.f21156r
            if (r15 != 0) goto L99
            x.c r15 = r0.f9225d
            float r2 = r2 + r6
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 >= 0) goto L88
            float r2 = r2 + r1
        L88:
            java.lang.Float r0 = new java.lang.Float
            r0.<init>(r2)
            r14.f9196r = r4
            java.lang.Object r15 = r15.e(r0, r14)
            if (r15 != r7) goto L96
            goto Lbe
        L96:
            k9.y r15 = p110k9.y.f19095a
            return r15
        L99:
            float r2 = r2 + r6
            int r15 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r15 >= 0) goto L9f
            float r2 = r2 + r1
        L9f:
            float r15 = r0.j(r2)
            x.c r8 = r0.f9225d
            java.lang.Float r9 = new java.lang.Float
            r9.<init>(r15)
            r15 = 1143930880(0x442f0000, float:700.0)
            r0 = 4
            r1 = 0
            x.a0 r10 = p223x.AbstractC1413d.p(r15, r0, r1)
            r14.f9196r = r3
            r11 = 0
            r13 = 12
            r12 = r14
            java.lang.Object r15 = p223x.C1411c.c(r8, r9, r10, r11, r12, r13)
            if (r15 != r7) goto Lbf
        Lbe:
            return r7
        Lbf:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: W.C0573k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
