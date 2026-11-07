package p173r2;

import android.os.Bundle;
import p241y9.c;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f21466r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Bundle f21467s;

    public /* synthetic */ r(int i10, Bundle bundle) {
        this.f21466r = i10;
        this.f21467s = bundle;
    }

    @Override // p241y9.c
    public final Object e(Object obj) {
        boolean zContainsKey;
        String str = (String) obj;
        switch (this.f21466r) {
            case 0:
                j.e(str, "argName");
                Bundle bundle = this.f21467s;
                j.e(bundle, "source");
                zContainsKey = bundle.containsKey(str);
                break;
            default:
                j.e(str, "key");
                Bundle bundle2 = this.f21467s;
                j.e(bundle2, "source");
                zContainsKey = bundle2.containsKey(str);
                break;
        }
        return Boolean.valueOf(!zContainsKey);
    }
}
