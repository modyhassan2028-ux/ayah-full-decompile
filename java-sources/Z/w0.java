package Z;

import J0.C0299w;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0 f10839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f10840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object[] f10842d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f10843e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f10844f;
    public int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f10845h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f10846i;
    public final C0299w j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f10847k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f10848l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f10849m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f10850n;

    public w0(x0 x0Var) {
        this.f10839a = x0Var;
        this.f10840b = x0Var.f10854r;
        int i10 = x0Var.f10855s;
        this.f10841c = i10;
        this.f10842d = x0Var.f10856t;
        this.f10843e = x0Var.f10857u;
        this.f10845h = i10;
        this.f10846i = -1;
        this.j = new C0299w();
    }

    public final C0670a a(int i10) {
        ArrayList arrayList = this.f10839a.f10862z;
        int iE = z0.e(arrayList, i10, this.f10841c);
        if (iE >= 0) {
            return (C0670a) arrayList.get(iE);
        }
        C0670a c0670a = new C0670a(i10);
        arrayList.add(-(iE + 1), c0670a);
        return c0670a;
    }

    public final Object b(int[] iArr, int i10) {
        int i11 = i10 * 5;
        int i12 = iArr[i11 + 1];
        if ((268435456 & i12) != 0) {
            return this.f10842d[i11 >= iArr.length ? iArr.length : iArr[i11 + 4] + Integer.bitCount(i12 >> 29)];
        }
        return C0690k.f10683a;
    }

    public final void c() {
        this.f10844f = true;
        x0 x0Var = this.f10839a;
        x0Var.getClass();
        if (this.f10839a != x0Var || x0Var.f10858v <= 0) {
            AbstractC0700p.c("Unexpected reader close()");
        }
        x0Var.f10858v--;
    }

    public final void d() {
        if (this.f10847k == 0) {
            if (!(this.g == this.f10845h)) {
                AbstractC0700p.c("endGroup() not called at the end of a group");
            }
            int i10 = (this.f10846i * 5) + 2;
            int[] iArr = this.f10840b;
            int i11 = iArr[i10];
            this.f10846i = i11;
            int i12 = this.f10841c;
            this.f10845h = i11 < 0 ? i12 : z0.a(iArr, i11) + i11;
            int iB = this.j.b();
            if (iB < 0) {
                this.f10848l = 0;
                this.f10849m = 0;
            } else {
                this.f10848l = iB;
                this.f10849m = i11 >= i12 - 1 ? this.f10843e : iArr[((i11 + 1) * 5) + 4];
            }
        }
    }

    public final Object e() {
        int i10 = this.g;
        if (i10 < this.f10845h) {
            return b(this.f10840b, i10);
        }
        return 0;
    }

    public final int f() {
        int i10 = this.g;
        if (i10 >= this.f10845h) {
            return 0;
        }
        return this.f10840b[i10 * 5];
    }

    public final Object g(int i10, int i11) {
        int[] iArr = this.f10840b;
        int iC = z0.c(iArr, i10);
        int i12 = i10 + 1;
        int i13 = iC + i11;
        return i13 < (i12 < this.f10841c ? iArr[(i12 * 5) + 4] : this.f10843e) ? this.f10842d[i13] : C0690k.f10683a;
    }

    public final boolean h(int i10) {
        return (this.f10840b[(i10 * 5) + 1] & 536870912) != 0;
    }

    public final boolean i(int i10) {
        return (this.f10840b[(i10 * 5) + 1] & 1073741824) != 0;
    }

    public final Object j() {
        int i10;
        if (this.f10847k > 0 || (i10 = this.f10848l) >= this.f10849m) {
            this.f10850n = false;
            return C0690k.f10683a;
        }
        this.f10850n = true;
        this.f10848l = i10 + 1;
        return this.f10842d[i10];
    }

    public final Object k(int i10) {
        int i11 = i10 * 5;
        int[] iArr = this.f10840b;
        int i12 = iArr[i11 + 1] & 1073741824;
        if (i12 == 0) {
            return null;
        }
        if (i12 == 0) {
            return C0690k.f10683a;
        }
        return this.f10842d[iArr[i11 + 4]];
    }

    public final int l(int i10) {
        return this.f10840b[(i10 * 5) + 1] & 67108863;
    }

    public final Object m(int[] iArr, int i10) {
        int i11 = i10 * 5;
        int i12 = iArr[i11 + 1];
        if ((536870912 & i12) == 0) {
            return null;
        }
        return this.f10842d[Integer.bitCount(i12 >> 30) + iArr[i11 + 4]];
    }

    public final int n(int i10) {
        return this.f10840b[(i10 * 5) + 2];
    }

    public final void o(int i10) {
        if (!(this.f10847k == 0)) {
            AbstractC0700p.c("Cannot reposition while in an empty region");
        }
        this.g = i10;
        int[] iArr = this.f10840b;
        int i11 = this.f10841c;
        int i12 = i10 < i11 ? iArr[(i10 * 5) + 2] : -1;
        this.f10846i = i12;
        if (i12 < 0) {
            this.f10845h = i11;
        } else {
            this.f10845h = z0.a(iArr, i12) + i12;
        }
        this.f10848l = 0;
        this.f10849m = 0;
    }

    public final int p() {
        if (!(this.f10847k == 0)) {
            AbstractC0700p.c("Cannot skip while in an empty region");
        }
        int i10 = this.g;
        int[] iArr = this.f10840b;
        int i11 = (iArr[(i10 * 5) + 1] & 1073741824) == 0 ? iArr[(i10 * 5) + 1] & 67108863 : 1;
        this.g = z0.a(iArr, i10) + i10;
        return i11;
    }

    public final void q() {
        if (!(this.f10847k == 0)) {
            AbstractC0700p.c("Cannot skip the enclosing group while in an empty region");
        }
        this.g = this.f10845h;
        this.f10848l = 0;
        this.f10849m = 0;
    }

    public final void r() {
        if (this.f10847k <= 0) {
            int i10 = this.f10846i;
            int i11 = this.g;
            int[] iArr = this.f10840b;
            if (!(iArr[(i11 * 5) + 2] == i10)) {
                AbstractC0689j0.a("Invalid slot table detected");
            }
            int i12 = this.f10848l;
            int i13 = this.f10849m;
            C0299w c0299w = this.j;
            if (i12 == 0 && i13 == 0) {
                c0299w.c(-1);
            } else {
                c0299w.c(i12);
            }
            this.f10846i = i11;
            this.f10845h = z0.a(iArr, i11) + i11;
            int i14 = i11 + 1;
            this.g = i14;
            this.f10848l = z0.c(iArr, i11);
            this.f10849m = i11 >= this.f10841c - 1 ? this.f10843e : iArr[(i14 * 5) + 4];
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SlotReader(current=");
        sb.append(this.g);
        sb.append(", key=");
        sb.append(f());
        sb.append(", parent=");
        sb.append(this.f10846i);
        sb.append(", end=");
        return android.support.v4.media.session.p.A(sb, this.f10845h, ')');
    }
}
