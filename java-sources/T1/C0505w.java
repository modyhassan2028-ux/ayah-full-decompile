package T1;

/* JADX INFO: renamed from: T1.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0505w extends q9.i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f7749r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f7750s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ boolean f7751t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ B f7752u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f7753v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f7754w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0505w(B b5, int i10, p150o9.c cVar, int i11) {
        super(2, cVar);
        this.f7749r = i11;
        this.f7752u = b5;
        this.f7753v = i10;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f7749r) {
            case 0:
                C0505w c0505w = new C0505w(this.f7752u, this.f7753v, cVar, 0);
                c0505w.f7751t = ((Boolean) obj).booleanValue();
                return c0505w;
            default:
                C0505w c0505w2 = new C0505w(this.f7752u, this.f7753v, cVar, 1);
                c0505w2.f7751t = ((Boolean) obj).booleanValue();
                return c0505w2;
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f7749r;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        p150o9.c cVar = (p150o9.c) obj2;
        switch (i10) {
            case 0:
                break;
        }
        return ((C0505w) create(bool, cVar)).invokeSuspend(p110k9.y.f19095a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0060  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        int iIntValue;
        d0 w9;
        boolean z10;
        ?? r10;
        ?? r11;
        boolean z11;
        Object obj2;
        int iIntValue2;
        int iHashCode;
        switch (this.f7749r) {
            case 0:
                boolean z12 = this.f7750s;
                B b5 = this.f7752u;
                p161p9.a aVar = p161p9.a.f21156r;
                try {
                    if (z12 == 0) {
                        p110k9.a.e(obj);
                        boolean z13 = this.f7751t;
                        this.f7751t = z13;
                        this.f7750s = 1;
                        obj = B.g(b5, z13, this);
                        z12 = z13;
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (z12 != 1) {
                            if (z12 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            boolean z14 = this.f7751t;
                            th = (Throwable) this.f7754w;
                            p110k9.a.e(obj);
                            r11 = z14;
                            iIntValue = ((Number) obj).intValue();
                            r10 = r11;
                            w9 = new W(th, iIntValue);
                            z10 = r10;
                            return new p110k9.j(w9, Boolean.valueOf(z10));
                        }
                        boolean z15 = this.f7751t;
                        p110k9.a.e(obj);
                        z12 = z15;
                    }
                    w9 = (d0) obj;
                    z10 = z12;
                    break;
                } catch (Throwable th2) {
                    if (z12 != 0) {
                        M mH = b5.h();
                        this.f7754w = th2;
                        this.f7751t = z12;
                        this.f7750s = 2;
                        Object objE = mH.e(this);
                        if (objE == aVar) {
                            return aVar;
                        }
                        th = th2;
                        obj = objE;
                        r11 = z12;
                    } else {
                        th = th2;
                        iIntValue = this.f7753v;
                        r10 = z12;
                    }
                    w9 = new W(th, iIntValue);
                    z10 = r10;
                    return new p110k9.j(w9, Boolean.valueOf(z10));
                }
                return new p110k9.j(w9, Boolean.valueOf(z10));
            default:
                int i10 = this.f7750s;
                B b10 = this.f7752u;
                Object c0487d = p161p9.a.f21156r;
                if (i10 == 0) {
                    p110k9.a.e(obj);
                    z11 = this.f7751t;
                    this.f7751t = z11;
                    this.f7750s = 1;
                    obj = b10.j(this);
                    if (obj != c0487d) {
                    }
                    return c0487d;
                }
                if (i10 == 1) {
                    z11 = this.f7751t;
                    p110k9.a.e(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj2 = this.f7754w;
                    p110k9.a.e(obj);
                }
                iIntValue2 = ((Number) obj).intValue();
                if (obj2 != null) {
                    iHashCode = obj2.hashCode();
                } else {
                    iHashCode = 0;
                }
                c0487d = new C0487d(iHashCode, iIntValue2, obj2);
                return c0487d;
                if (z11) {
                    M mH2 = b10.h();
                    this.f7754w = obj;
                    this.f7750s = 2;
                    Object objE2 = mH2.e(this);
                    if (objE2 != c0487d) {
                        obj2 = obj;
                        obj = objE2;
                        iIntValue2 = ((Number) obj).intValue();
                        if (obj2 != null) {
                            iHashCode = obj2.hashCode();
                        } else {
                            iHashCode = 0;
                        }
                        c0487d = new C0487d(iHashCode, iIntValue2, obj2);
                    }
                } else {
                    obj2 = obj;
                    iIntValue2 = this.f7753v;
                    if (obj2 != null) {
                        iHashCode = obj2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    c0487d = new C0487d(iHashCode, iIntValue2, obj2);
                }
                return c0487d;
        }
    }
}
