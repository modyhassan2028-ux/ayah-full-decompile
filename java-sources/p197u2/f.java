package p197u2;

import p110k9.y;
import p120l9.k;
import p173r2.j;
import p241y9.c;
import p251z9.r;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ r f22842r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ r f22843s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ h f22844t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f22845u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ k f22846v;

    public /* synthetic */ f(r rVar, r rVar2, h hVar, boolean z10, k kVar) {
        this.f22842r = rVar;
        this.f22843s = rVar2;
        this.f22844t = hVar;
        this.f22845u = z10;
        this.f22846v = kVar;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        j jVar = (j) obj;
        p251z9.j.e(jVar, "entry");
        this.f22842r.f24882r = true;
        this.f22843s.f24882r = true;
        this.f22844t.n(jVar, this.f22845u, this.f22846v);
        return y.f19095a;
    }
}
