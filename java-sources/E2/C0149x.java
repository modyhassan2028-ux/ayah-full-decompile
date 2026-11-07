package E2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.appcompat.widget.ScrollingTabContainerView;
import com.google.android.material.internal.ClippableRoundedCornerLayout;

/* JADX INFO: renamed from: E2.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0149x extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1792c;

    public /* synthetic */ C0149x(int i10, Object obj) {
        this.f1790a = i10;
        this.f1792c = obj;
        this.f1791b = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f1790a) {
            case 0:
                this.f1791b = true;
                break;
            case 1:
                this.f1791b = true;
                break;
            case 2:
            case 3:
            default:
                super.onAnimationCancel(animator);
                break;
            case 4:
                this.f1791b = true;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f1790a) {
            case 0:
                C0151z c0151z = (C0151z) this.f1792c;
                if (this.f1791b) {
                    this.f1791b = false;
                } else if (((Float) c0151z.f1824z.getAnimatedValue()).floatValue() != 0.0f) {
                    c0151z.f1799A = 2;
                    c0151z.f1817s.invalidate();
                } else {
                    c0151z.f1799A = 0;
                    c0151z.l(0);
                }
                break;
            case 1:
                P4.a aVar = (P4.a) this.f1792c;
                if (this.f1791b) {
                    this.f1791b = false;
                } else if (((Float) aVar.f6670z.getAnimatedValue()).floatValue() != 0.0f) {
                    aVar.f6645A = 2;
                    aVar.f6663s.invalidate();
                } else {
                    aVar.f6645A = 0;
                    aVar.l(0);
                }
                break;
            case 2:
                P7.n nVar = (P7.n) this.f1792c;
                P7.n.a(nVar, this.f1791b ? 1.0f : 0.0f);
                ClippableRoundedCornerLayout clippableRoundedCornerLayout = nVar.f6752c;
                clippableRoundedCornerLayout.f14969r = null;
                clippableRoundedCornerLayout.f14970s = 0.0f;
                clippableRoundedCornerLayout.invalidate();
                break;
            case 3:
                if (!this.f1791b) {
                    ((View) this.f1792c).setVisibility(4);
                }
                break;
            default:
                ScrollingTabContainerView scrollingTabContainerView = (ScrollingTabContainerView) this.f1792c;
                if (!this.f1791b) {
                    scrollingTabContainerView.setVisibility(0);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f1790a) {
            case 2:
                P7.n.a((P7.n) this.f1792c, this.f1791b ? 0.0f : 1.0f);
                break;
            case 3:
                if (this.f1791b) {
                    ((View) this.f1792c).setVisibility(0);
                }
                break;
            case 4:
                ((ScrollingTabContainerView) this.f1792c).setVisibility(0);
                this.f1791b = false;
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public C0149x(View view, boolean z10) {
        this.f1790a = 3;
        this.f1791b = z10;
        this.f1792c = view;
    }

    public C0149x(P7.n nVar, boolean z10) {
        this.f1790a = 2;
        this.f1792c = nVar;
        this.f1791b = z10;
    }
}
