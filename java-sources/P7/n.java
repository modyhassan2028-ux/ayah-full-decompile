package P7;

import E2.C0149x;
import F7.p;
import H7.C0232f;
import H7.C0233g;
import H7.C0236j;
import H7.H;
import H7.z;
import I1.S;
import I1.Y;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.internal.measurement.B1;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.search.SearchBar;
import com.google.android.material.search.SearchView;
import java.util.WeakHashMap;
import p020c.C0776a;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SearchView f6750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f6751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ClippableRoundedCornerLayout f6752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FrameLayout f6753d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final FrameLayout f6754e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final MaterialToolbar f6755f;
    public final Toolbar g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f6756h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final EditText f6757i;
    public final ImageButton j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final View f6758k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TouchObserverFrameLayout f6759l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final J7.h f6760m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public AnimatorSet f6761n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SearchBar f6762o;

    public n(SearchView searchView) {
        this.f6750a = searchView;
        this.f6751b = searchView.f15148r;
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = searchView.f15149s;
        this.f6752c = clippableRoundedCornerLayout;
        this.f6753d = searchView.f15152v;
        this.f6754e = searchView.f15153w;
        this.f6755f = searchView.f15154x;
        this.g = searchView.f15155y;
        this.f6756h = searchView.f15156z;
        this.f6757i = searchView.f15132A;
        this.j = searchView.f15133B;
        this.f6758k = searchView.f15134C;
        this.f6759l = searchView.f15135D;
        this.f6760m = new J7.h(clippableRoundedCornerLayout);
    }

    public static void a(n nVar, float f3) {
        ActionMenuView actionMenuViewH;
        nVar.j.setAlpha(f3);
        nVar.f6758k.setAlpha(f3);
        nVar.f6759l.setAlpha(f3);
        if (!nVar.f6750a.f15145N || (actionMenuViewH = H.h(nVar.f6755f)) == null) {
            return;
        }
        actionMenuViewH.setAlpha(f3);
    }

    public final void b(AnimatorSet animatorSet) {
        ImageButton imageButtonJ = H.j(this.f6755f);
        if (imageButtonJ == null) {
            return;
        }
        Drawable drawableN = B1.N(imageButtonJ.getDrawable());
        if (!this.f6750a.f15144M) {
            if (drawableN instanceof p102k.f) {
                p102k.f fVar = (p102k.f) drawableN;
                if (fVar.f18890i != 1.0f) {
                    fVar.f18890i = 1.0f;
                    fVar.invalidateSelf();
                }
            }
            if (drawableN instanceof C0232f) {
                ((C0232f) drawableN).a(1.0f);
                return;
            }
            return;
        }
        if (drawableN instanceof p102k.f) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new Y(3, (p102k.f) drawableN));
            animatorSet.playTogether(valueAnimatorOfFloat);
        }
        if (drawableN instanceof C0232f) {
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat2.addUpdateListener(new Y(4, (C0232f) drawableN));
            animatorSet.playTogether(valueAnimatorOfFloat2);
        }
    }

    public final void c() {
        SearchBar searchBar = this.f6762o;
        J7.h hVar = this.f6760m;
        if (hVar.a() != null) {
            AnimatorSet animatorSetB = hVar.b(searchBar);
            View view = hVar.f4367b;
            if (view instanceof ClippableRoundedCornerLayout) {
                ClippableRoundedCornerLayout clippableRoundedCornerLayout = (ClippableRoundedCornerLayout) view;
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(clippableRoundedCornerLayout.getCornerRadius(), hVar.c());
                valueAnimatorOfFloat.addUpdateListener(new Y(1, clippableRoundedCornerLayout));
                animatorSetB.playTogether(valueAnimatorOfFloat);
            }
            animatorSetB.setDuration(hVar.f4370e);
            animatorSetB.start();
            hVar.f4379i = 0.0f;
            hVar.j = null;
            hVar.f4380k = null;
        }
        AnimatorSet animatorSet = this.f6761n;
        if (animatorSet != null) {
            animatorSet.reverse();
        }
        this.f6761n = null;
    }

    public final void d() {
        long totalDuration = l().getTotalDuration();
        SearchBar searchBar = this.f6762o;
        J7.h hVar = this.f6760m;
        AnimatorSet animatorSetB = hVar.b(searchBar);
        animatorSetB.setDuration(totalDuration);
        animatorSetB.start();
        hVar.f4379i = 0.0f;
        hVar.j = null;
        hVar.f4380k = null;
        if (this.f6761n != null) {
            e(false).start();
            this.f6761n.resume();
        }
        this.f6761n = null;
    }

    public final AnimatorSet e(boolean z10) {
        AnimatorSet animatorSet = new AnimatorSet();
        MaterialToolbar materialToolbar = this.f6755f;
        ImageButton imageButtonJ = H.j(materialToolbar);
        if (imageButtonJ != null) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(h(imageButtonJ), 0.0f);
            valueAnimatorOfFloat.addUpdateListener(new C0236j(new A8.c(10), imageButtonJ));
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(i(), 0.0f);
            valueAnimatorOfFloat2.addUpdateListener(C0236j.a(imageButtonJ));
            animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        }
        ActionMenuView actionMenuViewH = H.h(materialToolbar);
        if (actionMenuViewH != null) {
            ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(g(actionMenuViewH), 0.0f);
            valueAnimatorOfFloat3.addUpdateListener(new C0236j(new A8.c(10), actionMenuViewH));
            ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(i(), 0.0f);
            valueAnimatorOfFloat4.addUpdateListener(C0236j.a(actionMenuViewH));
            animatorSet.playTogether(valueAnimatorOfFloat3, valueAnimatorOfFloat4);
        }
        animatorSet.setDuration(z10 ? 300L : 250L);
        animatorSet.setInterpolator(z.a(z10, p137n7.a.f20016b));
        return animatorSet;
    }

    public final AnimatorSet f(boolean z10) {
        AnimatorSet animatorSet = new AnimatorSet();
        if (this.f6761n == null) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            b(animatorSet2);
            animatorSet2.setDuration(z10 ? 300L : 250L);
            animatorSet2.setInterpolator(z.a(z10, p137n7.a.f20016b));
            animatorSet.playTogether(animatorSet2, e(z10));
        }
        TimeInterpolator timeInterpolator = z10 ? p137n7.a.f20015a : p137n7.a.f20016b;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(z10 ? 300L : 250L);
        valueAnimatorOfFloat.setInterpolator(z.a(z10, timeInterpolator));
        valueAnimatorOfFloat.addUpdateListener(new C0236j(new A8.c(13), this.f6751b));
        J7.h hVar = this.f6760m;
        Rect rect = hVar.j;
        Rect rectB = hVar.f4380k;
        SearchView searchView = this.f6750a;
        if (rect == null) {
            rect = new Rect(searchView.getLeft(), searchView.getTop(), searchView.getRight(), searchView.getBottom());
        }
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = this.f6752c;
        if (rectB == null) {
            rectB = H.b(clippableRoundedCornerLayout, this.f6762o);
        }
        final Rect rect2 = new Rect(rectB);
        final float cornerSize = this.f6762o.getCornerSize();
        final float fMax = Math.max(clippableRoundedCornerLayout.getCornerRadius(), hVar.c());
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new p(rect2), rectB, rect);
        valueAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: P7.k
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                n nVar = this.f6742a;
                nVar.getClass();
                float fA = p137n7.a.a(cornerSize, fMax, valueAnimator.getAnimatedFraction());
                ClippableRoundedCornerLayout clippableRoundedCornerLayout2 = nVar.f6752c;
                clippableRoundedCornerLayout2.getClass();
                Rect rect3 = rect2;
                clippableRoundedCornerLayout2.a(rect3.left, rect3.top, rect3.right, rect3.bottom, fA);
            }
        });
        valueAnimatorOfObject.setDuration(z10 ? 300L : 250L);
        p076h2.a aVar = p137n7.a.f20016b;
        valueAnimatorOfObject.setInterpolator(z.a(z10, aVar));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setDuration(z10 ? 50L : 42L);
        valueAnimatorOfFloat2.setStartDelay(z10 ? 250L : 0L);
        LinearInterpolator linearInterpolator = p137n7.a.f20015a;
        valueAnimatorOfFloat2.setInterpolator(z.a(z10, linearInterpolator));
        valueAnimatorOfFloat2.addUpdateListener(new C0236j(new A8.c(13), this.j));
        AnimatorSet animatorSet3 = new AnimatorSet();
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat3.setDuration(z10 ? 150L : 83L);
        valueAnimatorOfFloat3.setStartDelay(z10 ? 75L : 0L);
        valueAnimatorOfFloat3.setInterpolator(z.a(z10, linearInterpolator));
        View view = this.f6758k;
        TouchObserverFrameLayout touchObserverFrameLayout = this.f6759l;
        valueAnimatorOfFloat3.addUpdateListener(new C0236j(new A8.c(13), view, touchObserverFrameLayout));
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat((touchObserverFrameLayout.getHeight() * 0.050000012f) / 2.0f, 0.0f);
        valueAnimatorOfFloat4.setDuration(z10 ? 300L : 250L);
        valueAnimatorOfFloat4.setInterpolator(z.a(z10, aVar));
        valueAnimatorOfFloat4.addUpdateListener(C0236j.a(view));
        ValueAnimator valueAnimatorOfFloat5 = ValueAnimator.ofFloat(0.95f, 1.0f);
        valueAnimatorOfFloat5.setDuration(z10 ? 300L : 250L);
        valueAnimatorOfFloat5.setInterpolator(z.a(z10, aVar));
        valueAnimatorOfFloat5.addUpdateListener(new C0236j(new A8.c(12), touchObserverFrameLayout));
        animatorSet3.playTogether(valueAnimatorOfFloat3, valueAnimatorOfFloat4, valueAnimatorOfFloat5);
        Animator animatorK = k(z10, false, this.f6753d);
        Toolbar toolbar = this.g;
        Animator animatorK2 = k(z10, false, toolbar);
        ValueAnimator valueAnimatorOfFloat6 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat6.setDuration(z10 ? 300L : 250L);
        valueAnimatorOfFloat6.setInterpolator(z.a(z10, aVar));
        if (searchView.f15145N) {
            valueAnimatorOfFloat6.addUpdateListener(new C0233g(H.h(toolbar), H.h(this.f6755f)));
        }
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfObject, valueAnimatorOfFloat2, animatorSet3, animatorK, animatorK2, valueAnimatorOfFloat6, k(z10, true, this.f6757i), k(z10, true, this.f6756h));
        animatorSet.addListener(new C0149x(this, z10));
        return animatorSet;
    }

    public final int g(View view) {
        int marginEnd = ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).getMarginEnd();
        return H.l(this.f6762o) ? this.f6762o.getLeft() - marginEnd : (this.f6762o.getRight() - this.f6750a.getWidth()) + marginEnd;
    }

    public final int h(View view) {
        int marginStart = ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).getMarginStart();
        SearchBar searchBar = this.f6762o;
        WeakHashMap weakHashMap = S.f3689a;
        int paddingStart = searchBar.getPaddingStart();
        return H.l(this.f6762o) ? ((this.f6762o.getWidth() - this.f6762o.getRight()) + marginStart) - paddingStart : (this.f6762o.getLeft() - marginStart) + paddingStart;
    }

    public final int i() {
        FrameLayout frameLayout = this.f6754e;
        return ((this.f6762o.getBottom() + this.f6762o.getTop()) / 2) - ((frameLayout.getBottom() + frameLayout.getTop()) / 2);
    }

    public final AnimatorSet j(boolean z10) {
        AnimatorSet animatorSet = new AnimatorSet();
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = this.f6752c;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(clippableRoundedCornerLayout.getHeight(), 0.0f);
        valueAnimatorOfFloat.addUpdateListener(C0236j.a(clippableRoundedCornerLayout));
        animatorSet.playTogether(valueAnimatorOfFloat);
        b(animatorSet);
        animatorSet.setInterpolator(z.a(z10, p137n7.a.f20016b));
        animatorSet.setDuration(z10 ? 350L : 300L);
        return animatorSet;
    }

    public final AnimatorSet k(boolean z10, boolean z11, View view) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(z11 ? h(view) : g(view), 0.0f);
        valueAnimatorOfFloat.addUpdateListener(new C0236j(new A8.c(10), view));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(i(), 0.0f);
        valueAnimatorOfFloat2.addUpdateListener(C0236j.a(view));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        animatorSet.setDuration(z10 ? 300L : 250L);
        animatorSet.setInterpolator(z.a(z10, p137n7.a.f20016b));
        return animatorSet;
    }

    public final AnimatorSet l() {
        SearchBar searchBar = this.f6762o;
        SearchView searchView = this.f6750a;
        if (searchBar != null) {
            if (searchView.g()) {
                searchView.f();
            }
            AnimatorSet animatorSetF = f(false);
            animatorSetF.addListener(new m(this, 1));
            animatorSetF.start();
            return animatorSetF;
        }
        if (searchView.g()) {
            searchView.f();
        }
        AnimatorSet animatorSetJ = j(false);
        animatorSetJ.addListener(new m(this, 3));
        animatorSetJ.start();
        return animatorSetJ;
    }

    public final void m(C0776a c0776a) {
        float f3 = c0776a.f13367c;
        if (f3 <= 0.0f) {
            return;
        }
        SearchBar searchBar = this.f6762o;
        float cornerSize = searchBar.getCornerSize();
        J7.h hVar = this.f6760m;
        if (hVar.f4371f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        C0776a c0776a2 = hVar.f4371f;
        hVar.f4371f = c0776a;
        if (c0776a2 != null) {
            if (searchBar.getVisibility() != 4) {
                searchBar.setVisibility(4);
            }
            boolean z10 = c0776a.f13368d == 0;
            float f7 = c0776a.f13366b;
            float f10 = hVar.g;
            float interpolation = hVar.f4366a.getInterpolation(f3);
            View view = hVar.f4367b;
            float width = view.getWidth();
            float height = view.getHeight();
            if (width > 0.0f && height > 0.0f) {
                float fA = p137n7.a.a(1.0f, 0.9f, interpolation);
                float fA2 = p137n7.a.a(0.0f, Math.max(0.0f, ((width - (0.9f * width)) / 2.0f) - f10), interpolation) * (z10 ? 1 : -1);
                float fMin = Math.min(Math.max(0.0f, ((height - (fA * height)) / 2.0f) - f10), hVar.f4378h);
                float f11 = f7 - hVar.f4379i;
                float fA3 = p137n7.a.a(0.0f, fMin, Math.abs(f11) / height) * Math.signum(f11);
                view.setScaleX(fA);
                view.setScaleY(fA);
                view.setTranslationX(fA2);
                view.setTranslationY(fA3);
                if (view instanceof ClippableRoundedCornerLayout) {
                    ClippableRoundedCornerLayout clippableRoundedCornerLayout = (ClippableRoundedCornerLayout) view;
                    clippableRoundedCornerLayout.a(clippableRoundedCornerLayout.getLeft(), clippableRoundedCornerLayout.getTop(), clippableRoundedCornerLayout.getRight(), clippableRoundedCornerLayout.getBottom(), p137n7.a.a(hVar.c(), cornerSize, interpolation));
                }
            }
        }
        AnimatorSet animatorSet = this.f6761n;
        if (animatorSet != null) {
            animatorSet.setCurrentPlayTime((long) (f3 * animatorSet.getDuration()));
            return;
        }
        SearchView searchView = this.f6750a;
        if (searchView.g()) {
            searchView.f();
        }
        if (searchView.f15144M) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            b(animatorSet2);
            animatorSet2.setDuration(250L);
            animatorSet2.setInterpolator(z.a(false, p137n7.a.f20016b));
            this.f6761n = animatorSet2;
            animatorSet2.start();
            this.f6761n.pause();
        }
    }
}
