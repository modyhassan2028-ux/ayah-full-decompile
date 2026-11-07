package N4;

import Z.C0672b;
import Z.C0698o;
import com.google.android.gms.internal.measurement.AbstractC0813f2;
import java.text.NumberFormat;
import l0.r;
import p110k9.y;
import p124m3.h;
import p241y9.e;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f6011r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f6012s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ r f6013t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f6014u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ NumberFormat f6015v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f6016w;

    public /* synthetic */ b(Object obj, String str, r rVar, boolean z10, NumberFormat numberFormat, int i10, int i11) {
        this.f6011r = i11;
        this.f6016w = obj;
        this.f6012s = str;
        this.f6013t = rVar;
        this.f6014u = z10;
        this.f6015v = numberFormat;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f6011r) {
            case 0:
                ((Integer) obj2).getClass();
                int iY = C0672b.y(1);
                AbstractC0813f2.i((h) this.f6016w, this.f6012s, this.f6013t, this.f6014u, this.f6015v, (C0698o) obj, iY);
                break;
            default:
                ((Integer) obj2).getClass();
                int iY2 = C0672b.y(1);
                p050e8.b.e((p124m3.a) this.f6016w, this.f6012s, this.f6013t, this.f6014u, this.f6015v, (C0698o) obj, iY2);
                break;
        }
        return y.f19095a;
    }
}
