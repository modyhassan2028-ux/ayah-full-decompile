package p126m5;

import H2.j;
import Z.C0672b;
import Z.C0698o;
import com.ayah.feature.miniplayer.MiniPlayerWrapper;
import p110k9.y;
import p120l9.r;
import p136n5.b;
import p136n5.d;
import p157p5.c;
import p241y9.e;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f19618r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j f19619s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ MiniPlayerWrapper f19620t;

    public /* synthetic */ a(j jVar, MiniPlayerWrapper miniPlayerWrapper, int i10) {
        this.f19618r = i10;
        this.f19619s = jVar;
        this.f19620t = miniPlayerWrapper;
    }

    @Override // p241y9.e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f19618r;
        y yVar = y.f19095a;
        MiniPlayerWrapper miniPlayerWrapper = this.f19620t;
        int i11 = 1;
        switch (i10) {
            case 0:
                C0698o c0698o = (C0698o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i12 = MiniPlayerWrapper.f13811v;
                if (!c0698o.K(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c0698o.N();
                } else {
                    p005a4.e.a(false, p074h0.j.d(1401957562, new a(this.f19619s, miniPlayerWrapper, i11), c0698o), c0698o, 48);
                }
                break;
            default:
                C0698o c0698o2 = (C0698o) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i13 = MiniPlayerWrapper.f13811v;
                if (!c0698o2.K(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    c0698o2.N();
                } else {
                    c.e((d) C0672b.k(this.f19619s, new b(new p065g3.a("", false, "", (2046 & 8) != 0 ? "" : "محمد المنشاوي", (2046 & 16) != 0 ? "" : "Muhammad Al-Minshawi", null, null, null, null, "", r.f19440r)), null, c0698o2, 0, 2).getValue(), miniPlayerWrapper.getPlaybackControls(), c0698o2, 0);
                }
                break;
        }
        return yVar;
    }
}
