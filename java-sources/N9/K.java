package N9;

/* JADX INFO: loaded from: classes.dex */
public final class K extends q9.i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ int f6107r;

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        K k7 = new K(2, cVar);
        k7.f6107r = ((Number) obj).intValue();
        return k7;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((K) create(Integer.valueOf(((Number) obj).intValue()), (p150o9.c) obj2)).invokeSuspend(p110k9.y.f19095a);
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        p110k9.a.e(obj);
        return Boolean.valueOf(this.f6107r > 0);
    }
}
