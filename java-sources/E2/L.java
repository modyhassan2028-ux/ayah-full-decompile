package E2;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public W f1556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1559d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1560e;

    public L() {
        d();
    }

    public final void a() {
        this.f1558c = this.f1559d ? this.f1556a.i() : this.f1556a.m();
    }

    public final void b(int i10, View view) {
        if (this.f1559d) {
            int iD = this.f1556a.d(view);
            W w9 = this.f1556a;
            this.f1558c = (Integer.MIN_VALUE == w9.f1625a ? 0 : w9.n() - w9.f1625a) + iD;
        } else {
            this.f1558c = this.f1556a.g(view);
        }
        this.f1557b = i10;
    }

    public final void c(int i10, View view) {
        W w9 = this.f1556a;
        int iN = Integer.MIN_VALUE == w9.f1625a ? 0 : w9.n() - w9.f1625a;
        if (iN >= 0) {
            b(i10, view);
            return;
        }
        this.f1557b = i10;
        if (!this.f1559d) {
            int iG = this.f1556a.g(view);
            int iM = iG - this.f1556a.m();
            this.f1558c = iG;
            if (iM > 0) {
                int i11 = (this.f1556a.i() - Math.min(0, (this.f1556a.i() - iN) - this.f1556a.d(view))) - (this.f1556a.e(view) + iG);
                if (i11 < 0) {
                    this.f1558c -= Math.min(iM, -i11);
                    return;
                }
                return;
            }
            return;
        }
        int i12 = (this.f1556a.i() - iN) - this.f1556a.d(view);
        this.f1558c = this.f1556a.i() - i12;
        if (i12 > 0) {
            int iE = this.f1558c - this.f1556a.e(view);
            int iM2 = this.f1556a.m();
            int iMin = iE - (Math.min(this.f1556a.g(view) - iM2, 0) + iM2);
            if (iMin < 0) {
                this.f1558c = Math.min(i12, -iMin) + this.f1558c;
            }
        }
    }

    public final void d() {
        this.f1557b = -1;
        this.f1558c = Integer.MIN_VALUE;
        this.f1559d = false;
        this.f1560e = false;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.f1557b + ", mCoordinate=" + this.f1558c + ", mLayoutFromEnd=" + this.f1559d + ", mValid=" + this.f1560e + '}';
    }
}
