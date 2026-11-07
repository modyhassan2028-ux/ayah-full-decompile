package G;

import K9.AbstractC0405x;

/* JADX INFO: loaded from: classes.dex */
public final class U extends p251z9.k implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f2633r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ W f2634s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ U(W w9, int i10) {
        super(1);
        this.f2633r = i10;
        this.f2634s = w9;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        switch (this.f2633r) {
            case 0:
                F.i iVar = (F.i) this.f2634s.f2639F.invoke();
                int iB = iVar.b();
                int i10 = 0;
                while (i10 < iB) {
                    if (iVar.c(i10).equals(obj)) {
                        return Integer.valueOf(i10);
                    }
                    i10++;
                }
                i10 = -1;
                return Integer.valueOf(i10);
            default:
                int iIntValue = ((Number) obj).intValue();
                W w9 = this.f2634s;
                F.i iVar2 = (F.i) w9.f2639F.invoke();
                if (iIntValue < 0 || iIntValue >= iVar2.b()) {
                    StringBuilder sbW = p123m2.c.w(iIntValue, "Can't scroll to index ", ", it is out of bounds [0, ");
                    sbW.append(iVar2.b());
                    sbW.append(')');
                    C.a.a(sbW.toString());
                }
                AbstractC0405x.x(w9.h0(), null, new V(iIntValue, 0, w9, null), 3);
                return Boolean.TRUE;
        }
    }
}
