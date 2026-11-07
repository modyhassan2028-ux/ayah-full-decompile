package F6;

import M.k;
import android.content.Context;
import android.support.v4.media.session.r;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f2415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f2416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f2417c;

    public e(Context context, r rVar) {
        k kVar = new k(context);
        this.f2417c = new HashMap();
        this.f2415a = kVar;
        this.f2416b = rVar;
    }

    public final synchronized g a(String str) {
        if (this.f2417c.containsKey(str)) {
            return (g) this.f2417c.get(str);
        }
        CctBackendFactory cctBackendFactoryQ = this.f2415a.q(str);
        if (cctBackendFactoryQ == null) {
            return null;
        }
        r rVar = this.f2416b;
        g gVarCreate = cctBackendFactoryQ.create(new b((Context) rVar.f11364s, (N6.a) rVar.f11365t, (N6.a) rVar.f11366u, str));
        this.f2417c.put(str, gVarCreate);
        return gVarCreate;
    }
}
