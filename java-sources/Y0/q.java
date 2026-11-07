package Y0;

import android.graphics.Typeface;

/* JADX INFO: loaded from: classes.dex */
public final class q implements p {
    public static Typeface c(String str, l lVar, int i10) {
        if (i10 == 0 && p251z9.j.a(lVar, l.f10359t) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), lVar.f10364r, i10 == 1);
    }

    @Override // Y0.p
    public final Typeface a(n nVar, l lVar, int i10) {
        nVar.getClass();
        return c("sans-serif", lVar, i10);
    }

    @Override // Y0.p
    public final Typeface b(l lVar, int i10) {
        return c(null, lVar, i10);
    }
}
