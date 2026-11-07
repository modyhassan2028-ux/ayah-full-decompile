package p008a8;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.transformation.ExpandableBehavior;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ View f11227r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f11228s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ E7.a f11229t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ExpandableBehavior f11230u;

    public a(ExpandableBehavior expandableBehavior, View view, int i10, E7.a aVar) {
        this.f11230u = expandableBehavior;
        this.f11227r = view;
        this.f11228s = i10;
        this.f11229t = aVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view = this.f11227r;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        ExpandableBehavior expandableBehavior = this.f11230u;
        if (expandableBehavior.f15382r == this.f11228s) {
            Object obj = this.f11229t;
            expandableBehavior.w((View) obj, view, ((FloatingActionButton) obj).f14934F.f1975b, false);
        }
        return false;
    }
}
