package p250z8;

import F9.f;
import T1.InterfaceC0491h;
import android.content.Context;
import p185s8.u0;
import p241y9.c;
import p251z9.j;
import p251z9.p;
import p251z9.w;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ f[] f24855d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ThreadLocal f24857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC0491h f24858c;

    static {
        p pVar = new p(a.class);
        w.f24887a.getClass();
        f24855d = new f[]{pVar};
    }

    public a(Context context, String str) {
        j.e(context, "context");
        j.e(str, "name");
        this.f24856a = str;
        this.f24857b = new ThreadLocal();
        this.f24858c = u0.x(str, null, new E5.a(22, this), 10).a(context, f24855d[0]);
    }

    public final void a(c cVar) {
    }
}
