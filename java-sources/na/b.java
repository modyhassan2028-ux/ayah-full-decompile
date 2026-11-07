package na;

import java.util.Iterator;
import java.util.Map;
import la.e;
import oa.n;
import oa.o;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f20037e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f20038f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(o oVar, String str) {
        super(str);
        this.f20038f = oVar;
    }

    @Override // na.a
    public final long a() {
        n nVar;
        switch (this.f20037e) {
            case 0:
                ((p241y9.a) this.f20038f).invoke();
                return -1L;
            default:
                o oVar = (o) this.f20038f;
                long jNanoTime = System.nanoTime();
                Map map = oVar.f20455c;
                Iterator it = map.values().iterator();
                if (it.hasNext()) {
                    throw p245z2.a.z(it);
                }
                Iterator it2 = oVar.f20458f.iterator();
                j.d(it2, "iterator(...)");
                while (it2.hasNext()) {
                    if (map.get(((n) it2.next()).f20438d.f19285a) != null) {
                        throw new ClassCastException();
                    }
                }
                long j = (jNanoTime - oVar.f20454b) + 1;
                Iterator it3 = oVar.f20458f.iterator();
                j.d(it3, "iterator(...)");
                int i10 = 0;
                long j10 = Long.MAX_VALUE;
                n nVar2 = null;
                n nVar3 = null;
                int i11 = 0;
                while (it3.hasNext()) {
                    n nVar4 = (n) it3.next();
                    j.b(nVar4);
                    synchronized (nVar4) {
                        if (oVar.a(nVar4, jNanoTime) > 0) {
                            i11++;
                        } else {
                            int i12 = i11;
                            long j11 = nVar4.f20452t;
                            if (j11 < j) {
                                j = j11;
                                nVar2 = nVar4;
                            }
                            if (map.get(nVar4.f20438d.f19285a) != null) {
                                throw new ClassCastException();
                            }
                            i10++;
                            if (j11 < j10) {
                                j10 = j11;
                                nVar3 = nVar4;
                            }
                            i11 = i12;
                        }
                    }
                    jNanoTime = jNanoTime;
                }
                long j12 = jNanoTime;
                int i13 = i11;
                if (nVar2 != null) {
                    nVar = nVar2;
                } else if (i10 > 5) {
                    j = j10;
                    nVar = nVar3;
                } else {
                    j = -1;
                    nVar = null;
                }
                if (nVar == null) {
                    if (nVar3 != null) {
                        return (j10 + oVar.f20454b) - j12;
                    }
                    if (i13 > 0) {
                        return oVar.f20454b;
                    }
                    return -1L;
                }
                synchronized (nVar) {
                    if (nVar.f20451s.isEmpty() && nVar.f20452t == j) {
                        nVar.f20445m = true;
                        oVar.f20458f.remove(nVar);
                        if (map.get(nVar.f20438d.f19285a) != null) {
                            throw new ClassCastException();
                        }
                        e.b(nVar.f20440f);
                        if (oVar.f20458f.isEmpty()) {
                            oVar.f20456d.a();
                        }
                    }
                }
                return 0L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, p241y9.a aVar) {
        super(str);
        this.f20038f = aVar;
    }
}
