package p056f2;

import I1.ViewTreeObserverOnPreDrawListenerC0266t;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* JADX INFO: renamed from: f2.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0950x extends AnimationSet implements Runnable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ViewGroup f16177r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final View f16178s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f16179t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f16180u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f16181v;

    public RunnableC0950x(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f16181v = true;
        this.f16177r = viewGroup;
        this.f16178s = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation) {
        this.f16181v = true;
        if (this.f16179t) {
            return !this.f16180u;
        }
        if (!super.getTransformation(j, transformation)) {
            this.f16179t = true;
            ViewTreeObserverOnPreDrawListenerC0266t.a(this.f16177r, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10 = this.f16179t;
        ViewGroup viewGroup = this.f16177r;
        if (z10 || !this.f16181v) {
            viewGroup.endViewTransition(this.f16178s);
            this.f16180u = true;
        } else {
            this.f16181v = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation, float f3) {
        this.f16181v = true;
        if (this.f16179t) {
            return !this.f16180u;
        }
        if (!super.getTransformation(j, transformation, f3)) {
            this.f16179t = true;
            ViewTreeObserverOnPreDrawListenerC0266t.a(this.f16177r, this);
        }
        return true;
    }
}
