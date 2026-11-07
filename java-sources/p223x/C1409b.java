package p223x;

import p110k9.a;
import p110k9.y;
import p241y9.c;
import q9.i;

/* JADX INFO: renamed from: x.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1409b extends i implements c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C1411c f23937r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f23938s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1409b(C1411c c1411c, Object obj, p150o9.c cVar) {
        super(1, cVar);
        this.f23937r = c1411c;
        this.f23938s = obj;
    }

    @Override // q9.a
    public final p150o9.c create(p150o9.c cVar) {
        return new C1409b(this.f23937r, this.f23938s, cVar);
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        C1409b c1409b = (C1409b) create((p150o9.c) obj);
        y yVar = y.f19095a;
        c1409b.invokeSuspend(yVar);
        return yVar;
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        a.e(obj);
        C1411c c1411c = this.f23937r;
        C1411c.b(c1411c);
        Object objA = C1411c.a(c1411c, this.f23938s);
        c1411c.f23943c.f24028s.setValue(objA);
        c1411c.f23945e.setValue(objA);
        return y.f19095a;
    }
}
