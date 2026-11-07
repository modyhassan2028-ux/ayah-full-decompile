package i7;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class L0 implements Runnable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f17027r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y0 f17028s;

    public /* synthetic */ L0(Y0 y10, int i10) {
        this.f17027r = i10;
        this.f17028s = y10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17027r) {
            case 0:
                this.f17028s.L();
                break;
            case 1:
                C1020t0 c1020t0 = this.f17028s.f17226I;
                C1023u0 c1023u0 = c1020t0.f17549r;
                C1014r0 c1014r0 = c1023u0.f17585x;
                Y0 y10 = c1023u0.f17566D;
                C0985h0 c0985h0 = c1023u0.f17583v;
                C1023u0.m(c1014r0);
                c1014r0.o();
                if (c1020t0.d()) {
                    if (c1020t0.c()) {
                        C1023u0.k(c0985h0);
                        c0985h0.f17397N.k(null);
                        Bundle bundle = new Bundle();
                        bundle.putString("source", "(not set)");
                        bundle.putString("medium", "(not set)");
                        bundle.putString("_cis", "intent");
                        bundle.putLong("_cc", 1L);
                        C1023u0.l(y10);
                        y10.v("auto", "_cmpx", bundle);
                    } else {
                        C1023u0.k(c0985h0);
                        Ca.r rVar = c0985h0.f17397N;
                        String strJ = rVar.j();
                        if (TextUtils.isEmpty(strJ)) {
                            X x9 = c1023u0.f17584w;
                            C1023u0.m(x9);
                            x9.f17183x.a("Cache still valid but referrer not found");
                        } else {
                            long jA = c0985h0.f17398O.a() / 3600000;
                            Uri uri = Uri.parse(strJ);
                            Bundle bundle2 = new Bundle();
                            Pair pair = new Pair(uri.getPath(), bundle2);
                            for (String str : uri.getQueryParameterNames()) {
                                bundle2.putString(str, uri.getQueryParameter(str));
                            }
                            ((Bundle) pair.second).putLong("_cc", (jA - 1) * 3600000);
                            Object obj = pair.first;
                            String str2 = obj == null ? "app" : (String) obj;
                            C1023u0.l(y10);
                            y10.v(str2, "_cmp", (Bundle) pair.second);
                        }
                        rVar.k(null);
                    }
                    C1023u0.k(c0985h0);
                    c0985h0.f17398O.b(0L);
                    break;
                }
                break;
            case 2:
                Y0 y11 = this.f17028s;
                y11.o();
                C1023u0 c1023u1 = (C1023u0) y11.f16104r;
                C0985h0 c0985h1 = c1023u1.f17583v;
                X x10 = c1023u1.f17584w;
                C1023u0.k(c0985h1);
                C0976e0 c0976e0 = c0985h1.f17394K;
                if (c0976e0.a()) {
                    C1023u0.m(x10);
                    x10.f17177D.a("Deferred Deep Link already retrieved. Not fetching again.");
                } else {
                    C0979f0 c0979f0 = c0985h1.f17395L;
                    long jA2 = c0979f0.a();
                    c0979f0.b(1 + jA2);
                    if (jA2 >= 5) {
                        C1023u0.m(x10);
                        x10.f17185z.a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                        c0976e0.b(true);
                    } else {
                        if (y11.f17228K == null) {
                            y11.f17228K = new M0(y11, c1023u1, 3);
                        }
                        y11.f17228K.b(0L);
                    }
                }
                break;
            default:
                this.f17028s.L();
                break;
        }
    }
}
