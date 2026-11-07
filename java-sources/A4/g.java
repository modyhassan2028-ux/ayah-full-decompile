package A4;

import E4.u;
import Z.X;
import com.ayah.feature.audioconfig.AudioConfigWrapper;
import p110k9.y;
import p162q0.s;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f521r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ X f522s;

    public /* synthetic */ g(X x9, int i10) {
        this.f521r = i10;
        this.f522s = x9;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        int i10 = this.f521r;
        y yVar = y.f19095a;
        X x9 = this.f522s;
        switch (i10) {
            case 0:
                B4.b bVar = (B4.b) obj;
                int i11 = AudioConfigWrapper.f13759u;
                p251z9.j.e(bVar, "it");
                x9.setValue(bVar);
                break;
            case 1:
                p251z9.j.e((z3.k) obj, "it");
                x9.setValue(Boolean.TRUE);
                break;
            case 2:
                u uVar = (u) obj;
                p251z9.j.e(uVar, "it");
                x9.setValue(uVar);
                break;
            case 3:
                s sVar = (s) obj;
                p251z9.j.e(sVar, "focusState");
                if (sVar.a()) {
                    Z0.y yVar2 = (Z0.y) x9.getValue();
                    x9.setValue(Z0.y.a(yVar2, null, va.g.e(0, yVar2.f10953a.f8060s.length()), 5));
                }
                break;
            default:
                Z0.y yVar3 = (Z0.y) obj;
                p251z9.j.e(yVar3, "it");
                x9.setValue(yVar3);
                break;
        }
        return yVar;
    }
}
