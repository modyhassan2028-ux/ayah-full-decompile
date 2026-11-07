package E2;

import I1.AbstractC0244b0;
import O.C0445m;
import androidx.datastore.preferences.protobuf.AbstractC0746u;
import androidx.datastore.preferences.protobuf.AbstractC0748w;
import androidx.datastore.preferences.protobuf.C0733g;
import androidx.datastore.preferences.protobuf.C0739m;
import androidx.datastore.preferences.protobuf.C0749x;
import androidx.datastore.preferences.protobuf.C0750y;
import androidx.datastore.preferences.protobuf.InterfaceC0747v;
import androidx.recyclerview.widget.RecyclerView;
import io.realm.RealmFieldTypeConstants;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1435c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1436d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f1437e;

    public /* synthetic */ A(int i10) {
        this.f1433a = i10;
    }

    public void A(InterfaceC0747v interfaceC0747v, boolean z10) throws C0749x {
        String strX;
        int iZ;
        AbstractC0244b0 abstractC0244b0 = (AbstractC0244b0) this.f1437e;
        if ((this.f1434b & 7) != 2) {
            throw C0750y.b();
        }
        do {
            if (z10) {
                E(2);
                strX = abstractC0244b0.y();
            } else {
                E(2);
                strX = abstractC0244b0.x();
            }
            ((androidx.datastore.preferences.protobuf.U) interfaceC0747v).add(strX);
            if (abstractC0244b0.c()) {
                return;
            } else {
                iZ = abstractC0244b0.z();
            }
        } while (iZ == this.f1434b);
        this.f1436d = iZ;
    }

    public void B(InterfaceC0747v interfaceC0747v) throws C0750y {
        int iZ;
        AbstractC0244b0 abstractC0244b0 = (AbstractC0244b0) this.f1437e;
        int i10 = this.f1434b & 7;
        if (i10 == 0) {
            do {
                ((androidx.datastore.preferences.protobuf.U) interfaceC0747v).add(Integer.valueOf(abstractC0244b0.A()));
                if (abstractC0244b0.c()) {
                    return;
                } else {
                    iZ = abstractC0244b0.z();
                }
            } while (iZ == this.f1434b);
            this.f1436d = iZ;
            return;
        }
        if (i10 != 2) {
            throw C0750y.b();
        }
        int iB = abstractC0244b0.b() + abstractC0244b0.A();
        do {
            ((androidx.datastore.preferences.protobuf.U) interfaceC0747v).add(Integer.valueOf(abstractC0244b0.A()));
        } while (abstractC0244b0.b() < iB);
        D(iB);
    }

    public void C(InterfaceC0747v interfaceC0747v) throws C0750y {
        int iZ;
        AbstractC0244b0 abstractC0244b0 = (AbstractC0244b0) this.f1437e;
        int i10 = this.f1434b & 7;
        if (i10 == 0) {
            do {
                ((androidx.datastore.preferences.protobuf.U) interfaceC0747v).add(Long.valueOf(abstractC0244b0.B()));
                if (abstractC0244b0.c()) {
                    return;
                } else {
                    iZ = abstractC0244b0.z();
                }
            } while (iZ == this.f1434b);
            this.f1436d = iZ;
            return;
        }
        if (i10 != 2) {
            throw C0750y.b();
        }
        int iB = abstractC0244b0.b() + abstractC0244b0.A();
        do {
            ((androidx.datastore.preferences.protobuf.U) interfaceC0747v).add(Long.valueOf(abstractC0244b0.B()));
        } while (abstractC0244b0.b() < iB);
        D(iB);
    }

    public void D(int i10) throws C0750y {
        if (((AbstractC0244b0) this.f1437e).b() != i10) {
            throw C0750y.e();
        }
    }

    public void E(int i10) throws C0749x {
        if ((this.f1434b & 7) != i10) {
            throw C0750y.b();
        }
    }

    public boolean F() {
        int i10;
        AbstractC0244b0 abstractC0244b0 = (AbstractC0244b0) this.f1437e;
        if (abstractC0244b0.c() || (i10 = this.f1434b) == this.f1435c) {
            return false;
        }
        return abstractC0244b0.C(i10);
    }

    public void a(com.squareup.moshi.w wVar) {
        wVar.f15499t = null;
        wVar.f15497r = null;
        wVar.f15498s = null;
        wVar.f15505z = 1;
        int i10 = this.f1434b;
        if (i10 > 0) {
            int i11 = this.f1436d;
            if ((i11 & 1) == 0) {
                this.f1436d = i11 + 1;
                this.f1434b = i10 - 1;
                this.f1435c++;
            }
        }
        wVar.f15497r = (com.squareup.moshi.w) this.f1437e;
        this.f1437e = wVar;
        int i12 = this.f1436d;
        int i13 = i12 + 1;
        this.f1436d = i13;
        int i14 = this.f1434b;
        if (i14 > 0 && (i13 & 1) == 0) {
            this.f1436d = i12 + 2;
            this.f1434b = i14 - 1;
            this.f1435c++;
        }
        int i15 = 4;
        while (true) {
            int i16 = i15 - 1;
            if ((this.f1436d & i16) != i16) {
                return;
            }
            int i17 = this.f1435c;
            if (i17 == 0) {
                com.squareup.moshi.w wVar2 = (com.squareup.moshi.w) this.f1437e;
                com.squareup.moshi.w wVar3 = wVar2.f15497r;
                com.squareup.moshi.w wVar4 = wVar3.f15497r;
                wVar3.f15497r = wVar4.f15497r;
                this.f1437e = wVar3;
                wVar3.f15498s = wVar4;
                wVar3.f15499t = wVar2;
                wVar3.f15505z = wVar2.f15505z + 1;
                wVar4.f15497r = wVar3;
                wVar2.f15497r = wVar3;
            } else if (i17 == 1) {
                com.squareup.moshi.w wVar5 = (com.squareup.moshi.w) this.f1437e;
                com.squareup.moshi.w wVar6 = wVar5.f15497r;
                this.f1437e = wVar6;
                wVar6.f15499t = wVar5;
                wVar6.f15505z = wVar5.f15505z + 1;
                wVar5.f15497r = wVar6;
                this.f1435c = 0;
            } else if (i17 == 2) {
                this.f1435c = 0;
            }
            i15 *= 2;
        }
    }

    public void b(H2.g gVar) {
        Object[] objArr = (Object[]) this.f1437e;
        int i10 = this.f1435c;
        objArr[i10] = gVar;
        int i11 = this.f1436d & (i10 + 1);
        this.f1435c = i11;
        int i12 = this.f1434b;
        if (i11 == i12) {
            int length = objArr.length;
            int i13 = length - i12;
            int i14 = length << 1;
            if (i14 < 0) {
                throw new RuntimeException("Max array capacity exceeded");
            }
            Object[] objArr2 = new Object[i14];
            p120l9.l.X(0, i12, length, objArr, objArr2);
            p120l9.l.X(i13, 0, this.f1434b, (Object[]) this.f1437e, objArr2);
            this.f1437e = objArr2;
            this.f1434b = 0;
            this.f1435c = length;
            this.f1436d = i14 - 1;
        }
    }

    public void c(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i11 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i12 = this.f1436d;
        int i13 = i12 * 2;
        int[] iArr = (int[]) this.f1437e;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f1437e = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i13 >= iArr.length) {
            int[] iArr3 = new int[i12 * 4];
            this.f1437e = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = (int[]) this.f1437e;
        iArr4[i13] = i10;
        iArr4[i13 + 1] = i11;
        this.f1436d++;
    }

    public C0445m d(int i10) {
        return new C0445m(p017b7.g.f0((U0.I) this.f1437e, i10), i10, 1L);
    }

    public void e(RecyclerView recyclerView, boolean z10) {
        this.f1436d = 0;
        int[] iArr = (int[]) this.f1437e;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        AbstractC0135m0 abstractC0135m0 = recyclerView.f12863E;
        if (recyclerView.f12861D == null || abstractC0135m0 == null || !abstractC0135m0.f1722i) {
            return;
        }
        if (z10) {
            if (!recyclerView.f12916v.k()) {
                abstractC0135m0.j(recyclerView.f12861D.a(), this);
            }
        } else if (!recyclerView.R()) {
            abstractC0135m0.i(this.f1434b, this.f1435c, recyclerView.f12923y0, this);
        }
        int i10 = this.f1436d;
        if (i10 > abstractC0135m0.j) {
            abstractC0135m0.j = i10;
            abstractC0135m0.f1723k = z10;
            recyclerView.f12912t.m();
        }
    }

    public int f() {
        return this.f1436d - this.f1435c;
    }

    public int g() {
        int i10 = this.f1436d;
        if (i10 != 0) {
            this.f1434b = i10;
            this.f1436d = 0;
        } else {
            this.f1434b = ((AbstractC0244b0) this.f1437e).z();
        }
        int i11 = this.f1434b;
        if (i11 == 0 || i11 == this.f1435c) {
            return Integer.MAX_VALUE;
        }
        return i11 >>> 3;
    }

    public int h(int i10) {
        return ((p001a0.J) this.f1437e).f11082k[this.f1435c + i10];
    }

    public Object i(int i10) {
        return ((p001a0.J) this.f1437e).f11084m[this.f1436d + i10];
    }

    public void j(Object obj, androidx.datastore.preferences.protobuf.W w9, C0739m c0739m) {
        int i10 = this.f1435c;
        this.f1435c = ((this.f1434b >>> 3) << 3) | 4;
        try {
            w9.a(obj, this, c0739m);
            if (this.f1434b != this.f1435c) {
                throw new C0750y("Failed to parse the message.");
            }
            this.f1435c = i10;
        } catch (Throwable th) {
            this.f1435c = i10;
            throw th;
        }
    }

    public void k(Object obj, androidx.datastore.preferences.protobuf.W w9, C0739m c0739m) throws C0750y {
        AbstractC0244b0 abstractC0244b0 = (AbstractC0244b0) this.f1437e;
        int iA = abstractC0244b0.A();
        if (abstractC0244b0.f3712r >= 100) {
            throw new C0750y("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i10 = abstractC0244b0.i(iA);
        abstractC0244b0.f3712r++;
        w9.a(obj, this, c0739m);
        abstractC0244b0.a(0);
        abstractC0244b0.f3712r--;
        abstractC0244b0.h(i10);
    }

    public void l(InterfaceC0747v interfaceC0747v) throws C0750y {
        int iZ;
        AbstractC0244b0 abstractC0244b0 = (AbstractC0244b0) this.f1437e;
        int i10 = this.f1434b & 7;
        if (i10 == 0) {
            do {
                ((androidx.datastore.preferences.protobuf.U) interfaceC0747v).add(Boolean.valueOf(abstractC0244b0.j()));
                if (abstractC0244b0.c()) {
                    return;
                } else {
                    iZ = abstractC0244b0.z();
                }
            } while (iZ == this.f1434b);
            this.f1436d = iZ;
            return;
        }
        if (i10 != 2) {
            throw C0750y.b();
        }
        int iB = abstractC0244b0.b() + abstractC0244b0.A();
        do {
            ((androidx.datastore.preferences.protobuf.U) interfaceC0747v).add(Boolean.valueOf(abstractC0244b0.j()));
        } while (abstractC0244b0.b() < iB);
        D(iB);
    }

    public C0733g m() throws C0749x {
        E(2);
        return ((AbstractC0244b0) this.f1437e).k();
    }

    public void n(InterfaceC0747v interfaceC0747v) throws C0749x {
        int iZ;
        AbstractC0244b0 abstractC0244b0 = (AbstractC0244b0) this.f1437e;
        if ((this.f1434b & 7) != 2) {
            throw C0750y.b();
        }
        do {
            ((androidx.datastore.preferences.protobuf.U) interfaceC0747v).add(m());
            if (abstractC0244b0.c()) {
                return;
            } else {
                iZ = abstractC0244b0.z();
            }
        } while (iZ == this.f1434b);
        this.f1436d = iZ;
    }

    public void o(InterfaceC0747v interfaceC0747v) throws C0750y {
        int iZ;
        AbstractC0244b0 abstractC0244b0 = (AbstractC0244b0) this.f1437e;
        int i10 = this.f1434b & 7;
        if (i10 == 1) {
            do {
                ((androidx.datastore.preferences.protobuf.U) interfaceC0747v).add(Double.valueOf(abstractC0244b0.l()));
                if (abstractC0244b0.c()) {
                    return;
                } else {
                    iZ = abstractC0244b0.z();
                }
            } while (iZ == this.f1434b);
            this.f1436d = iZ;
            return;
        }
        if (i10 != 2) {
            throw C0750y.b();
        }
        int iA = abstractC0244b0.A();
        if ((iA & 7) != 0) {
            throw new C0750y("Failed to parse the message.");
        }
        int iB = abstractC0244b0.b() + iA;
        do {
            ((androidx.datastore.preferences.protobuf.U) interfaceC0747v).add(Double.valueOf(abstractC0244b0.l()));
        } while (abstractC0244b0.b() < iB);
    }

    public void p(InterfaceC0747v interfaceC0747v) throws C0750y {
        int iZ;
        AbstractC0244b0 abstractC0244b0 = (AbstractC0244b0) this.f1437e;
        int i10 = this.f1434b & 7;
        if (i10 == 0) {
            do {
                ((androidx.datastore.preferences.protobuf.U) interfaceC0747v).add(Integer.valueOf(abstractC0244b0.m()));
                if (abstractC0244b0.c()) {
                    return;
                } else {
                    iZ = abstractC0244b0.z();
                }
            } while (iZ == this.f1434b);
            this.f1436d = iZ;
            return;
        }
        if (i10 != 2) {
            throw C0750y.b();
        }
        int iB = abstractC0244b0.b() + abstractC0244b0.A();
        do {
            ((androidx.datastore.preferences.protobuf.U) interfaceC0747v).add(Integer.valueOf(abstractC0244b0.m()));
        } while (abstractC0244b0.b() < iB);
        D(iB);
    }

    public Object q(androidx.datastore.preferences.protobuf.r0 r0Var, Class cls, C0739m c0739m) throws C0750y {
        AbstractC0244b0 abstractC0244b0 = (AbstractC0244b0) this.f1437e;
        switch (r0Var.ordinal()) {
            case 0:
                E(1);
                return Double.valueOf(abstractC0244b0.l());
            case 1:
                E(5);
                return Float.valueOf(abstractC0244b0.q());
            case 2:
                E(0);
                return Long.valueOf(abstractC0244b0.s());
            case 3:
                E(0);
                return Long.valueOf(abstractC0244b0.B());
            case 4:
                E(0);
                return Integer.valueOf(abstractC0244b0.r());
            case 5:
                E(1);
                return Long.valueOf(abstractC0244b0.o());
            case 6:
                E(5);
                return Integer.valueOf(abstractC0244b0.n());
            case 7:
                E(0);
                return Boolean.valueOf(abstractC0244b0.j());
            case 8:
                E(2);
                return abstractC0244b0.y();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                E(2);
                androidx.datastore.preferences.protobuf.W wA = androidx.datastore.preferences.protobuf.T.f12406c.a(cls);
                AbstractC0746u abstractC0746uI = wA.i();
                k(abstractC0746uI, wA, c0739m);
                wA.e(abstractC0746uI);
                return abstractC0746uI;
            case 11:
                return m();
            case 12:
                E(0);
                return Integer.valueOf(abstractC0244b0.A());
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                E(0);
                return Integer.valueOf(abstractC0244b0.m());
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                E(5);
                return Integer.valueOf(abstractC0244b0.t());
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                E(1);
                return Long.valueOf(abstractC0244b0.u());
            case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                E(0);
                return Integer.valueOf(abstractC0244b0.v());
            case 17:
                E(0);
                return Long.valueOf(abstractC0244b0.w());
        }
    }

    public void r(InterfaceC0747v interfaceC0747v) throws C0750y {
        int iZ;
        AbstractC0244b0 abstractC0244b0 = (AbstractC0244b0) this.f1437e;
        int i10 = this.f1434b & 7;
        if (i10 == 2) {
            int iA = abstractC0244b0.A();
            if ((iA & 3) != 0) {
                throw new C0750y("Failed to parse the message.");
            }
            int iB = abstractC0244b0.b() + iA;
            do {
                ((androidx.datastore.preferences.protobuf.U) interfaceC0747v).add(Integer.valueOf(abstractC0244b0.n()));
            } while (abstractC0244b0.b() < iB);
            return;
        }
        if (i10 != 5) {
            throw C0750y.b();
        }
        do {
            ((androidx.datastore.preferences.protobuf.U) interfaceC0747v).add(Integer.valueOf(abstractC0244b0.n()));
            if (abstractC0244b0.c()) {
                return;
            } else {
                iZ = abstractC0244b0.z();
            }
        } while (iZ == this.f1434b);
        this.f1436d = iZ;
    }

    public void s(InterfaceC0747v interfaceC0747v) throws C0750y {
        int iZ;
        AbstractC0244b0 abstractC0244b0 = (AbstractC0244b0) this.f1437e;
        int i10 = this.f1434b & 7;
        if (i10 == 1) {
            do {
                ((androidx.datastore.preferences.protobuf.U) interfaceC0747v).add(Long.valueOf(abstractC0244b0.o()));
                if (abstractC0244b0.c()) {
                    return;
                } else {
                    iZ = abstractC0244b0.z();
                }
            } while (iZ == this.f1434b);
            this.f1436d = iZ;
            return;
        }
        if (i10 != 2) {
            throw C0750y.b();
        }
        int iA = abstractC0244b0.A();
        if ((iA & 7) != 0) {
            throw new C0750y("Failed to parse the message.");
        }
        int iB = abstractC0244b0.b() + iA;
        do {
            ((androidx.datastore.preferences.protobuf.U) interfaceC0747v).add(Long.valueOf(abstractC0244b0.o()));
        } while (abstractC0244b0.b() < iB);
    }

    public void t(InterfaceC0747v interfaceC0747v) throws C0750y {
        int iZ;
        AbstractC0244b0 abstractC0244b0 = (AbstractC0244b0) this.f1437e;
        int i10 = this.f1434b & 7;
        if (i10 == 2) {
            int iA = abstractC0244b0.A();
            if ((iA & 3) != 0) {
                throw new C0750y("Failed to parse the message.");
            }
            int iB = abstractC0244b0.b() + iA;
            do {
                ((androidx.datastore.preferences.protobuf.U) interfaceC0747v).add(Float.valueOf(abstractC0244b0.q()));
            } while (abstractC0244b0.b() < iB);
            return;
        }
        if (i10 != 5) {
            throw C0750y.b();
        }
        do {
            ((androidx.datastore.preferences.protobuf.U) interfaceC0747v).add(Float.valueOf(abstractC0244b0.q()));
            if (abstractC0244b0.c()) {
                return;
            } else {
                iZ = abstractC0244b0.z();
            }
        } while (iZ == this.f1434b);
        this.f1436d = iZ;
    }

    public String toString() {
        switch (this.f1433a) {
            case 1:
                StringBuilder sb = new StringBuilder("SelectionInfo(id=1, range=(");
                int i10 = this.f1434b;
                sb.append(i10);
                sb.append('-');
                U0.I i11 = (U0.I) this.f1437e;
                sb.append(p017b7.g.f0(i11, i10));
                sb.append(',');
                int i12 = this.f1435c;
                sb.append(i12);
                sb.append('-');
                sb.append(p017b7.g.f0(i11, i12));
                sb.append("), prevOffset=");
                return android.support.v4.media.session.p.A(sb, this.f1436d, ')');
            case 2:
                return "";
            default:
                return super.toString();
        }
    }

    public void u(InterfaceC0747v interfaceC0747v) throws C0750y {
        int iZ;
        AbstractC0244b0 abstractC0244b0 = (AbstractC0244b0) this.f1437e;
        int i10 = this.f1434b & 7;
        if (i10 == 0) {
            do {
                ((androidx.datastore.preferences.protobuf.U) interfaceC0747v).add(Integer.valueOf(abstractC0244b0.r()));
                if (abstractC0244b0.c()) {
                    return;
                } else {
                    iZ = abstractC0244b0.z();
                }
            } while (iZ == this.f1434b);
            this.f1436d = iZ;
            return;
        }
        if (i10 != 2) {
            throw C0750y.b();
        }
        int iB = abstractC0244b0.b() + abstractC0244b0.A();
        do {
            ((androidx.datastore.preferences.protobuf.U) interfaceC0747v).add(Integer.valueOf(abstractC0244b0.r()));
        } while (abstractC0244b0.b() < iB);
        D(iB);
    }

    public void v(InterfaceC0747v interfaceC0747v) throws C0750y {
        int iZ;
        AbstractC0244b0 abstractC0244b0 = (AbstractC0244b0) this.f1437e;
        int i10 = this.f1434b & 7;
        if (i10 == 0) {
            do {
                ((androidx.datastore.preferences.protobuf.U) interfaceC0747v).add(Long.valueOf(abstractC0244b0.s()));
                if (abstractC0244b0.c()) {
                    return;
                } else {
                    iZ = abstractC0244b0.z();
                }
            } while (iZ == this.f1434b);
            this.f1436d = iZ;
            return;
        }
        if (i10 != 2) {
            throw C0750y.b();
        }
        int iB = abstractC0244b0.b() + abstractC0244b0.A();
        do {
            ((androidx.datastore.preferences.protobuf.U) interfaceC0747v).add(Long.valueOf(abstractC0244b0.s()));
        } while (abstractC0244b0.b() < iB);
        D(iB);
    }

    public void w(InterfaceC0747v interfaceC0747v) throws C0750y {
        int iZ;
        AbstractC0244b0 abstractC0244b0 = (AbstractC0244b0) this.f1437e;
        int i10 = this.f1434b & 7;
        if (i10 == 2) {
            int iA = abstractC0244b0.A();
            if ((iA & 3) != 0) {
                throw new C0750y("Failed to parse the message.");
            }
            int iB = abstractC0244b0.b() + iA;
            do {
                ((androidx.datastore.preferences.protobuf.U) interfaceC0747v).add(Integer.valueOf(abstractC0244b0.t()));
            } while (abstractC0244b0.b() < iB);
            return;
        }
        if (i10 != 5) {
            throw C0750y.b();
        }
        do {
            ((androidx.datastore.preferences.protobuf.U) interfaceC0747v).add(Integer.valueOf(abstractC0244b0.t()));
            if (abstractC0244b0.c()) {
                return;
            } else {
                iZ = abstractC0244b0.z();
            }
        } while (iZ == this.f1434b);
        this.f1436d = iZ;
    }

    public void x(InterfaceC0747v interfaceC0747v) throws C0750y {
        int iZ;
        AbstractC0244b0 abstractC0244b0 = (AbstractC0244b0) this.f1437e;
        int i10 = this.f1434b & 7;
        if (i10 == 1) {
            do {
                ((androidx.datastore.preferences.protobuf.U) interfaceC0747v).add(Long.valueOf(abstractC0244b0.u()));
                if (abstractC0244b0.c()) {
                    return;
                } else {
                    iZ = abstractC0244b0.z();
                }
            } while (iZ == this.f1434b);
            this.f1436d = iZ;
            return;
        }
        if (i10 != 2) {
            throw C0750y.b();
        }
        int iA = abstractC0244b0.A();
        if ((iA & 7) != 0) {
            throw new C0750y("Failed to parse the message.");
        }
        int iB = abstractC0244b0.b() + iA;
        do {
            ((androidx.datastore.preferences.protobuf.U) interfaceC0747v).add(Long.valueOf(abstractC0244b0.u()));
        } while (abstractC0244b0.b() < iB);
    }

    public void y(InterfaceC0747v interfaceC0747v) throws C0750y {
        int iZ;
        AbstractC0244b0 abstractC0244b0 = (AbstractC0244b0) this.f1437e;
        int i10 = this.f1434b & 7;
        if (i10 == 0) {
            do {
                ((androidx.datastore.preferences.protobuf.U) interfaceC0747v).add(Integer.valueOf(abstractC0244b0.v()));
                if (abstractC0244b0.c()) {
                    return;
                } else {
                    iZ = abstractC0244b0.z();
                }
            } while (iZ == this.f1434b);
            this.f1436d = iZ;
            return;
        }
        if (i10 != 2) {
            throw C0750y.b();
        }
        int iB = abstractC0244b0.b() + abstractC0244b0.A();
        do {
            ((androidx.datastore.preferences.protobuf.U) interfaceC0747v).add(Integer.valueOf(abstractC0244b0.v()));
        } while (abstractC0244b0.b() < iB);
        D(iB);
    }

    public void z(InterfaceC0747v interfaceC0747v) throws C0750y {
        int iZ;
        AbstractC0244b0 abstractC0244b0 = (AbstractC0244b0) this.f1437e;
        int i10 = this.f1434b & 7;
        if (i10 == 0) {
            do {
                ((androidx.datastore.preferences.protobuf.U) interfaceC0747v).add(Long.valueOf(abstractC0244b0.w()));
                if (abstractC0244b0.c()) {
                    return;
                } else {
                    iZ = abstractC0244b0.z();
                }
            } while (iZ == this.f1434b);
            this.f1436d = iZ;
            return;
        }
        if (i10 != 2) {
            throw C0750y.b();
        }
        int iB = abstractC0244b0.b() + abstractC0244b0.A();
        do {
            ((androidx.datastore.preferences.protobuf.U) interfaceC0747v).add(Long.valueOf(abstractC0244b0.w()));
        } while (abstractC0244b0.b() < iB);
        D(iB);
    }

    public A(AbstractC0244b0 abstractC0244b0) {
        this.f1433a = 4;
        this.f1436d = 0;
        Charset charset = AbstractC0748w.f12518a;
        this.f1437e = abstractC0244b0;
        abstractC0244b0.f3713s = this;
    }

    public A(p001a0.J j) {
        this.f1433a = 3;
        this.f1437e = j;
    }

    public A(int i10, int i11, int i12, U0.I i13) {
        this.f1433a = 1;
        this.f1434b = i10;
        this.f1435c = i11;
        this.f1436d = i12;
        this.f1437e = i13;
    }
}
