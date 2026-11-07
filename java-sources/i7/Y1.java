package i7;

import com.google.android.gms.internal.measurement.C0787a1;
import com.google.android.gms.internal.measurement.C0792b1;
import com.google.android.gms.internal.measurement.C0852n1;
import com.google.android.gms.internal.measurement.C0857o1;
import com.google.android.gms.internal.measurement.C0862p1;
import com.google.android.gms.internal.measurement.C0866q0;
import com.google.android.gms.internal.measurement.C0867q1;
import com.google.android.gms.internal.measurement.C0898w3;
import com.google.android.gms.internal.measurement.C0900x0;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import u.C1347b;
import u.C1350e;

/* JADX INFO: loaded from: classes.dex */
public final class Y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f17240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0857o1 f17241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final BitSet f17242d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BitSet f17243e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C1350e f17244f;
    public final C1350e g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0969c f17245h;

    public Y1(C0969c c0969c, String str, C0857o1 c0857o1, BitSet bitSet, BitSet bitSet2, C1350e c1350e, C1350e c1350e2) {
        this.f17245h = c0969c;
        this.f17239a = str;
        this.f17242d = bitSet;
        this.f17243e = bitSet2;
        this.f17244f = c1350e;
        this.g = new C1350e(0);
        for (Integer num : (C1347b) c1350e2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) c1350e2.get(num));
            this.g.put(num, arrayList);
        }
        this.f17240b = false;
        this.f17241c = c0857o1;
    }

    public final void a(C0966b c0966b) {
        int iQ;
        boolean z10;
        boolean zV;
        switch (c0966b.g) {
            case 0:
                iQ = ((C0866q0) c0966b.f17264i).q();
                break;
            default:
                iQ = ((C0900x0) c0966b.f17264i).q();
                break;
        }
        if (c0966b.f17259c != null) {
            this.f17243e.set(iQ, true);
        }
        Boolean bool = c0966b.f17260d;
        if (bool != null) {
            this.f17242d.set(iQ, bool.booleanValue());
        }
        if (c0966b.f17261e != null) {
            Integer numValueOf = Integer.valueOf(iQ);
            C1350e c1350e = this.f17244f;
            Long l10 = (Long) c1350e.get(numValueOf);
            long jLongValue = c0966b.f17261e.longValue() / 1000;
            if (l10 == null || jLongValue > l10.longValue()) {
                c1350e.put(numValueOf, Long.valueOf(jLongValue));
            }
        }
        if (c0966b.f17262f != null) {
            Integer numValueOf2 = Integer.valueOf(iQ);
            C1350e c1350e2 = this.g;
            List arrayList = (List) c1350e2.get(numValueOf2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                c1350e2.put(numValueOf2, arrayList);
            }
            switch (c0966b.g) {
                case 0:
                    z10 = false;
                    break;
                default:
                    z10 = true;
                    break;
            }
            if (z10) {
                arrayList.clear();
            }
            C0898w3.a();
            C1023u0 c1023u0 = (C1023u0) this.f17245h.f16104r;
            C0981g c0981g = c1023u0.f17582u;
            F f3 = G.f16895G0;
            String str = this.f17239a;
            if (c0981g.y(str, f3)) {
                switch (c0966b.g) {
                    case 0:
                        zV = ((C0866q0) c0966b.f17264i).v();
                        break;
                    default:
                        zV = false;
                        break;
                }
                if (zV) {
                    arrayList.clear();
                }
            }
            C0898w3.a();
            if (!c1023u0.f17582u.y(str, f3)) {
                arrayList.add(Long.valueOf(c0966b.f17262f.longValue() / 1000));
                return;
            }
            Long lValueOf = Long.valueOf(c0966b.f17262f.longValue() / 1000);
            if (arrayList.contains(lValueOf)) {
                return;
            }
            arrayList.add(lValueOf);
        }
    }

    public final com.google.android.gms.internal.measurement.V0 b(int i10) {
        ArrayList arrayList;
        List list;
        com.google.android.gms.internal.measurement.U0 u0W = com.google.android.gms.internal.measurement.V0.w();
        u0W.b();
        ((com.google.android.gms.internal.measurement.V0) u0W.f14329s).x(i10);
        u0W.b();
        ((com.google.android.gms.internal.measurement.V0) u0W.f14329s).A(this.f17240b);
        C0857o1 c0857o1 = this.f17241c;
        if (c0857o1 != null) {
            u0W.b();
            ((com.google.android.gms.internal.measurement.V0) u0W.f14329s).z(c0857o1);
        }
        C0852n1 c0852n1X = C0857o1.x();
        ArrayList arrayListW = C0967b0.W(this.f17242d);
        c0852n1X.b();
        ((C0857o1) c0852n1X.f14329s).B(arrayListW);
        ArrayList arrayListW2 = C0967b0.W(this.f17243e);
        c0852n1X.b();
        ((C0857o1) c0852n1X.f14329s).z(arrayListW2);
        C1350e c1350e = this.f17244f;
        if (c1350e == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(c1350e.f22703t);
            for (Integer num : (C1347b) c1350e.keySet()) {
                int iIntValue = num.intValue();
                Long l10 = (Long) c1350e.get(num);
                if (l10 != null) {
                    C0787a1 c0787a1T = C0792b1.t();
                    c0787a1T.b();
                    ((C0792b1) c0787a1T.f14329s).u(iIntValue);
                    long jLongValue = l10.longValue();
                    c0787a1T.b();
                    ((C0792b1) c0787a1T.f14329s).v(jLongValue);
                    arrayList2.add((C0792b1) c0787a1T.e());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            c0852n1X.b();
            ((C0857o1) c0852n1X.f14329s).D(arrayList);
        }
        C1350e c1350e2 = this.g;
        if (c1350e2 == null) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList3 = new ArrayList(c1350e2.f22703t);
            for (Integer num2 : (C1347b) c1350e2.keySet()) {
                C0862p1 c0862p1U = C0867q1.u();
                int iIntValue2 = num2.intValue();
                c0862p1U.b();
                ((C0867q1) c0862p1U.f14329s).v(iIntValue2);
                List list2 = (List) c1350e2.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    c0862p1U.b();
                    ((C0867q1) c0862p1U.f14329s).w(list2);
                }
                arrayList3.add((C0867q1) c0862p1U.e());
            }
            list = arrayList3;
        }
        c0852n1X.b();
        ((C0857o1) c0852n1X.f14329s).F(list);
        u0W.b();
        ((com.google.android.gms.internal.measurement.V0) u0W.f14329s).y((C0857o1) c0852n1X.e());
        return (com.google.android.gms.internal.measurement.V0) u0W.e();
    }

    public Y1(C0969c c0969c, String str) {
        this.f17245h = c0969c;
        this.f17239a = str;
        this.f17240b = true;
        this.f17242d = new BitSet();
        this.f17243e = new BitSet();
        this.f17244f = new C1350e(0);
        this.g = new C1350e(0);
    }
}
