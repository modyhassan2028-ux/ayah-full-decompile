package p173r2;

import G9.k;
import G9.m;
import android.app.Activity;
import android.content.Context;
import p245z2.a;
import p251z9.j;

/* JADX INFO: renamed from: r2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@F("activity")
public class C1282b extends G {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Activity f21435c;

    public C1282b(Context context) {
        j.e(context, "context");
        for (Object obj : k.b0(context, new m(20))) {
            if (((Context) obj) instanceof Activity) {
                this.f21435c = (Activity) obj;
            }
        }
        obj = null;
        this.f21435c = (Activity) obj;
    }

    @Override // p173r2.G
    public final v a() {
        return new C1281a(this);
    }

    @Override // p173r2.G
    public final v c(v vVar) {
        throw new IllegalStateException(a.E(new StringBuilder("Destination "), ((C1281a) vVar).f21493s.f1641a, " does not have an Intent set.").toString());
    }

    @Override // p173r2.G
    public final boolean f() {
        Activity activity = this.f21435c;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }
}
