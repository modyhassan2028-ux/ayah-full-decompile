package p207v2;

import java.util.concurrent.CancellationException;
import p151p.C1256n;

/* JADX INFO: loaded from: classes.dex */
public final class f0 extends CancellationException {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C1256n f23232r;

    public f0(C1256n c1256n) {
        super("Cancelled isolated runner");
        this.f23232r = c1256n;
    }
}
