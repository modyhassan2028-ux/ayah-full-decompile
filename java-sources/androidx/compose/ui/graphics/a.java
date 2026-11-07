package androidx.compose.ui.graphics;

import l0.r;
import p180s0.F;
import p180s0.J;
import p180s0.M;
import p180s0.w;
import p241y9.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final r a(r rVar, c cVar) {
        return rVar.b(new BlockGraphicsLayerElement(cVar));
    }

    public static r b(r rVar, float f3, float f7, float f10, float f11, float f12, J j, boolean z10, int i10) {
        float f13 = (i10 & 1) != 0 ? 1.0f : f3;
        float f14 = (i10 & 2) != 0 ? 1.0f : f7;
        float f15 = (i10 & 4) != 0 ? 1.0f : f10;
        float f16 = (i10 & 32) != 0 ? 0.0f : f11;
        float f17 = (i10 & 256) != 0 ? 0.0f : f12;
        long j10 = M.f21814b;
        J j11 = (i10 & 2048) != 0 ? F.f21774a : j;
        boolean z11 = (i10 & 4096) != 0 ? false : z10;
        long j12 = w.f21849a;
        return rVar.b(new GraphicsLayerElement(f13, f14, f15, f16, f17, j10, j11, z11, j12, j12));
    }
}
