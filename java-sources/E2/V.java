package E2;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class V extends W {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1624d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ V(AbstractC0135m0 abstractC0135m0, int i10) {
        super(abstractC0135m0);
        this.f1624d = i10;
    }

    @Override // E2.W
    public final int d(View view) {
        int right;
        int i10;
        switch (this.f1624d) {
            case 0:
                C0137n0 c0137n0 = (C0137n0) view.getLayoutParams();
                ((AbstractC0135m0) this.f1626b).getClass();
                right = view.getRight() + ((C0137n0) view.getLayoutParams()).f1734b.right;
                i10 = ((ViewGroup.MarginLayoutParams) c0137n0).rightMargin;
                break;
            default:
                C0137n0 c0137n1 = (C0137n0) view.getLayoutParams();
                ((AbstractC0135m0) this.f1626b).getClass();
                right = view.getBottom() + ((C0137n0) view.getLayoutParams()).f1734b.bottom;
                i10 = ((ViewGroup.MarginLayoutParams) c0137n1).bottomMargin;
                break;
        }
        return right + i10;
    }

    @Override // E2.W
    public final int e(View view) {
        int iB;
        int i10;
        switch (this.f1624d) {
            case 0:
                C0137n0 c0137n0 = (C0137n0) view.getLayoutParams();
                ((AbstractC0135m0) this.f1626b).getClass();
                iB = AbstractC0135m0.B(view) + ((ViewGroup.MarginLayoutParams) c0137n0).leftMargin;
                i10 = ((ViewGroup.MarginLayoutParams) c0137n0).rightMargin;
                break;
            default:
                C0137n0 c0137n1 = (C0137n0) view.getLayoutParams();
                ((AbstractC0135m0) this.f1626b).getClass();
                iB = AbstractC0135m0.A(view) + ((ViewGroup.MarginLayoutParams) c0137n1).topMargin;
                i10 = ((ViewGroup.MarginLayoutParams) c0137n1).bottomMargin;
                break;
        }
        return iB + i10;
    }

    @Override // E2.W
    public final int f(View view) {
        int iA;
        int i10;
        switch (this.f1624d) {
            case 0:
                C0137n0 c0137n0 = (C0137n0) view.getLayoutParams();
                ((AbstractC0135m0) this.f1626b).getClass();
                iA = AbstractC0135m0.A(view) + ((ViewGroup.MarginLayoutParams) c0137n0).topMargin;
                i10 = ((ViewGroup.MarginLayoutParams) c0137n0).bottomMargin;
                break;
            default:
                C0137n0 c0137n1 = (C0137n0) view.getLayoutParams();
                ((AbstractC0135m0) this.f1626b).getClass();
                iA = AbstractC0135m0.B(view) + ((ViewGroup.MarginLayoutParams) c0137n1).leftMargin;
                i10 = ((ViewGroup.MarginLayoutParams) c0137n1).rightMargin;
                break;
        }
        return iA + i10;
    }

    @Override // E2.W
    public final int g(View view) {
        int left;
        int i10;
        switch (this.f1624d) {
            case 0:
                C0137n0 c0137n0 = (C0137n0) view.getLayoutParams();
                ((AbstractC0135m0) this.f1626b).getClass();
                left = view.getLeft() - ((C0137n0) view.getLayoutParams()).f1734b.left;
                i10 = ((ViewGroup.MarginLayoutParams) c0137n0).leftMargin;
                break;
            default:
                C0137n0 c0137n1 = (C0137n0) view.getLayoutParams();
                ((AbstractC0135m0) this.f1626b).getClass();
                left = view.getTop() - ((C0137n0) view.getLayoutParams()).f1734b.top;
                i10 = ((ViewGroup.MarginLayoutParams) c0137n1).topMargin;
                break;
        }
        return left - i10;
    }

    @Override // E2.W
    public final int h() {
        switch (this.f1624d) {
            case 0:
                return ((AbstractC0135m0) this.f1626b).f1726n;
            default:
                return ((AbstractC0135m0) this.f1626b).f1727o;
        }
    }

    @Override // E2.W
    public final int i() {
        int i10;
        int iF;
        switch (this.f1624d) {
            case 0:
                AbstractC0135m0 abstractC0135m0 = (AbstractC0135m0) this.f1626b;
                i10 = abstractC0135m0.f1726n;
                iF = abstractC0135m0.F();
                break;
            default:
                AbstractC0135m0 abstractC0135m1 = (AbstractC0135m0) this.f1626b;
                i10 = abstractC0135m1.f1727o;
                iF = abstractC0135m1.D();
                break;
        }
        return i10 - iF;
    }

    @Override // E2.W
    public final int j() {
        switch (this.f1624d) {
            case 0:
                return ((AbstractC0135m0) this.f1626b).F();
            default:
                return ((AbstractC0135m0) this.f1626b).D();
        }
    }

    @Override // E2.W
    public final int k() {
        switch (this.f1624d) {
            case 0:
                return ((AbstractC0135m0) this.f1626b).f1724l;
            default:
                return ((AbstractC0135m0) this.f1626b).f1725m;
        }
    }

    @Override // E2.W
    public final int l() {
        switch (this.f1624d) {
            case 0:
                return ((AbstractC0135m0) this.f1626b).f1725m;
            default:
                return ((AbstractC0135m0) this.f1626b).f1724l;
        }
    }

    @Override // E2.W
    public final int m() {
        switch (this.f1624d) {
            case 0:
                return ((AbstractC0135m0) this.f1626b).E();
            default:
                return ((AbstractC0135m0) this.f1626b).G();
        }
    }

    @Override // E2.W
    public final int n() {
        int iE;
        int iF;
        switch (this.f1624d) {
            case 0:
                AbstractC0135m0 abstractC0135m0 = (AbstractC0135m0) this.f1626b;
                iE = abstractC0135m0.f1726n - abstractC0135m0.E();
                iF = abstractC0135m0.F();
                break;
            default:
                AbstractC0135m0 abstractC0135m1 = (AbstractC0135m0) this.f1626b;
                iE = abstractC0135m1.f1727o - abstractC0135m1.G();
                iF = abstractC0135m1.D();
                break;
        }
        return iE - iF;
    }

    @Override // E2.W
    public final int o(View view) {
        switch (this.f1624d) {
            case 0:
                AbstractC0135m0 abstractC0135m0 = (AbstractC0135m0) this.f1626b;
                Rect rect = (Rect) this.f1627c;
                abstractC0135m0.K(rect, view);
                return rect.right;
            default:
                AbstractC0135m0 abstractC0135m1 = (AbstractC0135m0) this.f1626b;
                Rect rect2 = (Rect) this.f1627c;
                abstractC0135m1.K(rect2, view);
                return rect2.bottom;
        }
    }

    @Override // E2.W
    public final int p(View view) {
        switch (this.f1624d) {
            case 0:
                AbstractC0135m0 abstractC0135m0 = (AbstractC0135m0) this.f1626b;
                Rect rect = (Rect) this.f1627c;
                abstractC0135m0.K(rect, view);
                return rect.left;
            default:
                AbstractC0135m0 abstractC0135m1 = (AbstractC0135m0) this.f1626b;
                Rect rect2 = (Rect) this.f1627c;
                abstractC0135m1.K(rect2, view);
                return rect2.top;
        }
    }

    @Override // E2.W
    public final void q(int i10) {
        switch (this.f1624d) {
            case 0:
                ((AbstractC0135m0) this.f1626b).P(i10);
                break;
            default:
                ((AbstractC0135m0) this.f1626b).Q(i10);
                break;
        }
    }
}
