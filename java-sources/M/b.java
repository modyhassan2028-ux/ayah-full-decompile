package M;

import H0.InterfaceC0219s;
import p110k9.y;
import p180s0.A;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b extends p251z9.h implements p241y9.c {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ l f5591z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(l lVar) {
        super(1, p251z9.i.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
        this.f5591z = lVar;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        float[] fArr = ((A) obj).f21769a;
        InterfaceC0219s interfaceC0219s = (InterfaceC0219s) this.f5591z.f5623I.getValue();
        if (interfaceC0219s != null) {
            if (!interfaceC0219s.C()) {
                interfaceC0219s = null;
            }
            if (interfaceC0219s != null) {
                interfaceC0219s.D(fArr);
            }
        }
        return y.f19095a;
    }
}
