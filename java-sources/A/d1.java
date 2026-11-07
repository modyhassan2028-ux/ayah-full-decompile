package A;

/* JADX INFO: loaded from: classes.dex */
public final class d1 extends q9.h implements p241y9.e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f222s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f223t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f224u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ D0.v f225v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(D0.v vVar, p150o9.c cVar) {
        super(2, cVar);
        this.f225v = vVar;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        d1 d1Var = new d1(this.f225v, cVar);
        d1Var.f224u = obj;
        return d1Var;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((d1) create((D0.N) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x0048 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003d -> B:12:0x0040). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // q9.a
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.f223t
            r1 = 1
            if (r0 == 0) goto L19
            if (r0 != r1) goto L11
            long r2 = r6.f222s
            java.lang.Object r0 = r6.f224u
            D0.N r0 = (D0.N) r0
            p110k9.a.e(r7)
            goto L40
        L11:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L19:
            p110k9.a.e(r7)
            java.lang.Object r7 = r6.f224u
            D0.N r7 = (D0.N) r7
            D0.v r0 = r6.f225v
            long r2 = r0.f1133b
            K0.c1 r0 = r7.e()
            r0.getClass()
            r4 = 40
            long r4 = r4 + r2
            r0 = r7
            r2 = r4
        L30:
            r6.f224u = r0
            r6.f222s = r2
            r6.f223t = r1
            r7 = 3
            java.lang.Object r7 = A.n1.c(r0, r6, r7)
            p9.a r4 = p161p9.a.f21156r
            if (r7 != r4) goto L40
            return r4
        L40:
            D0.v r7 = (D0.v) r7
            long r4 = r7.f1133b
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 < 0) goto L30
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: A.d1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
