package A;

import H0.InterfaceC0219s;
import Z.C0709z;
import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.List;
import p232y.C1460n;

/* JADX INFO: loaded from: classes.dex */
public final class U0 extends p251z9.k implements p241y9.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f150r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Z.X f151s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ U0(Z.X x9, int i10) {
        super(1);
        this.f150r = i10;
        this.f151s = x9;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        int i10 = this.f150r;
        p110k9.y yVar = p110k9.y.f19095a;
        Z.X x9 = this.f151s;
        switch (i10) {
            case 0:
                return (Float) ((p241y9.c) x9.getValue()).e(Float.valueOf(((Number) obj).floatValue()));
            case 1:
                InterfaceC0219s interfaceC0219s = (InterfaceC0219s) obj;
                p251z9.j.e(interfaceC0219s, "it");
                x9.setValue(new p171r0.c(interfaceC0219s.G(0L)));
                return yVar;
            case 2:
                N.f fVar = (N.f) obj;
                x9.setValue(fVar.f5929c ? fVar.f5928b : fVar.f5927a);
                return yVar;
            case 3:
                List list = (List) obj;
                if (x9 != null) {
                    x9.setValue(list);
                }
                return yVar;
            case 4:
                ((p241y9.c) x9.getValue()).e(new p171r0.c(((p171r0.c) obj).f21387a));
                return yVar;
            case 5:
                Configuration configuration = new Configuration((Configuration) obj);
                C0709z c0709z = AndroidCompositionLocals_androidKt.f12062a;
                x9.setValue(configuration);
                return yVar;
            case 6:
                J0.K k7 = (J0.K) obj;
                k7.a();
                float fW = k7.w(((C1460n) x9.getValue()).f24574a);
                p196u0.b bVar = k7.f3942r;
                float fB = p171r0.i.b(bVar.f22795s.v()) - (fW / 2);
                p123m2.c.g(k7, ((C1460n) x9.getValue()).f24575b, p171r0.d.a(0.0f, fB), p171r0.d.a(p171r0.i.d(bVar.f22795s.v()), fB), fW, 0.0f, 496);
                return yVar;
            default:
                InterfaceC0219s interfaceC0219s2 = (InterfaceC0219s) obj;
                p251z9.j.e(interfaceC0219s2, "it");
                x9.setValue(new ia.a((int) (interfaceC0219s2.F() >> 32), (int) (interfaceC0219s2.F() & 4294967295L)));
                return yVar;
        }
    }
}
