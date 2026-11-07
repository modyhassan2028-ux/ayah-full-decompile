package T1;

import K9.AbstractC0405x;
import java.io.Serializable;

/* JADX INFO: renamed from: T1.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0507y extends q9.i implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f7764r = 1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f7765s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ B f7766t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Object f7767u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f7768v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Serializable f7769w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0507y(B b5, p150o9.h hVar, p241y9.e eVar, p150o9.c cVar) {
        super(1, cVar);
        this.f7766t = b5;
        this.f7768v = hVar;
        this.f7769w = (q9.i) eVar;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [q9.i, y9.e] */
    @Override // q9.a
    public final p150o9.c create(p150o9.c cVar) {
        switch (this.f7764r) {
            case 0:
                return new C0507y((p251z9.v) this.f7768v, this.f7766t, (p251z9.t) this.f7769w, cVar);
            default:
                return new C0507y(this.f7766t, (p150o9.h) this.f7768v, (p241y9.e) this.f7769w, cVar);
        }
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        p150o9.c cVar = (p150o9.c) obj;
        switch (this.f7764r) {
            case 0:
                break;
        }
        return ((C0507y) create(cVar)).invokeSuspend(p110k9.y.f19095a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0061  */
    /* JADX WARN: Code duplicated, block: B:26:0x0066  */
    /* JADX WARN: Code duplicated, block: B:28:0x006e  */
    /* JADX WARN: Code duplicated, block: B:33:0x007b  */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v3, types: [q9.i, y9.e] */
    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        p251z9.v vVar;
        p251z9.t tVar;
        C0487d c0487d;
        Object obj2;
        int iHashCode;
        switch (this.f7764r) {
            case 0:
                p251z9.t tVar2 = (p251z9.t) this.f7769w;
                p251z9.v vVar2 = (p251z9.v) this.f7768v;
                int i10 = this.f7765s;
                B b5 = this.f7766t;
                p161p9.a aVar = p161p9.a.f21156r;
                try {
                    if (i10 != 0) {
                        if (i10 == 1) {
                            vVar = (p251z9.v) ((Serializable) this.f7767u);
                            p110k9.a.e(obj);
                        } else {
                            if (i10 != 2) {
                                if (i10 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                tVar2 = (p251z9.t) ((Serializable) this.f7767u);
                                p110k9.a.e(obj);
                                tVar2.f24884r = ((Number) obj).intValue();
                                return p110k9.y.f19095a;
                            }
                            tVar = (p251z9.t) ((Serializable) this.f7767u);
                            p110k9.a.e(obj);
                        }
                        tVar.f24884r = ((Number) obj).intValue();
                        return p110k9.y.f19095a;
                    }
                    p110k9.a.e(obj);
                    this.f7767u = vVar2;
                    this.f7765s = 1;
                    obj = b5.j(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    vVar = vVar2;
                    vVar.f24886r = obj;
                    M mH = b5.h();
                    this.f7767u = tVar2;
                    this.f7765s = 2;
                    obj = mH.e(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    tVar = tVar2;
                    tVar.f24884r = ((Number) obj).intValue();
                    return p110k9.y.f19095a;
                } catch (C0485b unused) {
                    Object obj3 = vVar2.f24886r;
                    this.f7767u = tVar2;
                    this.f7765s = 3;
                    obj = b5.k(obj3, true, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
            default:
                int i11 = this.f7765s;
                B b10 = this.f7766t;
                p161p9.a aVar2 = p161p9.a.f21156r;
                if (i11 != 0) {
                    if (i11 == 1) {
                        p110k9.a.e(obj);
                    } else {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Object obj4 = this.f7767u;
                            p110k9.a.e(obj);
                            return obj4;
                        }
                        c0487d = (C0487d) this.f7767u;
                        p110k9.a.e(obj);
                    }
                    obj2 = c0487d.f7667b;
                    if (obj2 != null) {
                        iHashCode = obj2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    if (iHashCode == c0487d.f7668c) {
                        throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                    }
                    if (!p251z9.j.a(c0487d.f7667b, obj)) {
                        this.f7767u = obj;
                        this.f7765s = 3;
                        if (b10.k(obj, true, this) == aVar2) {
                            return aVar2;
                        }
                    }
                    return obj;
                }
                p110k9.a.e(obj);
                this.f7765s = 1;
                obj = B.g(b10, true, this);
                if (obj == aVar2) {
                    return aVar2;
                }
                c0487d = (C0487d) obj;
                p150o9.h hVar = (p150o9.h) this.f7768v;
                O9.y yVar = new O9.y((p241y9.e) this.f7769w, c0487d, (p150o9.c) null);
                this.f7767u = c0487d;
                this.f7765s = 2;
                obj = AbstractC0405x.I(hVar, yVar, this);
                if (obj == aVar2) {
                    return aVar2;
                }
                obj2 = c0487d.f7667b;
                if (obj2 != null) {
                    iHashCode = obj2.hashCode();
                } else {
                    iHashCode = 0;
                }
                if (iHashCode == c0487d.f7668c) {
                    throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                }
                if (!p251z9.j.a(c0487d.f7667b, obj)) {
                    this.f7767u = obj;
                    this.f7765s = 3;
                    if (b10.k(obj, true, this) == aVar2) {
                        return aVar2;
                    }
                }
                return obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0507y(p251z9.v vVar, B b5, p251z9.t tVar, p150o9.c cVar) {
        super(1, cVar);
        this.f7768v = vVar;
        this.f7766t = b5;
        this.f7769w = tVar;
    }
}
