package p151p;

import android.content.Context;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import p130n.b;
import p140o.C;
import p140o.k;
import p140o.m;
import p140o.w;

/* JADX INFO: loaded from: classes.dex */
public final class d1 implements w {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public k f20652r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public m f20653s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Toolbar f20654t;

    public d1(Toolbar toolbar) {
        this.f20654t = toolbar;
    }

    @Override // p140o.w
    public final void e(boolean z10) {
        if (this.f20653s != null) {
            k kVar = this.f20652r;
            if (kVar != null) {
                int size = kVar.f20139f.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (this.f20652r.getItem(i10) == this.f20653s) {
                        return;
                    }
                }
            }
            m(this.f20653s);
        }
    }

    @Override // p140o.w
    public final boolean f(m mVar) {
        Toolbar toolbar = this.f20654t;
        toolbar.c();
        ViewParent parent = toolbar.f11712y.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f11712y);
            }
            toolbar.addView(toolbar.f11712y);
        }
        View actionView = mVar.getActionView();
        toolbar.f11713z = actionView;
        this.f20653s = mVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f11713z);
            }
            e1 e1VarH = Toolbar.h();
            e1VarH.f20655a = (toolbar.f11677E & 112) | 8388611;
            e1VarH.f20656b = 2;
            toolbar.f11713z.setLayoutParams(e1VarH);
            toolbar.addView(toolbar.f11713z);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((e1) childAt.getLayoutParams()).f20656b != 2 && childAt != toolbar.f11705r) {
                toolbar.removeViewAt(childCount);
                toolbar.f11689V.add(childAt);
            }
        }
        toolbar.requestLayout();
        mVar.f20161C = true;
        mVar.f20173n.p(false);
        KeyEvent.Callback callback = toolbar.f11713z;
        if (callback instanceof b) {
            ((b) callback).onActionViewExpanded();
        }
        toolbar.w();
        return true;
    }

    @Override // p140o.w
    public final int getId() {
        return 0;
    }

    @Override // p140o.w
    public final void i(Context context, k kVar) {
        m mVar;
        k kVar2 = this.f20652r;
        if (kVar2 != null && (mVar = this.f20653s) != null) {
            kVar2.d(mVar);
        }
        this.f20652r = kVar;
    }

    @Override // p140o.w
    public final boolean j() {
        return false;
    }

    @Override // p140o.w
    public final Parcelable k() {
        return null;
    }

    @Override // p140o.w
    public final boolean l(C c10) {
        return false;
    }

    @Override // p140o.w
    public final boolean m(m mVar) {
        Toolbar toolbar = this.f20654t;
        KeyEvent.Callback callback = toolbar.f11713z;
        if (callback instanceof b) {
            ((b) callback).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.f11713z);
        toolbar.removeView(toolbar.f11712y);
        toolbar.f11713z = null;
        ArrayList arrayList = toolbar.f11689V;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f20653s = null;
        toolbar.requestLayout();
        mVar.f20161C = false;
        mVar.f20173n.p(false);
        toolbar.w();
        return true;
    }

    @Override // p140o.w
    public final void c(Parcelable parcelable) {
    }

    @Override // p140o.w
    public final void b(k kVar, boolean z10) {
    }
}
