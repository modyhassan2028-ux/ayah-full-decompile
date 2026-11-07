package O4;

import E2.AbstractC0115c0;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f6473r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ AbstractC0115c0 f6474s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f6475t;

    public /* synthetic */ a(AbstractC0115c0 abstractC0115c0, Object obj, int i10) {
        this.f6473r = i10;
        this.f6474s = abstractC0115c0;
        this.f6475t = obj;
    }

    /* JADX WARN: Type inference failed for: r3v10, types: [y9.e, z9.h] */
    /* JADX WARN: Type inference failed for: r3v4, types: [y9.e, z9.h] */
    /* JADX WARN: Type inference failed for: r3v7, types: [y9.e, z9.h] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f6473r) {
            case 0:
                b bVar = (b) this.f6474s;
                J4.a aVar = (J4.a) this.f6475t;
                ?? r10 = bVar.f6480w;
                p124m3.g gVar = aVar.f4323a;
                r10.invoke(Integer.valueOf(gVar.f19573h), Integer.valueOf(gVar.f19574i));
                break;
            case 1:
                b bVar2 = (b) this.f6474s;
                p124m3.a aVar2 = (p124m3.a) this.f6475t;
                bVar2.f6479v.invoke(Integer.valueOf(aVar2.f19528b), Integer.valueOf(aVar2.a().f19541b));
                break;
            case 2:
                b bVar3 = (b) this.f6474s;
                p124m3.h hVar = (p124m3.h) this.f6475t;
                bVar3.f6479v.invoke(Integer.valueOf(hVar.g.f19585a), Integer.valueOf(hVar.g.c()));
                break;
            default:
                ((Z5.b) this.f6474s).f11010y.e(((p007a6.c) this.f6475t).f11208b.f19987a);
                break;
        }
    }
}
