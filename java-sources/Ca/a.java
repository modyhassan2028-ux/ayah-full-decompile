package Ca;

import java.net.ProtocolException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class a implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f787a;

    public /* synthetic */ a(int i10) {
        this.f787a = i10;
    }

    @Override // Ca.n
    public final void a(r rVar, Object obj) {
        switch (this.f787a) {
            case 0:
                e eVar = (e) obj;
                p251z9.j.e(rVar, "writer");
                p251z9.j.e(eVar, "value");
                rVar.g("ANY", eVar.f804a, eVar.f805b, new A3.e(4, rVar, eVar));
                break;
            default:
                long jLongValue = ((Number) obj).longValue();
                p251z9.j.e(rVar, "writer");
                if (-631152000000L <= jLongValue && jLongValue < 2524608000000L) {
                    c.f798k.a(rVar, Long.valueOf(jLongValue));
                } else {
                    c.f799l.a(rVar, Long.valueOf(jLongValue));
                }
                break;
        }
    }

    @Override // Ca.n
    public final /* synthetic */ j b(long j, String str) {
        int i10 = this.f787a;
        return p245z2.a.a(this, str, j);
    }

    @Override // Ca.n
    public final boolean c(o oVar) {
        switch (this.f787a) {
            case 0:
                return true;
            default:
                return c.f798k.c(oVar) || c.f799l.c(oVar);
        }
    }

    @Override // Ca.n
    public final Object d(q qVar) throws ProtocolException {
        long jLongValue;
        switch (this.f787a) {
            case 0:
                p251z9.j.e(qVar, "reader");
                ArrayList arrayList = qVar.f845e;
                if (qVar.c() == null) {
                    throw new ProtocolException("expected a value");
                }
                o oVar = qVar.g;
                p251z9.j.b(oVar);
                long j = oVar.f838d;
                qVar.g = null;
                long j10 = qVar.f843c;
                boolean z10 = qVar.f846f;
                long jA = j != -1 ? qVar.a() + j : -1L;
                if (j10 != -1 && jA > j10) {
                    throw new ProtocolException("enclosed object too large");
                }
                qVar.f843c = jA;
                qVar.f846f = oVar.f837c;
                arrayList.add("ANY");
                try {
                    return new e(oVar.f835a, oVar.f836b, oVar.f837c, oVar.f838d, qVar.f842b.k(qVar.b()));
                } finally {
                    qVar.g = null;
                    qVar.f843c = j10;
                    qVar.f846f = z10;
                    arrayList.remove(arrayList.size() - 1);
                }
            default:
                p251z9.j.e(qVar, "reader");
                o oVarC = qVar.c();
                if (oVarC == null) {
                    throw new ProtocolException("expected time but was exhausted at " + qVar);
                }
                long j11 = oVarC.f836b;
                int i10 = oVarC.f835a;
                j jVar = c.f798k;
                if (i10 == jVar.f818b && j11 == jVar.f819c) {
                    jLongValue = ((Number) jVar.d(qVar)).longValue();
                } else {
                    j jVar2 = c.f799l;
                    if (i10 != jVar2.f818b || j11 != jVar2.f819c) {
                        throw new ProtocolException("expected time but was " + oVarC + " at " + qVar);
                    }
                    jLongValue = ((Number) jVar2.d(qVar)).longValue();
                }
                return Long.valueOf(jLongValue);
        }
    }
}
