package i7;

import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Pair;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: renamed from: i7.v1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1027v1 extends L1 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final C0979f0 f17620A;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final HashMap f17621u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final C0979f0 f17622v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C0979f0 f17623w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C0979f0 f17624x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C0979f0 f17625y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final C0979f0 f17626z;

    public C1027v1(Q1 q10) {
        super(q10);
        this.f17621u = new HashMap();
        C0985h0 c0985h0 = ((C1023u0) this.f16104r).f17583v;
        C1023u0.k(c0985h0);
        this.f17622v = new C0979f0(c0985h0, "last_delete_stale", 0L);
        C0985h0 c0985h1 = ((C1023u0) this.f16104r).f17583v;
        C1023u0.k(c0985h1);
        this.f17623w = new C0979f0(c0985h1, "last_delete_stale_batch", 0L);
        C0985h0 c0985h2 = ((C1023u0) this.f16104r).f17583v;
        C1023u0.k(c0985h2);
        this.f17624x = new C0979f0(c0985h2, "backoff", 0L);
        C0985h0 c0985h3 = ((C1023u0) this.f16104r).f17583v;
        C1023u0.k(c0985h3);
        this.f17625y = new C0979f0(c0985h3, "last_upload", 0L);
        C0985h0 c0985h4 = ((C1023u0) this.f16104r).f17583v;
        C1023u0.k(c0985h4);
        this.f17626z = new C0979f0(c0985h4, "last_upload_attempt", 0L);
        C0985h0 c0985h5 = ((C1023u0) this.f16104r).f17583v;
        C1023u0.k(c0985h5);
        this.f17620A = new C0979f0(c0985h5, "midnight_offset", 0L);
    }

    public final Pair s(String str) {
        C1024u1 c1024u1;
        F2.v vVarA;
        o();
        C1023u0 c1023u0 = (C1023u0) this.f16104r;
        Y6.a aVar = c1023u0.f17564B;
        C0981g c0981g = c1023u0.f17582u;
        aVar.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashMap map = this.f17621u;
        C1024u1 c1024u2 = (C1024u1) map.get(str);
        if (c1024u2 != null && jElapsedRealtime < c1024u2.f17590c) {
            return new Pair(c1024u2.f17588a, Boolean.valueOf(c1024u2.f17589b));
        }
        long jV = c0981g.v(str, G.f16931b) + jElapsedRealtime;
        try {
            try {
                vVarA = P6.a.a(c1023u0.f17579r);
            } catch (PackageManager.NameNotFoundException unused) {
                if (c1024u2 != null && jElapsedRealtime < c1024u2.f17590c + c0981g.v(str, G.f16934c)) {
                    return new Pair(c1024u2.f17588a, Boolean.valueOf(c1024u2.f17589b));
                }
                vVarA = null;
            }
            if (vVarA == null) {
                return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
            }
            String str2 = vVarA.f2330b;
            c1024u1 = str2 != null ? new C1024u1(jV, str2, vVarA.f2331c) : new C1024u1(jV, "", vVarA.f2331c);
            map.put(str, c1024u1);
            return new Pair(c1024u1.f17588a, Boolean.valueOf(c1024u1.f17589b));
        } catch (Exception e10) {
            X x9 = c1023u0.f17584w;
            C1023u0.m(x9);
            x9.f17177D.b(e10, "Unable to get advertising id");
            c1024u1 = new C1024u1(jV, "", false);
        }
    }

    public final String t(String str, boolean z10) {
        o();
        String str2 = z10 ? (String) s(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest messageDigestF = V1.F();
        if (messageDigestF == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestF.digest(str2.getBytes())));
    }

    @Override // i7.L1
    public final void r() {
    }
}
