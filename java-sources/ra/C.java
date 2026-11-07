package ra;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class C extends IOException {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final EnumC1290b f21640r;

    public C(EnumC1290b enumC1290b) {
        super("stream was reset: " + enumC1290b);
        this.f21640r = enumC1290b;
    }
}
