package Ga;

/* JADX INFO: loaded from: classes.dex */
public final class E extends q9.i implements p241y9.c {
    @Override // q9.a
    public final p150o9.c create(p150o9.c cVar) {
        return new E(1, cVar);
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        E e10 = (E) create((p150o9.c) obj);
        p110k9.y yVar = p110k9.y.f19095a;
        e10.invokeSuspend(yVar);
        return yVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        p110k9.a.e(obj);
        return p110k9.y.f19095a;
    }
}
