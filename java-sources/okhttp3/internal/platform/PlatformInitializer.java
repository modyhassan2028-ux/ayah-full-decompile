package okhttp3.internal.platform;

import U2.b;
import android.content.Context;
import java.util.List;
import p120l9.r;
import p251z9.j;
import ua.d;
import ua.e;

/* JADX INFO: loaded from: classes.dex */
public final class PlatformInitializer implements b {
    @Override // U2.b
    public final List a() {
        return r.f19440r;
    }

    @Override // U2.b
    public final Object b(Context context) {
        j.e(context, "context");
        e eVar = e.f22996a;
        Object obj = e.f22996a;
        d dVar = obj != null ? (d) obj : null;
        if (dVar != null) {
            dVar.a(context);
        }
        return e.f22996a;
    }
}
