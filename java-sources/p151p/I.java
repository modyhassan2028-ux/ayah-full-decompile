package p151p;

import K7.l;
import X7.r;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import androidx.appcompat.widget.AppCompatSpinner;

/* JADX INFO: loaded from: classes.dex */
public final class I extends A0 implements K {
    public CharSequence U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public G f20557V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final Rect f20558W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public int f20559X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ AppCompatSpinner f20560Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(AppCompatSpinner appCompatSpinner, Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10, 0);
        this.f20560Y = appCompatSpinner;
        this.f20558W = new Rect();
        this.f20513F = appCompatSpinner;
        this.f20523P = true;
        this.Q.setFocusable(true);
        this.f20514G = new r(1, this);
    }

    @Override // p151p.K
    public final void h(CharSequence charSequence) {
        this.U = charSequence;
    }

    @Override // p151p.K
    public final void k(int i10) {
        this.f20559X = i10;
    }

    @Override // p151p.K
    public final void m(int i10, int i11) {
        ViewTreeObserver viewTreeObserver;
        C1279z c1279z = this.Q;
        boolean zIsShowing = c1279z.isShowing();
        s();
        c1279z.setInputMethodMode(2);
        d();
        C1261p0 c1261p0 = this.f20526t;
        c1261p0.setChoiceMode(1);
        c1261p0.setTextDirection(i10);
        c1261p0.setTextAlignment(i11);
        AppCompatSpinner appCompatSpinner = this.f20560Y;
        int selectedItemPosition = appCompatSpinner.getSelectedItemPosition();
        C1261p0 c1261p1 = this.f20526t;
        if (c1279z.isShowing() && c1261p1 != null) {
            c1261p1.setListSelectionHidden(false);
            c1261p1.setSelection(selectedItemPosition);
            if (c1261p1.getChoiceMode() != 0) {
                c1261p1.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = appCompatSpinner.getViewTreeObserver()) == null) {
            return;
        }
        l lVar = new l(5, this);
        viewTreeObserver.addOnGlobalLayoutListener(lVar);
        c1279z.setOnDismissListener(new H(this, lVar));
    }

    @Override // p151p.K
    public final CharSequence o() {
        return this.U;
    }

    @Override // p151p.A0, p151p.K
    public final void p(ListAdapter listAdapter) {
        super.p(listAdapter);
        this.f20557V = (G) listAdapter;
    }

    public final void s() {
        int i10;
        AppCompatSpinner appCompatSpinner = this.f20560Y;
        Rect rect = appCompatSpinner.f11542y;
        C1279z c1279z = this.Q;
        Drawable background = c1279z.getBackground();
        if (background != null) {
            background.getPadding(rect);
            boolean z10 = q1.f20766a;
            i10 = appCompatSpinner.getLayoutDirection() == 1 ? rect.right : -rect.left;
        } else {
            i10 = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = appCompatSpinner.getPaddingLeft();
        int paddingRight = appCompatSpinner.getPaddingRight();
        int width = appCompatSpinner.getWidth();
        int i11 = appCompatSpinner.f11541x;
        if (i11 == -2) {
            int iA = appCompatSpinner.a(this.f20557V, c1279z.getBackground());
            int i12 = (appCompatSpinner.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (iA > i12) {
                iA = i12;
            }
            r(Math.max(iA, (width - paddingLeft) - paddingRight));
        } else if (i11 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i11);
        }
        boolean z11 = q1.f20766a;
        this.f20529w = appCompatSpinner.getLayoutDirection() == 1 ? (((width - paddingRight) - this.f20528v) - this.f20559X) + i10 : paddingLeft + this.f20559X + i10;
    }
}
