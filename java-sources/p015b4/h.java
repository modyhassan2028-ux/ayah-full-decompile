package p015b4;

import Z.C0672b;
import Z.C0698o;
import java.io.IOException;
import l0.r;
import org.xmlpull.v1.XmlPullParserException;
import p074h0.d;
import p110k9.y;
import p241y9.a;
import p241y9.c;
import p241y9.e;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f13274r = 2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f13275s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f13276t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ p110k9.e f13277u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f13278v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f13279w;

    public /* synthetic */ h(int i10, c cVar, a aVar, a aVar2, int i11) {
        this.f13278v = i10;
        this.f13276t = cVar;
        this.f13275s = aVar;
        this.f13277u = aVar2;
        this.f13279w = i11;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) throws XmlPullParserException, IOException {
        switch (this.f13274r) {
            case 0:
                r rVar = (r) this.f13276t;
                String str = (String) this.f13275s;
                d dVar = (d) this.f13277u;
                ((Integer) obj2).getClass();
                f.f(C0672b.y(this.f13278v | 1), this.f13279w, (C0698o) obj, dVar, str, rVar);
                break;
            case 1:
                String str2 = (String) this.f13275s;
                r rVar2 = (r) this.f13276t;
                d dVar2 = (d) this.f13277u;
                ((Integer) obj2).getClass();
                f.i(C0672b.y(this.f13278v | 1), this.f13279w, (C0698o) obj, dVar2, str2, rVar2);
                break;
            default:
                ((Integer) obj2).getClass();
                p191t5.a.c(this.f13278v, (c) this.f13276t, (a) this.f13275s, (a) this.f13277u, (C0698o) obj, C0672b.y(this.f13279w | 1));
                break;
        }
        return y.f19095a;
    }

    public /* synthetic */ h(String str, r rVar, d dVar, int i10, int i11) {
        this.f13275s = str;
        this.f13276t = rVar;
        this.f13277u = dVar;
        this.f13278v = i10;
        this.f13279w = i11;
    }

    public /* synthetic */ h(r rVar, String str, d dVar, int i10, int i11) {
        this.f13276t = rVar;
        this.f13275s = str;
        this.f13277u = dVar;
        this.f13278v = i10;
        this.f13279w = i11;
    }
}
