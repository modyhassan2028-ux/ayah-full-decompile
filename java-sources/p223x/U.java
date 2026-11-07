package p223x;

import K9.AbstractC0405x;
import p110k9.a;
import p110k9.y;
import p241y9.c;
import q9.i;

/* JADX INFO: loaded from: classes.dex */
public final class U extends i implements c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f23889r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f23890s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f23891t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ X f23892u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ q0 f23893v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ float f23894w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(Object obj, Object obj2, X x9, q0 q0Var, float f3, p150o9.c cVar) {
        super(1, cVar);
        this.f23890s = obj;
        this.f23891t = obj2;
        this.f23892u = x9;
        this.f23893v = q0Var;
        this.f23894w = f3;
    }

    @Override // q9.a
    public final p150o9.c create(p150o9.c cVar) {
        return new U(this.f23890s, this.f23891t, this.f23892u, this.f23893v, this.f23894w, cVar);
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        return ((U) create((p150o9.c) obj)).invokeSuspend(y.f19095a);
    }

    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f23889r;
        if (i10 == 0) {
            a.e(obj);
            T t2 = new T(this.f23890s, this.f23891t, this.f23892u, this.f23893v, this.f23894w, null);
            this.f23889r = 1;
            Object objJ = AbstractC0405x.j(t2, this);
            p161p9.a aVar = p161p9.a.f21156r;
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.e(obj);
        }
        return y.f19095a;
    }
}
