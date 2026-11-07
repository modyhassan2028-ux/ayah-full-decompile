package V0;

import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;

/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f8399a = new q();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f8400b;

    static {
        long j = 0;
        f8400b = (j & 4294967295L) | (j << 32);
    }

    public static final TextDirectionHeuristic a(int i10) {
        if (i10 == 0) {
            return TextDirectionHeuristics.LTR;
        }
        if (i10 == 1) {
            return TextDirectionHeuristics.RTL;
        }
        if (i10 == 2) {
            return TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
        if (i10 == 3) {
            return TextDirectionHeuristics.FIRSTSTRONG_RTL;
        }
        if (i10 != 4) {
            return i10 != 5 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.LOCALE;
        }
        return TextDirectionHeuristics.ANYRTL_LTR;
    }
}
