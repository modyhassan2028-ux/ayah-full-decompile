package p207v2;

import A6.a;
import E9.d;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p120l9.m;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class K {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final K f23153e = new K(C1377o.g);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f23154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23157d;

    public K(int i10, int i11, List list) {
        j.e(list, "pages");
        this.f23154a = m.D0(list);
        Iterator it = list.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((j0) it.next()).f23259b.size();
        }
        this.f23155b = size;
        this.f23156c = i10;
        this.f23157d = i11;
    }

    public final l0 a(int i10) {
        ArrayList arrayList;
        int i11 = 0;
        int size = i10 - this.f23156c;
        while (true) {
            arrayList = this.f23154a;
            if (size < ((j0) arrayList.get(i11)).f23259b.size() || i11 >= AbstractC0813f2.E(arrayList)) {
                break;
            }
            size -= ((j0) arrayList.get(i11)).f23259b.size();
            i11++;
        }
        return new l0(((j0) arrayList.get(i11)).f23260c, size, i10 - this.f23156c, ((e() - i10) - this.f23157d) - 1, c(), d());
    }

    public final Object b(int i10) {
        ArrayList arrayList = this.f23154a;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            int size2 = ((j0) arrayList.get(i11)).f23259b.size();
            if (size2 > i10) {
                break;
            }
            i10 -= size2;
            i11++;
        }
        return ((j0) arrayList.get(i11)).f23259b.get(i10);
    }

    public final int c() {
        Integer numValueOf;
        int[] iArr = ((j0) m.f0(this.f23154a)).f23258a;
        if (iArr.length == 0) {
            numValueOf = null;
        } else {
            int i10 = iArr[0];
            int i11 = 1;
            int length = iArr.length - 1;
            if (1 <= length) {
                while (true) {
                    int i12 = iArr[i11];
                    if (i10 > i12) {
                        i10 = i12;
                    }
                    if (i11 == length) {
                        break;
                    }
                    i11++;
                }
            }
            numValueOf = Integer.valueOf(i10);
        }
        j.b(numValueOf);
        return numValueOf.intValue();
    }

    public final int d() {
        Integer numValueOf;
        int[] iArr = ((j0) m.m0(this.f23154a)).f23258a;
        if (iArr.length == 0) {
            numValueOf = null;
        } else {
            int i10 = iArr[0];
            int i11 = 1;
            int length = iArr.length - 1;
            if (1 <= length) {
                while (true) {
                    int i12 = iArr[i11];
                    if (i10 < i12) {
                        i10 = i12;
                    }
                    if (i11 == length) {
                        break;
                    }
                    i11++;
                }
            }
            numValueOf = Integer.valueOf(i10);
        }
        j.b(numValueOf);
        return numValueOf.intValue();
    }

    public final int e() {
        return this.f23156c + this.f23155b + this.f23157d;
    }

    public final AbstractC1367e f(AbstractC1379q abstractC1379q) {
        j.e(abstractC1379q, "pageEvent");
        boolean z10 = abstractC1379q instanceof C1377o;
        ArrayList arrayList = this.f23154a;
        if (!z10) {
            if (!(abstractC1379q instanceof AbstractC1376n)) {
                throw new IllegalStateException("Paging received an event to process StaticList or LoadStateUpdate while\nprocessing Inserts and Drops. If you see this exception, it is most\nlikely a bug in the library. Please file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106");
            }
            d dVar = new d(0, 0, 1);
            Iterator it = arrayList.iterator();
            int size = 0;
            while (it.hasNext()) {
                j0 j0Var = (j0) it.next();
                for (int i10 : j0Var.f23258a) {
                    if (dVar.b(i10)) {
                        size += j0Var.f23259b.size();
                        it.remove();
                        break;
                    }
                }
            }
            int i11 = this.f23155b - size;
            this.f23155b = i11;
            int i12 = this.f23157d;
            this.f23157d = 0;
            return new P(this.f23156c + i11, size, 0, i12);
        }
        C1377o c1377o = (C1377o) abstractC1379q;
        List list = c1377o.f23277b;
        Iterator it2 = list.iterator();
        int size2 = 0;
        while (it2.hasNext()) {
            size2 += ((j0) it2.next()).f23259b.size();
        }
        int iOrdinal = c1377o.f23276a.ordinal();
        if (iOrdinal == 0) {
            throw new IllegalStateException("Paging received a refresh event in the middle of an actively loading generation\nof PagingData. If you see this exception, it is most likely a bug in the library.\nPlease file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106");
        }
        if (iOrdinal == 1) {
            int i13 = this.f23156c;
            arrayList.addAll(0, list);
            this.f23155b += size2;
            this.f23156c = c1377o.f23278c;
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                m.d0(arrayList2, ((j0) it3.next()).f23259b);
            }
            return new S(arrayList2, this.f23156c, i13);
        }
        if (iOrdinal != 2) {
            throw new a();
        }
        int i14 = this.f23157d;
        int i15 = this.f23155b;
        arrayList.addAll(arrayList.size(), list);
        this.f23155b += size2;
        this.f23157d = c1377o.f23279d;
        int i16 = this.f23156c + i15;
        ArrayList arrayList3 = new ArrayList();
        Iterator it4 = list.iterator();
        while (it4.hasNext()) {
            m.d0(arrayList3, ((j0) it4.next()).f23259b);
        }
        return new O(i16, arrayList3, this.f23157d, i14);
    }

    public final String toString() {
        int i10 = this.f23155b;
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(b(i11));
        }
        String strL0 = m.l0(arrayList, null, null, null, null, 63);
        StringBuilder sb = new StringBuilder("[(");
        sb.append(this.f23156c);
        sb.append(" placeholders), ");
        sb.append(strL0);
        sb.append(", (");
        return p245z2.a.E(sb, this.f23157d, " placeholders)]");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public K(C1377o c1377o) {
        this(c1377o.f23278c, c1377o.f23279d, c1377o.f23277b);
        j.e(c1377o, "insertEvent");
    }
}
