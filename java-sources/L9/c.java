package L9;

import A.C0007a;
import K9.J;
import K9.s0;
import T1.V;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements J {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f5579r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f5580s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f5581t;

    public /* synthetic */ c(int i10, Object obj, Object obj2) {
        this.f5579r = i10;
        this.f5580s = obj;
        this.f5581t = obj2;
    }

    @Override // K9.J
    public final void a() {
        switch (this.f5579r) {
            case 0:
                d dVar = (d) this.f5580s;
                dVar.f5582t.removeCallbacks((s0) this.f5581t);
                return;
            default:
                String str = (String) this.f5580s;
                C0007a c0007a = (C0007a) this.f5581t;
                synchronized (V.f7643b) {
                    LinkedHashMap linkedHashMap = V.f7644c;
                    V v10 = (V) linkedHashMap.get(str);
                    if (v10 != null) {
                        v10.f7645a.remove(c0007a);
                        if (v10.f7645a.isEmpty()) {
                            linkedHashMap.remove(str);
                            v10.stopWatching();
                        }
                    }
                    break;
                }
                return;
        }
    }
}
