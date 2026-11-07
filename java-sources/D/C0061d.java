package D;

import R7.C0480b;
import R7.InterfaceC0482d;

/* JADX INFO: renamed from: D.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0061d implements InterfaceC0062e, InterfaceC0064g, R3.b, R7.n {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f948r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final float f949s;

    public /* synthetic */ C0061d(int i10, float f3) {
        this.f948r = i10;
        this.f949s = f3;
    }

    @Override // D.InterfaceC0062e, D.InterfaceC0064g
    public float a() {
        switch (this.f948r) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return this.f949s;
    }

    @Override // D.InterfaceC0062e
    public void b(p063g1.c cVar, int i10, int[] iArr, p063g1.m mVar, int[] iArr2) {
        switch (this.f948r) {
            case 0:
                if (mVar != p063g1.m.f16261r) {
                    AbstractC0066i.a(i10, iArr, iArr2, true);
                } else {
                    AbstractC0066i.a(i10, iArr, iArr2, false);
                }
                break;
            case 1:
                if (mVar != p063g1.m.f16261r) {
                    AbstractC0066i.d(i10, iArr, iArr2, true);
                } else {
                    AbstractC0066i.d(i10, iArr, iArr2, false);
                }
                break;
            case 2:
                if (mVar != p063g1.m.f16261r) {
                    AbstractC0066i.e(i10, iArr, iArr2, true);
                } else {
                    AbstractC0066i.e(i10, iArr, iArr2, false);
                }
                break;
            default:
                if (mVar != p063g1.m.f16261r) {
                    AbstractC0066i.f(i10, iArr, iArr2, true);
                } else {
                    AbstractC0066i.f(i10, iArr, iArr2, false);
                }
                break;
        }
    }

    @Override // R7.n
    public InterfaceC0482d c(InterfaceC0482d interfaceC0482d) {
        return interfaceC0482d instanceof R7.k ? interfaceC0482d : new C0480b(this.f949s, interfaceC0482d);
    }

    @Override // D.InterfaceC0064g
    public void d(int i10, H0.K k7, int[] iArr, int[] iArr2) {
        switch (this.f948r) {
            case 0:
                AbstractC0066i.a(i10, iArr, iArr2, false);
                break;
            case 1:
                AbstractC0066i.d(i10, iArr, iArr2, false);
                break;
            case 2:
                AbstractC0066i.e(i10, iArr, iArr2, false);
                break;
            default:
                AbstractC0066i.f(i10, iArr, iArr2, false);
                break;
        }
    }

    @Override // R3.b
    public R3.a f(int i10, int i11) {
        int iMin = Math.min((int) (1080 * this.f949s), (int) Math.rint(i10 * 0.97f));
        float f3 = iMin;
        return new R3.a(iMin, (int) Math.ceil(1.76f * f3), iMin - (((int) (f3 * 0.027f)) * 2), (int) (0.04f * f3));
    }

    public String toString() {
        switch (this.f948r) {
            case 0:
                return "Arrangement#Center";
            case 1:
                return "Arrangement#SpaceAround";
            case 2:
                return "Arrangement#SpaceBetween";
            case 3:
                return "Arrangement#SpaceEvenly";
            default:
                return super.toString();
        }
    }

    public C0061d(int i10) {
        this.f948r = i10;
        switch (i10) {
            case 1:
                this.f949s = 0;
                break;
            case 2:
                this.f949s = 0;
                break;
            case 3:
                this.f949s = 0;
                break;
            default:
                this.f949s = 0;
                break;
        }
    }
}
