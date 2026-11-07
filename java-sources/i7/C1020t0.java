package i7;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: renamed from: i7.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1020t0 implements InterfaceC0965a1 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C1023u0 f17549r;

    public /* synthetic */ C1020t0(C1023u0 c1023u0) {
        this.f17549r = c1023u0;
    }

    public void a(String str, Bundle bundle) {
        String string;
        C1023u0 c1023u0 = this.f17549r;
        C1014r0 c1014r0 = c1023u0.f17585x;
        C0985h0 c0985h0 = c1023u0.f17583v;
        C1023u0.m(c1014r0);
        c1014r0.o();
        if (c1023u0.a()) {
            return;
        }
        if (bundle.isEmpty()) {
            string = null;
        } else {
            if (true == str.isEmpty()) {
                str = "auto";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            string = builder.build().toString();
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        C1023u0.k(c0985h0);
        c0985h0.f17397N.k(string);
        C0979f0 c0979f0 = c0985h0.f17398O;
        c1023u0.f17564B.getClass();
        c0979f0.b(System.currentTimeMillis());
    }

    @Override // i7.InterfaceC0965a1, i7.Z
    public /* synthetic */ void b(String str, int i10, Throwable th, byte[] bArr, Map map) {
        this.f17549r.i(i10, th, bArr);
    }

    public boolean c() {
        if (!d()) {
            return false;
        }
        C1023u0 c1023u0 = this.f17549r;
        c1023u0.f17564B.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        C0985h0 c0985h0 = c1023u0.f17583v;
        C1023u0.k(c0985h0);
        return jCurrentTimeMillis - c0985h0.f17398O.a() > c1023u0.f17582u.v(null, G.f16956k0);
    }

    public boolean d() {
        C0985h0 c0985h0 = this.f17549r.f17583v;
        C1023u0.k(c0985h0);
        return c0985h0.f17398O.a() > 0;
    }
}
