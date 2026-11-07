package p223x;

import p110k9.a;
import p110k9.y;
import p150o9.c;
import p241y9.e;
import q9.i;

/* JADX INFO: loaded from: classes.dex */
public final class E extends i implements e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ float f23846r;

    @Override // q9.a
    public final c create(Object obj, c cVar) {
        E e10 = new E(2, cVar);
        e10.f23846r = ((Number) obj).floatValue();
        return e10;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        return ((E) create(Float.valueOf(((Number) obj).floatValue()), (c) obj2)).invokeSuspend(y.f19095a);
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        a.e(obj);
        return Boolean.valueOf(this.f23846r > 0.0f);
    }
}
