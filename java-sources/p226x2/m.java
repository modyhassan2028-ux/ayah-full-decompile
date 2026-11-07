package p226x2;

import E2.AbstractC0131k0;
import E2.B0;
import E2.F0;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.preference.PreferenceFragmentCompat;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class m extends AbstractC0131k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Drawable f24310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f24311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f24312c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ PreferenceFragmentCompat f24313d;

    public m(PreferenceFragmentCompat preferenceFragmentCompat) {
        this.f24313d = preferenceFragmentCompat;
    }

    @Override // E2.AbstractC0131k0
    public final void f(Rect rect, View view, RecyclerView recyclerView, B0 b5) {
        if (i(view, recyclerView)) {
            rect.bottom = this.f24311b;
        }
    }

    @Override // E2.AbstractC0131k0
    public final void h(Canvas canvas, RecyclerView recyclerView, B0 b5) {
        if (this.f24310a == null) {
            return;
        }
        int childCount = recyclerView.getChildCount();
        int width = recyclerView.getWidth();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = recyclerView.getChildAt(i10);
            if (i(childAt, recyclerView)) {
                int height = childAt.getHeight() + ((int) childAt.getY());
                this.f24310a.setBounds(0, height, width, this.f24311b + height);
                this.f24310a.draw(canvas);
            }
        }
    }

    public final boolean i(View view, RecyclerView recyclerView) {
        F0 f0O = recyclerView.O(view);
        if (!(f0O instanceof t) || !((t) f0O).f24345y) {
            return false;
        }
        boolean z10 = this.f24312c;
        int iIndexOfChild = recyclerView.indexOfChild(view);
        if (iIndexOfChild >= recyclerView.getChildCount() - 1) {
            return z10;
        }
        F0 f0O2 = recyclerView.O(recyclerView.getChildAt(iIndexOfChild + 1));
        return (f0O2 instanceof t) && ((t) f0O2).f24344x;
    }
}
