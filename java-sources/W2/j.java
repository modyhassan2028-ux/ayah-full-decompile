package W2;

import android.animation.Animator;
import android.animation.AnimatorSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {
    public static long a(Animator animator) {
        return animator.getTotalDuration();
    }

    public static void b(Animator animator, long j) {
        ((AnimatorSet) animator).setCurrentPlayTime(j);
    }
}
