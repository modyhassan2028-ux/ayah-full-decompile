package N9;

/* JADX INFO: renamed from: N9.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0410c extends C0412e {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final q9.i f6168w;

    /* JADX WARN: Multi-variable type inference failed */
    public C0410c(p241y9.e eVar, p150o9.h hVar, int i10, M9.a aVar) {
        super(eVar, hVar, i10, aVar);
        this.f6168w = (q9.i) eVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // N9.C0412e, O9.e
    public final Object e(M9.s sVar, p150o9.c cVar) throws Throwable {
        C0409b c0409b;
        if (cVar instanceof C0409b) {
            c0409b = (C0409b) cVar;
            int i10 = c0409b.f6163u;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c0409b.f6163u = i10 - Integer.MIN_VALUE;
            } else {
                c0409b = new C0409b(this, (q9.c) cVar);
            }
        } else {
            c0409b = new C0409b(this, (q9.c) cVar);
        }
        Object obj = c0409b.f6161s;
        int i11 = c0409b.f6163u;
        if (i11 == 0) {
            p110k9.a.e(obj);
            c0409b.f6160r = sVar;
            c0409b.f6163u = 1;
            Object objE = super.e(sVar, c0409b);
            Object obj2 = p161p9.a.f21156r;
            if (objE == obj2) {
                return obj2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sVar = c0409b.f6160r;
            p110k9.a.e(obj);
        }
        if (((M9.r) sVar).f5883u.x()) {
            return p110k9.y.f19095a;
        }
        throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [q9.i, y9.e] */
    @Override // N9.C0412e, O9.e
    public final O9.e h(p150o9.h hVar, int i10, M9.a aVar) {
        return new C0410c(this.f6168w, hVar, i10, aVar);
    }
}
