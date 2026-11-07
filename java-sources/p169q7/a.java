package p169q7;

import I1.S;
import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class a extends p000a.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f21335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21336c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f21337d;

    public a(SwipeDismissBehavior swipeDismissBehavior) {
        this.f21337d = swipeDismissBehavior;
    }

    @Override // p000a.a
    public final int L(View view) {
        return view.getWidth();
    }

    @Override // p000a.a
    public final void Y(View view, int i10) {
        this.f21336c = i10;
        this.f21335b = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f21337d;
            swipeDismissBehavior.f14611t = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f14611t = false;
        }
    }

    @Override // p000a.a
    public final void a0(View view, int i10, int i11) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f21337d;
        float f3 = width * swipeDismissBehavior.f14613v;
        float width2 = view.getWidth() * swipeDismissBehavior.f14614w;
        float fAbs = Math.abs(i10 - this.f21335b);
        if (fAbs <= f3) {
            view.setAlpha(1.0f);
        } else if (fAbs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((fAbs - f3) / (width2 - f3))), 1.0f));
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0052  */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    /* JADX WARN: Code duplicated, block: B:35:0x0067  */
    @Override // p000a.a
    public final void b0(View view, float f3, float f7) {
        int i10;
        int left;
        int i11;
        this.f21336c = -1;
        int width = view.getWidth();
        boolean z10 = false;
        SwipeDismissBehavior swipeDismissBehavior = this.f21337d;
        if (f3 != 0.0f) {
            WeakHashMap weakHashMap = S.f3689a;
            boolean z11 = view.getLayoutDirection() == 1;
            int i12 = swipeDismissBehavior.f14612u;
            if (i12 != 2 && (i12 != 0 ? i12 != 1 || (!z11 ? f3 < 0.0f : f3 > 0.0f) : !z11 ? f3 > 0.0f : f3 < 0.0f)) {
                i10 = this.f21335b;
            } else {
                if (f3 >= 0.0f) {
                    left = view.getLeft();
                    i11 = this.f21335b;
                    if (left < i11) {
                        i10 = this.f21335b - width;
                    } else {
                        i10 = i11 + width;
                    }
                } else {
                    i10 = this.f21335b - width;
                }
                z10 = true;
            }
        } else {
            if (Math.abs(view.getLeft() - this.f21335b) >= Math.round(view.getWidth() * 0.5f)) {
                if (f3 >= 0.0f) {
                    left = view.getLeft();
                    i11 = this.f21335b;
                    if (left < i11) {
                        i10 = this.f21335b - width;
                    } else {
                        i10 = i11 + width;
                    }
                } else {
                    i10 = this.f21335b - width;
                }
                z10 = true;
            } else {
                i10 = this.f21335b;
            }
        }
        if (swipeDismissBehavior.f14609r.s(i10, view.getTop())) {
            b bVar = new b(swipeDismissBehavior, view, z10);
            WeakHashMap weakHashMap2 = S.f3689a;
            view.postOnAnimation(bVar);
        }
    }

    @Override // p000a.a
    public final boolean o0(int i10, View view) {
        int i11 = this.f21336c;
        return (i11 == -1 || i11 == i10) && this.f21337d.w(view);
    }

    @Override // p000a.a
    public final int p(int i10, View view) {
        int width;
        int width2;
        int width3;
        WeakHashMap weakHashMap = S.f3689a;
        boolean z10 = view.getLayoutDirection() == 1;
        int i11 = this.f21337d.f14612u;
        if (i11 == 0) {
            if (z10) {
                width = this.f21335b - view.getWidth();
                width2 = this.f21335b;
            } else {
                width = this.f21335b;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i11 != 1) {
            width = this.f21335b - view.getWidth();
            width2 = view.getWidth() + this.f21335b;
        } else if (z10) {
            width = this.f21335b;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.f21335b - view.getWidth();
            width2 = this.f21335b;
        }
        return Math.min(Math.max(width, i10), width2);
    }

    @Override // p000a.a
    public final int q(int i10, View view) {
        return view.getTop();
    }

    @Override // p000a.a
    public final void Z(int i10) {
    }
}
