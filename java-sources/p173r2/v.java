package p173r2;

import B9.a;
import E2.C0112b;
import H9.k;
import H9.m;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.session.p;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p074h0.i;
import p110k9.o;
import p120l9.w;
import p251z9.j;
import u.P;
import u.Q;

/* JADX INFO: loaded from: classes.dex */
public abstract class v {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f21491v = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f21492r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C0112b f21493s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public x f21494t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final P f21495u;

    static {
        new LinkedHashMap();
    }

    public v(G g) {
        j.e(g, "navigator");
        LinkedHashMap linkedHashMap = H.f21433b;
        this.f21492r = i.d(g.getClass());
        this.f21493s = new C0112b(this);
        this.f21495u = new P(0);
    }

    public final Bundle b(Bundle bundle) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f21493s.f1644d;
        if (bundle == null && linkedHashMap.isEmpty()) {
            return null;
        }
        Bundle bundleP = AbstractC0813f2.p((p110k9.j[]) Arrays.copyOf(new p110k9.j[0], 0));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            ((C1288h) entry.getValue()).getClass();
            j.e(str, "name");
        }
        if (bundle != null) {
            bundleP.putAll(bundle);
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str2 = (String) entry2.getKey();
                C1288h c1288h = (C1288h) entry2.getValue();
                c1288h.getClass();
                E e10 = c1288h.f21439a;
                j.e(str2, "name");
                if (!bundleP.containsKey(str2) || !a.K(str2, bundleP)) {
                    try {
                        e10.a(str2, bundleP);
                    } catch (IllegalStateException unused) {
                    }
                }
                StringBuilder sbD = p.D("Wrong argument type for '", str2, "' in argument savedState. ");
                sbD.append(e10.b());
                sbD.append(" expected.");
                throw new IllegalArgumentException(sbD.toString().toString());
            }
        }
        return bundleP;
    }

    public final Map c() {
        return w.k0((LinkedHashMap) this.f21493s.f1644d);
    }

    public u d(i iVar) {
        boolean zMatches;
        m mVar;
        k kVarC;
        C0112b c0112b = this.f21493s;
        LinkedHashMap linkedHashMap = (LinkedHashMap) c0112b.f1644d;
        Uri uri = (Uri) iVar.f16422s;
        ArrayList arrayList = (ArrayList) c0112b.f1642b;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        u uVar = null;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            t tVar = (t) obj;
            tVar.getClass();
            o oVar = tVar.f21479d;
            if (((m) oVar.getValue()) == null) {
                zMatches = true;
            } else if (uri == null) {
                zMatches = false;
            } else {
                m mVar2 = (m) oVar.getValue();
                j.b(mVar2);
                String string = uri.toString();
                j.e(string, "input");
                zMatches = mVar2.f3641r.matcher(string).matches();
            }
            if (zMatches) {
                Bundle bundleD = uri != null ? tVar.d(uri, linkedHashMap) : null;
                int iB = tVar.b(uri);
                String str = (String) iVar.f16423t;
                boolean z10 = str != null && str.equals(null);
                if (bundleD == null) {
                    if (z10) {
                        j.e(linkedHashMap, "arguments");
                        Bundle bundleP = AbstractC0813f2.p((p110k9.j[]) Arrays.copyOf(new p110k9.j[0], 0));
                        if (uri != null && (mVar = (m) oVar.getValue()) != null && (kVarC = mVar.c(uri.toString())) != null) {
                            tVar.e(kVarC, bundleP, linkedHashMap);
                            if (((Boolean) tVar.f21480e.getValue()).booleanValue()) {
                                tVar.f(uri, bundleP, linkedHashMap);
                            }
                        }
                        if (i.e(linkedHashMap, new r(1, bundleP)).isEmpty()) {
                        }
                    }
                }
                u uVar2 = new u((v) c0112b.f1643c, bundleD, tVar.f21485l, iB, z10);
                if (uVar == null || uVar2.compareTo(uVar) > 0) {
                    uVar = uVar2;
                }
            }
        }
        return uVar;
    }

    public boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        if (this != obj) {
            if (obj != null && (obj instanceof v)) {
                C0112b c0112b = this.f21493s;
                ArrayList arrayList = (ArrayList) c0112b.f1642b;
                v vVar = (v) obj;
                P p10 = vVar.f21495u;
                C0112b c0112b2 = vVar.f21493s;
                boolean zA = j.a(arrayList, (ArrayList) c0112b2.f1642b);
                P p11 = this.f21495u;
                if (p11.g() != p10.g()) {
                    z10 = false;
                    break;
                }
                Iterator it = ((G9.a) G9.k.a0(new Q(p11))).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z10 = true;
                        break;
                    }
                    int iIntValue = ((Number) it.next()).intValue();
                    if (!j.a(p11.d(iIntValue), p10.d(iIntValue))) {
                        z10 = false;
                        break;
                    }
                }
                if (c().size() != vVar.c().size()) {
                    z11 = false;
                    break;
                }
                Set setEntrySet = c().entrySet();
                j.e(setEntrySet, "<this>");
                Iterator it2 = setEntrySet.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z11 = true;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (!vVar.c().containsKey(entry.getKey()) || !j.a(vVar.c().get(entry.getKey()), entry.getValue())) {
                        z11 = false;
                        break;
                    }
                }
                if (c0112b.f1641a != c0112b2.f1641a || !j.a((String) c0112b.f1645e, (String) c0112b2.f1645e) || !zA || !z10 || !z11) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C0112b c0112b = this.f21493s;
        int i10 = c0112b.f1641a * 31;
        String str = (String) c0112b.f1645e;
        int iHashCode = i10 + (str != null ? str.hashCode() : 0);
        ArrayList arrayList = (ArrayList) c0112b.f1642b;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            iHashCode = (((t) obj).f21476a.hashCode() + (iHashCode * 31)) * 961;
        }
        P p10 = this.f21495u;
        j.e(p10, "<this>");
        if (p10.g() > 0) {
            p10.h(0).getClass();
            throw new ClassCastException();
        }
        for (String str2 : c().keySet()) {
            int iX = p245z2.a.x(str2, iHashCode * 31, 31);
            Object obj2 = c().get(str2);
            iHashCode = iX + (obj2 != null ? obj2.hashCode() : 0);
        }
        return iHashCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(0x");
        C0112b c0112b = this.f21493s;
        c0112b.getClass();
        sb.append(Integer.toHexString(c0112b.f1641a));
        sb.append(")");
        String str = (String) c0112b.f1645e;
        if (str != null && !H9.o.e1(str)) {
            sb.append(" route=");
            sb.append((String) c0112b.f1645e);
        }
        String string = sb.toString();
        j.d(string, "toString(...)");
        return string;
    }
}
