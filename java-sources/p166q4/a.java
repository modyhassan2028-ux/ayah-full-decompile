package p166q4;

import F2.x;
import java.util.Collections;
import java.util.Map;
import p050e8.f;
import p119l8.b;
import p160p8.p;
import p160p8.r;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f21303a;

    public a() {
        f fVarB = f.b();
        fVarB.a();
        b bVar = (b) fVarB.f15846d.b(b.class);
        if (bVar == null) {
            throw new NullPointerException("FirebaseCrashlytics component is not present.");
        }
        this.f21303a = bVar;
    }

    public final void a(String str) {
        j.e(str, "message");
        r rVar = this.f21303a.f19428a;
        rVar.f21126o.f21345a.a(new p(rVar, System.currentTimeMillis() - rVar.f21117d, str, 0));
    }

    public final void b(Exception exc) {
        r rVar = this.f21303a.f19428a;
        Map map = Collections.EMPTY_MAP;
        rVar.f21126o.f21345a.a(new x(rVar, exc));
    }
}
