package W4;

import Z.C0672b;
import Z.C0698o;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.List;
import l0.r;
import org.xmlpull.v1.XmlPullParserException;
import p017b7.g;
import p110k9.y;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements p241y9.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f9620r = 1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f9621s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f9622t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f9623u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ p110k9.e f9624v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p110k9.e f9625w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f9626x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f9627y;

    public /* synthetic */ e(int i10, List list, p241y9.c cVar, p241y9.a aVar, p241y9.c cVar2, p241y9.a aVar2, int i11) {
        this.f9621s = i10;
        this.f9623u = list;
        this.f9624v = cVar;
        this.f9625w = aVar;
        this.f9626x = cVar2;
        this.f9627y = aVar2;
        this.f9622t = i11;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) throws XmlPullParserException, IOException {
        switch (this.f9620r) {
            case 0:
                ((Integer) obj2).getClass();
                g.D((p095j3.c) this.f9623u, (p241y9.e) this.f9624v, (r) this.f9626x, (p241y9.e) this.f9625w, (NumberFormat) this.f9627y, (C0698o) obj, C0672b.y(this.f9621s | 1), this.f9622t);
                break;
            default:
                ((Integer) obj2).getClass();
                p191t5.a.a(this.f9621s, (List) this.f9623u, (p241y9.c) this.f9624v, (p241y9.a) this.f9625w, (p241y9.c) this.f9626x, (p241y9.a) this.f9627y, (C0698o) obj, C0672b.y(this.f9622t | 1));
                break;
        }
        return y.f19095a;
    }

    public /* synthetic */ e(p095j3.c cVar, p241y9.e eVar, r rVar, p241y9.e eVar2, NumberFormat numberFormat, int i10, int i11) {
        this.f9623u = cVar;
        this.f9624v = eVar;
        this.f9626x = rVar;
        this.f9625w = eVar2;
        this.f9627y = numberFormat;
        this.f9621s = i10;
        this.f9622t = i11;
    }
}
