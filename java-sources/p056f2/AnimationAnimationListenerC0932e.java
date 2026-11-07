package p056f2;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import p013b2.l;
import p251z9.j;

/* JADX INFO: renamed from: f2.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class AnimationAnimationListenerC0932e implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ X f16087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f16088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f16089c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0933f f16090d;

    public AnimationAnimationListenerC0932e(X x9, ViewGroup viewGroup, View view, C0933f c0933f) {
        this.f16087a = x9;
        this.f16088b = viewGroup;
        this.f16089c = view;
        this.f16090d = c0933f;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        j.e(animation, "animation");
        ViewGroup viewGroup = this.f16088b;
        viewGroup.post(new l(viewGroup, this.f16089c, this.f16090d, 1));
        if (K.K(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f16087a + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        j.e(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        j.e(animation, "animation");
        if (K.K(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f16087a + " has reached onAnimationStart.");
        }
    }
}
