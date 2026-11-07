package androidx.compose.animation;

import com.google.android.gms.internal.measurement.B1;
import l0.o;
import l0.r;
import p063g1.l;
import p223x.AbstractC1413d;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f11740a;

    static {
        long j = Integer.MIN_VALUE;
        f11740a = (j & 4294967295L) | (j << 32);
    }

    public static r a() {
        long j = 1;
        return B1.n(o.f19333a).b(new SizeAnimationModifierElement(AbstractC1413d.p(400.0f, 1, new l((j & 4294967295L) | (j << 32)))));
    }
}
