package ka;

import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public X4.c f19197b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final W2.n f19200e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f19201f;
    public final boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f19202h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f19203i;
    public final boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b f19204k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b f19205l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b f19206m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final SocketFactory f19207n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public SSLSocketFactory f19208o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public X509TrustManager f19209p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List f19210q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List f19211r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ya.c f19212s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final d f19213t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public p186s9.b f19214u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f19215v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f19216w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f19217x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Aa.a f19196a = new Aa.a(15);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f19198c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f19199d = new ArrayList();

    public q() {
        TimeZone timeZone = la.e.f19451a;
        this.f19200e = new W2.n(26);
        this.f19201f = true;
        this.g = true;
        b bVar = b.f19106r;
        this.f19202h = bVar;
        this.f19203i = true;
        this.j = true;
        this.f19204k = b.f19107s;
        this.f19205l = b.f19108t;
        this.f19206m = bVar;
        SocketFactory socketFactory = SocketFactory.getDefault();
        p251z9.j.d(socketFactory, "getDefault(...)");
        this.f19207n = socketFactory;
        this.f19210q = r.f19219C;
        this.f19211r = r.f19218B;
        this.f19212s = ya.c.f24718a;
        this.f19213t = d.f19121c;
        this.f19215v = 10000;
        this.f19216w = 10000;
        this.f19217x = 10000;
    }
}
