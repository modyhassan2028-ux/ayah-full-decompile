package p173r2;

import E2.C0112b;
import E2.C0124h;
import H9.o;
import java.util.ArrayList;
import p251z9.j;
import u.P;

/* JADX INFO: loaded from: classes.dex */
public final class y extends w {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final H f21503f;
    public final String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f21504h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(H h7) {
        super(h7.b(i.d(z.class)), null);
        j.e(h7, "provider");
        this.f21504h = new ArrayList();
        this.f21503f = h7;
        this.g = "khatmah/new";
    }

    public final x c() {
        x xVar = (x) super.a();
        ArrayList arrayList = this.f21504h;
        j.e(arrayList, "nodes");
        C0124h c0124h = xVar.f21502w;
        c0124h.getClass();
        int size = arrayList.size();
        int iHashCode = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            v vVar = (v) obj;
            if (vVar != null) {
                P p10 = (P) c0124h.f1675d;
                x xVar2 = (x) c0124h.f1674c;
                C0112b c0112b = xVar2.f21493s;
                C0112b c0112b2 = vVar.f21493s;
                int i11 = c0112b2.f1641a;
                String str = (String) c0112b2.f1645e;
                if (i11 == 0 && str == null) {
                    throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
                }
                String str2 = (String) c0112b.f1645e;
                if (str2 != null && j.a(str, str2)) {
                    throw new IllegalArgumentException(("Destination " + vVar + " cannot have the same route as graph " + xVar2).toString());
                }
                if (i11 == c0112b.f1641a) {
                    throw new IllegalArgumentException(("Destination " + vVar + " cannot have the same id as graph " + xVar2).toString());
                }
                v vVar2 = (v) p10.d(i11);
                if (vVar2 == vVar) {
                    continue;
                } else {
                    if (vVar.f21494t != null) {
                        throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
                    }
                    if (vVar2 != null) {
                        vVar2.f21494t = null;
                    }
                    vVar.f21494t = xVar2;
                    p10.f(c0112b2.f1641a, vVar);
                }
            }
        }
        String str3 = this.g;
        if (str3 == null) {
            if (this.f21497b != null) {
                throw new IllegalStateException("You must set a start destination route");
            }
            throw new IllegalStateException("You must set a start destination id");
        }
        x xVar3 = (x) c0124h.f1674c;
        if (str3 != null) {
            if (str3.equals((String) xVar3.f21493s.f1645e)) {
                throw new IllegalArgumentException(("Start destination " + str3 + " cannot use the same route as the graph " + xVar3).toString());
            }
            if (o.e1(str3)) {
                throw new IllegalArgumentException("Cannot have an empty start destination route");
            }
            int i12 = v.f21491v;
            iHashCode = "android-app://androidx.navigation/".concat(str3).hashCode();
        }
        c0124h.f1673b = iHashCode;
        c0124h.f1677f = str3;
        return xVar;
    }
}
