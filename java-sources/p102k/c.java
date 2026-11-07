package p102k;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;
import com.google.android.gms.internal.measurement.B1;

/* JADX INFO: loaded from: classes.dex */
public final class c extends B1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ObjectAnimator f18857d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f18858e;

    public c(AnimationDrawable animationDrawable, boolean z10, boolean z11) {
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        int i10 = z10 ? numberOfFrames - 1 : 0;
        int i11 = z10 ? 0 : numberOfFrames - 1;
        d dVar = new d();
        int numberOfFrames2 = animationDrawable.getNumberOfFrames();
        dVar.f18860b = numberOfFrames2;
        int[] iArr = dVar.f18859a;
        if (iArr == null || iArr.length < numberOfFrames2) {
            dVar.f18859a = new int[numberOfFrames2];
        }
        int[] iArr2 = dVar.f18859a;
        int i12 = 0;
        for (int i13 = 0; i13 < numberOfFrames2; i13++) {
            int duration = animationDrawable.getDuration(z10 ? (numberOfFrames2 - i13) - 1 : i13);
            iArr2[i13] = duration;
            i12 += duration;
        }
        dVar.f18861c = i12;
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i10, i11);
        objectAnimatorOfInt.setAutoCancel(true);
        objectAnimatorOfInt.setDuration(dVar.f18861c);
        objectAnimatorOfInt.setInterpolator(dVar);
        this.f18858e = z11;
        this.f18857d = objectAnimatorOfInt;
    }

    @Override // com.google.android.gms.internal.measurement.B1
    public final void H() {
        this.f18857d.reverse();
    }

    @Override // com.google.android.gms.internal.measurement.B1
    public final void J() {
        this.f18857d.start();
    }

    @Override // com.google.android.gms.internal.measurement.B1
    public final void K() {
        this.f18857d.cancel();
    }

    @Override // com.google.android.gms.internal.measurement.B1
    public final boolean i() {
        return this.f18858e;
    }
}
