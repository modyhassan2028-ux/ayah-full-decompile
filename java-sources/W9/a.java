package W9;

import android.support.v4.media.session.p;
import java.util.ArrayList;
import java.util.HashSet;
import p120l9.r;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f9655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet f9656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f9657d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f9658e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f9659f;

    public a(String str) {
        p251z9.j.e(str, "serialName");
        this.f9654a = str;
        this.f9655b = new ArrayList();
        this.f9656c = new HashSet();
        this.f9657d = new ArrayList();
        this.f9658e = new ArrayList();
        this.f9659f = new ArrayList();
    }

    public static void a(a aVar, String str, f fVar) {
        aVar.getClass();
        p251z9.j.e(fVar, "descriptor");
        if (!aVar.f9656c.add(str)) {
            StringBuilder sbD = p.D("Element with name '", str, "' is already registered in ");
            sbD.append(aVar.f9654a);
            throw new IllegalArgumentException(sbD.toString().toString());
        }
        aVar.f9655b.add(str);
        aVar.f9657d.add(fVar);
        aVar.f9658e.add(r.f19440r);
        aVar.f9659f.add(false);
    }
}
