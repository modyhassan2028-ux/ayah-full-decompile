package O;

/* JADX INFO: renamed from: O.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0452u extends q9.h implements p241y9.e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f6416s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f6417t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f6418u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ p241y9.c f6419v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0452u(int i10, p150o9.c cVar, p241y9.c cVar2) {
        super(2, cVar);
        this.f6416s = i10;
        this.f6419v = cVar2;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f6416s) {
            case 0:
                C0452u c0452u = new C0452u(0, cVar, this.f6419v);
                c0452u.f6418u = obj;
                return c0452u;
            default:
                C0452u c0452u2 = new C0452u(1, cVar, this.f6419v);
                c0452u2.f6418u = obj;
                return c0452u2;
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        D0.N n6 = (D0.N) obj;
        p150o9.c cVar = (p150o9.c) obj2;
        switch (this.f6416s) {
            case 0:
                ((C0452u) create(n6, cVar)).invokeSuspend(p110k9.y.f19095a);
                return p161p9.a.f21156r;
            default:
                return ((C0452u) create(n6, cVar)).invokeSuspend(p110k9.y.f19095a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008e A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x008c -> B:33:0x008f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:23:0x0061
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // q9.a
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.f6416s
            switch(r0) {
                case 0: goto L61;
                default: goto L5;
            }
        L5:
            int r0 = r6.f6417t
            r1 = 2
            r2 = 1
            p9.a r3 = p161p9.a.f21156r
            if (r0 == 0) goto L25
            if (r0 == r2) goto L1d
            if (r0 != r1) goto L15
            p110k9.a.e(r7)
            goto L57
        L15:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1d:
            java.lang.Object r0 = r6.f6418u
            D0.N r0 = (D0.N) r0
            p110k9.a.e(r7)
            goto L38
        L25:
            p110k9.a.e(r7)
            java.lang.Object r7 = r6.f6418u
            r0 = r7
            D0.N r0 = (D0.N) r0
            r6.f6418u = r0
            r6.f6417t = r2
            java.lang.Object r7 = p171r0.d.b(r0, r6)
            if (r7 != r3) goto L38
            goto L60
        L38:
            D0.v r7 = (D0.v) r7
            r7.a()
            long r4 = r7.f1134c
            r0.c r7 = new r0.c
            r7.<init>(r4)
            y9.c r2 = r6.f6419v
            r2.e(r7)
            r7 = 0
            r6.f6418u = r7
            r6.f6417t = r1
            D0.o r7 = D0.EnumC0097o.f1124s
            java.lang.Object r7 = A.n1.g(r0, r7, r6)
            if (r7 != r3) goto L57
            goto L60
        L57:
            D0.v r7 = (D0.v) r7
            if (r7 == 0) goto L5e
            r7.a()
        L5e:
            k9.y r3 = p110k9.y.f19095a
        L60:
            return r3
        L61:
            int r0 = r6.f6417t
            r1 = 1
            if (r0 == 0) goto L78
            if (r0 != r1) goto L70
            java.lang.Object r0 = r6.f6418u
            D0.N r0 = (D0.N) r0
            p110k9.a.e(r7)
            goto L8f
        L70:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L78:
            p110k9.a.e(r7)
            java.lang.Object r7 = r6.f6418u
            D0.N r7 = (D0.N) r7
            r0 = r7
        L80:
            r6.f6418u = r0
            r6.f6417t = r1
            D0.o r7 = D0.EnumC0097o.f1123r
            java.lang.Object r7 = r0.a(r7, r6)
            p9.a r2 = p161p9.a.f21156r
            if (r7 != r2) goto L8f
            return r2
        L8f:
            D0.n r7 = (D0.C0096n) r7
            boolean r7 = p000a.a.O(r7)
            r7 = r7 ^ r1
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            y9.c r2 = r6.f6419v
            r2.e(r7)
            goto L80
        */
        throw new UnsupportedOperationException("Method not decompiled: O.C0452u.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
