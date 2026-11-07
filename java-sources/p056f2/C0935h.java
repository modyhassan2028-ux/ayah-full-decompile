package p056f2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.v4.media.session.p;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import p251z9.j;

/* JADX INFO: renamed from: f2.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0935h extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f16095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f16096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f16097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ X f16098d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0936i f16099e;

    public C0935h(ViewGroup viewGroup, View view, boolean z10, X x9, C0936i c0936i) {
        this.f16095a = viewGroup;
        this.f16096b = view;
        this.f16097c = z10;
        this.f16098d = x9;
        this.f16099e = c0936i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        j.e(animator, "anim");
        ViewGroup viewGroup = this.f16095a;
        View view = this.f16096b;
        viewGroup.endViewTransition(view);
        boolean z10 = this.f16097c;
        X x9 = this.f16098d;
        if (z10) {
            int i10 = x9.f16039a;
            j.d(view, "viewToAnimate");
            p.j(i10, view, viewGroup);
        }
        C0936i c0936i = this.f16099e;
        ((X) c0936i.f16100c.f16104r).c(c0936i);
        if (K.K(2)) {
            Log.v("FragmentManager", "Animator from operation " + x9 + " has ended.");
        }
    }
}
