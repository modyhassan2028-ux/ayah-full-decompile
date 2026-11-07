package Y0;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class l implements Comparable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final l f10358s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final l f10359t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final l f10360u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final l f10361v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final l f10362w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final List f10363x;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f10364r;

    static {
        l lVar = new l(100);
        l lVar2 = new l(200);
        l lVar3 = new l(300);
        l lVar4 = new l(400);
        l lVar5 = new l(500);
        l lVar6 = new l(600);
        f10358s = lVar6;
        l lVar7 = new l(700);
        l lVar8 = new l(800);
        l lVar9 = new l(900);
        f10359t = lVar4;
        f10360u = lVar5;
        f10361v = lVar6;
        f10362w = lVar7;
        f10363x = p120l9.l.S(new l[]{lVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7, lVar8, lVar9});
    }

    public l(int i10) {
        this.f10364r = i10;
        boolean z10 = false;
        if (1 <= i10 && i10 < 1001) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        p002a1.a.a("Font weight can be in range [1, 1000]. Current value: " + i10);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return p251z9.j.f(this.f10364r, ((l) obj).f10364r);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            return this.f10364r == ((l) obj).f10364r;
        }
        return false;
    }

    public final int hashCode() {
        return this.f10364r;
    }

    public final String toString() {
        return android.support.v4.media.session.p.A(new StringBuilder("FontWeight(weight="), this.f10364r, ')');
    }
}
