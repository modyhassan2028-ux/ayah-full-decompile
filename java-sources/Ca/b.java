package Ca;

import java.net.ProtocolException;
import java.util.ArrayList;
import p110k9.y;

/* JADX INFO: loaded from: classes.dex */
public final class b implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f789b;

    public /* synthetic */ b(int i10, Object obj) {
        this.f788a = i10;
        this.f789b = obj;
    }

    @Override // Ca.n
    public final void a(r rVar, Object obj) {
        switch (this.f788a) {
            case 0:
                p251z9.j.e(rVar, "writer");
                for (p110k9.j jVar : (p110k9.j[]) this.f789b) {
                    F9.c cVar = (F9.c) jVar.f19077r;
                    n nVar = (n) jVar.f19078s;
                    p251z9.e eVar = (p251z9.e) cVar;
                    if (eVar.d(obj) || (obj == null && eVar.equals(p251z9.w.a(y.class)))) {
                        p251z9.j.c(nVar, "null cannot be cast to non-null type okhttp3.tls.internal.der.DerAdapter<kotlin.Any?>");
                        nVar.a(rVar, obj);
                    }
                    break;
                }
                break;
            case 1:
                p110k9.j jVar2 = (p110k9.j) obj;
                p251z9.j.e(rVar, "writer");
                p251z9.j.e(jVar2, "value");
                n nVar2 = (n) jVar2.f19077r;
                Object obj2 = jVar2.f19078s;
                p251z9.j.c(nVar2, "null cannot be cast to non-null type okhttp3.tls.internal.der.DerAdapter<kotlin.Any?>");
                nVar2.a(rVar, obj2);
                break;
            default:
                p251z9.j.e(rVar, "writer");
                n nVar3 = (n) ((p241y9.c) this.f789b).e(p120l9.m.n0((ArrayList) rVar.f850d));
                if (nVar3 != null) {
                    nVar3.a(rVar, obj);
                } else {
                    p251z9.j.c(obj, "null cannot be cast to non-null type okio.ByteString");
                    rVar.d().v((Da.k) obj);
                }
                break;
        }
    }

    @Override // Ca.n
    public final /* synthetic */ j b(long j, String str) {
        int i10 = this.f788a;
        return p245z2.a.a(this, str, j);
    }

    @Override // Ca.n
    public final boolean c(o oVar) {
        switch (this.f788a) {
        }
        return true;
    }

    @Override // Ca.n
    public final Object d(q qVar) throws ProtocolException {
        n nVar;
        switch (this.f788a) {
            case 0:
                p251z9.j.e(qVar, "reader");
                o oVarC = qVar.c();
                if (oVarC == null) {
                    throw new ProtocolException("expected a value at " + qVar);
                }
                for (p110k9.j jVar : (p110k9.j[]) this.f789b) {
                    n nVar2 = (n) jVar.f19078s;
                    if (nVar2.c(oVarC)) {
                        return nVar2.d(qVar);
                    }
                }
                throw new ProtocolException("expected any but was " + oVarC + " at " + qVar);
            case 1:
                p251z9.j.e(qVar, "reader");
                o oVarC2 = qVar.c();
                if (oVarC2 == null) {
                    throw new ProtocolException("expected a value at " + qVar);
                }
                n[] nVarArr = (n[]) this.f789b;
                int length = nVarArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        nVar = nVarArr[i10];
                        if (!nVar.c(oVarC2)) {
                            i10++;
                        }
                    } else {
                        nVar = null;
                    }
                }
                if (nVar != null) {
                    return new p110k9.j(nVar, nVar.d(qVar));
                }
                throw new ProtocolException("expected a matching choice but was " + oVarC2 + " at " + qVar);
            default:
                p251z9.j.e(qVar, "reader");
                n nVar3 = (n) ((p241y9.c) this.f789b).e(p120l9.m.n0(qVar.f844d));
                return nVar3 != null ? nVar3.d(qVar) : qVar.f842b.k(qVar.b());
        }
    }

    public String toString() {
        switch (this.f788a) {
            case 1:
                return p120l9.l.n0(" OR ", (n[]) this.f789b);
            default:
                return super.toString();
        }
    }
}
