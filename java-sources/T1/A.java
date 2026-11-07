package T1;

/* JADX INFO: loaded from: classes.dex */
public final class A extends q9.i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public p251z9.t f7554r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f7555s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f7556t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ p251z9.t f7557u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ B f7558v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f7559w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f7560x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(p251z9.t tVar, B b5, Object obj, boolean z10, p150o9.c cVar) {
        super(2, cVar);
        this.f7557u = tVar;
        this.f7558v = b5;
        this.f7559w = obj;
        this.f7560x = z10;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        A a9 = new A(this.f7557u, this.f7558v, this.f7559w, this.f7560x, cVar);
        a9.f7556t = obj;
        return a9;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((A) create((K) obj, (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0056, code lost:
    
        if (r5.b(r1, r7) == r6) goto L16;
     */
    @Override // q9.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.f7555s
            java.lang.Object r1 = r7.f7559w
            T1.B r2 = r7.f7558v
            z9.t r3 = r7.f7557u
            r4 = 2
            r5 = 1
            p9.a r6 = p161p9.a.f21156r
            if (r0 == 0) goto L28
            if (r0 == r5) goto L1e
            if (r0 != r4) goto L16
            p110k9.a.e(r8)
            goto L59
        L16:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1e:
            z9.t r0 = r7.f7554r
            java.lang.Object r5 = r7.f7556t
            T1.K r5 = (T1.K) r5
            p110k9.a.e(r8)
            goto L43
        L28:
            p110k9.a.e(r8)
            java.lang.Object r8 = r7.f7556t
            T1.K r8 = (T1.K) r8
            T1.M r0 = r2.h()
            r7.f7556t = r8
            r7.f7554r = r3
            r7.f7555s = r5
            java.lang.Object r0 = r0.d(r7)
            if (r0 != r6) goto L40
            goto L58
        L40:
            r5 = r8
            r8 = r0
            r0 = r3
        L43:
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r0.f24884r = r8
            r8 = 0
            r7.f7556t = r8
            r7.f7554r = r8
            r7.f7555s = r4
            java.lang.Object r8 = r5.b(r1, r7)
            if (r8 != r6) goto L59
        L58:
            return r6
        L59:
            boolean r8 = r7.f7560x
            if (r8 == 0) goto L71
            O8.c r8 = r2.f7567h
            T1.d r0 = new T1.d
            if (r1 == 0) goto L68
            int r2 = r1.hashCode()
            goto L69
        L68:
            r2 = 0
        L69:
            int r3 = r3.f24884r
            r0.<init>(r2, r3, r1)
            r8.E(r0)
        L71:
            k9.y r8 = p110k9.y.f19095a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.A.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
