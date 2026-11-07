package D0;

import K9.AbstractC0405x;
import K9.C0389g;
import K9.InterfaceC0402u;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import p223x.AbstractC1413d;
import p223x.C1408a0;
import p223x.C1411c;

/* JADX INFO: loaded from: classes.dex */
public final class L extends q9.i implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f1061r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f1062s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f1063t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f1064u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(long j, N n6, p150o9.c cVar) {
        super(2, cVar);
        this.f1061r = 0;
        this.f1063t = j;
        this.f1064u = n6;
    }

    @Override // q9.a
    public final p150o9.c create(Object obj, p150o9.c cVar) {
        switch (this.f1061r) {
            case 0:
                return new L(this.f1063t, (N) this.f1064u, cVar);
            case 1:
                return new L((Ga.A) this.f1064u, this.f1063t, cVar, 1);
            case 2:
                return new L((C1411c) this.f1064u, this.f1063t, cVar, 2);
            default:
                return new L((AndroidViewHolder) this.f1064u, this.f1063t, cVar, 3);
        }
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0402u interfaceC0402u = (InterfaceC0402u) obj;
        p150o9.c cVar = (p150o9.c) obj2;
        switch (this.f1061r) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((L) create(interfaceC0402u, cVar)).invokeSuspend(p110k9.y.f19095a);
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0120  */
    @Override // q9.a
    public final Object invokeSuspend(Object obj) {
        C0389g c0389g;
        switch (this.f1061r) {
            case 0:
                int i10 = this.f1062s;
                long j = this.f1063t;
                p161p9.a aVar = p161p9.a.f21156r;
                if (i10 != 0) {
                    if (i10 == 1) {
                        p110k9.a.e(obj);
                    } else {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p110k9.a.e(obj);
                    }
                    c0389g = ((N) this.f1064u).f1070t;
                    if (c0389g != null) {
                        c0389g.resumeWith(p110k9.a.b(new p(j)));
                    }
                    return p110k9.y.f19095a;
                }
                p110k9.a.e(obj);
                this.f1062s = 1;
                if (AbstractC0405x.k(j - 8, this) == aVar) {
                    return aVar;
                }
                this.f1062s = 2;
                if (AbstractC0405x.k(8L, this) == aVar) {
                    return aVar;
                }
                c0389g = ((N) this.f1064u).f1070t;
                if (c0389g != null) {
                    c0389g.resumeWith(p110k9.a.b(new p(j)));
                }
                return p110k9.y.f19095a;
            case 1:
                Ga.A a9 = (Ga.A) this.f1064u;
                int i11 = this.f1062s;
                p161p9.a aVar2 = p161p9.a.f21156r;
                if (i11 != 0) {
                    if (i11 == 1) {
                        p110k9.a.e(obj);
                    } else {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        p110k9.a.e(obj);
                    }
                    a9.f2968r.setValue(null);
                    return p110k9.y.f19095a;
                }
                p110k9.a.e(obj);
                C1411c c1411c = a9.f2969s;
                p171r0.c cVar = new p171r0.c(this.f1063t);
                this.f1062s = 1;
                if (c1411c.e(cVar, this) == aVar2) {
                    return aVar2;
                }
                C1411c c1411c2 = a9.f2969s;
                p171r0.c cVar2 = new p171r0.c(0L);
                C1408a0 c1408a0P = AbstractC1413d.p(400.0f, 1, new p171r0.c((((long) Float.floatToRawIntBits(0.5f)) << 32) | (((long) Float.floatToRawIntBits(0.5f)) & 4294967295L)));
                this.f1062s = 2;
                if (C1411c.c(c1411c2, cVar2, c1408a0P, null, this, 12) == aVar2) {
                    return aVar2;
                }
                a9.f2968r.setValue(null);
                return p110k9.y.f19095a;
            case 2:
                int i12 = this.f1062s;
                if (i12 == 0) {
                    p110k9.a.e(obj);
                    C1411c c1411c3 = (C1411c) this.f1064u;
                    p171r0.c cVar3 = new p171r0.c(this.f1063t);
                    C1408a0 c1408a0 = O.B.f6276d;
                    this.f1062s = 1;
                    Object objC = C1411c.c(c1411c3, cVar3, c1408a0, null, this, 12);
                    p161p9.a aVar3 = p161p9.a.f21156r;
                    if (objC == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                }
                return p110k9.y.f19095a;
            default:
                int i13 = this.f1062s;
                if (i13 == 0) {
                    p110k9.a.e(obj);
                    C0.d dVar = ((AndroidViewHolder) this.f1064u).f12113r;
                    this.f1062s = 1;
                    Object objB = dVar.b(this.f1063t, this);
                    p161p9.a aVar4 = p161p9.a.f21156r;
                    if (objB == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p110k9.a.e(obj);
                }
                return p110k9.y.f19095a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ L(Object obj, long j, p150o9.c cVar, int i10) {
        super(2, cVar);
        this.f1061r = i10;
        this.f1064u = obj;
        this.f1063t = j;
    }
}
