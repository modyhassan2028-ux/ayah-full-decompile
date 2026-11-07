package B0;

import android.view.KeyEvent;
import l0.q;

/* JADX INFO: loaded from: classes.dex */
public final class e extends q implements d {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public p241y9.c f589F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public p241y9.c f590G;

    @Override // B0.d
    public final boolean F(KeyEvent keyEvent) {
        p241y9.c cVar = this.f589F;
        if (cVar != null) {
            return ((Boolean) cVar.e(new b(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // B0.d
    public final boolean l(KeyEvent keyEvent) {
        p241y9.c cVar = this.f590G;
        if (cVar != null) {
            return ((Boolean) cVar.e(new b(keyEvent))).booleanValue();
        }
        return false;
    }
}
