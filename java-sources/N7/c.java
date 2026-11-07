package N7;

import android.graphics.Typeface;

/* JADX INFO: loaded from: classes.dex */
public final class c extends p244z1.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ B0.c f6052h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e f6053i;

    public c(e eVar, B0.c cVar) {
        this.f6053i = eVar;
        this.f6052h = cVar;
    }

    @Override // p244z1.a
    public final void j(int i10) {
        this.f6053i.f6067m = true;
        this.f6052h.W(i10);
    }

    @Override // p244z1.a
    public final void k(Typeface typeface) {
        e eVar = this.f6053i;
        eVar.f6068n = Typeface.create(typeface, eVar.f6059c);
        eVar.f6067m = true;
        this.f6052h.X(eVar.f6068n, false);
    }
}
