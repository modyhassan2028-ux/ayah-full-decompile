package Ca;

import java.io.Serializable;
import java.net.ProtocolException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class j implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f820d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f821e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f822f;
    public final boolean g;

    public j(String str, int i10, long j, i iVar, boolean z10, Object obj, boolean z11) {
        this.f817a = str;
        this.f818b = i10;
        this.f819c = j;
        this.f820d = iVar;
        this.f821e = z10;
        this.f822f = obj;
        this.g = z11;
        if (i10 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (j < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public static j e(j jVar, long j, Object obj, int i10) {
        String str = jVar.f817a;
        int i11 = (i10 & 2) != 0 ? jVar.f818b : 128;
        if ((i10 & 4) != 0) {
            j = jVar.f819c;
        }
        long j10 = j;
        i iVar = jVar.f820d;
        boolean z10 = (i10 & 16) != 0 ? jVar.f821e : true;
        if ((i10 & 32) != 0) {
            obj = jVar.f822f;
        }
        Object obj2 = obj;
        boolean z11 = (i10 & 64) != 0 ? jVar.g : true;
        jVar.getClass();
        p251z9.j.e(str, "name");
        p251z9.j.e(iVar, "codec");
        return new j(str, i11, j10, iVar, z10, obj2, z11);
    }

    public static j h(j jVar, long j) {
        jVar.getClass();
        return e(jVar, j, null, 121);
    }

    @Override // Ca.n
    public final void a(r rVar, Object obj) {
        p251z9.j.e(rVar, "writer");
        if (this.g) {
            ArrayList arrayList = (ArrayList) rVar.f850d;
            arrayList.set(arrayList.size() - 1, obj);
        }
        if (this.f821e && p251z9.j.a(obj, this.f822f)) {
            return;
        }
        rVar.g(this.f817a, this.f818b, this.f819c, new h(this, rVar, obj, 0));
    }

    @Override // Ca.n
    public final /* synthetic */ j b(long j, String str) {
        return p245z2.a.a(this, str, j);
    }

    @Override // Ca.n
    public final boolean c(o oVar) {
        return oVar.f835a == this.f818b && oVar.f836b == this.f819c;
    }

    @Override // Ca.n
    public final Object d(q qVar) throws ProtocolException {
        p251z9.j.e(qVar, "reader");
        ArrayList arrayList = qVar.f845e;
        o oVarC = qVar.c();
        if (oVarC == null || oVarC.f835a != this.f818b || oVarC.f836b != this.f819c) {
            if (this.f821e) {
                return this.f822f;
            }
            throw new ProtocolException("expected " + this + " but was " + oVarC + " at " + qVar);
        }
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
        String str = this.f817a;
        if (str != null) {
            arrayList.add(str);
        }
        try {
            Object objD = this.f820d.d(qVar);
            if (jA != -1 && qVar.a() > jA) {
                throw new ProtocolException("unexpected byte count at " + qVar);
            }
            qVar.g = null;
            qVar.f843c = j10;
            qVar.f846f = z10;
            if (str != null) {
                arrayList.remove(arrayList.size() - 1);
            }
            if (this.g) {
                ArrayList arrayList2 = qVar.f844d;
                arrayList2.set(arrayList2.size() - 1, objD);
            }
            return objD;
        } catch (Throwable th) {
            qVar.g = null;
            qVar.f843c = j10;
            qVar.f846f = z10;
            if (str != null) {
                arrayList.remove(arrayList.size() - 1);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return p251z9.j.a(this.f817a, jVar.f817a) && this.f818b == jVar.f818b && this.f819c == jVar.f819c && p251z9.j.a(this.f820d, jVar.f820d) && this.f821e == jVar.f821e && p251z9.j.a(this.f822f, jVar.f822f) && this.g == jVar.g;
    }

    public final j f(Serializable serializable) {
        return e(this, 0L, serializable, 79);
    }

    public final /* synthetic */ j g(long j) {
        return p245z2.a.p(this, 128, j, null);
    }

    public final int hashCode() {
        int iHashCode = (((this.f820d.hashCode() + (((((this.f817a.hashCode() * 31) + this.f818b) * 31) + ((int) this.f819c)) * 31)) * 31) + (this.f821e ? 1 : 0)) * 31;
        Object obj = this.f822f;
        return ((iHashCode + (obj != null ? obj.hashCode() : 0)) * 31) + (this.g ? 1 : 0);
    }

    public final String toString() {
        return this.f817a + " [" + this.f818b + '/' + this.f819c + ']';
    }
}
