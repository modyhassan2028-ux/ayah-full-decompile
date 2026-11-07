package p142o1;

import android.support.v4.media.session.p;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Comparable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public h f20241r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g f20242s;

    public f(g gVar) {
        this.f20242s = gVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f20241r.f20247b - ((h) obj).f20247b;
    }

    public final String toString() {
        String string = "[ ";
        if (this.f20241r != null) {
            for (int i10 = 0; i10 < 9; i10++) {
                StringBuilder sbC = p.C(string);
                sbC.append(this.f20241r.f20252h[i10]);
                sbC.append(" ");
                string = sbC.toString();
            }
        }
        return string + "] " + this.f20241r;
    }
}
