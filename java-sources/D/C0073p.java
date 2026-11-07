package D;

import java.util.List;

/* JADX INFO: renamed from: D.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0073p extends p251z9.k implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ H0.U[] f1011r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ List f1012s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ H0.K f1013t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ p251z9.t f1014u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ p251z9.t f1015v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C0074q f1016w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0073p(H0.U[] uArr, List list, H0.K k7, p251z9.t tVar, p251z9.t tVar2, C0074q c0074q) {
        super(1);
        this.f1011r = uArr;
        this.f1012s = list;
        this.f1013t = k7;
        this.f1014u = tVar;
        this.f1015v = tVar2;
        this.f1016w = c0074q;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        H0.T t2 = (H0.T) obj;
        H0.U[] uArr = this.f1011r;
        int length = uArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i11 < length) {
            int i12 = i10;
            H0.U u8 = uArr[i11];
            p251z9.j.c(u8, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
            AbstractC0071n.b(t2, u8, (H0.H) this.f1012s.get(i12), this.f1013t.getLayoutDirection(), this.f1014u.f24884r, this.f1015v.f24884r, this.f1016w.f1017a);
            i11++;
            i10 = i12 + 1;
        }
        return p110k9.y.f19095a;
    }
}
