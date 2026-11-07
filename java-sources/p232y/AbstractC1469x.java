package p232y;

import android.view.ViewConfiguration;

/* JADX INFO: renamed from: y.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1469x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f24595a = ViewConfiguration.getScrollFriction();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final double f24596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final double f24597c;

    static {
        double dLog = Math.log(0.78d) / Math.log(0.9d);
        f24596b = dLog;
        f24597c = dLog - 1.0d;
    }
}
