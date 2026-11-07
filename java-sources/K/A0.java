package K;

/* JADX INFO: loaded from: classes.dex */
public final class A0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public M.k f4434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public M.k f4435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4436c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Long f4437d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f4438e;

    /* JADX WARN: Code duplicated, block: B:34:0x0071  */
    public final void a(Z0.y yVar) {
        M.k kVar;
        Z0.y yVar2;
        this.f4438e = false;
        M.k kVar2 = this.f4434a;
        if (p251z9.j.a(yVar, kVar2 != null ? (Z0.y) kVar2.f5619t : null)) {
            return;
        }
        String str = yVar.f10953a.f8060s;
        M.k kVar3 = this.f4434a;
        if (p251z9.j.a(str, (kVar3 == null || (yVar2 = (Z0.y) kVar3.f5619t) == null) ? null : yVar2.f10953a.f8060s)) {
            M.k kVar4 = this.f4434a;
            if (kVar4 == null) {
                return;
            }
            kVar4.f5619t = yVar;
            return;
        }
        this.f4434a = new M.k(27, this.f4434a, yVar);
        this.f4435b = null;
        int length = yVar.f10953a.f8060s.length() + this.f4436c;
        this.f4436c = length;
        if (length > 100000) {
            M.k kVar5 = this.f4434a;
            if ((kVar5 != null ? (M.k) kVar5.f5618s : null) == null) {
                return;
            }
            while (true) {
                if (kVar5 == null) {
                    kVar = null;
                } else {
                    M.k kVar6 = (M.k) kVar5.f5618s;
                    if (kVar6 != null) {
                        kVar = (M.k) kVar6.f5618s;
                    } else {
                        kVar = null;
                    }
                }
                if (kVar == null) {
                    break;
                } else {
                    kVar5 = (M.k) kVar5.f5618s;
                }
            }
            if (kVar5 == null) {
                return;
            }
            kVar5.f5618s = null;
        }
    }
}
