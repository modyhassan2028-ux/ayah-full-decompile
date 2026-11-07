package p081h8;

import L5.c;
import android.os.Bundle;
import i7.I0;
import i7.J0;
import java.util.HashSet;
import p029c8.g;
import p085i0.n;

/* JADX INFO: loaded from: classes.dex */
public final class b implements J0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16469b;

    public /* synthetic */ b(int i10, Object obj) {
        this.f16468a = i10;
        this.f16469b = obj;
    }

    @Override // i7.J0
    public final void a(long j, Bundle bundle, String str, String str2) {
        int i10 = this.f16468a;
        Object obj = this.f16469b;
        switch (i10) {
            case 0:
                c cVar = (c) obj;
                if (((HashSet) cVar.f5532s).contains(str2)) {
                    Bundle bundle2 = new Bundle();
                    g gVar = a.f16464a;
                    String strG = I0.g(str2, I0.f17005c, I0.f17003a);
                    if (strG != null) {
                        str2 = strG;
                    }
                    bundle2.putString("events", str2);
                    ((n) cVar.f5533t).g(2, bundle2);
                    break;
                }
                break;
            default:
                if (str != null && !a.f16464a.contains(str2)) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("name", str2);
                    bundle3.putLong("timestampInMillis", j);
                    bundle3.putBundle("params", bundle);
                    ((n) ((X4.c) obj).f9953r).g(3, bundle3);
                    break;
                }
                break;
        }
    }
}
