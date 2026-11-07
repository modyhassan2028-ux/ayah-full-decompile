package ka;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final List f19154e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final List f19155f;
    public static final i g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final i f19156h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f19157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f19158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f19159c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String[] f19160d;

    static {
        f fVar = f.f19138r;
        f fVar2 = f.f19139s;
        f fVar3 = f.f19140t;
        f fVar4 = f.f19132l;
        f fVar5 = f.f19134n;
        f fVar6 = f.f19133m;
        f fVar7 = f.f19135o;
        f fVar8 = f.f19137q;
        f fVar9 = f.f19136p;
        List listS = p120l9.l.S(new f[]{fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9});
        f19154e = listS;
        List listS2 = p120l9.l.S(new f[]{fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, f.j, f.f19131k, f.f19129h, f.f19130i, f.f19128f, f.g, f.f19127e});
        f19155f = listS2;
        h hVar = new h();
        f[] fVarArr = (f[]) listS.toArray(new f[0]);
        hVar.c((f[]) Arrays.copyOf(fVarArr, fVarArr.length));
        y yVar = y.f19289t;
        y yVar2 = y.f19290u;
        hVar.e(yVar, yVar2);
        hVar.f19151b = true;
        hVar.a();
        h hVar2 = new h();
        f[] fVarArr2 = (f[]) listS2.toArray(new f[0]);
        hVar2.c((f[]) Arrays.copyOf(fVarArr2, fVarArr2.length));
        hVar2.e(yVar, yVar2);
        hVar2.f19151b = true;
        g = hVar2.a();
        h hVar3 = new h();
        f[] fVarArr3 = (f[]) listS2.toArray(new f[0]);
        hVar3.c((f[]) Arrays.copyOf(fVarArr3, fVarArr3.length));
        hVar3.e(yVar, yVar2, y.f19291v, y.f19292w);
        hVar3.f19151b = true;
        hVar3.a();
        f19156h = new i(false, false, null, null);
    }

    public i(boolean z10, boolean z11, String[] strArr, String[] strArr2) {
        this.f19157a = z10;
        this.f19158b = z11;
        this.f19159c = strArr;
        this.f19160d = strArr2;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.io.Serializable, java.lang.String[]] */
    public final void a(SSLSocket sSLSocket, boolean z10) {
        String[] enabledProtocols;
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        p251z9.j.b(enabledCipherSuites);
        String[] strArr = this.f19159c;
        if (strArr != null) {
            enabledCipherSuites = la.c.h(strArr, enabledCipherSuites, f.f19125c);
        }
        ?? r10 = this.f19160d;
        if (r10 != 0) {
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            p251z9.j.d(enabledProtocols2, "getEnabledProtocols(...)");
            enabledProtocols = la.c.h(enabledProtocols2, r10, p139n9.a.f20030b);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        p251z9.j.b(supportedCipherSuites);
        e eVar = f.f19125c;
        byte[] bArr = la.c.f19448a;
        int length = supportedCipherSuites.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            } else if (eVar.compare(supportedCipherSuites[i10], "TLS_FALLBACK_SCSV") == 0) {
                break;
            } else {
                i10++;
            }
        }
        if (z10 && i10 != -1) {
            String str = supportedCipherSuites[i10];
            p251z9.j.d(str, "get(...)");
            p251z9.j.e(enabledCipherSuites, "<this>");
            Object[] objArrCopyOf = Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            p251z9.j.d(objArrCopyOf, "copyOf(...)");
            enabledCipherSuites = (String[]) objArrCopyOf;
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        h hVar = new h();
        hVar.f19150a = this.f19157a;
        hVar.f19152c = strArr;
        hVar.f19153d = r10;
        hVar.f19151b = this.f19158b;
        hVar.b((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
        hVar.d((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length));
        i iVarA = hVar.a();
        if (iVarA.c() != null) {
            sSLSocket.setEnabledProtocols(iVarA.f19160d);
        }
        if (iVarA.b() != null) {
            sSLSocket.setEnabledCipherSuites(iVarA.f19159c);
        }
    }

    public final ArrayList b() {
        String[] strArr = this.f19159c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(f.f19124b.b(str));
        }
        return arrayList;
    }

    public final ArrayList c() {
        String[] strArr = this.f19160d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            y.f19288s.getClass();
            arrayList.add(b.c(str));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        i iVar = (i) obj;
        boolean z10 = iVar.f19157a;
        boolean z11 = this.f19157a;
        if (z11 != z10) {
            return false;
        }
        if (z11) {
            return Arrays.equals(this.f19159c, iVar.f19159c) && Arrays.equals(this.f19160d, iVar.f19160d) && this.f19158b == iVar.f19158b;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.f19157a) {
            return 17;
        }
        String[] strArr = this.f19159c;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f19160d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f19158b ? 1 : 0);
    }

    public final String toString() {
        if (!this.f19157a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(b(), "[all enabled]") + ", tlsVersions=" + Objects.toString(c(), "[all enabled]") + ", supportsTlsExtensions=" + this.f19158b + ')';
    }
}
